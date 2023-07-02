package com.globalpaysolution.datepikerdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.globalpaysolution.datepikerdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

           binding = ActivityMainBinding.inflate(layoutInflater)
           setContentView(binding.root)
            binding.etDate.setOnClickListener{ showDatePickerDialog() }
    }

    private fun showDatePickerDialog() {
        val datePicker = DatePickerFragment { day, month, year -> onDateSelected(day, month, year) }
        datePicker.show(supportFragmentManager, "datePicker")
    }

    private fun onDateSelected(day: Int, month: Int, year: Int) {
        binding.etDate.setText("$day / $month / $year")
    }

}