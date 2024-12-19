package com.example.kotlin_pr2

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Начальная загрузка первого фрагмента
        if (savedInstanceState == null) {
            navigateToFragment1()
        }
    }

    fun navigateToFragment1() {
        supportFragmentManager.commit {
            replace(R.id.fragment_container, Fragment1())
            addToBackStack(null)
        }
    }

    fun navigateToFragment2() {
        supportFragmentManager.commit {
            replace(R.id.fragment_container, Fragment2())
            addToBackStack(null)
        }
    }

    fun navigateToFragment3() {
        supportFragmentManager.commit {
            replace(R.id.fragment_container, Fragment3())
            addToBackStack(null)
        }
    }

    fun goBack() {
        onBackPressedDispatcher.onBackPressed()
    }
}
