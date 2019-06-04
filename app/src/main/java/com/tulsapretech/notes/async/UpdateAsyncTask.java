/*
   Author: Theodore Pollock
   Contact: Theodore.Pollock86@Gmail.com
   File Name: UpdateAsyncTask
 */

package com.tulsapretech.notes.async;

import android.os.AsyncTask;

import com.tulsapretech.notes.models.Note;
import com.tulsapretech.notes.persistence.NoteDao;

public class UpdateAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.updateNotes(notes);
        return null;
    }

}