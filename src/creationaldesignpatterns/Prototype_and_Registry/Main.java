package creationaldesignpatterns.Prototype_and_Registry;

public class Main {
    public static void main(String[] args) throws Exception {
        Student s=new Student("pavan",1,"sept22",100,"sandeep","LLD-2");
//        for(int i=0;i<10;i++)
//            System.out.println(s.clone());
        StudentRegistry registry=new StudentRegistry();
        registry.addtoRegistry("sept22",s);
        Student sept23=new Student("nani",2,"sept23",100,"sandeep","HLD");
        Student dec23=new Student("Arani",3,"dec23",100,"sandeep","LLD3");
        registry.addtoRegistry("sept23",sept23);
        registry.addtoRegistry("dec23",dec23);

        Student rohitsept23=registry.getRegistry("sept23");
        rohitsept23.setId(3);
        rohitsept23.setName("rohit");
        System.out.println(registry.getRegistry("sept22"));

    }
}
