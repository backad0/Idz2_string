public class StringProcessor {
    public static String getMultipliedString(String string, int n) {
        if (string == null) throw new IllegalArgumentException("String can`t be null");
        if (n < 0) throw new IllegalArgumentException("n < 0!");
        //if (n == 0) return "";
        String res = "";
        for (int i = 0; i < n; i++) res = res.concat(string);
        return res;
    }

    public static int getNumberOfInputs(String string1, String string2) {
        if (string2 == null) throw new IllegalArgumentException("Target can`t be null");
        if (string2.equals("")) throw new IllegalArgumentException("Target can`t be empty");
        return (string1.length() - string1.replace(string2, "").length() / string2.length());
    }

    public static String convertNumbersToWords(String str) {
        if (str == null) throw new IllegalArgumentException("String can`t be null");
        if (str.equals("")) throw new IllegalArgumentException("String can`t be empty");
        return (str.replace("1", "one").replace("2", "two").replace("3", "three"));
    }

    public static void deleteEverySecondNumber(StringBuilder str1) {
        if (str1 == null) throw new IllegalArgumentException("String can`t be null");
        if (str1.equals("")) throw new IllegalArgumentException("String can`t be empty");
        for (int i = 1; i <= str1.length(); i++) {
            str1.deleteCharAt(i);
        }

    }

    /*public static String getReversedWOSpaces(String str) {
        StringBuilder str1 = new StringBuilder(str);
        StringBuilder res = new StringBuilder();
        char[] cArray = new char[str.length()];
        str1.getChars(0, str.length(), cArray, 0);
        int j = str.length()-1 , wCount1 = 0, wCount2 = 0, lettersCount1 = 0, lettersCount2 = 0, stopIndex = str.length()-1;
        char check = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (cArray[i] == ' ') {
                res.append("|");
            } else {
                //search words from the end and looks where we`ll going to take word
                while ((wCount1 == wCount2)&&(i != str.length()-1)){
                    if ((cArray[j] == ' ')&&(lettersCount1 == 0)) {stopIndex = j; j--;}
                    if ((cArray[j] == ' ')&&(lettersCount1 != 0)) {j--; wCount1++;}
                    if ((cArray[j] != ' ')&&(j>=0)) {j--; lettersCount1++;}
                } // check if there are word or space in the end of array
                if (stopIndex == str.length()){
                    for (int l = j+1; l<=stopIndex;l++){
                        res.append(cArray[l]);
                    }
                } else {
                    for (int l = j+1; l<stopIndex;l++){
                        res.append(cArray[l]);
                    }
                }
                int i1 = i+1;
                while (check != ' '){
                    check = cArray[i1];
                    i1++;
                    lettersCount2++;
                }
                wCount2++;
                i=i+lettersCount2;
            }
        }
        return res.toString();
    }*/
}


