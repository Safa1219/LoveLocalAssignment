public class LoveLocalEasy {
    public int lengthOfLastWord(String str) {
        str = str.trim();
        int lastSpaceIndex = str.lastIndexOf(32);
        return str.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        LoveLocalEasy a1 = new LoveLocalEasy();
        System.out.println(a1.lengthOfLastWord("Hello World"));
        System.out.println(a1.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(a1.lengthOfLastWord("luffy is still joyboy"));
    }
}
