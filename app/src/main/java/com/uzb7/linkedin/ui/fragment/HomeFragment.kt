package com.uzb7.linkedin.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.uzb7.linkedin.R
import com.uzb7.linkedin.databinding.FragmentHomeBinding
import com.uzb7.linkedin.utils.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    private val binding by viewBinding { FragmentHomeBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding.apply { 
            bClick.setOnClickListener {
                Toast.makeText(requireContext(), "You are in the Home fragment", Toast.LENGTH_SHORT).show()
            }
        }
    }

}