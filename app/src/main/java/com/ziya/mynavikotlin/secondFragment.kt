package com.ziya.mynavikotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second.*


class secondFragment : Fragment() {

    private var name =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            name = secondFragmentArgs.fromBundle(it).name
            second_fragment_textview.setText(name)
        }
        second_fragment_button.setOnClickListener {
            val action = secondFragmentDirections.actionSecondFragmentToFirstFragment()
            //second_fragment_textview.setText(action.arguments.)
            Navigation.findNavController(it).navigate(action)
        }
    }
}