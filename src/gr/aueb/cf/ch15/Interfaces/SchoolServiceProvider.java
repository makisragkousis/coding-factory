package gr.aueb.cf.ch15.Interfaces;

public class SchoolServiceProvider {
    private  TeacherServiceImpl teacherService;

    public SchoolServiceProvider() {
        teacherService = new TeacherServiceImpl(); // tightly coupled
    }

    public void register() {
        teacherService.register();
    }

    public void unregistered() {
        teacherService.unregistered();
    }
}
