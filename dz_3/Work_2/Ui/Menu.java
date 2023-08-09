package dz_3.Work_2.Ui;

import java.util.ArrayList;
import java.util.List;

import dz_3.Work_2.Ui.Commands.AddRecords;
import dz_3.Work_2.Ui.Commands.Commands;
import dz_3.Work_2.Ui.Commands.CopyFile;
import dz_3.Work_2.Ui.Commands.Exit;
import dz_3.Work_2.Ui.Commands.PrintFile;
import dz_3.Work_2.Ui.Commands.ReadFile;
import dz_3.Work_2.Ui.Commands.SaveFile;

public class Menu {
    private List<Commands> commandsList;

    public Menu(View view) {
        commandsList = new ArrayList<>();
        commandsList.add(new AddRecords(view));
        commandsList.add(new SaveFile(view));
        commandsList.add(new ReadFile(view));
        commandsList.add(new CopyFile(view));
        commandsList.add(new PrintFile(view));
        commandsList.add(new Exit(view));
    }

    public void execute(int number) {
        commandsList.get(number - 1).execute();
    }

    public String printMenu() {
        StringBuilder print = new StringBuilder();
        for (int i = 0; i < commandsList.size(); i++) {
            print.append(i + 1);
            print.append(". ");
            print.append(commandsList.get(i).description());
            print.append("\n");

        }
        return print.toString();
    }

}