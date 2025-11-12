//Jonah Banks
//11/12/25
//This class will decide whether or not a string is valid based on set criteria
public class Parentheses{
    public static boolean isValid(String s){
        //Continues running until string is empty, or returns false because is something wrong with it
        while(!(s.equals(""))){
            //Find position of the furthest opening character
            int furthest=0;
            for(int x=0; x<s.length();x++){
                if(s.charAt(x)=='{'||s.charAt(x)=='('||s.charAt(x)=='['){
                    furthest=x;
                }
            }
            //Prevent an indexoutofbounds error.
            if(furthest+1==s.length()){
                return false;
            }else if(!((s.charAt(furthest)=='{'&&s.charAt(furthest+1)=='}')||
            (s.charAt(furthest)=='['&&s.charAt(furthest+1)==']')||
            (s.charAt(furthest)=='('&&s.charAt(furthest+1)==')'))){
                return false;
            }else{
                s=s.substring(0,furthest)+s.substring(furthest+2);
            }
        }
        return true;
}
    public static void main(String[] args){
        System.out.println(isValid("()")); //true
        System.out.println(isValid("(){}[]")); //true
        System.out.println(isValid("(]")); //false
        System.out.println(isValid("([{({})}])")); //true
        System.out.println(isValid("(([]){})")); //true
        System.out.println(isValid("{}[())()(]")); //false
        System.out.println(isValid("(){}{")); //false
        System.out.println(isValid("([)]")); //false
        System.out.println(isValid("([{}([)])]")); //false
    }
}