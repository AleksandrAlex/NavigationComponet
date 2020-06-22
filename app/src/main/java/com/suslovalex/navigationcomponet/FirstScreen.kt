package com.suslovalex.navigationcomponet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.suslovalex.navigationcomponet.databinding.FirstScreenBinding

class FirstScreen : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : FirstScreenBinding = DataBindingUtil.inflate(inflater,
            R.layout.first_screen,
            container,
            false)
        binding.firstScreen.setOnClickListener {
            val action = FirstScreenDirections.actionFirstScreenToSecondScreen("HI!")
            Navigation.findNavController(it).navigate(action)
        }
        return binding.root

        }
    }

