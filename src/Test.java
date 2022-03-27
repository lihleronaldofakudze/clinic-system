public class Test {
    int testId;
    String testName;
    String testType;
    String testDescription;
    String testPatientId;
    String testCost;
    String testReport;

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
    public String toString() {
        return "Test{" +
                "testId=" + testId +
                ", testName='" + testName + '\'' +
                ", testType='" + testType + '\'' +
                ", testDescription='" + testDescription + '\'' +
                ", testPatientId='" + testPatientId + '\'' +
                ", testCost='" + testCost + '\'' +
                ", testReport='" + testReport + '\'' +
                '}';
    }

}