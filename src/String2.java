
public class String2 {
    private String string;
    public void string2() {
        System.out.println("Исходное слово : " + string);
        for (int i = 0; i < string.length(); i++) {
            if (string.length() != 3) {
                string = string.substring(i, string.length() - i);
            }
        }
        System.out.println("Результат : " + string);
    }

    public String2(String string) {
        this.string = string;
    }
}
