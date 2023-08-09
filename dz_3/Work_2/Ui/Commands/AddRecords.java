package dz_3.Work_2.Ui.Commands;

import dz_3.Work_2.Ui.View;

public class AddRecords implements Commands{

    private View view;

    public AddRecords(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.addRecords();
    }

    @Override
    public String description() {
        return "Добавить новую запись";
    }
}
