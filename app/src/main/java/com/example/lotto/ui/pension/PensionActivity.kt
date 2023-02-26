package com.example.lotto.ui.pension

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lotto.R
import com.example.lotto.databinding.ActivityPensionBinding
import com.example.lotto.ui.pension.pension.PensionFragment
import com.example.lotto.ui.pension.pension.PensionViewModel
import com.example.lotto.ui.pension.statistics.PensionStatisticsFragment

class PensionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPensionBinding
    private lateinit var pensionViewmodel: PensionViewModel

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPensionBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        val pensionFragment = PensionFragment()
        val pensionStatisticsFragment = PensionStatisticsFragment()

        replaceFragment(pensionFragment)

        val bottomNavigationView = binding.navView

        //뷰 모델 연결
        pensionViewmodel = ViewModelProvider(this)[PensionViewModel::class.java]

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> replaceFragment(pensionFragment)
                R.id.navigation_dashboard -> replaceFragment(pensionStatisticsFragment)
            }
            true
        }

        setContentView(binding.root)
    }

    private fun replaceFragment(fragment: Fragment) { // 클릭한 바텀 네비게이션 종류에 따라 프래그먼트 변경
        supportFragmentManager.beginTransaction()
            .apply {
                replace(R.id.fragmentContainer, fragment)
                commit()
            }
    }
}