package com.example.easyloan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.example.easyloan.databinding.FragmentLogin2Binding
import com.example.fitglow.base.BaseFragment


class loginFragment : BaseFragment<FragmentLogin2Binding>(FragmentLogin2Binding::inflate) {


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

    }

    override fun allObserver() {

    }
}





