/**
 * Write a description of class WordsRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordsRunner
{
    public static void main (String [] args)
    {
        //CREATING A WORDS OBJECT
        Words myWords = new Words();

        /**
         * myWords is a Words object and the methods you wrote are part of the Words class.
         * The methods themselves should not print to the screen.
         * However, your method calls can be used in a print statement.
         * If you print a method call, whatever is returned will be printed.
         */

        System.out.println("\n \n Testing the contains method \n");

        if (myWords.contains("sleep", "ee") && !myWords.contains("sleep", "a")) {

            System.out.println("contains : works");

        } else {

            System.out.println("contains : doesn't work");

        }


        System.out.println("\n \n Testing the isPalindrome method \n");

        if(!myWords.isPalindrome("net") && myWords.isPalindrome("netten")) {

            System.out.println("isPalindrome : works");

        } else {

            System.out.println("isPalindrome : doesn't work");

        }


        System.out.println("\n \n Testing the reverse method \n");

        if(myWords.reverse("test").equals("tset") && myWords.reverse("test1").equals("1tset")) {

            System.out.println("reverse : works");

        } else {

            System.out.println("reverse : doesn't work");

        }


        System.out.println("\n \n Testing the replaceOne method \n");

        if (myWords.replaceOne("lovely", "ov", "ik").equals("likely") && myWords.replaceOne("lovely", "ov", "aded").equals("ladedely") && myWords.replaceOne("lovely", "a", "ik").equals("lovely")) {

            System.out.println("replaceOne : works");

        } else {

            System.out.println("replaceOne : doesn't work");

        }


        System.out.println("\n \n Testing the replaceAll method \n");

        if (myWords.replaceAll("lovely", "a", "ik").equals("lovely") && myWords.replaceAll("lovely", "l", "a").equals("aoveay") && myWords.replaceAll("lovely", "l", "  ").equals("  ove  y")) {

            System.out.println("replaceAll : works");

        } else {

            System.out.println("replaceAll : doesn't work");

        }


        System.out.println("\n \n Testing the removeAll method \n");

        if(myWords.removeAll("lovely", "a").equals("lovely") && myWords.removeAll("lovely", "o").equals("lvely") && myWords.removeAll("lovely", "l").equals("ovey")) {

            System.out.println("removeAll : works");

        } else {

            System.out.println("removeAll : doesn't work");

        }


        System.out.println("\n \n Testing the countVowels method \n");

        if (myWords.countVowels("nt  wrd") == 0 && myWords.countVowels("not a word") == 3 && myWords.countVowels("y is not a vowel") == 5 && myWords.countVowels("Why") == 1 && myWords.countVowels("WhY") == 1) {

            System.out.println("countVowels : works");

        } else {

            System.out.println("countVowels : doesn't work");

        }


        System.out.println("\n \n Testing the countWords method \n");

        if (myWords.countWords("   ") == 0 && myWords.countWords("oneWord") == 1 && myWords.countWords("two Words") == 2) {

            System.out.println("countWords : works");

        } else {

            System.out.println("countWords : doesn't work");
            System.out.println(myWords.countWords("   "));
        }

    }


}