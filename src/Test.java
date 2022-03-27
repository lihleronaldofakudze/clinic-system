import java.sql.Connection;
import java.sql.PreparedStatement;

public class Test extends DatabaseMethods {
    int testId;
    String testName;
    String testType;
    String testDescription;
    String testPatientId;
    String testCost;
    String testReport;
    Connection connection = DatabaseConnection.getConnection();

    public Test() {
    }

    public Test(int testId, String testName, String testType, String testDescription, String testPatientId,
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

    public String getTestPatientId() {
        return testPatientId;
    }

    public void setTestPatientId(String testPatientId) {
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
        try {
            String query = "INSERT INTO test (testId, testName, testType, testDescription, testPatientId, testCost, testReport) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, testId);
            preparedStatement.setString(2, testName);
            preparedStatement.setString(3, testType);
            preparedStatement.setString(4, testDescription);
            preparedStatement.setString(5, testPatientId);
            preparedStatement.setString(6, testCost);
            preparedStatement.setString(7, testReport);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        try {
            String query = "UPDATE test SET testName=?, testType=?, testDescription=?, testPatientId=?, testCost=?, testReport=? WHERE testId=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, testName);
            preparedStatement.setString(2, testType);
            preparedStatement.setString(3, testDescription);
            preparedStatement.setString(4, testPatientId);
            preparedStatement.setString(5, testCost);
            preparedStatement.setString(6, testReport);
            preparedStatement.setInt(7, testId);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        try {
            String query = "DELETE FROM test WHERE testId=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, testId);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {

    }

}