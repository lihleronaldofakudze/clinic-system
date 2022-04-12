import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Role extends DatabaseMethods {
    int roleId;
    String roleTitle;
    String roleDescription;
    Connection connection = DatabaseConnection.getConnection();
    Scanner scanner = new Scanner(System.in);

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
        System.out.println("Enter role title: ");
        roleTitle = scanner.nextLine();

        System.out.println("Enter role description: ");
        roleDescription = scanner.nextLine();

        String sql = "INSERT INTO role (role_title, role_description) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, roleTitle);
            preparedStatement.setString(2, roleDescription);
            preparedStatement.executeUpdate();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Role added successfully");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        System.out.println("Enter role title: ");
        roleTitle = scanner.nextLine();

        System.out.println("Enter role description: ");
        roleDescription = scanner.nextLine();

        String sql = "UPDATE role SET role_title = ?, role_description = ? WHERE role_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, roleTitle);
            preparedStatement.setString(2, roleDescription);
            preparedStatement.setInt(3, roleId);
            preparedStatement.executeUpdate();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Role updated successfully");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter role id: ");
        roleId = Integer.parseInt(scanner.nextLine());

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
        String sql = "SELECT * FROM role";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Role id: " + resultSet.getInt("role_id"));
                System.out.println("Role title: " + resultSet.getString("role_title"));
                System.out.println("Role description: " + resultSet.getString("role_description"));
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}