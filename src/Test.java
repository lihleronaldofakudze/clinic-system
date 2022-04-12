import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test extends DatabaseMethods {
    int testId;
    String testName;
    String testType;
    String testDescription;
    int testPatientId;
    String testCost;
    String testReport;
    Connection connection = DatabaseConnection.getConnection();
    Scanner scanner = new Scanner(System.in);

    public Test() {
    }

    public Test(int testId, String testName, String testType, String testDescription, int testPatientId,
            String testCost, String testReport) {
        this.testId = testId;
        this.testName = testName;
        this.testType = testType;
        this.testDescription = testDescription;
        this.testPatientId = testPatientId;
        this.testCost = testCost;
        this.testReport = testReport;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getTestDescription() {
        return testDescription;
    }

    public void setTestDescription(String testDescription) {
        this.testDescription = testDescription;
    }

    public int getTestPatientId() {
        return testPatientId;
    }

    public void setTestPatientId(int testPatientId) {
        this.testPatientId = testPatientId;
    }

    public String getTestCost() {
        return testCost;
    }

    public void setTestCost(String testCost) {
        this.testCost = testCost;
    }

    public String getTestReport() {
        return testReport;
    }

    public void setTestReport(String testReport) {
        this.testReport = testReport;
    }

    @Override
    public void add() {
        System.out.println("Enter test id: ");
        testId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter test name: ");
        testName = scanner.nextLine();

        System.out.println("Enter test type: ");
        testType = scanner.nextLine();

        System.out.println("Enter test description: ");
        testDescription = scanner.nextLine();

        System.out.println("Enter test patient id: ");
        testPatientId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter test cost: ");
        testCost = scanner.nextLine();

        System.out.println("Enter test report: ");
        testReport = scanner.nextLine();

        String query = "INSERT INTO test (testId, testName, testType, testDescription, testPatientId, testCost, testReport) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, testId);
            preparedStatement.setString(2, testName);
            preparedStatement.setString(3, testType);
            preparedStatement.setString(4, testDescription);
            preparedStatement.setInt(5, testPatientId);
            preparedStatement.setString(6, testCost);
            preparedStatement.setString(7, testReport);
            preparedStatement.executeUpdate();
            System.out.println("Test added successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        System.out.println("Enter test id: ");
        testId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter test name: ");
        testName = scanner.nextLine();

        System.out.println("Enter test type: ");
        testType = scanner.nextLine();

        System.out.println("Enter test description: ");
        testDescription = scanner.nextLine();

        System.out.println("Enter test patient id: ");
        testPatientId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter test cost: ");
        testCost = scanner.nextLine();

        System.out.println("Enter test report: ");
        testReport = scanner.nextLine();

        String query = "UPDATE test SET testName=?, testType=?, testDescription=?, testPatientId=?, testCost=?, testReport=? WHERE testId=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, testName);
            preparedStatement.setString(2, testType);
            preparedStatement.setString(3, testDescription);
            preparedStatement.setInt(4, testPatientId);
            preparedStatement.setString(5, testCost);
            preparedStatement.setString(6, testReport);
            preparedStatement.setInt(7, testId);
            preparedStatement.executeUpdate();
            System.out.println("Test updated successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter test id: ");
        testId = Integer.parseInt(scanner.nextLine());

        String query = "DELETE FROM test WHERE testId=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, testId);
            preparedStatement.executeUpdate();
            System.out.println("Test deleted successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        String query = "SELECT * FROM test";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Test id: " + resultSet.getInt("testId"));
                System.out.println("Test name: " + resultSet.getString("testName"));
                System.out.println("Test type: " + resultSet.getString("testType"));
                System.out.println("Test description: " + resultSet.getString("testDescription"));
                System.out.println("Test patient id: " + resultSet.getInt("testPatientId"));
                System.out.println("Test cost: " + resultSet.getString("testCost"));
                System.out.println("Test report: " + resultSet.getString("testReport"));
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}