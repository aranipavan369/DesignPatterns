package creationaldesignpatterns.Prototype_and_Registry;

public class Tata implements ICar<Tata>{
    private String Modelname;
    private int Enginsize;
    private int noofwheels;
    private String serialnumber;
    public Tata()
    {

    }
    public Tata(String Modelname,int Enginesize,int noofwheels,String serialnumber)
    {
        this.Modelname=Modelname;
        this.Enginsize=Enginesize;
        this.noofwheels=noofwheels;
        this.serialnumber=serialnumber;
    }
    public Tata(Tata t)
    {
        this(t.Modelname,t.Enginsize,t.noofwheels,t.serialnumber);
    }

    @Override
    public Tata clone() {
        Tata t=new Tata();
        t.Modelname=this.Modelname;
        t.Enginsize=this.Enginsize;
        t.noofwheels=this.noofwheels;
        t.serialnumber=this.serialnumber;
        return t;
    }
}
