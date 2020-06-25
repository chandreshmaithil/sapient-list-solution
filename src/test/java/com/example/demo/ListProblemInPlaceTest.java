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
    public void testAssertThatEqual() {
        String [] input = {"2","18", "24" ,"3" ,"5" ,"7", "9" ,"6" ,"12"};
        listProblemInPlace.processLinkedList(input);
    }
}