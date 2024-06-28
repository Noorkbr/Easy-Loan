package com.example.easyloan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.easyloan.databinding.FragmentRegisterBinding
import com.example.fitglow.base.BaseFragment


class registerFragment : BaseFragment<FragmentRegisterBinding>(FragmentRegisterBinding::inflate) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)

        // Set up the toolbar
        val toolbar: androidx.appcompat.widget.Toolbar = binding.toolbar
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Handle back navigation
        toolbar.setNavigationOnClickListener {
            activity?.onBackPressed()
        }

        return view
    }


    override fun setListener() {
       binding.registerBtn.setOnClickListener{
           findNavController().navigate(R.id.action_registerFragment_to_verificationFragment)

       }
    }

    override fun allObserver() {

    }


}


