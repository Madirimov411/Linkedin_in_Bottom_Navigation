package com.uzb7.linkedin.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.uzb7.linkedin.R
import com.uzb7.linkedin.databinding.FragmentJobsBinding
import com.uzb7.linkedin.utils.viewBinding

class JobsFragment : Fragment(R.layout.fragment_jobs) {

    private val binding by viewBinding { FragmentJobsBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding.apply {
            bClick.setOnClickListener {
                Toast.makeText(requireContext(), "You are in the Jobs fragment", Toast.LENGTH_SHORT).show()
            }
        }
    }

}