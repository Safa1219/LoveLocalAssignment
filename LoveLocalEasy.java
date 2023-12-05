//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal 
//substring consisting of non-space characters only.

public class LoveLocalEasy {
        public int lengthOfLastWord(String s) {
           
            String str = s.trim();
            int count = 0;
            for(int i=str.length()-1;i>=0;i--){
                if(str.charAt(i) != ' '){
                    count++;
                }else{
                    break;
                }
            }
            return count;
        }


    public static void main(String[] args) {
        LoveLocalEasy a1 = new LoveLocalEasy();
        System.out.println(a1.lengthOfLastWord("Hello World"));
        System.out.println(a1.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(a1.lengthOfLastWord("luffy is still joyboy"));
    }
}

