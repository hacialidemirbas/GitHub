package Exercises;

public class TestTest {
        int test_a, test_b;
        TestTest(){

        }
        TestTest(int a, int b)
        {
            test_a = a;
            test_b = b;
        }
        public static void main (String args[])
        {
            TestTest test = new TestTest();
            System.out.println(test.test_a+" "+test.test_b);
        }
    }
