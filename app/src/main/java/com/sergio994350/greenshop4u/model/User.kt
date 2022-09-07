package com.sergio994350.greenshop4u.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity
@Serializable
data class User(
    @PrimaryKey(autoGenerate = true) val userId: Int,
    val name: String,
    val profile: Int? = null,
    val phone: String? = null,
    val email: String? = null,
    val password: String? = null,
    val token: String? = null,
)
