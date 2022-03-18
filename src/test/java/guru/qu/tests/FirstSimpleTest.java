package guru.qu.tests;

import org.junit.jupiter.api.*;

@DisplayName("Это наш первый простой тест")
public class FirstSimpleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll method!");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    @BeforeEach method!");
    }

    @AfterEach
    void afterEach() {
        System.out.println("    @AfterEach method!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll method!");
    }

    @DisplayName("Простенький тест на asserEquals")
    @Test
    void firstTest() {
        System.out.println("        Простенький тест на assertEquals");
        Assertions.assertEquals(1, 1);
    }

    @DisplayName("Простенький тест на asserTrue")
    @Test
    void secondTest() {
        System.out.println("        Простенький тест на asserTrue");
        Assertions.assertTrue(7 > 6);
    }
}
