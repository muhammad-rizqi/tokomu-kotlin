package com.example.tokomu.adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.tokomu.ProductDetailActivity
import com.example.tokomu.R
import com.example.tokomu.model.Product

class ProductAdapter(private val products: ArrayList<Product>) :
    RecyclerView.Adapter<ProductAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_product, viewGroup, false)
        return ListViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val product = products[position]

        with(holder.itemView) {
            Glide.with(context)
                .load(product.image)
                .apply(RequestOptions().override(350, 550))
                .into(holder.imgPhoto)

            val tvName: TextView = findViewById(R.id.tv_name)
            val tvPrice: TextView = findViewById(R.id.tv_price)
            val tvCity: TextView = findViewById(R.id.tv_city)

            tvName.text = product.name
            tvPrice.text = "Rp${product.price}"
            tvCity.text = product.shop.city
            setOnClickListener {
                val intent = Intent(context, ProductDetailActivity::class.java)
                intent.putExtra(ProductDetailActivity.EXTRA_PRODUCT, product)
                context.startActivity(intent)
            }
        }


    }

    override fun getItemCount(): Int {
        return products.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_profile_photo)

    }
}