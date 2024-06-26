package com.example.easyloan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.easyloan.databinding.FragmentLandingBinding
import com.example.fitglow.base.BaseFragment


class LandingFragment : BaseFragment<FragmentLandingBinding>(FragmentLandingBinding::inflate) {
    override fun setListener() {

        binding.signInButton.setOnClickListener {
            findNavController().navigate(R.id.action_landingFragment_to_loginFragment2)
        }
    }

    override fun allObserver() {

    }

}