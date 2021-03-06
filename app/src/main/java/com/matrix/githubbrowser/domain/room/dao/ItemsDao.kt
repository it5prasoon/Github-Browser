package com.matrix.githubbrowser.domain.room.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.matrix.githubbrowser.data.models.room.ItemsEntity

@Dao
interface ItemsDao {

    @Insert
    suspend fun saveItem(itemsEntity: ItemsEntity)

    @Delete
    suspend fun removeItem(itemsEntity: ItemsEntity)

    @Query("select * from repo_table")
    fun getAllSavedRepos(): LiveData<List<ItemsEntity>>

}