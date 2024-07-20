import java.util.*;
import java.util.stream.Collectors;

class Notes{
         int id;
         String str;
         long roll;

     public Notes(int id, String str, long roll) {
         this.id = id;
         this.str = str;
         this.roll = roll;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public long getRoll() {
        return roll;
    }

    public void setRoll(long roll) {
        this.roll = roll;
    }
}


public class TestNotes {


    //convert a List of objects into a Map by considering duplicated keys and store them in sorted order
    public static void main(String[] args) {

        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));
        noteLst.add(new Notes(6, "note4", 66));

        Map<String, Long> notesRecords =noteLst
                .stream()
                        .sorted(Comparator.comparingLong(Notes::getRoll).reversed())
                                .collect(Collectors.toMap(
                                        Notes::getStr,Notes::getRoll,
                                        (oldValue,newValue)-> oldValue,LinkedHashMap::new
                                ));
// consider old value 44 for dupilcate key
// it keeps order
        System.out.println("Notes : " + notesRecords);
    }
}
