package MidsemProject;

public class StudentCredential {
    private String studentId;
    private String password;
    private String StudentName;

    public StudentCredential(int getStudentId) {
    }

    public String getStudentId() {
        return studentId;
    }

    public String getPassword() {
        return password;
    }

    public String getStudentName() {
        return StudentName;
    }

    public StudentCredential(String studentId, String password, String studentName) {
        this.studentId = studentId;
        this.password = password;
        this.StudentName = studentName;
    }
}
