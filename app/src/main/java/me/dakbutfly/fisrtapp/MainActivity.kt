package me.dakbutfly.fisrtapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnChangeTxt.setOnClickListener {
            val text = textEdit.text
            textView.text = text
        }

        var imageId = R.drawable.grill
        btnToggleImg.setOnClickListener {

            val newImageId = when (imageId) {
                R.drawable.grill -> R.drawable.barbecue
                else -> R.drawable.grill
            }

            imageView.setImageResource(newImageId)
            imageId = newImageId
        }
    }
}
