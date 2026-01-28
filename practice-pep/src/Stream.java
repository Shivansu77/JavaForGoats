public class Stream {
    public static void main(String[] args) {
        skip("","baddaah");
        skipApple("","mappleguysapp");

    }
    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }

    public static void skipApple(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        if(up.startsWith("apple")){
            skipApple(p,up.substring(5));
        }else{
            skipApple(p+up.charAt(0),up.substring(1));
        }
    }

    public static void skipAppButNotAPPLE(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            skipAppButNotAPPLE(p,up.substring(3));
        }else{
            skipAppButNotAPPLE(p+up.charAt(0),up.substring(1));
        }
    }



}
