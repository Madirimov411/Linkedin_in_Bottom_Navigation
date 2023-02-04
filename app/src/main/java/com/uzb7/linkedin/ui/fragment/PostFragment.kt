package com.uzb7.linkedin.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.uzb7.linkedin.R
import com.uzb7.linkedin.databinding.FragmentPostBinding
import com.uzb7.linkedin.utils.viewBinding

class PostFragment : Fragment(R.layout.fragment_post) {
    private val binding by viewBinding { FragmentPostBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}