
public class String6 {
    private String string;
    public void String6(){
        System.out.println("Исходная строка : " + string);
        for(int i = 0;i<string .length();i++){
            if(string .charAt(i) == '*'){
                string = string.substring(0,i-1)+string.substring(i+2);
            }
        }
        System.out.println("Результат : " + string);
    }

    public String6(String string) {
        this.string = string;
    }
}
