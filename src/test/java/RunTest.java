import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RunTest {
    //its RunTest origin
    private int result;

    @BeforeAll
    public static void init() {
        System.out.println("Инициализация тестов на hotfix");
    }

    @BeforeEach
    public void setUp() {
        result = 0;
        System.out.println("Начальное значение");
    }

    @Test
    public void testAddition() {
        result = result + 7;
        System.out.println("Тестовая сумма: Результат равен " + result);
    }

    @Test
    public void testSubtraction() {
        result = result - 5;
        System.out.println("Тестовая разность: Результат равен " + result);
    }

    @AfterAll
    public static void cleanUp() {
        System.out.println("Очистка");
    }
}
