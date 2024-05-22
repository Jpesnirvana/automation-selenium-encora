package utils;

import com.company.seleniumwebdriver.pages.RegisterPage;
import org.apache.commons.lang3.RandomStringUtils;

public class UserRandom {
    private static final String[] FIRST_NAMES = {
            "Jordhan", "Pool", "Cristina"
    };

    private static final String[] LAST_NAMES = {
            "Evangelista", "Seminario"
    };

    public static String generateRandomUser() {
        String firstName = FIRST_NAMES[(int) (Math.random() * FIRST_NAMES.length)];
        String lastName = LAST_NAMES[(int) (Math.random() * LAST_NAMES.length)];
        String username = firstName.toLowerCase() + "." + lastName.toLowerCase() + (int) (Math.random() * 100);
        return username;
    }
    public static String generateRandomPass() {
        String password = RandomStringUtils.randomAlphanumeric(10);
        return password;
    }

}

