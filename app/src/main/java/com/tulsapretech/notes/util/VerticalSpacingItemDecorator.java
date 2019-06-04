/*
   Author: Theodore Pollock
   Contact:
   File Name: VerticalSpacingItemDecorator.java
   Gives a padding between the lists as defined inside the
 */

package com.tulsapretech.notes.util;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;



public class VerticalSpacingItemDecorator extends RecyclerView.ItemDecoration {
    private final int verticalSpaceHeight;


    public VerticalSpacingItemDecorator(int verticalSpaceHeight){
        this.verticalSpaceHeight=verticalSpaceHeight;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        outRect.bottom = verticalSpaceHeight;
    }
}

