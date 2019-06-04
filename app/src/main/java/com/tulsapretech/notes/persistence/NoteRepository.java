/*
   Author: Theodore Pollock
   Contact: Theodore.Pollock86@Gmail.com
   File Name: NoteRepository.java
 */

package com.tulsapretech.notes.persistence;


import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.util.Log;

import com.tulsapretech.notes.async.DeleteAsyncTask;
import com.tulsapretech.notes.async.InsertAsyncTask;
import com.tulsapretech.notes.async.UpdateAsyncTask;
import com.tulsapretech.notes.models.Note;

import java.util.List;

public class NoteRepository {
    private static final String TAG = "NoteRepository";
    private NoteDatabase mNoteDatabase;

    public NoteRepository(Context context) {
        mNoteDatabase = NoteDatabase.getInstance(context);
    }

    public void insertNoteTask(Note note){
        Log.d(TAG,"");
        new InsertAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public void updateNoteTask(Note note){
        Log.d(TAG,"");
        new UpdateAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public LiveData<List<Note>> retrieveNotesTask() {
        Log.d(TAG,"");
        return mNoteDatabase.getNoteDao().getNotes();
    }

    public void deleteNoteTask(Note note){
        new DeleteAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
        Log.d(TAG,"");
    }
}
