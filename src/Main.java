public class Main {
    public static void main(String[] args) {
        Student melvinStudent = new Student();
        Student markStudent = new Student();

        melvinStudent.setStudent_id(201401399);
        melvinStudent.setStudent_name("Melvin Baybayanon");
        melvinStudent.setStudentCurriculum("Math");

        markStudent.setStudent_id(2014012456);
        markStudent.setStudent_name("Mark Sample");
        markStudent.setStudentCurriculum("Science");

        System.out.println("Student name = (" + melvinStudent.getStudent_name() + ") with ID no: (" +
                melvinStudent.getStudent_id() + ") has a Curriculum (" + melvinStudent.getStudentCurriculum() + ")");

        System.out.println("Student name = (" + markStudent.getStudent_name() + ") with ID no: (" +
                markStudent.getStudent_id() + ") has a Curriculum (" + markStudent.getStudentCurriculum() + ")");
    }
}
