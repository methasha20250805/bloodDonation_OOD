import java.util.Date;

public class Donor extends User{
    private String nic;
    private String bloodType;
    private Date lastDonated;

    public Donor(String id, String name, String phone, String password, String nic, String bloodType, Date lastDonated) {
        super(id, name, phone, password);
    }
}