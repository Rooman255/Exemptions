package dz_3.Work_2.Ui.Commands;

import dz_3.Work_2.Ui.View;

public class PrintFile implements Commands {
    private View view;

    public PrintFile(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.printFile();
    }

    @Override
    public String description() {
        return "Вывести на экран";
    }
}


