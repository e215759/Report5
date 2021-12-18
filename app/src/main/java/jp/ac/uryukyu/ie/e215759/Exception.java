package jp.ac.uryukyu.ie.e215759;

/*
public class Exception {
    public static void main(String[] args){
        String str = null;
        try{
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("エラー：NullPointerException");
            System.out.println(e.getMessage());
        }
    }
}
*/

public class Exception{
    public static void main(String[] args){
        String str = "百二十三";
        int value = Integer.parseInt(str);
        try{
        } catch (NumberFormatException e) {
            System.out.println(value);
            System.out.println(e.getMessage());
        }
    }
}