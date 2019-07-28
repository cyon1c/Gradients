package io.cyonic.gradients.storage

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import io.cyonic.gradients.models.BehaviorJournal

@Dao
abstract class BehaviorJournalDAO {
    @Transaction
    @Query("SELECT * FROM Journal where name = :journalName")
    abstract fun getJournalWithEntries(journalName : String) : BehaviorJournal
}