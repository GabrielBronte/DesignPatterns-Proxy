import java.util.Arrays;
import java.util.List;

public class Fighter implements IFighter{
    private Integer key;
    private String name;
    private String surname;
    private String cartel;
    private String hometown;
    private String contractClauses;

    public Fighter(int key) {
        this.key = key;
        Fighter objeto = BD.getFighter(key);
        this.name = objeto.name;
        this.surname = objeto.surname;
        this.hometown = objeto.hometown;
        this.contractClauses = objeto.contractClauses;
        this.cartel = objeto.cartel;
    }

    public Fighter(Integer key, String name, String surname, String hometown, String cartel, String contractClauses) {
        this.key = key;
        this.name = name;
        this.surname = surname;
        this.hometown = hometown;
        this.contractClauses = contractClauses;
        this.cartel = cartel;
    }

    public Integer getRegistration(){
        return key;
    }
    @Override
    public List<String> accessFighterData(){
        return Arrays.asList(this.name, this.surname, this.cartel);
    }
    @Override
    public List<String> accessContractClauses(Employee employee){
        return Arrays.asList(this.contractClauses);
    }
}