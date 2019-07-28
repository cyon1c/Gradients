package io.cyonic.gradients.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Journal(
    @PrimaryKey val name: String,
    var createdAt: Number)