
import java.util.ArrayList;
import java.util.List;

public class DatabaseInvoker {
    private List<Command> commandHistory = new ArrayList<>();
    private int index = 0;

    public void  executeCommand(Command command){

        if (commandHistory.size() > index +1){
            commandHistory.remove(commandHistory.size()-1);
        }
        command.execute();
        commandHistory.add(command);
        System.out.println("İşlem kaydedildi..." + command.getDescription());
        index++;
    }
    public void undo(){
        if (index>=0){
            Command command = commandHistory.remove(index-1);
            command.undo();
            index--;
            System.out.println("Son işlem geri alındı....");
        }
        else {
            System.out.println("Geri alınacak bir şey yok!");
        }

    }

    public void showHistory(){
        for (int i = 0; i < commandHistory.size() ; i++) {
            System.out.println((i+1) + ". işlem: "+ commandHistory.get(i).getDescription());
        }
    }

    public void executeBatch(List<Command> commands){
        for (Command command : commands){
            executeCommand(command);
        }
    }
}
