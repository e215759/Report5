package jp.ac.uryukyu.ie.e215759;

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
