package com.example.kotlin_pr2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_1, container, false)

        view.findViewById<Button>(R.id.button_navigate_2).setOnClickListener {
            (activity as MainActivity).navigateToFragment2()
        }
        return view
    }
}
