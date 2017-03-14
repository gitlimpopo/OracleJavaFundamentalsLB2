
public class String3 {
    private String string;
    public void string3(){
        System.out.println("Исходное слово : " + string);
        StringBuilder sb = new StringBuilder(string);
        sb.insert(0,string.substring(string.length()-2,string.length()));
        System.out.println("Результат :" + sb);
    }

    public String3(String string) {
        this.string = string;
    }
}
