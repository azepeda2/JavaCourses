

public class WordPlay {

    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                return true;
            }

        return false;
    }

    public static void main(String[] args) {
        WordPlay wp = new WordPlay();
        System.out.println(wp.isVowel('q'));
        System.out.println(wp.isVowel('w'));
        System.out.println(wp.isVowel('r'));
        System.out.println(wp.isVowel('t'));
        System.out.println(wp.isVowel('e'));
        System.out.println(wp.isVowel('Q')); 
        System.out.println(wp.isVowel('W'));
        System.out.println(wp.isVowel('R'));
        System.out.println(wp.isVowel('T'));
        System.out.println(wp.isVowel('E'));
    }
}