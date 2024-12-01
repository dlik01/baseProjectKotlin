package com.example.home.baseapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.home.baseapplication.base.fragment.BaseDaggerFragment
import com.example.home.baseapplication.databinding.TwoFragmentBinding

class FragmentTwo : BaseDaggerFragment<TwoFragmentBinding>() {
    private val appViewModel: MainViewModel by viewModels { viewModelFactory }
    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): TwoFragmentBinding = TwoFragmentBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initLayout()
        appViewModel.testUseCase()
    }

    private fun initLayout() = with(binding) {
        textView.text = this@FragmentTwo::class.java.simpleName
        fragment1.setOnClickListener { findNavController().popBackStack() }
        fragment3.setOnClickListener { findNavController().navigate(R.id.action_two_fragment_to_three_fragment) }
    }

}