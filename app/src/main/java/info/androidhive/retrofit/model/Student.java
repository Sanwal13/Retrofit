package info.androidhive.retrofit.model;

/**
 * Created by Sanwal Singh on 29/9/16.
 */
public class Student {

    //Variables that are in our json
    private int StudentId;
    private String StudentName;
    private String StudentMarks;

    //Getters and setters
    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int bookId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String name) {
        this.StudentName = StudentName;
    }

    public String getStudentMarks() {
        return StudentMarks;
    }

    public void setStudentMarks(String price) {
        this.StudentMarks = StudentMarks;
    }
}
