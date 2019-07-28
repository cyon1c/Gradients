package io.cyonic.gradients.storage

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import io.cyonic.gradients.models.Entry

@Dao
abstract class EntryDAO : BaseDAO<Entry> {

    @Query("SELECT * FROM Entry WHERE journalName = :journalName")
    abstract fun getEntries(journalName : String): LiveData<Array<Entry>>

    @Query("SELECT * FROM Entry WHERE behaviorName = :behavior")
    abstract fun getEntriesOfBehaviorType(behavior: String): LiveData<Array<Entry>>
}