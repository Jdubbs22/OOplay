import static org.junit.Assert.*;
import org.junit.Test;
public class swapTest {
	@Test
	public void testSwap(){
		// arrange
		StringObject a = new StringObject("Hello");
		StringObject b = new StringObject("World");
		
		// act
		a.swap(b);
		
		// assert
		assertEquals("Hello", b.str);
		assertEquals("World", a.str);
	}
	
	@Test
	public void testSwapCaseSensitive(){
		// arrange
		StringObject a = new StringObject("hello");
		StringObject b = new StringObject("world");
		
		// act
		a.swap(b);
		
		// assert
		assertEquals("hello", b.str);
		assertEquals("world", a.str);
	}
	
	@Test
	public void testSwapFailsWithNullInput(){
		// arrange
		StringObject a = new StringObject("hello");
				
		try{
		// act
			a.swap(null);
			fail();
		} catch(NullPointerException ex){
			
		}
		catch(Exception ex){
			fail();
		}
		
		// assert
		assertTrue(true);
	}
	
	@Test
	public void testSwapSucceedsWithNullStrValue(){
		// arrange
		StringObject a = new StringObject("hello");
		StringObject b = new StringObject(null);
		
		// act
		a.swap(b);
		
		// assert
		assertEquals("hello", b.str);
		assertEquals(null, a.str);
	}
}
