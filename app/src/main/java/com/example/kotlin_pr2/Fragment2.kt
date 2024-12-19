package com.example.kotlin_pr2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_2, container, false)

        view.findViewById<Button>(R.id.button_navigate_3).setOnClickListener {
            (activity as MainActivity).navigateToFragment3()
        }

        view.findViewById<Button>(R.id.button_back).setOnClickListener {
            (activity as MainActivity).goBack()
        }

        return view
    }
}
