package com.problemsolving;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;
    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void reverseSubstring_First_Test_Case() {
        Assert.assertEquals("abd(bnj)asdf", solution.reverseSubstring("abd(jnb)asdf"));
    }

    @Test
    public void reverseSubstring_Second_Test_Case() {
        Assert.assertEquals("abdjnbasdf", solution.reverseSubstring("abdjnbasdf"));
    }

    @Test
    public void reverseSubstring_Third_Test_Case() {
        Assert.assertEquals("dd(fd)a(hhhg)", solution.reverseSubstring("dd(df)a(ghhh)"));
    }

    @Test
    public void reverseSubstring_Empty_Test_Case() {
        Assert.assertEquals("", solution.reverseSubstring(""));
    }

    @Test
    public void reverseSubstring_Empty_parentheses_Test_Case() {
        Assert.assertEquals("abd()abd", solution.reverseSubstring("abd()abd"));
    }
}