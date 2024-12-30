public class STringTransform {
    public static int lengthAfterTransformations(String s, int t) {
        
      char [] ch = s.toCharArray();
     String[] str = new String[ch.length];
     for(int i=0;i<str.length;i++){
        str[i]=String.valueOf(ch[i]);
     }
     while (t>0) {
        for(int i=0;i<str.length;i++){
            if (str[i]=="z") {
                str[i]= "ab";
            }else{
                char chr = str[i].charAt(0);
                char re = ++chr;
              str[i] = str[i].replace(chr , re );
            }
        }
        t--;
     }
    String res = String.join("", str);
    return res.length();
    }
    public static void main(String[] args) {
        System.out.println(lengthAfterTransformations("abcyy", 2));
    }
}
