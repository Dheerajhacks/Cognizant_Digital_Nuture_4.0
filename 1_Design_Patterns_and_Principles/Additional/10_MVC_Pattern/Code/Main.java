public class Main {
    public static void main(String[] args) {

        System.out.println("\nMVC Pattern Example\n");

        Student student = new Student();
        student.name = "John Doe";
        student.id = 12345;
        student.grade = 90;

        System.out.println("Creating a student object..");
        StudentView view = new StudentView();

       
        StudentController controller = new StudentController(student, view);
        controller.updateView();

        System.out.println("\nUpdating student details...\n");
        controller.setStudentName("Jane Smith");
        controller.setStudentId(67890);
        controller.setStudentGrade(95);
        controller.updateView();

        System.out.println();
    }
    
}
