package com.example.lotto.ui.pension.statistics

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lotto.databinding.FragmentPensionStatisticsBinding

class PensionStatisticsFragment: Fragment() {

    private  var _binding: FragmentPensionStatisticsBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("NotifyDataSetChanged", "SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPensionStatisticsBinding.inflate(inflater,container,false)

        val pensionStatisticsViewModel = ViewModelProvider(this)[PensionStatisticsViewModel::class.java]

        pensionStatisticsViewModel.updateText()



        pensionStatisticsViewModel.pensionNumberJo.observe(viewLifecycleOwner){
            pensionStatisticsViewModel.setNumberBackGround(it.toInt(), binding.PastLPensionNumber,0)
            binding.jo.isVisible = true
        }
        pensionStatisticsViewModel.pensionNumber.observe(viewLifecycleOwner, Observer{
            pensionStatisticsViewModel.setNumberBackGround(it[0].toInt(),binding.PastLPensionNumber2,1)
            pensionStatisticsViewModel.setNumberBackGround(it[1].toInt(),binding.PastLPensionNumber3,2)
            pensionStatisticsViewModel.setNumberBackGround(it[2].toInt(),binding.PastLPensionNumber4,3)
            pensionStatisticsViewModel.setNumberBackGround(it[3].toInt(),binding.PastLPensionNumber5,4)
            pensionStatisticsViewModel.setNumberBackGround(it[4].toInt(),binding.PastLPensionNumber6,5)
            pensionStatisticsViewModel.setNumberBackGround(it[5].toInt(),binding.PastLPensionNumber7,6)
        })

        pensionStatisticsViewModel.pensionBonusNumber.observe(viewLifecycleOwner, Observer{
            pensionStatisticsViewModel.setNumberBackGround(it[0].toInt(),binding.BonusNumber1,1)
            pensionStatisticsViewModel.setNumberBackGround(it[1].toInt(),binding.BonusNumber2,2)
            pensionStatisticsViewModel.setNumberBackGround(it[2].toInt(),binding.BonusNumber3,3)
            pensionStatisticsViewModel.setNumberBackGround(it[3].toInt(),binding.BonusNumber4,4)
            pensionStatisticsViewModel.setNumberBackGround(it[4].toInt(),binding.BonusNumber5,5)
            pensionStatisticsViewModel.setNumberBackGround(it[5].toInt(),binding.BonusNumber6,6)
            binding.bonusTextView.isVisible = true
        })
        //조
        pensionStatisticsViewModel.pensionRecyclerView1.observe(viewLifecycleOwner){
            binding.recyclerView1.adapter = PensionRecyclerViewAdapter(it,0)
        }
        //십만
        pensionStatisticsViewModel.pensionRecyclerView2.observe(viewLifecycleOwner){
            binding.recyclerView2.adapter = PensionRecyclerViewAdapter(it,1)
        }
        // 만
        pensionStatisticsViewModel.pensionRecyclerView3.observe(viewLifecycleOwner){
            binding.recyclerView3.adapter = PensionRecyclerViewAdapter(it,2)
        }
        //천
        pensionStatisticsViewModel.pensionRecyclerView4.observe(viewLifecycleOwner){
            binding.recyclerView4.adapter = PensionRecyclerViewAdapter(it,3)
        }
        //백
        pensionStatisticsViewModel.pensionRecyclerView5.observe(viewLifecycleOwner){
            binding.recyclerView5.adapter = PensionRecyclerViewAdapter(it,4)
        }
        //십
        pensionStatisticsViewModel.pensionRecyclerView6.observe(viewLifecycleOwner){
            binding.recyclerView6.adapter = PensionRecyclerViewAdapter(it,5)
        }
        //일
        pensionStatisticsViewModel.pensionRecyclerView7.observe(viewLifecycleOwner){
            binding.recyclerView7.adapter = PensionRecyclerViewAdapter(it,6)
        }


        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}