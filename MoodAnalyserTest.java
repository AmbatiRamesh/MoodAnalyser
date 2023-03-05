package com.javaCoreConcepts;
import org.junit.jupiter.api.*;
public class MoodAnalyserTest {
        @BeforeAll
        static void showMessageBeforeAllTestCase() {
            System.out.println("---Welcome to Mood Analyzer---");
        }
        @AfterAll
        public static void showMessageAfterAllTestCase() {
            System.out.println("All Test Case Completed");
        }
        @AfterEach
        void afterEachTestCasePrintMessage() {
            System.out.println("Pass");
        }
        MoodAnalyser object;
        @BeforeEach
        public void setUp() {
            object = new MoodAnalyser();
        }
    @Test
    public void moodAnalyser(){
        String ans = object.moodAnalyser("I am in Sad Mood");
        Assertions.assertEquals("SAD",ans);;
        System.out.println(ans);
    }
    @Test
    public void moodAnalyser1(){
        String ans1 = object.moodAnalyser("I am in any Mood");
        Assertions.assertEquals("HAPPY",ans1);;
        System.out.println(ans1);
    }
}