package percy.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TodoTest {
    @Test
    public void testTodoInit() {
        Todo todo = new Todo("Call granny");
        String expectedToString = "[T][ ] Call granny";
        assertEquals(expectedToString, todo.toString());
    }

    @Test
    public void testDoTask() {
        Todo todo = new Todo("Feed cat");
        todo.doTask();
        String expectedToString = "[T][\u2713] Feed cat";
        assertEquals(expectedToString, todo.toString());
    }
}