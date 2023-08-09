package dz_3.Work_2.Ui.Commands;

import dz_3.Work_2.Ui.View;

public class CopyFile implements Commands {

    private View view;

    public CopyFile(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.copy();

    }

    @Override
    public String description() {
        return "Скопировать файл";
    }
}
