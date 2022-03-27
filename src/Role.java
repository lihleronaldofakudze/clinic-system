import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Role extends DatabaseMethods {
    int roleId;
    String roleTitle;
    String roleDescription;
    Connection connection = DatabaseConnection.getConnection();

    public Role(int roleId, String roleTitle, String roleDescription) {
        this.roleId = roleId;
        this.roleTitle = roleTitle;
        this.roleDescription = roleDescription;
    }

    public Role() {
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    @Override
    public void add() {
        String sql = "INSERT INTO role (role_title, role_description) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, roleTitle);
            preparedStatement.setString(2, roleDescription);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        String sql = "UPDATE role SET role_title = ?, role_description = ? WHERE role_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, roleTitle);
            preparedStatement.setString(2, roleDescription);
            preparedStatement.setInt(3, roleId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        String sql = "DELETE FROM role WHERE role_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, roleId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {

    }

}