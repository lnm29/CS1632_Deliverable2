package com.laboon;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Test program modifications
 */

public class ProgramModificationsTest {

/**This is the creation of a stub method.
 * When the ProgramExecutor initiated and step is set to false, nothing should happen. Then return Program stack method peek.
 */
  
  private static int stub(String input) {
    ProgramExecutor _e = new ProgramExecutor(new MainPanel(), new ProgramStack(), new ProgramArea(input));
    while (_e.step() == false) {
    }
    return _e._ps.peek();
  }
  
  /** This is the creation of a mock method.
 *	Mock is getting the Junit display ready.
 */
  
  private static int mock(String input) {
    ProgramStack ps = new ProgramStack();
    ProgramArea pa = new ProgramArea(input);
    MainPanel mp = new MainPanel();
    ProgramExecutor _e = new ProgramExecutor(mp, ps, pa);
    _e.run(10);
    return _e._ps.peek();
    
  }
  
  /** This is testing a simple increment.
 *	When "itdt@" is stubbed, it should be equal to 0. This test checks that.
 */
  
  @Test
  public void testSimpleIncrementStub() {
    assertEquals(0, stub("itdt@"));
  }
  
  /** This is also testing a simple increment.
 * Using the mock method, when "itdt@" is mocked, it should equal 0.
 */
  
  @Test
  public void testSimpleIncrementMock() {
    assertEquals(0, mock("itdt@"));
  }
  
  /** This is testing a loop.
 * The loop from 1 to 5 is being incremented and counted. When stubbed, it should equal 0.
 */
  @Test
  public void testLoopFrom1To5UsingCounterStub() {
    assertEquals(0, stub("v      <\n>it:.5-|\n       @"));
  }
  
  /** This is also testing a loop.
 *	THe loop from 1 to 5 is being incremented and counted. WHen mocked, it should equal 0.
 */
  
  @Test
  public void testLoopFrom1To5UsingCounterMock() {
    assertEquals(0, mock("v      <\n>it:.5-|\n       @"));
  }
  
  /** The tests reversing the stack.
 *	When this is stubbed it should equal 1 (indicating it worked).
 */
  @Test
  public void testReverseStackStub() {
    assertEquals(1, stub("itititr@"));
  }
  
  /** This also tests reversing the stack.
 *	When this is mocked, it should equal 1, indicating it worked.
 */
  
  @Test
  public void testReverseStackMock() {
    assertEquals(1, mock("itititr@"));
  }
  
  /** This si testing a simple comment.
 * I have the comment in parentheses and when stubbed it should equal 0.
 */
  
  @Test
  public void testSimpleCommentStub() {
    assertEquals(0, stub("91+91+*(This will print out 100).@"));
  }
  
  /** This is also testing a simple comment.
 *	 I have the comment in parentheses and when mocked it should equal 0.
 */
  
  @Test
  public void testSimpleCommentMock() {
    assertEquals(0, mock("91+91+*(This will print out 100).@"));
  }
  
  /** This is testing code that goes in multiple directions but has a comment within it.
 * When stubbed, this should equal 4.
 */
  
  @Test
  public void testMultiDirectionCommentStub() {
    assertEquals(4, stub("iiii((((((((((((((((()tv\n                       (\n                       h\n                       i\n                       )\n                       t\n                       .\n                       @"));
  }
  
  /**This is testing code that goes in multiple directions but has a comment within it.
 * When mocked, this should equal 4.
 */
  
  @Test
  public void testMultiDirectionCommentMock() {
    assertEquals(4, mock("iiii((((((((((((((((()tv\n                       (\n                       h\n                       i\n                       )\n                       t\n                       .\n                       @"));
  }
  
  /** This is testing a simple output of "Hello World"!
 * When stubbed, this should equal 0.
 */
  
  @Test
  public void testHelloWorldStub() {
    assertEquals(0, stub("64+\"!dlroW ,olleH\">:#,_@"));
  }
  
  /**This is testing a simple output of "Hello World"!
 * When mocked, this should equate to 0.
 */
  
  @Test
  public void testHelloWorldMock() {
    assertEquals(0, mock("64+\"!dlroW ,olleH\">:#,_@"));
  }
  
  /**THis test is just testing a factorial if it were to appear in the code.
 * When stubbed, this should equal 6.
 */
  
  @Test
  public void testFactorialStub() {
    assertEquals(6, stub("itit*it*@"));
  }
  
  /** THis test is just testing a factorial if it were to appear in the code.
 * When mocked, this should equal 6.
 */
  
  @Test
  public void testFactorialMock() {
    assertEquals(6, mock("itit*it*@"));
  }
  
  /** This is testing a factorial with a comment in between.
 * When stubbed, this should equal 6.
 */
  
  @Test
  public void testFactorialWithCommentStub() {
    assertEquals(6, stub("it(Comment1)it*(Comment2)it*@"));
  }
  
  /** This is testing a factorial with a comment.
 * When mocked, this should equal 6.
 */
  
  @Test
  public void testFactorialWithCommentMock() {
    assertEquals(6, mock("it(Comment1)it*(Comment2)it*@"));
  }
  
  /** This is testing the reverse sequence of a set of numbers.
 * When stubbed, it should equal 9.
 */
  
  @Test
  public void testSequenceReverseStub() {
    assertEquals(9, stub("987654321r@"));
  }
  
  /** This is testing the reverse sequence of a set of numbers.
 * When mocked it should equal 9.
 */
  
  @Test
  public void testSequenceReverseMock() {
    assertEquals(9, mock("987654321r@"));
  }
  
  
  /** This is testing the reverse sequence of a comment.
 * WHen the comment is stubbed it should equal 9 in this instance.
 */
  
  @Test
  public void testSequenceReverseWithCommentStub() {
    assertEquals(9, stub("98765(comment)4321r@"));
  }
  
  /** This is testing the reverse sequence of a comment.
 *	WHen the comment is mocked it should equal 9 in this instance.
 */
 
  @Test
  public void testSequenceReverseWithCommentMock() {
    assertEquals(9, mock("98765(comment)4321r@"));
  }
  
}