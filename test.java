import java.util.*;
class test
{

    //This is my first Commmmmmmmittttttt

    public static boolean isValid(String s) {
        Stack<String> stck=new Stack<String>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stck.push(String.valueOf(s.charAt(i)));
                System.out.println(stck);
            }
            else {
                String x = (String) stck.pop();
                if(x.equals(s.charAt(i)) != false) return false;

            }
        }
        return true;
    }
    public static void main(String[] args){
        String str="{()}";
        System.out.println(isValid(str)); 
    }
}