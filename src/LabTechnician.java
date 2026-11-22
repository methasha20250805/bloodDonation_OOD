public class LabTechnician extends User {
    private String labelId;

    public LabTechnician(String id, String name, String phone, String password, String labelId) {
        super(id, name, phone, password);
    }
}