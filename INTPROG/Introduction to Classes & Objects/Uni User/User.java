public class User {

    private String fname;
    private String lname;
    private int studentID;
    private String course;
    private boolean paymentStatus;
    private boolean studentStatus;

    private String email;

    public User(String fname, String lname, int studentID, String course ){
        this.email = "@university.ac.uk";
        this.fname = fname;
        this.lname = lname;
        this.studentID = studentID;
        this.course = course;
        this.paymentStatus = false;
        this.studentStatus = true;

    }

    public String uniEmail() {
        String newemail = this.fname.substring(0,1) + this.lname + this.email;
        return newemail;
    }
    public String courseChange(String newCourse){
        this.course = newCourse;
        return "Course has been updated to " + this.course + " for - " + this.studentID + "/" + this.uniEmail();
    }
    public String paymentPaid(boolean updatePayment){
        this.paymentStatus = updatePayment;
        return "Fees have been updated to " + this.paymentStatus + " for -  " + this.studentID + "/" + this.uniEmail();
    }
    public String withdraw(boolean updateWithdraw){
        this.studentStatus = updateWithdraw;
        return "Student " + this.studentID + " status set to " + this.studentStatus;
    }
    public String reEnroll(boolean updateEnroll){
        if (this.studentStatus == false){
            this.studentStatus = updateEnroll;
            return "Student " + this.studentID + " status set to " + this.studentStatus;
        }
        return "Student " + this.studentID + " already enrolled!";
    }
}
