package io.cyonic.gradients.storage

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import io.cyonic.gradients.models.Entry
import io.cyonic.gradients.models.Journal

@Dao
interface JournalDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertJournal(journal : Journal)

    @Insert
    fun insertEntries(vararg entries: Entry<*>)
}