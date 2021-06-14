package com.example.tokomu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.tokomu.model.Product
import de.hdodenhof.circleimageview.CircleImageView

class ProductDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PRODUCT = "extra_product"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productDetail = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        productDetail?.let {
            val detailImageView: ImageView = findViewById(R.id.img_detail_product_image)
            val detailProductName: TextView =  findViewById(R.id.tv_detail_product_name)
            val detailProductPrice: TextView = findViewById(R.id.tv_detail_product_price)
            val detailProductDesc: TextView =  findViewById(R.id.tv_detail_product_desc)

            val detailShopImage: CircleImageView =  findViewById(R.id.img_detail_shop_image)
            val detailShopName: TextView = findViewById(R.id.tv_detail_shop_name)
            val detailShopCity: TextView = findViewById(R.id.tv_detail_shop_city)

            Glide.with(this)
                .load(productDetail.image)
                .into(detailImageView)

            Glide.with(this)
                .load(productDetail.shop.image)
                .into(detailShopImage)

            detailProductName.text = productDetail.name
            detailProductPrice.text = "Rp${productDetail.price}"
            detailProductDesc.text = productDetail.description

            detailShopName.text = productDetail.shop.name
            detailShopCity.text = productDetail.shop.city
            supportActionBar?.title = productDetail.name
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

    }
}