package pl.deso.ClinicWebApp.models;

public class LoginRequest {

    private String userEmail;
    private String userPassword;


    public LoginRequest() {
        }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
