package co.example.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyJsonparser parser= new MyJsonparser();
    	
        Product obj=new Product(101,"Panasonic", 30000);
        
        String jsonResp= parser.javaToJson(obj);
        
        System.out.println(jsonResp);
        
        
        System.out.println("== Convert from Json to Java");
        System.out.println(parser.jsonToJava(jsonResp));
    }
}
