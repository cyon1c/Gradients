package io.cyonic.gradients.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore

@Entity
open class Behavior<T>(
    @ColumnInfo(name = "behavior_type")val name: String,
    @Ignore val range: Array<T>)