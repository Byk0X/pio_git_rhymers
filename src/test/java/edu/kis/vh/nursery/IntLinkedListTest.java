package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntLinkedListTest {

    private IntLinkedList list;

    @Before
    public void setUp() {
        list = new IntLinkedList();
    }

    @Test
    public void testPushAndTop() {
        int testValue = 5;
        list.push(testValue);

        int result = list.top();
        Assert.assertEquals(testValue, result);

        int anotherTestValue = 10;
        list.push(anotherTestValue);
        result = list.top();
        Assert.assertEquals(anotherTestValue, result);

        list.push(testValue);
        result = list.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testIsEmpty() {
        boolean result = list.isEmpty();
        Assert.assertTrue(result);

        list.push(888);
        result = list.isEmpty();
        Assert.assertFalse(result);

        list.pop();
        result = list.isEmpty();
        Assert.assertTrue(result);
    }

    @Test
    public void testIsFull() {
        boolean result = list.isFull();
        Assert.assertFalse(result);
    }

    @Test
    public void testTopEmptyList() {
        final int EMPTY_STACK_VALUE = -1;

        int result = list.top();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void testPop() {
        final int EMPTY_STACK_VALUE = -1;

        int result = list.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        list.push(testValue);

        result = list.pop();
        Assert.assertEquals(testValue, result);
        result = list.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }
}
