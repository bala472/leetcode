public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String temp = s.toLowerCase();
        String result1="";
        for(int i=0;i<temp.length();i++){
        if(((int) temp.charAt(i)>=97 && (int)temp.charAt(i)<=122) || ((int) temp.charAt(i)>=48 && (int)temp.charAt(i)<=57)){
            result1=result1+Character.toString(temp.charAt(i));
        }
        }
        StringBuilder result2 = new StringBuilder(result1);
        result2.reverse();
        String result=new String(result2);
        if(result1.equals(result)){
            return true;
        }
        return false;
    }
}
