//Jonah Banks
public class Parentheses{
    public boolean isValid(String s){
        //1st, find the furthest right opening parenth in the string s
        //2nd, find corresponding closing parenth
        //3rd, repeat until all have been matched, or not
        while(!(s.equals(""))){
            int furthest=0;
            for(int x=0; x<s.length();x++){
                if(s.charAt(x)=='{'||s.charAt(x)=='('||s.charAt(x)=='['){
                    furthest=x;
                }
            }
            if(furthest+1==s.length()){
                return false;
            }else if(!((s.charAt(furthest)=='{'&&s.chatAt(furthest+1)=='}')||
            (s.charAt(furthest)=='['&&s.charAt(furthest+1)==']')||
            (s.charAt(furthest)=='('&&s.charAt(furthest+1)==')'))){
                return false;
            }else{
                s=s.substring(0,furthest)+s.substring(furthest+2);
            }
    }}
    public static void main(String[] args){
        isValid("{[]}");
        isValid("[{]");
    }
}