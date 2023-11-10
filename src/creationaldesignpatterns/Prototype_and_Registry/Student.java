package creationaldesignpatterns.Prototype_and_Registry;

public class Student implements Prototype<Student>{
    private String name;
    private int id;
    private String batchname;
    private int psp;
    private String instructorname;
    private String modulename;

    public Student()
    {

    }

    public Student(String name,int id,String batchname,int psp,String instructorname,String modulename)
    {
        this.name=name;
        this.id=id;
        this.batchname=batchname;
        this.psp=psp;
        this.instructorname=instructorname;
        this.modulename=modulename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBatchname() {
        return batchname;
    }

    public void setBatchname(String batchname) {
        this.batchname = batchname;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public String getInstructorname() {
        return instructorname;
    }

    public void setInstructorname(String instructorname) {
        this.instructorname = instructorname;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    public Student clone()
    {
        Student s=new Student();
        s.setName(this.name);
        s.setId(this.id);
        s.setBatchname(this.getBatchname());
        s.setPsp(this.getPsp());
        s.setModulename(this.getModulename());
        return s;
    }
}
