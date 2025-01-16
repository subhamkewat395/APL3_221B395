class Juet{
    String name;
    int age;
     String s = "subham";
    void setName(String name){
       this.name = name;
    }
    
    void setAge(int age){
       this.age = age;
    }
  
    void getName(){
        System.out.println("The name is : " + name);    
    }
    void getAge(){
        System.out.println("The age is : " + age);    
        
        
         System.out.println("The String is : " + s);    
    }
}
    
public class Main
{
	public static void main(String[] args) {
	   Juet ob = new Juet();
	   ob.setName("subham");
	   ob.setAge(20);
	   ob.getName();
	   ob.getAge();
	}
}



