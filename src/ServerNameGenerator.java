import java.util.Random;

public class ServerNameGenerator {



        String[] adjectives = {"tiny", "dramatic", "depressed", "stressed", "pernicious", "elated", "broken", "untoward",
                "hilarious", "melancholy"};

        String[] nouns = {"dog", "sea otter", "mouse", "panda", "unicorn", "staircase", "moon", "forest",
                "amusement park", "pinata"};

        String pickRandomWord(String[] words) {
            Random rand = new Random();
            int i = rand.nextInt(words.length);
            //System.out.println(i);
            return words[i];
        }

    public static void main(String[] args) {
        ServerNameGenerator sng = new ServerNameGenerator();
        String word1 = sng.pickRandomWord(sng.adjectives); //working between static and instance lvl
        String word2 = sng.pickRandomWord(sng.nouns);
        System.out.println("Here is your server name: ");
        System.out.println(word1 + "-" + word2);


    }
}
