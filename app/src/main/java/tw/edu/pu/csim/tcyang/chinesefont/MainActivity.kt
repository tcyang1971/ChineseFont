package tw.edu.pu.csim.tcyang.chinesefont

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv: TextView = findViewById(R.id.txv)
        txv.text = "新蒂手指畫字體"
        txv.setTypeface(Typeface.createFromAsset(assets,
                "font/HanyiSentyFingerPainting.ttf"))
    }
}