/**
 * String Methods to Practice
 * -=-=-=-=-=-=-=-=-=-=-=-=-=-
 *
 * @author YOUR NAME HERE
 * @version DATE HERE
 */
public class Words
{
    /**
     * Returns true if needle is in haystack. Returns false otherwise.
     *
     * Example: contains("I know!", "no") ---> true
     * Example: contains("I know!", "bye") ---> false
     */
    public boolean contains(String haystack, String needle)
    {
        return haystack.indexOf(needle) != -1;
    }

    /**
     * Returns true if str is a palindrome. Returns false otherwise.
     * A palindrome is a word that is the same forwards and backwards.
     * You may assume str does not contain spaces.
     *
     * Example: isPalindrome("madam") --> true
     * Example: isPalindrome("pancake") --> false
     */
    public boolean isPalindrome(String str)
    {
        return str.equals(reverse(str));
    }

    /**
     * Reverses the letters in all of str.
     * Returns the reversed string.
     *
     * Example: reverse("I love ducks") --> "skcud evol I"
     */
    public String reverse (String str)
    {
        int x = str.length();
        String stri = "";
        String strin = "";
        while (x > 0) {
            stri = str.substring(x-1, x);
            strin += stri;
            x--;
        }
        return strin;

    }

    /**
     * finds first instance of needle in haystack and replaces it with replacement
     * Return the modified string.
     * If needle is not in haystack, returns haystack unchanged.
     *
     * Example: replaceOne("I love ducks", "duck", "chicken") --> "I love chickens"
     * Example: replaceOne("I love ovens", "ove", "zzz") --> "I lzz ovens"
     */
    public String replaceOne(String haystack, String needle, String replacement)
    {
        int needleLoc = haystack.indexOf(needle);
        if (needleLoc == -1) {
            return haystack;
        }
        else {
            String preNeedle = haystack.substring(0, needleLoc);
            String postNeedle = haystack.substring(needleLoc + needle.length());

            return preNeedle + replacement + postNeedle;
        }

    }

    /**
     * finds all instances of needle in haystack and replaces them with replacement
     * Return the modified string.
     * If needle is not in haystack, returns haystack unchanged.
     *
     * Example: replaceAll("Hello!", "l", "zzz") --> "Hezzzzzzo!"
     * Example: replaceAll("Monday Tuesday Wednesday", "day", "cat") ---> "Moncat Tuecat Wednescat"
     */
    public String replaceAll(String haystack, String needle, String replacement)
    {
//        int fNeedleLoc = haystack.indexOf(needle);
//        if (fNeedleLoc !== -1) {
//            String fPreNeedle = haystack.substring(0, fNeedleLoc);
//            String fPostNeedle = haystack.substring(fNeedleLoc + needle.length(), haystack.length() - 1);
//            haystack = fPreNeedle + needle + fPostNeedle;
//            int needleLoc = (haystack.substring(fNeedleLoc + needle.length(), haystack.length() - 1 )).indexOf(needle);
//
//            while (needleLoc !== -1) {
//                String preNeedle = haystack.substring(0, needleLoc);
//                String postNeedle = haystack.substring(needleLoc + needle.length(), haystack.length() - 1 );
//                haystack = preNeedle + replacement + postNeedle;
//                needleLoc = (haystack.substring(needleLoc + needle.length(), haystack.length() - 1)).indexOf(needle);
//            }
//            return haystack;
//        } else {
//            return haystack;
//        }

        int pNeedle;
        int sNeedle = 0;
        while (haystack.indexOf(needle, sNeedle) != -1) {

            pNeedle = haystack.indexOf(needle, sNeedle);

            String preNeedle = haystack.substring(0, pNeedle);

            String postNeedle = haystack.substring(pNeedle + needle.length());

            haystack = preNeedle + replacement + postNeedle;

            sNeedle = haystack.indexOf(needle, sNeedle + needle.length());

        }
        return haystack;
    }

    /**
     * finds all instance of needle in haystack and removes them. 
     * Returns the modified String. 
     * If needle is not in haystack, returns haystack unchanged.
     *
     * Example: removeAll("ABC 123", "ABC") --> " 123"
     * Example: removeAll("My name is Mrs. Lang", " ") --> "MynameisMrs.Lang"
     */
    public String removeAll(String haystack, String needle)
    {
//        int fNeedleLoc = haystack.indexOf(needle);
//        if (fNeedleLoc !== -1) {
//            String fPreNeedle = haystack.substring(0, fNeedleLoc);
//            String fPostNeedle = haystack.substring(fNeedleLoc + needle.length(), haystack.length() - 1);
//            haystack = fPreNeedle + "" + fPostNeedle;
//            int needleLoc = (haystack.substring(fNeedleLoc + needle.length(), haystack.length() - 1)).indexOf(needle);
//
//            while (needleLoc !== -1) {
//                String preNeedle = haystack.substring(0, needleLoc);
//                String postNeedle = haystack.substring(needleLoc + needle.length(), haystack.length() - 1);
//                haystack = preNeedle + "" + postNeedle;
//                needleLoc = (haystack.substring(needleLoc + needle.length(), haystack.length() - 1)).indexOf(needle);
//            }
//            return haystack;
//        } else {
//            return haystack;
//        }

        int pNeedle;
        int sNeedle = 0;

        while (haystack.indexOf(needle, sNeedle) != -1) {

            pNeedle = haystack.indexOf(needle, sNeedle);

            String preNeedle = haystack.substring(0, pNeedle);

            String postNeedle = haystack.substring(pNeedle + needle.length());

            haystack = preNeedle + postNeedle;

            sNeedle = haystack.indexOf(needle, sNeedle + needle.length());
        }

        return haystack;
    }

    /**
     * Returns the number of vowels in str.
     * Vowels are a, e, i, o, u and their uppercase counterparts.
     * Hint: use the String method toLowerCase() to create a lowercase version of str.
     * Challenge for extra points: Count y as a vowel only if no other vowels are found.
     *
     * Example: countVowels("aeiou") --> 5
     * Example: countVowels("My name is Amanda") --> 6
     */
    public int countVowels(String str)
    {
//        int faLoc = str.indexOf("a");
//        int feLoc = str.indexOf("e");
//        int fiLoc = str.indexOf("i");
//        int foLoc = str.indexOf("o");
//        int fuLoc = str. indexOf("u");
//
//        int fALoc = str.indexOf("A");
//        int fELoc = str.indexOf("E");
//        int fILoc = str.indexOf("I");
//        int fOLoc = str.indexOf("O");
//        int fULoc = str. indexOf("U");
//
//        int vCount;
//
//        if (faLoc !== -1) {
//            String fpreNeedle = str.substring(0, faLoc);
//            String fPostNeedle = str.substring(faLoc + 1, str.length() + 1);
//            vCount++;
//            int needleLoc = (str.substring(faLoc + 1, str.length() + 1)).indexOf("a");
//
//            while (needleLoc !== -1) {
//                String preNeedle = str.substring(0, needleLoc);
//                String postNeedle = str.substring(needleLoc + 1, str.length() + 1);
//                vCount++;
//                needleLoc = (str.substring(needleLoc + 1, str.length() + 1)).indexOf("a");
//            }
//        }
//
//        if (feLoc !== -1) {
//            String fpreNeedle =str.substring(0, feLoc);
//            String fPostNeedle = str.substring(feLoc + 1, str.length() + 1);
//            vCount++;
//            int needleLoc = (str.substring(feLoc + 1, str.length() + 1)).indexOf("e");
//
//            while (needleLoc !== -1) {
//                String preNeedle = str.substring(0, needleLoc)
//                String postNeedle = str.substring(needleLoc + 1, str.length() + 1);
//                vCount++
//                needleLoc = (str.substring(needleLoc + 1, str.length() + 1)).indexOf("e");
//            }
//        }
//
//        if (fiLoc !== -1) {
//            String fPreNeedle =str.substring(0, fiLoc);
//            String fPostNeedle = str.substring(fiLoc + 1, str.length() + 1);
//            vCount++;
//            int needleLoc = (str.substring(fiLoc + 1, str.length() + 1)).indexOf("i");
//
//            while (needleLoc !== -1) {
//                String preNeedle = str.substring(0, needleLoc);
//                String postNeedle = str.substring(needleLoc + 1, str.length() + 1);
//                vCount++;
//                needleLoc = (str.substring(needleLoc + 1, str.length() + 1)).indexOf("i");
//            }
//        }
//
//
//        if (foLoc !== -1) {
//            String fPreNeedle =str.substring(0, foLoc);
//            String fPostNeedle = str.substring(foLoc + 1, str.length() + 1);
//            vCount++;
//            int needleLoc = (str.substring(foLoc + 1, str.length() + 1)).indexOf("o");
//
//            while (needleLoc !== -1) {
//                String preNeedle = str.substring(0, needleLoc);
//                String postNeedle = str.substring(needleLoc + 1, str.length() + 1);
//                vCount++;
//                needleLoc = (str.substring(needleLoc + 1, str.length() + 1)).indexOf("o");
//            }
//        }
//
//        if (fuLoc !== -1) {
//            String fPreNeedle =str.substring(0, fuLoc);
//            String fPostNeedle = str.substring(fuLoc + 1, str.length() + 1);
//            vCount++;
//            int needleLoc = (str.substring(fuLoc + 1, str.length() + 1)).indexOf("u");
//
//            while (needleLoc !== -1) {
//                String preNeedle = str.substring(0, needleLoc);
//                String postNeedle = str.substring(needleLoc + 1, str.length() + 1);
//                vCount++;
//                needleLoc = (str.substring(needleLoc + 1, str.length() + 1)).indexOf("u");
//            }
//        }
//
//        if (fALoc !== -1) {
//            String fPreNeedle =str.substring(0, fALoc);
//            String fPostNeedle = str.substring(fALoc + 1, str.length() + 1);
//            vCount++;
//            int needleLoc = (str.substring(fALoc + 1, str.length() + 1)).indexOf("A");
//
//            while (needleLoc !== -1) {
//                String preNeedle = str.substring(0, needleLoc);
//                String postNeedle = str.substring(needleLoc + 1, str.length() + 1);
//                vCount++;
//                needleLoc = (str.substring(needleLoc + 1, str.length() + 1)).indexOf("A");
//            }
//        }
//
//        if (fELoc !== -1) {
//            String fPreNeedle =str.substring(0, fELoc);
//            String fPostNeedle = str.substring(fELoc + 1, str.length() + 1);
//            vCount++;
//            int needleLoc = (str.substring(fELoc + 1, str.length() + 1)).indexOf("E");
//
//            while (needleLoc !== -1) {
//                String preNeedle = str.substring(0, needleLoc);
//                String postNeedle = str.substring(needleLoc + 1, str.length() + 1);
//                vCount++;
//                needleLoc = (str.substring(needleLoc + 1, str.length() + 1)).indexOf("E");
//            }
//        }
//
//        if (fILoc !== -1) {
//            String fPreNeedle =str.substring(0, fILoc);
//            String fPostNeedle = str.substring(fILoc + 1, str.length() + 1);
//            vCount++;
//            int needleLoc = (str.substring(fILoc + 1, str.length() + 1)).indexOf("I");
//
//            while (needleLoc !== -1) {
//                String preNeedle = str.substring(0, needleLoc);
//                String postNeedle = str.substring(needleLoc + 1, str.length() + 1);
//                vCount++;
//                needleLoc = (str.substring(needleLoc + 1, str.length() + 1)).indexOf("I");
//            }
//        }
//
//        if (fOLoc !== -1) {
//            String fPreNeedle =str.substring(0, fOLoc);
//            String fPostNeedle = str.substring(fOLoc + 1, str.length() + 1);
//            vCount++;
//            int needleLoc = (str.substring(fOLoc + 1, str.length() + 1)).indexOf("O");
//
//            while (needleLoc !== -1) {
//                String preNeedle = str.substring(0, needleLoc);
//                String postNeedle = str.substring(needleLoc + 1, str.length() + 1);
//                vCount++;
//                needleLoc = (str.substring(needleLoc + 1, str.length() + 1)).indexOf("O");
//            }
//        }
//
//        if (fULoc !== -1) {
//            String fPreNeedle =str.substring(0, fULoc);
//            String fPostNeedle = str.substring(fULoc + 1, str.length() + 1);
//            vCount++;
//            int needleLoc = (str.substring(fULoc + 1, str.length() + 1)).indexOf("U");
//
//            while (needleLoc != -1) {
//                String preNeedle = str.substring(0, needleLoc);
//                String postNeedle = str.substring(needleLoc + 1, str.length() + 1);
//                vCount++;
//                needleLoc = (str.substring(needleLoc + 1, str.length() + 1)).indexOf("U");
//            }
//        }
//
//        return vCount;

        int faLoc = str.indexOf("a");
        int feLoc = str.indexOf("e");
        int fiLoc = str.indexOf("i");
        int foLoc = str.indexOf("o");
        int fuLoc = str. indexOf("u");
        int fyLoc = str.indexOf("y");

        int fALoc = str.indexOf("A");
        int fELoc = str.indexOf("E");
        int fILoc = str.indexOf("I");
        int fOLoc = str.indexOf("O");
        int fULoc = str.indexOf("U");
        int fYLoc = str.indexOf("Y");

        int vCount = 0;

        if (faLoc != -1) {

            int pNeedle = faLoc;
            int sNeedle = 0;
            while (str.indexOf("a", sNeedle) != -1) {
                pNeedle = str.indexOf("a", sNeedle);
                vCount++;
                sNeedle = str.indexOf("a", pNeedle) + 1;
            }
        }

        if (feLoc != -1) {

            int pNeedle = feLoc;
            int sNeedle = 0;
            while (str.indexOf("e", sNeedle) != -1) {
                pNeedle = str.indexOf("e", sNeedle);
                vCount++;
                sNeedle = str.indexOf("e", pNeedle) + 1;
            }
        }

        if (fiLoc != -1) {

            int pNeedle = fiLoc;
            int sNeedle = 0;
            while (str.indexOf("i", sNeedle) != -1) {
                pNeedle = str.indexOf("i", sNeedle);
                vCount++;
                sNeedle = str.indexOf("i", pNeedle) + 1;
            }
        }

        if (foLoc != -1) {

            int pNeedle = foLoc;
            int sNeedle = 0;
            while (str.indexOf("o", sNeedle) != -1) {
                pNeedle = str.indexOf("o", sNeedle);
                vCount++;
                sNeedle = str.indexOf("o", pNeedle) + 1;
            }
        }

        if (fuLoc != -1) {

            int pNeedle = fuLoc;
            int sNeedle = 0;
            while (str.indexOf("u", sNeedle) != -1) {
                pNeedle = str.indexOf("u", sNeedle);
                vCount++;
                sNeedle = str.indexOf("u", pNeedle) + 1;
            }
        }

        if (fALoc != -1) {

            int pNeedle = fALoc;
            int sNeedle = 0;
            while (str.indexOf("A", sNeedle) != -1) {
                pNeedle = str.indexOf("A", sNeedle);
                vCount++;
                sNeedle = str.indexOf("A", pNeedle) + 1;
            }
        }

        if (fELoc != -1) {

            int pNeedle = feLoc;
            int sNeedle = 0;
            while (str.indexOf("E", sNeedle) != -1) {
                pNeedle = str.indexOf("E", sNeedle);
                vCount++;
                sNeedle = str.indexOf("E", pNeedle) + 1;
            }
        }

        if (fILoc != -1) {

            int pNeedle = fILoc;
            int sNeedle = 0;
            while (str.indexOf("I", sNeedle) != -1) {
                pNeedle = str.indexOf("I", sNeedle);
                vCount++;
                sNeedle = str.indexOf("I", pNeedle) + 1;
            }
        }

        if (fOLoc != -1) {

            int pNeedle = fOLoc;
            int sNeedle = 0;
            while (str.indexOf("O", sNeedle) != -1) {
                pNeedle = str.indexOf("O", sNeedle);
                vCount++;
                sNeedle = str.indexOf("O", pNeedle) + 1;
            }
        }

        if (fULoc != -1) {

            int pNeedle = fULoc;
            int sNeedle = 0;
            while (str.indexOf("U", sNeedle) != -1) {
                pNeedle = str.indexOf("U", sNeedle);
                vCount++;
                sNeedle = str.indexOf("U", pNeedle) + 1;
            }
        }

        if (vCount == 0) {

            if (fyLoc != -1) {

                int pNeedle = fyLoc;
                int sNeedle = 0;
                while (str.indexOf("y", sNeedle) != -1) {
                    pNeedle = str.indexOf("y", sNeedle);
                    vCount++;
                    sNeedle = str.indexOf("y", pNeedle) + 1;
                }
            }

            if (fYLoc != -1) {

                int pNeedle = fYLoc;
                int sNeedle = 0;
                while (str.indexOf("Y", sNeedle) != -1) {
                    pNeedle = str.indexOf("Y", sNeedle);
                    vCount++;
                    sNeedle = str.indexOf("Y", pNeedle) + 1;
                }
            }
        }

        return vCount;
    }

    /**
     * Returns the total number of words in str.
     * A word is defined as a group of non-space characters.
     *
     * Example: countWords("***") --> 1
     * Example: countWords("hi 123") --> 2
     * Example: countWords("   ") --> 0
     */
    public int countWords(String str)
    {
        int sCount = 0;
        int sStart = 0;
        String strT = str.trim();
        if (!strT.equals("")) {

            while (strT.indexOf(" ", sStart) != -1) {

                sCount++;

                sStart = strT.indexOf(" ", sStart) + 1;

            }

            return sCount + 1;
        } else {

            return 0;

        }


    }
}