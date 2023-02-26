package com.example.lotto.ui.pension.pension

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lotto.R
import com.example.lotto.databinding.FragmentPensionBinding

class PensionFragment: Fragment(R.layout.fragment_pension) {

    private lateinit var binding: FragmentPensionBinding
    private lateinit var pensionViewModel: PensionViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentPensionBinding = FragmentPensionBinding.bind(view)
        binding = fragmentPensionBinding

        pensionViewModel = ViewModelProvider(this)[PensionViewModel::class.java]

        binding.start.setOnClickListener {
            pensionViewModel.updateText()
        }

        pensionViewModel.lottoNumber1.observe(viewLifecycleOwner) {
            it?.let {
                binding.lottoNumber1.text = it[0].toString()
                binding.lottoNumber2.text = it[1].toString()
                binding.lottoNumber3.text = it[2].toString()
                binding.lottoNumber4.text = it[3].toString()
                binding.lottoNumber5.text = it[4].toString()
                binding.lottoNumber6.text = it[5].toString()
                binding.lottoNumber7.text = it[6].toString()
            }
        }
        pensionViewModel.lottoNumber2.observe(viewLifecycleOwner) {
            it?.let {
                binding.lottoNumber8.text = it[0].toString()
                binding.lottoNumber9.text = it[1].toString()
                binding.lottoNumber10.text = it[2].toString()
                binding.lottoNumber11.text = it[3].toString()
                binding.lottoNumber12.text = it[4].toString()
                binding.lottoNumber13.text = it[5].toString()
                binding.lottoNumber14.text = it[6].toString()
            }
        }
        pensionViewModel.lottoNumber3.observe(viewLifecycleOwner) {
            it?.let {
                binding.lottoNumber15.text = it[0].toString()
                binding.lottoNumber16.text = it[1].toString()
                binding.lottoNumber17.text = it[2].toString()
                binding.lottoNumber18.text = it[3].toString()
                binding.lottoNumber19.text = it[4].toString()
                binding.lottoNumber20.text = it[5].toString()
                binding.lottoNumber21.text = it[6].toString()
            }
        }
        pensionViewModel.lottoNumber4.observe(viewLifecycleOwner) {
            it?.let {
                binding.lottoNumber22.text = it[0].toString()
                binding.lottoNumber23.text = it[1].toString()
                binding.lottoNumber24.text = it[2].toString()
                binding.lottoNumber25.text = it[3].toString()
                binding.lottoNumber26.text = it[4].toString()
                binding.lottoNumber27.text = it[5].toString()
                binding.lottoNumber28.text = it[6].toString()
            }
        }
        pensionViewModel.lottoNumber5.observe(viewLifecycleOwner) {
            it?.let {
                binding.lottoNumber29.text = it[0].toString()
                binding.lottoNumber30.text = it[1].toString()
                binding.lottoNumber31.text = it[2].toString()
                binding.lottoNumber32.text = it[3].toString()
                binding.lottoNumber33.text = it[4].toString()
                binding.lottoNumber34.text = it[5].toString()
                binding.lottoNumber35.text = it[6].toString()
            }
        }
    }
}