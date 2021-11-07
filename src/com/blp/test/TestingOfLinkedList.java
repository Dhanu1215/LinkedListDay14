package com.blp.test;

import com.blp.linkedlist.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class TestingOfLinkedList {
    @Test
    public void testOfSearchResult() {
        MyLinkedList searchElement = new MyLinkedList();
        int element = searchElement.search(30);
        Assert.assertEquals(30, element);

    }
}
