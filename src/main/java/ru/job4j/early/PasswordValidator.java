package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("'password' cannot be empty");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("The password must be between 8 and 32 characters long");
        }

        if (!checkForNumber(password)) {
            throw new IllegalArgumentException("The password must contain at least one digit");
        }

        if (!checkForUpper(password)) {
            throw new IllegalArgumentException("The password must contain a uppercase  letter");
        }

        if (!checkForLower(password)) {
            throw new IllegalArgumentException("The password must contain a lowercase  letter");
        }

        return  password;
    }

    private static boolean checkForNumber(String password) {
        boolean rsl = false;
        char[] check = password.toCharArray();
        for (char num : check) {
            if (Character.isDigit(num)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    private static boolean checkForUpper(String password) {
        boolean rsl = false;
        char[] check = password.toCharArray();
        for (char num : check) {
            if (Character.isUpperCase(num)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    private static boolean checkForLower(String password) {
        boolean rsl = false;
        char[] check = password.toCharArray();
        for (char num : check) {
            if (Character.isLowerCase(num)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
