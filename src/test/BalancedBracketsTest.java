package test;

import org.junit.Test;
import main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here


//    Test 1
@Test
    public void emptyTest() {
    assertEquals(true, true);
}
//    Test 2
@Test
    public void onlyBracketsReturnTrue(){
    assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
}
//    Test 3
@Test
    public void onlyLeftOneBracketsReturnsFalse(){
    assertFalse(BalancedBrackets.hasBalancedBrackets("["));
}
//    Test 4
@Test
    public void onlyRightOneBracketsReturnFalse(){
    assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
}
//    Test 5
@Test
    public void stringBeforeBracketsReturnsTrue(){
    assertTrue(BalancedBrackets.hasBalancedBrackets("For the Emperor![]"));
}
//    Test 6
@Test
    public void stringBehindBracketsReturnsTrue(){
    assertTrue(BalancedBrackets.hasBalancedBrackets("[]For the Emperor!"));
}
//    Test 7
@Test
    public void stringMixBracketsReturnsTrue(){
    assertTrue(BalancedBrackets.hasBalancedBrackets("For the Emperor[Bobby]."));
}
//    Test 8
@Test
    public void stringMixTwoBracketsReturnsTrue(){
    assertTrue(BalancedBrackets.hasBalancedBrackets("For [the] Emperor[Bobby]!"));
}
}
