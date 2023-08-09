package dz_3.Work_2;

import dz_3.Work_2.FileHandler.FileHandler;
import dz_3.Work_2.NoteBook.Notebook;
import dz_3.Work_2.Presenter.Presenter;
import dz_3.Work_2.Service.Service;
import dz_3.Work_2.Ui.Console;
import dz_3.Work_2.Ui.View;

public class Program {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        View view = new Console();
        Service service = new Service(notebook, new FileHandler());
        Presenter presenter = new Presenter(view, service);
        view.start();
    }
}
