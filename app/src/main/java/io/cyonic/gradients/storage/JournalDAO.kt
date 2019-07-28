package io.cyonic.gradients.storage

import androidx.lifecycle.LiveData
import androidx.room.*
import io.cyonic.gradients.models.Entry
import io.cyonic.gradients.models.Journal

@Dao
interface JournalDAO : BaseDAO<Journal> {

    @Query("SELECT * FROM Journal WHERE name = :journalName")
    abstract fun getJournal(journalName: String) : LiveData<Journal>
}