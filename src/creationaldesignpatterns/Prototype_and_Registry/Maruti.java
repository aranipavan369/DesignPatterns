package creationaldesignpatterns.Prototype_and_Registry;

public class Maruti implements ICar<Maruti>{
    private String Modelname;
    private int Enginsize;
    private int noofwheels;
    private String serialnumber;
    public Maruti()
    {

    }
    public Maruti(String Modelname,int Enginesize,int noofwheels,String serialnumber)
    {
        this.Modelname=Modelname;
        this.Enginsize=Enginesize;
        this.noofwheels=noofwheels;
        this.serialnumber=serialnumber;
    }
    public Maruti(Maruti t)
    {
        this(t.Modelname,t.Enginsize,t.noofwheels,t.serialnumber);
    }

    @Override
    public Maruti clone() {
        Maruti m=new Maruti();
        m.Modelname=this.Modelname;
        m.Enginsize=this.Enginsize;
        m.noofwheels=this.noofwheels;
        m.serialnumber=this.serialnumber;
        return m;
    }
}
