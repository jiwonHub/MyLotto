package com.example.lotto.ui.pension

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.lotto.R
import com.example.lotto.databinding.ActivityPensionBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class PensionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPensionBinding


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //뷰 바인딩
        binding = ActivityPensionBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val pensionFragment = PensionFragment()
//        val pensionStatisticsFragment = PensionStatisticsFragment()

//        replaceFragment(pensionFragment)

        val navView: BottomNavigationView = binding.navView1

        //바텀 네비게이션 아이템 색상 없애기
        navView.itemIconTintList = null


//        bottomNavigationView.setOnNavigationItemSelectedListener {
//            when (it.itemId) {
//                R.id.navigation_home -> replaceFragment(pensionFragment)
//                R.id.navigation_dashboard -> replaceFragment(pensionStatisticsFragment)
//            }
//            true
//        }
        val navController = findNavController(R.id.fragmentContainerView)

        navView.setupWithNavController(navController)


    }

//    private fun replaceFragment(fragment: Fragment) { // 클릭한 바텀 네비게이션 종류에 따라 프래그먼트 변경
//        supportFragmentManager.beginTransaction()
//            .apply {
//                replace(R.id.fragmentContainer, fragment)
//                commit()
//            }
//    }
}