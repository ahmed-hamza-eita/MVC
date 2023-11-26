package com.hamza.mvc_architecture.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hamza.mvc_architecture.databinding.ActivityMainBinding
import com.hamza.mvc_architecture.models.FakeApiService
import com.hamza.mvc_architecture.models.FakeDatabase

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    val api = FakeApiService()
    val database = FakeDatabase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)
        actions()
    }

    private fun actions() {
        binding.btnFetch.setOnClickListener {
            fetchWisdom()
        }

    }

    private fun fetchWisdom() {

        val wisdomResult = api.getRandomWisdom()
        val userInfo = database.getCurrentUser()
        binding.apply {
            txtContent.text = wisdomResult.content
            txtDate.text = wisdomResult.date
            txtUsername.text = userInfo.name
        }

    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}