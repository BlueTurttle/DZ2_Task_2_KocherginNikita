import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Rand {
    public static Double RandomDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }

    public static String RandomUUID() {
        return UUID.randomUUID().toString();
    }

    public static LocalDate RandomDate() {
        Integer randY = ThreadLocalRandom.current().nextInt(1990, 2025);
        Integer randM = ThreadLocalRandom.current().nextInt(1, 13);
        Integer randD = 1;
        if (randM == 2) {
            if (randY % 4 == 0) {
                randD = ThreadLocalRandom.current().nextInt(1, 30);
            }
            else {
                randD = ThreadLocalRandom.current().nextInt(1, 29);
            }
        }
        else if (randM == 4 || randM == 6 || randM == 9 || randM == 11) {
            randD = ThreadLocalRandom.current().nextInt(1, 31);
        }
        else {
            randD = ThreadLocalRandom.current().nextInt(1, 32);
        }
        LocalDate randDate = LocalDate.of(randY, randM, randD);
        return randDate;
    }
}