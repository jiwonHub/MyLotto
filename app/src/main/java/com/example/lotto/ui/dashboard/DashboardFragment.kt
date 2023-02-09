package com.example.lotto.ui.dashboard

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lotto.databinding.FragmentDashboardBinding
import com.google.gson.JsonParser
import kotlinx.coroutines.*
import java.net.URL


class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    private val binding get() = _binding!!

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val lottoViewModel =
            ViewModelProvider(this)[DashboardViewModel::class.java]
        lottoViewModel.updateText()
        lottoViewModel.lottoNumber1.observe(viewLifecycleOwner, Observer {
            binding.PastLottoNumber.text = it
        })


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}




