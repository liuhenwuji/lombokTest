import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class LombokTest {

    private int count;

    public void add() {
        count++;

    }

    public static void main(String[] args) {
        LombokTest lombokTest = new LombokTest();
        lombokTest.add();
        log.info("count:{}",lombokTest.getCount());

        // 记录debug级别的信息
        log.debug("This is debug message.");
        // 记录info级别的信息
        log.info("This is info message.");
        // 记录error级别的信息
        log.error("This is error message.");
    }
}
