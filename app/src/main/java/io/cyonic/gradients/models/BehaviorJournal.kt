package io.cyonic.gradients.models

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Relation

data class BehaviorJournal(
    @Embedded
    var journal: Journal,

    @Relation(parentColumn = "name",
              entityColumn = "journalName")
    var entries: List<Entry> = ArrayList())