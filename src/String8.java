
public class String8 {
    private String string;
    private String unstring;
    public void String8(){
        System.out.println("Строка : " + string);
        System.out.println("Под строка : " + unstring);
        System.out.println("Результат : " + string.replaceAll(unstring, ""));

    }

    public String8(String string, String string1) {
        this.string = string;
        this.unstring = string1;
    }
}
