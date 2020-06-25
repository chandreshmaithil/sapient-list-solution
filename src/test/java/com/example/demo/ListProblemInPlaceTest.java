package com.example.demo;
import org.junit.Before;
import org.junit.Test;

public class ListProblemInPlaceTest {

    ListProblemInPlace  listProblemInPlace;

    @Before
    public void setData(){
        listProblemInPlace = new ListProblemInPlace();
    }

    @Test
    public void testAssertThatEqual0() {
        String [] input = {};
        listProblemInPlace.processLinkedList(input);
    }

    @Test
    public void testAssertThatEqualE() {
        String [] input = {"2","18", "24"};
        listProblemInPlace.processLinkedList(input);
    }

    @Test
    public void testAssertThatEqualO() {
        String [] input = {"3" ,"5" ,"7"};
        listProblemInPlace.processLinkedList(input);
    }

    @Test
    public void testAssertThatEqualEO() {
        String [] input = {"2","18", "24" ,"3" ,"5" ,"7"};
        listProblemInPlace.processLinkedList(input);
    }

    @Test
    public void testAssertThatEqualOE() {
        String [] input = {"3" ,"5" ,"7", "9" ,"6" ,"12"};
        listProblemInPlace.processLinkedList(input);
    }

    @Test
    public void testAssertThatEqualOEO() {
        String [] input = {"3" ,"5" ,"7", "9" ,"6" ,"12","3" ,"5" ,"7"};
        listProblemInPlace.processLinkedList(input);
    }

    @Test
    public void testAssertThatEqual5OEOE() {
        String [] input = {"3" ,"5" ,"7", "9" ,"6" ,"12","3" ,"5" ,"7","6" ,"12"};
        listProblemInPlace.processLinkedList(input);
    }

    @Test
    public void testAssertThatEqual6EOE() {
        String [] input = {"2","18", "24" ,"3" ,"5" ,"7", "9" ,"6" ,"12"};
        listProblemInPlace.processLinkedList(input);
    }

    @Test
    public void testAssertThatEqual6EOEO() {
        String [] input = {"2","18", "24" ,"3" ,"5" ,"7", "9" ,"6" ,"12","3" ,"5" ,"9"};
        listProblemInPlace.processLinkedList(input);
    }

    @Test
    public void testAssertThatEqual7() {
        String [] input = {"3" ,"5" ,"7","2","18", "24" ,"3" ,"5" ,"7", "9" ,"6" ,"12","3" ,"5" ,"7","2","18"};
        listProblemInPlace.processLinkedList(input);
    }
}