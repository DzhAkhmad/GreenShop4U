package com.sergio994350.greenshop4u.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity
@Serializable
data class Product(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val image: Int,
    val price: Double,
    val description: String,
    val discount: Int = 0,
    val manufacturerId: Int,
)
