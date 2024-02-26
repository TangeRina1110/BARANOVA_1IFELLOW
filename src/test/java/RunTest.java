import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RunTest {
    //its RunTest origin
    private int result;

    @BeforeAll
    public static void init() {
        System.out.println("Инициализируем тесты на develop");
    }

    @BeforeEach
    public void setUp() {
        result = 0;
        System.out.println("Начальное значение");
    }

    @Test
    public void testAddition() {
        result = result + 5;
        System.out.println("Тестовая сумма: Результат теста " + result);
    }

    @Test
    public void testSubtraction() {
        result = result - 3;
        System.out.println("Тестовая разность: Результат теста " + result);
    }

    @AfterAll
    public static void cleanUp() {
        System.out.println("Очистка");
    }
}
