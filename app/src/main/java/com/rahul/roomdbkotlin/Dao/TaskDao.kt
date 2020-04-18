package com.rahul.roomdbkotlin.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.rahul.roomdbkotlin.Entity.Task

@Dao
interface TaskDao{
    @Insert
    suspend fun insertTask(task: Task)

    @Delete
    suspend fun deleteTask(task: Task)

    @Query("SELECT * FROM Task")
    fun getAllTask() : LiveData<List<Task>>
}