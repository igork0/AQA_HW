package lab7.dao;


import lab7.basics.Student;

public class StudentDao extends Dao<Student> {

    private StudentDao() {
        super(Student.class);
    }

    private static final StudentDao INSTANCE = new StudentDao();

    public static StudentDao getInstance() {
        return INSTANCE;
    }
}
