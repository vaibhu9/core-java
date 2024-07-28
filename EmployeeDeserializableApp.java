package ClassExamples;
import java.io.*;
class Employee implements Serializable
{   private int id;
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

public class EmployeeDeserializableApp {
	public static void main(String[] args)throws Exception {
		FileInputStream finf = new FileInputStream("D:\\july2023\\empobj.txt");
		ObjectInputStream oinf = new ObjectInputStream(finf);
		Object obj = oinf.readObject();
		if(obj!=null){ 
			Employee e =(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		else{
			System.out.println("Object data not found");
		}

	}
}
