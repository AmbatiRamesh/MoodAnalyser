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
        public void moodAnalyser()throws MoodAnalyser.MoodAnalyserException {
            String ans = object.moodAnalyser();
            Assertions.assertEquals("HAPPY",ans);;
            System.out.println(ans);
        }
}