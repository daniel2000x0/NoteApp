package com.example.my_note;

import androidx.cardview.widget.CardView;

import com.example.my_note.Models.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
