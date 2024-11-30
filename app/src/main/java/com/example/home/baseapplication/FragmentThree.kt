package com.example.home.baseapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.home.baseapplication.databinding.ThreeFragmentBinding

class FragmentThree : Fragment() {
    private var _binding: ThreeFragmentBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ThreeFragmentBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initLayout()
    }

    private fun initLayout() = with(binding) {
        this ?: return@with
        textView.text = this@FragmentThree::class.java.simpleName
        fragment1.setOnClickListener { findNavController().popBackStack() }
        fragment2.setOnClickListener { findNavController().navigate(R.id.action_three_fragment_to_two_fragment) }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}