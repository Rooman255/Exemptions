package dz_3.Work_2.Presenter;

import dz_3.Work_2.Service.Service;
import dz_3.Work_2.Ui.View;

public class Presenter {

    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addNode(String note) {
        service.addNote(note);

    }

    public void saveFile() {
        service.save();
    }

    public void readFile() {
        service.read();

    }

    public void copy() {
        service.copy();

    }


    public void getRecords() {
        String answer = service.print();
        view.printAnswer(answer);
    }


}
