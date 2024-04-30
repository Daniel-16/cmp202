package User;

public class Admin extends User {
    String staffNo = "bhu/staff/12334";
    void uploadResults(String course, float score) {
        if (!staffNo.equals("")) {
            System.out.println(course + " " + score);
        }else {
            System.out.println("Enter a staff no");
        }
    }
    public static void main(String[] args) {
        Admin adminName = new Admin();
        adminName.name = "Daniel";
        adminName.password = "123445";
        Admin results = new Admin();
        results.uploadResults("CMP 202", 100);
        System.out.println(adminName.register());
    }
}
