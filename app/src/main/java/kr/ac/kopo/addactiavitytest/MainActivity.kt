package kr.ac.kopo.addactiavitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var rg : RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rg = findViewById(R.id.rg)
        rg.check(R.id.radioSecond)
        var intent = Intent(this@MainActivity, SecondActivity::class.java)
        var btnMain = findViewById<Button>(R.id.btnMain)
        btnMain.setOnClickListener {
            var intent = Intent(applicationContext, SecondActivity::class.java)
            when(rg.checkedRadioButtonId) {
                R.id.radioSecond -> Intent(applicationContext, SecondActivity::class.java)
                R.id.radioThird -> Intent(applicationContext, ThirdActivity::class.java)
            }
            btnMain.setOnClickListener {
                startActivity(intent)
            }
        }
    }
}