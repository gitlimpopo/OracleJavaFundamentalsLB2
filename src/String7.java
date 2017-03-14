
public class String7 {
    private String string;
    public void string7(){
        System.out.println("Исходная строка : " + string);
        int counter = 0;
        //String stroka9 = "ThiS is Horosha ";
        string = string.toLowerCase();
        for (int i = 0 ; i<string.length();i++){
            if(string.charAt(i)==' '){
                if(string.charAt(i-1)=='s'){
                    counter++;
                }
                if(string.charAt(i-1)=='a'){
                    counter++;
                }
            }
        }
        System.out.println("Количество букв оканчивающихся на s , a : " + counter);
    }

    public String7(String string) {
        this.string = string;
    }
}
