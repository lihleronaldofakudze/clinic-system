public class User {
    int userId;
    int userRoleId;
    String userName;
    String userEmail;
    String userDob;
    String userAddress;

    public User(int userId, int userRoleId, String userName, String userEmail, String userDob, String userAddress) {
        this.userId = userId;
        this.userRoleId = userRoleId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userDob = userDob;
        this.userAddress = userAddress;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserDob() {
        return userDob;
    }

    public void setUserDob(String userDob) {
        this.userDob = userDob;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userRoleId=" + userRoleId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userDob='" + userDob + '\'' +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }

}
