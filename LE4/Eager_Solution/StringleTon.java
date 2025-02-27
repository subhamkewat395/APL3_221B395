public class StringleTon
{
    private static StringleTon uniqueObj = new StringleTon();
    private StringleTon (){}
    
    public static StringleTon getInstance(){
            return uniqueObj;
        }
    }
    
	public static void main(String[] args) {
	    StringleTon s1 = StringleTon.getInstance();
	    
	}
}

