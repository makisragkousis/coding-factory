package gr.aueb.cf.ch15.Interfaces;

public class TeacherServiceImpl implements ISchoolService{

    @Override
    public void register() {
        System.out.println("Teacher registered!");
    }

    @Override
    public void unregistered() {
        System.out.println("Teacher unregistered!");
    }
}
