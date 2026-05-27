package gr.aueb.cf.ch15.Interfaces;

public class StudentServiceImpl implements ISchoolService {

    @Override
    public void register() {
        System.out.println("Student registered!");
    }

    @Override
    public void unregistered() {
        System.out.println("Student unregistered!");
    }
}
