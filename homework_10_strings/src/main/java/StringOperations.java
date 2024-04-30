public class StringOperations {

    public static void printTwoDigitalBlocks(String string) {

        System.out.println("Два первых блока по 4 цифры в одну строку:");
        String[] arr = string.split("-");
        String stringResult = arr[0].concat(arr[2]);
        System.out.println(stringResult + "\n");
    }

    public static void replaceBlocks(String string) {

        System.out.println("Номер документа: блоки из трех букв замена на ***");
        String replacement = "***";
        String[] arr = string.split("-");
        arr[1] = replacement;
        arr[3] = replacement;
        String stringResult = String.join("-", arr);
        System.out.println(stringResult + "\n");
    }

    public static void printOnlyLettersInLowerCaseFormat(String string) {

        System.out.println("Только буквы в формате yyy/yyy/y/y в нижнем регистре:");
        char[] chars = string.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : chars) {
            if (Character.isLetter(ch)) {
                stringBuilder.append(ch);
            }
        }
        String lowerCase = stringBuilder.toString().toLowerCase();

        String part1 = lowerCase.substring(0, 3);
        String part2 = lowerCase.substring(3, 6);
        String part3 = lowerCase.substring(6, 7);
        String part4 = lowerCase.substring(7, 8);
        String stringResult = part1.concat("/").concat(part2).concat("/").concat(part3).concat("/").concat(part4);
        System.out.println(stringResult + "\n");
    }

    public static void printOnlyLettersInUpperCaseFormat(String string) {

        System.out.println("Только буквы в формате Letters:yyy/yyy/y/y в верхнем регистре. Применить StringBuilder:");
        char[] chars = string.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : chars) {
            if (Character.isLetter(ch)) {
                stringBuilder.append(ch);
            }
        }

        String upperCase = stringBuilder.toString().toUpperCase();

        String part1 = upperCase.substring(0, 3);
        String part2 = upperCase.substring(3, 6);
        String part3 = upperCase.substring(6, 7);
        String part4 = upperCase.substring(7, 8);

        StringBuilder stringBuilder1 = new StringBuilder("Letters:");
        stringBuilder1.append(part1)
                .append("/")
                .append(part2)
                .append("/")
                .append(part3)
                .append("/")
                .append(part4);

        String stringResult = stringBuilder1.toString();
        System.out.println(stringResult + "\n");
    }

    public static void checkContainsSubstringAbc(String string) {

        System.out.println("Проверка содержит ли номер документа последовательность abc независимо от регистра:");

        String subString = "ABC";

        boolean result = string.toLowerCase().contains(subString.toLowerCase());

        String stringResult;

        if (result) {
            stringResult = "Содержит!";
        } else {
            stringResult = "Не содержит!";
        }

        System.out.println(stringResult + "\n");
    }

    public static void checkStartSubstring555(String string) {

        System.out.println("Проверка начинается ли номер документа с последовательности 555:");

        String subString = "555";

        boolean result = string.toLowerCase().startsWith(subString);

        String stringResult;

        if (result) {
            stringResult = "Номер начинается с последовательности 555.";
        } else {
            stringResult = "Номер не начинается с данной последовательности.";
        }

        System.out.println(stringResult + "\n");
    }

    public static void checkEndSubstring1a2b(String string) {

        System.out.println("Проверка заканчивается ли номер документа на последовательность 1a2b:");

        String subString = "1a2b";

        boolean result = string.toLowerCase().endsWith(subString);

        String stringResult;

        if (result) {
            stringResult = "Номер заканчивается на последовательность 1a2b.";
        } else {
            stringResult = "Номер не заканчивается на данную последовательность.";
        }

        System.out.println(stringResult + "\n");
    }
}
