package kr.ac.kopo.addactiavitytest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var btnThird = findViewById<Button>(R.id.btnThird)
        btnThird.setOnClickListener {
            finish()
        }
    }
}