/*
   Author: Theodore Pollock
   Contact: Theodore.Pollock86@Gmail.com
   File Name: NoteDao.java(interface)
 */

package com.tulsapretech.notes.persistence;


import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.tulsapretech.notes.models.Note;

import java.util.List;

@Dao
public interface NoteDao {

    @Insert
    long[] insertNotes(Note... notes);//DO NOT METHOD VOID BECAUSE OF NO RETURN!!

    @Query("SELECT * FROM notes")
    LiveData<List<Note>> getNotes();

    @Delete
    int delete(Note... notes);//DO NOT METHOD VOID BECAUSE OF NO RETURN!!

    @Update
    int updateNotes(Note... notes);//DO NOT METHOD VOID BECAUSE OF NO RETURN!!
}