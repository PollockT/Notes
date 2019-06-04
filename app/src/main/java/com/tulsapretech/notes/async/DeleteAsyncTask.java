/*
   Author: Theodore Pollock
   Contact: Theodore.Pollock86@Gmail.com
   File Name: DeleteAsyncTask.java
 */

package com.tulsapretech.notes.async;

import android.os.AsyncTask;

import com.tulsapretech.notes.models.Note;
import com.tulsapretech.notes.persistence.NoteDao;

public class DeleteAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public DeleteAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.delete(notes);
        return null;
    }

}