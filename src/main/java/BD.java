import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Fighter> fighters = new HashMap<>();

    public static Fighter getFighter(Integer matricula){
        return fighters.get(matricula);
    }
    public static void addFighter(Fighter fighter){
        fighters.put(fighter.getRegistration(), fighter);
    }
}