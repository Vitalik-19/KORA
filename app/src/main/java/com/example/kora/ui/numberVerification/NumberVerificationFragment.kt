package com.example.kora.ui.numberVerification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.kora.R
import com.example.kora.databinding.FragmentNumberVerificationBinding

class NumberVerificationFragment : Fragment() {

    lateinit var binding: FragmentNumberVerificationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_number_verification, container, false)

        return binding.root
    }
}