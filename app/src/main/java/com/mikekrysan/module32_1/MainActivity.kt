package com.mikekrysan.module32_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mikekrysan.module32_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Ссылка на binding позволяет получить все XML-объекты, у которых есть id
//        val binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.button.setOnClickListener {
//            Toast.makeText(this, "ViewBinding in Activity", Toast.LENGTH_SHORT).show()
//        }

        //Пример 2. Интеграция ViewBinding с Fragment
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().replace(binding.root.id,  BlankFragment()).commit()
    }
}