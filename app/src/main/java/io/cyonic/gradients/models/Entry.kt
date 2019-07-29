package io.cyonic.gradients.models

import androidx.room.*
import androidx.room.ForeignKey.CASCADE
import java.time.OffsetDateTime

@Entity(indices = [Index("journalName")],
    foreignKeys = [ForeignKey(
    entity=Journal::class,
    parentColumns = arrayOf("name"),
    childColumns = arrayOf("journalName"),
    onDelete = CASCADE)]
)
data class Entry(
    @PrimaryKey(autoGenerate = true) var id : Int,
    var journalName: String,
    var timeStamp: OffsetDateTime,
    var behaviorName: String,
    var enteredValue: Int)