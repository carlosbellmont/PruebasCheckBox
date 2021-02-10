package com.cbellmont.pruebascheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cbellmont.pruebascheckbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.checkBox.isChecked) {
                Toast.makeText(this, "El check box esta seleccionado", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "El check box esta NO seleccionado", Toast.LENGTH_LONG).show()
            }
        }
    }
}