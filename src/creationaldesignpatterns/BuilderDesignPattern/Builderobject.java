package creationaldesignpatterns.BuilderDesignPattern;

public class Builderobject {
    Student student= Student.builder()
            .setName("aagam")
            .setId(123L)
            .setAddress("kurnool")
            .setAge(18)
            .setPhoneno(85555L)
            .setUniversityname("G pulla REDDY ENG COLLEGE")
            .build();
    public Student display()
    {
        return student;
    }
}
