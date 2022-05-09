import java.util.Scanner;

public class Interface {
    private static Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Hospital Management System Admin Panel");
        System.out.println("\t 1. Doctor Management");
        System.out.println("\t 2. Nurse Management");
        System.out.println("\t 3. Patient Management");
        System.out.println("\t 4. Clinic Management");
        System.out.println("\t 5. Appointment Management");
        System.out.println("\t 6. Test Management");
        System.out.println("\t 7. Role Management");
        System.out.println("\t 8. User Management");
        System.out.println("\t 9. Exit");
        System.out.print("Enter your choice: ");
        int response = Integer.parseInt(scanner.nextLine());
        if (response == 1) {
            doctorMenu();
        } else if (response == 2) {
            nurseMenu();
        } else if (response == 3) {
            patientMenu();
        } else if (response == 4) {
            clinicMenu();
        } else if (response == 5) {
            appointmentMenu();
        } else if (response == 6) {
            testMenu();
        } else if (response == 7) {
            roleMenu();
        } else if (response == 8) {
            userMenu();
        } else if (response == 9) {
            System.exit(0);
        } else {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Invalid choice");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            mainMenu();
        }
    }

    public static void doctorMenu() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Doctor Management");
        System.out.println("\t 1. Add Doctor");
        System.out.println("\t 2. View Doctor");
        System.out.println("\t 3. Update Doctor");
        System.out.println("\t 4. Delete Doctor");
        System.out.println("\t 5. Back");
        System.out.print("Enter your choice: ");
        int response = Integer.parseInt(scanner.nextLine());
        Doctor doctor = new Doctor();
        if (response == 1) {
            doctor.add();
            doctor.print();
            doctorMenu();
        } else if (response == 2) {
            doctor.print();
            doctorMenu();
        } else if (response == 3) {
            doctor.update();
            doctor.print();
            doctorMenu();
        } else if (response == 4) {
            doctor.delete();
            doctor.print();
            doctorMenu();
        } else if (response == 5) {
            mainMenu();
        } else {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Invalid choice");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            doctorMenu();
        }
    }

    public static void nurseMenu() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Nurse Management");
        System.out.println("\t 1. Add Nurse");
        System.out.println("\t 2. View Nurse");
        System.out.println("\t 3. Update Nurse");
        System.out.println("\t 4. Delete Nurse");
        System.out.println("\t 5. Back");
        System.out.print("Enter your choice: ");
        int response = Integer.parseInt(scanner.nextLine());
        Nurse nurse = new Nurse();
        if (response == 1) {
            nurse.add();
            nurse.print();
            nurseMenu();
        } else if (response == 2) {
            nurse.print();
            nurseMenu();
        } else if (response == 3) {
            nurse.update();
            nurse.print();
            nurseMenu();
        } else if (response == 4) {
            nurse.delete();
            nurse.print();
            nurseMenu();
        } else if (response == 5) {
            mainMenu();
        } else {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Invalid choice");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            nurseMenu();
        }
    }

    public static void patientMenu() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Patient Management");
        System.out.println("\t 1. Add Patient");
        System.out.println("\t 2. View Patient");
        System.out.println("\t 3. Update Patient");
        System.out.println("\t 4. Delete Patient");
        System.out.println("\t 5. Back");
        System.out.print("Enter your choice: ");
        int response = Integer.parseInt(scanner.nextLine());
        Patient patient = new Patient();
        if (response == 1) {
            patient.add();
            patient.print();
        } else if (response == 2) {
            patient.print();
        } else if (response == 3) {
            patient.update();
            patient.print();
        } else if (response == 4) {
            patient.delete();
            patient.print();
        } else if (response == 5) {
            mainMenu();
        } else {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Invalid choice");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            patientMenu();
        }
    }

    public static void clinicMenu() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Clinic Management");
        System.out.println("\t 1. Add Clinic");
        System.out.println("\t 2. View Clinic");
        System.out.println("\t 3. Update Clinic");
        System.out.println("\t 4. Delete Clinic");
        System.out.println("\t 5. Back");
        System.out.print("Enter your choice: ");
        int response = Integer.parseInt(scanner.nextLine());
        Clinic clinic = new Clinic();
        if (response == 1) {
            clinic.add();
            clinic.print();
        } else if (response == 2) {
            clinic.print();
        } else if (response == 3) {
            clinic.update();
            clinic.print();
        } else if (response == 4) {
            clinic.delete();
            clinic.print();
        } else if (response == 5) {
            mainMenu();
        } else {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Invalid choice");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            clinicMenu();
        }
    }

    public static void appointmentMenu() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Appointment Management");
        System.out.println("\t 1. Add Appointment");
        System.out.println("\t 2. View Appointment");
        System.out.println("\t 3. Update Appointment");
        System.out.println("\t 4. Delete Appointment");
        System.out.println("\t 5. Back");
        System.out.print("Enter your choice: ");
        int response = Integer.parseInt(scanner.nextLine());
        Appointment appointment = new Appointment();
        if (response == 1) {
            appointment.add();
            appointment.print();
        } else if (response == 2) {
            appointment.print();
        } else if (response == 3) {
            appointment.update();
            appointment.print();
        } else if (response == 4) {
            appointment.delete();
            appointment.print();
        } else if (response == 5) {
            mainMenu();
        } else {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Invalid choice");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            appointmentMenu();
        }
    }

    public static void testMenu() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Test Management");
        System.out.println("\t 1. Add Test");
        System.out.println("\t 2. View Test");
        System.out.println("\t 3. Update Test");
        System.out.println("\t 4. Delete Test");
        System.out.println("\t 5. Back");
        System.out.print("Enter your choice: ");
        int response = Integer.parseInt(scanner.nextLine());
        Test test = new Test();
        if (response == 1) {
            test.add();
            test.print();
        } else if (response == 2) {
            test.print();
        } else if (response == 3) {
            test.update();
            test.print();
        } else if (response == 4) {
            test.delete();
            test.print();
        } else if (response == 5) {
            mainMenu();
        } else {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Invalid choice");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            testMenu();
        }
    }

    public static void roleMenu() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Role Management");
        System.out.println("\t 1. Add Role");
        System.out.println("\t 2. View Role");
        System.out.println("\t 3. Update Role");
        System.out.println("\t 4. Delete Role");
        System.out.println("\t 5. Back");
        System.out.print("Enter your choice: ");
        int response = Integer.parseInt(scanner.nextLine());
        Role role = new Role();
        if (response == 1) {
            role.add();
            role.print();
        } else if (response == 2) {
            role.print();
        } else if (response == 3) {
            role.update();
            role.print();
        } else if (response == 4) {
            role.delete();
            role.print();
        } else if (response == 5) {
            mainMenu();
        } else {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Invalid choice");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            roleMenu();
        }
    }

    public static void userMenu() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("User Management");
        System.out.println("\t 1. Add User");
        System.out.println("\t 2. View User");
        System.out.println("\t 3. Update User");
        System.out.println("\t 4. Delete User");
        System.out.println("\t 5. Back");
        System.out.print("Enter your choice: ");
        int response = Integer.parseInt(scanner.nextLine());
        User user = new User();
        if (response == 1) {
            user.add();
            user.print();
        } else if (response == 2) {
            user.print();
        } else if (response == 3) {
            user.update();
            user.print();
        } else if (response == 4) {
            user.delete();
            user.print();
        } else if (response == 5) {
            mainMenu();
        } else {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Invalid choice");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            userMenu();
        }
    }
}
