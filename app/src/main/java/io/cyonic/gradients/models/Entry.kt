package io.cyonic.gradients.models

import androidx.room.Embedded
import androidx.room.Entity

@Entity
open class Entry<T>(
    val timeStamp: Number,
    @Embedded val entryType: Behavior<T>,
    val value: T? = null)