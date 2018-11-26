/*
public class Main {
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました。");
            System.out.println(e.getMessage());
        }
    }
}
*/

public class Main {
    public static void main(String[] args){
        String str = "百二十三";
        int value = Integer.parseInt(str);
    }
}