import java.util.Date;
public class Screening {
    private String screeningId;
    private double weight;
    private String bloodPressure;
    private Date lastDonationDate;
    private String result;
    private String deferralReason;
    private Nurse nurse;

    public Screening(String screeningId, double weight, String bloodPressure,
                     Date lastDonationDate, String result, String deferralReason, Nurse nurse) {
        this.screeningId = screeningId;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.lastDonationDate = lastDonationDate;
        this.result = result;
        this.deferralReason = deferralReason;
        this.nurse = nurse;
    }
}