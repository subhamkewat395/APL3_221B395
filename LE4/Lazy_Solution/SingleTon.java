public class StringleTon
{
    private static StringleTon uniqueObj;
    private StringleTon (){}
    
    public static StringleTon getInstance(){
        if(uniqueObj == null){
            uniqueObj = new StringleTon();
            return uniqueObj;
        }
    }
    
	public static void main(String[] args) {
	    StringleTon s1 = StringleTon.getInstance();
	    
	}
}
