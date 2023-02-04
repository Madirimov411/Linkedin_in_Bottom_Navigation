package com.uzb7.linkedin.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.uzb7.linkedin.R
import com.uzb7.linkedin.databinding.FragmentMyNetworkBinding
import com.uzb7.linkedin.utils.viewBinding

class MyNetworkFragment : Fragment(R.layout.fragment_my_network){

    private val binding by viewBinding { FragmentMyNetworkBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding.apply {
            bClick.setOnClickListener {
                Toast.makeText(requireContext(), "You are in the My Network fragment", Toast.LENGTH_SHORT).show()
            }
        }
    }

}