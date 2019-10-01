package timBuchalka_Inner_Abstract_Interfaces;


	
	abstract class AnonymousInner {
		   public abstract void mymethod();
		}

		public class OuterDemo2 {

		   public static void main(String args[]) {
		      AnonymousInner inner = new AnonymousInner() {
		         public void mymethod() {
		            System.out.println("This is an example of anonymous inner class");
		         }
		      };
		      inner.mymethod();	
		   }
		}
	


