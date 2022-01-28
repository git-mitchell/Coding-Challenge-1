public class RegexCC2Application {

    private static boolean validate(String pin) {
        return pin.matches("[0-9]{4}|[0-9]{6}");
    }

    public static void main(String[] args) {
        System.out.println(validate(""));
        System.out.println(validate("1479"));
        System.out.println(validate("135790"));
        System.out.println(validate("1 23"));
        System.out.println(validate("123"));
    }
}
