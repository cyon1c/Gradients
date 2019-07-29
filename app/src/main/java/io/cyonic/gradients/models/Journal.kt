package io.cyonic.gradients.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.OffsetDateTime

@Entity
data class Journal(
    @PrimaryKey val name: String,
    var createdAt: OffsetDateTime)