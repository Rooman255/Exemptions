package dz_3.Work_2.NoteBook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import dz_3.Work_2.Note.Note;

public class Notebook implements Serializable {

    private List<Note> noteList;

    public Notebook(List<Note> noteList) {
        this.noteList = noteList;
    }

    public Notebook() {
        noteList = new ArrayList<>();
    }

    public void addNode(Note note) {
        noteList.add(note);
    }

    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < noteList.size(); i++) {
            stringBuilder.append(noteList.get(i));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
