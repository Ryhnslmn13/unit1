package uts.pam.unit1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HechoShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Shopee Button
        val shopNowButton: Button = findViewById(R.id.shop_now_button)
        shopNowButton.setOnClickListener {
            // Intent to open Shopee link
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://shopee.co.id/hechoshop"))
            startActivity(intent)
        }
    }
}