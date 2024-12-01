package com.example.home.baseapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.home.baseapplication.base.fragment.BaseDaggerFragment
import com.example.home.baseapplication.databinding.OneFragmentBinding

class FragmentOne : BaseDaggerFragment<OneFragmentBinding>() {

    private val appViewModel: MainViewModel by viewModels { viewModelFactory }
    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): OneFragmentBinding = OneFragmentBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initLayout()
        appViewModel.testUseCase()
    }

    private fun initLayout() = with(binding) {
        textView.text = this@FragmentOne::class.java.simpleName
        fragment2.setOnClickListener { findNavController().navigate(R.id.action_one_fragment_to_two_fragment) }
        fragment3.setOnClickListener { findNavController().navigate(R.id.action_one_fragment_to_three_fragment) }
    }
}