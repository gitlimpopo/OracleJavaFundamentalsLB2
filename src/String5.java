
public class String5 {
    private String string;
    public void string5(){
        System.out.println("Исходная строка : " + string);
        int count = 0;
        int begin = 0;
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == ' ')
            {
                if((string.charAt(begin) == 'b') && (string.charAt(begin+2) == 'b')) {
                    count++;
                }
                begin = i+1;
            }
        }
        if ((string.charAt(string.length()-1) == 'b') && (string.charAt(string.length()-3) == 'b') && (string.charAt(string.length()-4) == ' ')) {
            count++;
        }
        System.out.println ("Количестов слов по маске d*d : " + count);
    }

    public String5(String string) {
        this.string = string;
    }
}
