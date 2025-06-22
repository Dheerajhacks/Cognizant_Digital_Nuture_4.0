public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.name = name;
    }

    public void setStudentId(int id) {
        model.id = id;
    }

    public void setStudentGrade(int grade) {
        model.grade = grade;
    }

    public void updateView() {
        view.displayStudentDetails(model.name, model.id, model.grade);
    }
}
