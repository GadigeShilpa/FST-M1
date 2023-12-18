class CustomException extends Exception{
    private String  message = null;
    public CustomException(String message){
        this.message = message;
    }
    @Override
    public String getMessage(){
        return message;
            }

}

public class Activity8 {

    public static void main(String[] a) {
        try {
            // Method Call in case of correct input
            Activity8.exceptionTest("Will print to console");
            //Method call i  case of wrong input
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("Won't Execute");
        } catch (CustomException MAE) {
            System.out.println("Inside catch block: " + MAE.getMessage());
        }


    }

    static void exceptionTest(String str) throws CustomException {
        if (str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}