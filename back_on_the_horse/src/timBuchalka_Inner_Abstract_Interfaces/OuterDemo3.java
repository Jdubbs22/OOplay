package timBuchalka_Inner_Abstract_Interfaces;

//interface
interface Message {
String greet();
}//end interface

public class OuterDemo3 {
// method which accepts the object of interface Message
public void displayMessage(Message m) {
   System.out.println(m.greet() +
      ", This is an example of anonymous inner class as an argument");  
}//end method (containing interface)

public static void main(String args[]) {
   // Instantiating the class
   OuterDemo3 obj = new OuterDemo3();

   // Passing an anonymous inner class as an argument
   obj.displayMessage(new Message() {
      public String greet() {
         return "Hello";
      }//end method
   });//end method contained within an argument (of type interface)
}//end main
}//end class