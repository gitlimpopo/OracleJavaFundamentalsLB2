
/*1.  	Заданы 2 произвольных строки. Из этих строк создать одну объединенную без первых символов в каждой
        из строк.
*/
public class String1 {

    private String string;
    private String string1;
    public void string1() {
        /*1.  	Заданы 2 произвольных строки. Из этих строк создать одну объединенную без первых символов в каждой
        из строк.*/
        System.out.println("Певрое слово : " + string);
        System.out.println("Второе слово : " + string1);
        String stroka2 = string.substring(1, string.length()) + string.substring(1, string.length());
        System.out.println("Результат : " + stroka2);
    }

    public String1(String string, String string1) {
        this.string = string;
        this.string1 = string1;
    }

}
