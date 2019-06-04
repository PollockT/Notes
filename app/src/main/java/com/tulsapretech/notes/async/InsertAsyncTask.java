/*
   Author: Theodore Pollock
   Contact: Theodore.Pollock86@Gmail.com
   File Name: InsertAsyncTask
 */

package com.tulsapretech.notes.async;

import android.os.AsyncTask;

import com.tulsapretech.notes.models.Note;
import com.tulsapretech.notes.persistence.NoteDao;

public class InsertAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public InsertAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.insertNotes(notes);
        return null;
    }

}