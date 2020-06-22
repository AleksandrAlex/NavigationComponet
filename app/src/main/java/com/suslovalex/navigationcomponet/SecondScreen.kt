package com.suslovalex.navigationcomponet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.suslovalex.navigationcomponet.databinding.SecondScreenBinding

class SecondScreen: Fragment() {

    private val args: SecondScreenArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: SecondScreenBinding = DataBindingUtil.inflate(inflater,R.layout.second_screen,container,false)
        val value = args.stringLine
        binding.secondScreen.text = value
        binding.secondScreen.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_secondScreen_to_firstScreen)
        }
        return binding.root

    }
}