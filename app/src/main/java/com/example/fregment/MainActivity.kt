package com.example.fregment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment()
    }

    fun setFragment() {
        val listFragment: ListFragment = ListFragment()
        val transaction = supportFragmentManager.beginTransaction()

        transaction.add(R.id.frameLayout, listFragment)
        transaction.commit()
    }

    fun goDetail() {
        val detailFragment = DetailFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, detailFragment)
        transaction.commit()
        // 뒤로가기키 적용, 안해주면 뒤로가기 키 누를시 액티비티가 종료됨
        transaction.addToBackStack("detail")
    }

    fun goBack() {
        onBackPressed()
    }
}