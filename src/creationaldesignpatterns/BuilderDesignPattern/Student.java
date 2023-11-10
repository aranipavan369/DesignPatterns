package creationaldesignpatterns.BuilderDesignPattern;

public class Student{
    private String name;
    private int age;
    private Long id;
    private Long phoneno;
    private String Address;
    private String universityname;
    private Student(String name,int age,Long id,Long phoneno,String Address,String universityname)
    {
        this.name=name;
        this.age=age;
        this.id=id;
        this.phoneno=phoneno;
        this.Address=Address;
        this.universityname=universityname;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder{
        private String name;
        private int age;
        private Long id;
        private Long phoneno;
        private String Address;
        private String universityname;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(int age)
        {
            this.age=age;
            return this;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setPhoneno(Long phoneno) {
            this.phoneno = phoneno;
            return this;
        }

        public Builder setAddress(String address) {
            Address = address;
            return this;
        }

        public Builder setUniversityname(String universityname) {
            this.universityname = universityname;
            return this;
        }

        private void validate()
        {
            if(age<18)
                throw new InvalidAgeException("invalid age");
            if(id<1)
                throw new InvalidId("invalid id");
        }
        public Student build()
        {
            validate();
            return new Student(name,age,id,phoneno,Address,universityname);
        }



    }
}
