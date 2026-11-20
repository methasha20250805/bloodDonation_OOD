public class BloodBankOfficer extends User {
    private String officerId;

    public BloodBankOfficer(String id, String name, String phone, String password, String officerId) {
        super(id, name, phone, password);
    }
}