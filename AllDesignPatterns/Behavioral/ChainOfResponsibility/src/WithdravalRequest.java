import java.util.HashMap;
import java.util.Map;

public class WithdravalRequest {
    private int remainingAmount;
    private Map<Integer,Integer> notes;

    public WithdravalRequest(int amount){
        remainingAmount = amount;
        notes = new HashMap<>();
    }


    public int getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(int remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public Map<Integer, Integer> getNotes() {
        return notes;
    }

    public void addNote(int denomination, int count){
        if (count > 0){
            notes.put(denomination, notes.getOrDefault(denomination,0) + count);
        }
    }

    public boolean isCompleted(){
        return remainingAmount == 0;
    }

    public int getTotal(){
        return notes.entrySet().stream().mapToInt(entry->entry.getKey() * entry.getValue()).sum();
    }



}
