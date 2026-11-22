public abstract class User {
    private String userId;
    private String name;
    private String phone;
    private String password;

    public User(String id, String name, String phone, String password) {
        this.userId = id;
        this.name = name;
        this.phone = phone;
        this.password = password;
    }
    public String getUserId() {
        return userId;
    }
    public void login() {
        System.out.println(name + " logged in.");
    }
    public void logout() {
        System.out.println(name + " logged out.");
    }
}