package LectureNotes;

public class ExceptionsTest {
    public static void main(String[] args) {
//        // this is a try/catch. this is catching the exception for number formatting and
//        try {
//            ExceptionsLecture study = new ExceptionsLecture();
//            System.out.println(Integer.parseInt(study.maybeAnInt));
//            System.out.println(Integer.parseInt(study.notAnInt));
//
//        }catch (NumberFormatException nfx){
//            System.out.println("got an exception " + nfx);
//            System.out.println(nfx.getMessage());
//        }
//        //this code below is a try/catch for out of bounds substring exceptions
//        try {
//           String tester ="test 123 test";
//           int notSubYo = tester.length();
//            System.out.println(notSubYo);
//            // the below code will continue to run fine and will not be caught bc the parameter is in bounds
//           String mysubStr = tester.substring(5,8);
//            System.out.println(mysubStr);
//            // this code is going to get caught because the parameter is way out of bounds
//            String OBEXTLOLLL = tester.substring(3,45);
//            System.out.println(OBEXTLOLLL);
//
//        }catch (IndexOutOfBoundsException iob){
//            System.out.println("this is an exception"+ iob);
//            System.out.println(iob.getMessage());
//        }

        ExceptionsLecture exceptionsTester = new ExceptionsLecture();
        exceptionsTester.askForAnInteger();

    }
}
