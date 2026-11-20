public class Booking {
    private String bookingId;
    private String status;
    private Donor donor;
    private TimeSlot timeSlot;
    private Screening screening;
    private Donation donation;

    public Booking(String bookingId, String status, Donor donor, TimeSlot timeSlot) {
        this.bookingId = bookingId;
        this.status = status;
        this.donor = donor;
        this.timeSlot = timeSlot;
    }
}
