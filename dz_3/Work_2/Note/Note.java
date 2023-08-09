package dz_3.Work_2.Note;

import java.io.Serializable;

public class Note implements Serializable {

    private String note;

    public Note(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return " " + note;
    }
}
