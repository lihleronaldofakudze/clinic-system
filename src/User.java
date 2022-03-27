import java.sql.*;

public class User extends DatabaseMethods {
    int userId;
    int userRoleId;
    String userName;
    String userEmail;
    String userDob;
    String userAddress;
    String userPassword;
    String userUsername;
    Connection connection = DatabaseConnection.getConnection();

    public User() {
    }

    public User(int userId, int userRoleId, String userName, String userEmail, String userDob, String userAddress,
            String userPassword, String userUsername) {
        this.userId = userId;
        this.userRoleId = userRoleId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userDob = userDob;
        this.userAddress = userAddress;
        this.userPassword = userPassword;
        this.userUsername = userUsername;
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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public boolean login(String username, String password) {
        try {
            String sql = "SELECT * FROM user WHERE user_username = ? AND user_password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void add() {
        try {
            String sql = "INSERT INTO user (user_id, user_role_id, user_name, user_email, user_dob, user_address, user_password, user_username) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userId);
            preparedStatement.setInt(2, userRoleId);
            preparedStatement.setString(3, userName);
            preparedStatement.setString(4, userEmail);
            preparedStatement.setString(5, userDob);
            preparedStatement.setString(6, userAddress);
            preparedStatement.setString(7, userPassword);
            preparedStatement.setString(8, userUsername);
            preparedStatement.executeUpdate();
            System.out.println("User added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        try {
            String sql = "UPDATE user SET user_role_id = ?, user_name = ?, user_email = ?, user_dob = ?, user_address = ?, user_password = ?, user_username = ? WHERE user_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userRoleId);
            preparedStatement.setString(2, userName);
            preparedStatement.setString(3, userEmail);
            preparedStatement.setString(4, userDob);
            preparedStatement.setString(5, userAddress);
            preparedStatement.setString(6, userPassword);
            preparedStatement.setString(7, userUsername);
            preparedStatement.setInt(8, userId);
            preparedStatement.executeUpdate();
            System.out.println("User updated successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        try {
            String sql = "DELETE FROM user WHERE user_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();
            System.out.println("User deleted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        try {
            String sql = "SELECT * FROM user";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.print("User ID: " + resultSet.getInt("user_id"));
                System.out.print("User Role ID: " + resultSet.getInt("user_role_id"));
                System.out.print("User Name: " + resultSet.getString("user_name"));
                System.out.print("User Email: " + resultSet.getString("user_email"));
                System.out.print("User DOB: " + resultSet.getString("user_dob"));
                System.out.print("User Address: " + resultSet.getString("user_address"));
                System.out.print("User Username: " + resultSet.getString("user_username"));
                System.out.println("User Password: " + resultSet.getString("user_password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
