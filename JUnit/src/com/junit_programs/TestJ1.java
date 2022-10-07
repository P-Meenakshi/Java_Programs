package com.junit_programs;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class TestJ1 {

    public static void main(String[] args) {

        class FirstJUnit5Tests {
            @Test
            void myFirstTest() {
                assertEquals(2, 1 + 1);
            }
        }




    }
}
