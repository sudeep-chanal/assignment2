public class StudentCourses {

    private String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "MP" };
    private int[] marks = { 85, 92, 75, 88, 95 };

    public void displayStudentMarks() {
        System.out.println("Course Codes \t Marks Obtained");

        for (int i = 0; i < courseCodes.length; i++) {
            System.out.println(courseCodes[i] + "\t\t\t" + marks[i]);
        }
    }
}