package one.example.myapplication.Model;

public class UserModel {
    private int userImage;
    private String userText;

    public UserModel(int userImage, String userText) {
        this.userImage = userImage;
        this.userText = userText;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public String getUserText() {
        return userText;
    }

    public void setUserText(String userText) {
        this.userText = userText;
    }
}
