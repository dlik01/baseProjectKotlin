package com.example.home.baseapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.home.baseapplication.databinding.TwoFragmentBinding

class FragmentTwo : Fragment() {
    private var _binding: TwoFragmentBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = TwoFragmentBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initLayout()
    }

    private fun initLayout() = with(binding) {
        this ?: return@with
        textView.text = this@FragmentTwo::class.java.simpleName
        fragment1.setOnClickListener { findNavController().popBackStack() }
        fragment3.setOnClickListener { findNavController().navigate(R.id.action_two_fragment_to_three_fragment) }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}