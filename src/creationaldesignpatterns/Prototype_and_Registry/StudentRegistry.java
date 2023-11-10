package creationaldesignpatterns.Prototype_and_Registry;

import java.util.HashMap;

public class StudentRegistry {
    HashMap<String,Student> studentregistry;
    public StudentRegistry()
    {
        this.studentregistry=new HashMap<>();
    }

    public Student addtoRegistry(String batchname,Student s) throws Exception {
        if(studentregistry.containsKey(s))
            throw new Exception("user already exists");
        else
            studentregistry.put(batchname,s);
        return s;
    }
    public Student getRegistry(String batchname) throws Exception {
        if(!studentregistry.containsKey(batchname))
            throw new Exception("user does not exists");
        return studentregistry.get(batchname);
    }
}
