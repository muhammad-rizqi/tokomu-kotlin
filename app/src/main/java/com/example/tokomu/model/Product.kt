package com.example.tokomu.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    var name: String = "",
    var price: Int = 0,
    var stock: Int = 0,
    var image: String = "",
    var description: String = "",
    var shop: Shop
): Parcelable

@Parcelize
data class Shop(
    val name: String,
    val city: String,
    val image: String
): Parcelable