package ClassExamples;
import java.io.*;
class Employeee implements Serializable {
	private int id;
    private String name;
    private int sal;

    public void setId(int id)
    { this.id=id;
    }
    public int getId(){
     return id;
    }
    public void setName(String name)
    { this.name=name;
    }
    public String getName(){
      return name;
    }
    public void setSal(int sal)
     { this.sal=sal;
    }
    public int getSal(){
      return sal;
    }
}

public class EmployeeSerializableApp {
	public static void main(String x[])throws Exception{
		FileOutputStream fout = new FileOutputStream("D:\\july2023\\empobj.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		Employeee e = new Employeee();
		e.setId(1);
		e.setName("ABC");
		e.setSal(10000);
		oout.writeObject(e);
		oout.close();
		fout.close();
		System.out.println("Employee Data Store Successfully..........");
		
	}	
}
