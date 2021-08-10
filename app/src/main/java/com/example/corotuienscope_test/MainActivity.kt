package com.example.corotuienscope_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.corotuienscope_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binder : ActivityMainBinding
    private lateinit var viewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.users.observe(this, Observer {
            it.forEach {
                Log.d("Test", "id: ${it.id}")
                Log.d("Test", "name: ${it.name}")
            }
        })
    }
}