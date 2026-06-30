public class day72{
    public static boolean palindrome(String str){
        int start=0;
        int end=str.length()-1;
        int mid=(str.length()-1)/2;
        while(start!=mid){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="mom";
        boolean b=palindrome(str);
        if(b==true){
            System.out.println("the string is palindrome");
        }
        else{
            System.out.println("the string is not palindrome");
        }
    }
}

