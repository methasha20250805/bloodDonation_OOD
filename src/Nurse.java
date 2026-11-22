import java.util.ArrayList;

public class Nurse extends User {
    private String licenseNo;
    private ArrayList<Screening> screenings = new ArrayList <>();

    public Nurse(String id, String name, String phone, String password, String licenseNo) {
        super(id, name, phone, password);
    }

}
