
public class String4 {
    private String string;
    public void string4(){
        System.out.println("Исходное слово : "+string);
        StringBuilder string1= new StringBuilder(string);
        for(int i=0;i<string.length();i++){
            string1.insert(i+i,string.charAt(i));
        }
        System.out.println("Результат : " + string1);
    }

    public String4(String string) {
        this.string = string;
    }
}
