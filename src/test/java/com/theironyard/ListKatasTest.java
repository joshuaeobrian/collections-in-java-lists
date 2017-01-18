package com.theironyard;

import net.doughughes.testifier.exception.CannotFindMethodException;
import net.doughughes.testifier.matcher.RegexMatcher;
import net.doughughes.testifier.test.TestifierTest;
import net.doughughes.testifier.util.Invoker;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

@SuppressWarnings("unchecked")
public class ListKatasTest extends TestifierTest{

    @Test
    public void testArrayListIndexesWithFiveElementsValues(){
        /* arrange */

        /* act */
        ArrayList<Integer> result = null;
        try {
            result = (ArrayList<Integer>) Invoker.invokeStatic(ListKatas.class, "arrayListIndexes", 5);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("First element in list should not be 0",
                result.get(0), equalTo(0));
        assertThat("Second element in list should not be 1",
                result.get(1), equalTo(1));
        assertThat("Third element in list should not be 2",
                result.get(2), equalTo(2));
        assertThat("Fourth element in list should not be 3",
                result.get(3), equalTo(3));
        assertThat("Fifth element in list should not be 4",
                result.get(4), equalTo(4));
    }

    @Test
    public void testArrayListIndexesWithFiveElementsLength(){
        /* arrange */

        /* act */
        ArrayList<Integer> result = null;
        try {
            result = (ArrayList<Integer>) Invoker.invokeStatic(ListKatas.class, "arrayListIndexes", 5);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("Length of list should be 5",
                result.size(), equalTo(5));
    }

    @Test
    public void testArrayListIndexesWithZeroElementsLength(){
        /* arrange */

        /* act */
        ArrayList<Integer> result = null;
        try {
            result = (ArrayList<Integer>) Invoker.invokeStatic(ListKatas.class, "arrayListIndexes", 0);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("Length of list should be 0",
                result.size(), equalTo(0));
    }

    @Test
    public void testArrayListIndexesReturnsArrayListOfInteger(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("arrayListIndexes", int.class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("arrayListIndexes() method should return an ArrayList of Integer.",
                source, RegexMatcher.matches("^.*?MethodDeclaration\\[arrayListIndexes\\].*?ReferenceType ClassOrInterfaceType\\[ArrayList\\] ReferenceType ClassOrInterfaceType\\[Integer\\].*?BlockStmt.*?$"));
    }

    @Test
    public void testArrayListIndexesCreatesArrayListOfInteger(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("arrayListIndexes", int.class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("arrayListIndexes() method should create a new ArrayList of Integer.",
                source, RegexMatcher.matches("^.*?VariableDeclarationExpr ReferenceType ClassOrInterfaceType\\[ArrayList\\] ReferenceType ClassOrInterfaceType\\[Integer\\].*?$"));
    }

    @Test
    public void testSumListOfFiveNumbers() {
        /* arrange */
        ArrayList<Double> nums = new ArrayList<>();
        nums.add(1.1);
        nums.add(2.2);
        nums.add(3.3);
        nums.add(4.4);
        nums.add(5.5);
        nums.add(6.6);

        /* act */
        double sum = 0;
        try {
            sum = (double) Invoker.invokeStatic(ListKatas.class, "sumList", nums);
        } catch (Throwable throwable) {
            fail(throwable.getMessage());
        }

        /* assert */
        assertThat("sum of 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 should be 23.1",
                sum, equalTo(23.1));
    }

    @Test
    public void testSumListOfZeroNumbers() {
        /* arrange */

        /* act */
        double sum = 0;
        try {
            sum = (double) Invoker.invokeStatic(ListKatas.class, "sumList", new ArrayList<Integer>());
        } catch (Throwable throwable) {
            fail(throwable.getMessage());
        }

        /* assert */
        assertThat("sum of no numbers should be 0.0",
                sum, closeTo(0.0, 0.001));
    }

    @Test
    public void testSumListAcceptsArrayListOfDouble(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("sumList", ArrayList.class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("sumList() method should accept an ArrayList of Double named numbers.",
                source, RegexMatcher.matches("^.*?Parameter\\[numbers\\].*?ClassOrInterfaceType\\[ArrayList\\] ReferenceType ClassOrInterfaceType\\[Double\\] /Parameter.*?$"));
    }

    @Test
    public void testConcatenateStringsOfFiveWords() {
        /* arrange */
        ArrayList<String> words = new ArrayList<>();
        words.add("This");
        words.add("is");
        words.add("five");
        words.add("words");
        words.add("together");

        /* act */
        String result = "";
        try {
            result = (String) Invoker.invokeStatic(ListKatas.class, "concatenateStrings", words);
        } catch (Throwable throwable) {
            fail(throwable.getMessage());
        }

        /* assert */
        assertThat("concatenation of \"This\", \"is\", \"five\", \"words\", \"together\" should be \"Thisisfivewordstogether\"",
                result, equalTo("Thisisfivewordstogether"));
    }

    @Test
    public void testConcatenateStringsOfZeroWords() {
        /* arrange */

        /* act */
        String result = "";
        try {
            result = (String) Invoker.invokeStatic(ListKatas.class, "concatenateStrings", new ArrayList<String>());
        } catch (Throwable throwable) {
            fail(throwable.getMessage());
        }

        /* assert */
        assertThat("concatenation of \"This\", \"is\", \"five\", \"words\", \"together\" should be \"Thisisfivewordstogether\"",
                result, equalTo(""));
    }

    @Test
    public void testConcatenateStringsAcceptsArrayListOfString(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("concatenateStrings", ArrayList.class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("concatenateStrings() method should accept an ArrayList of String named strings.",
                source, RegexMatcher.matches("^.*?Parameter\\[strings\\].*?ClassOrInterfaceType\\[ArrayList\\] ReferenceType ClassOrInterfaceType\\[String\\] /Parameter.*?$"));
    }

    @Test
    public void testReverseListOfStringsWithFiveWords() {
        /* arrange */
        ArrayList<String> words = new ArrayList<>();
        words.add("This");
        words.add("is");
        words.add("five");
        words.add("words");
        words.add("reversed");

        ArrayList<String> reversed = new ArrayList<>();
        reversed.add("reversed");
        reversed.add("words");
        reversed.add("five");
        reversed.add("is");
        reversed.add("This");

        /* act */
        ArrayList<String> result = null;
        try {
            result = (ArrayList<String>) Invoker.invokeStatic(ListKatas.class, "reverseListOfStrings", words);
        } catch (Throwable throwable) {
            fail(throwable.getMessage());
        }

        /* assert */
        assertThat("reverse of \"This\", \"is\", \"five\", \"words\", \"reversed\" should be \"reversed\", \"words\", \"five\", \"is\", \"This\"",
                result, equalTo(reversed));
    }

    @Test
    public void testReverseListOfStringsWithZeroWords() {
        /* arrange */

        /* act */
        ArrayList<String> result = null;
        try {
            result = (ArrayList<String>) Invoker.invokeStatic(ListKatas.class, "reverseListOfStrings", new ArrayList<String>());
        } catch (Throwable throwable) {
            fail(throwable.getMessage());
        }

        /* assert */
        assertThat("reverse of empty list should be an empty list",
                result, equalTo(new ArrayList<String>()));
    }

    @Test
    public void testReverseListOfStringsReturnsArrayListOfString(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("reverseListOfStrings", ArrayList.class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("reverseListOfStrings() method should return an ArrayList of String.",
                source, RegexMatcher.matches("^.*?MethodDeclaration\\[reverseListOfStrings\\].*?ReferenceType ClassOrInterfaceType\\[ArrayList\\] ReferenceType ClassOrInterfaceType\\[String\\].*?BlockStmt.*?$"));
    }

    @Test
    public void testReverseListOfStringsAcceptsArrayListOfString(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("reverseListOfStrings", ArrayList.class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("reverseListOfStrings() method should accept an ArrayList of String named strings.",
                source, RegexMatcher.matches("^.*?Parameter\\[strings\\].*?ClassOrInterfaceType\\[ArrayList\\] ReferenceType ClassOrInterfaceType\\[String\\] /Parameter.*?$"));
    }

    @Test
    public void testReverseListOfStringsCreatesArrayListOfString(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("reverseListOfStrings", ArrayList.class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("reverseListOfStrings() method should create a new ArrayList of String.",
                source, RegexMatcher.matches("^.*?BlockStmt.*?ClassOrInterfaceType\\[ArrayList\\] ReferenceType ClassOrInterfaceType\\[String\\].*?$"));
    }


}