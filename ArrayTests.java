import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }


  @Test
  public void testNull(){
    int[] input1 = { 1, 5, 6 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 1, 5, 6}, input1);
  }

  @Test
  public void testreversemultiple(){
    int[] input1 = { 1, 2, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 1, 2, 4}, input1);
  }
}