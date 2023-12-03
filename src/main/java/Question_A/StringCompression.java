package Question_A;

public class StringCompression {
    public static String compressString2(String str) {
        String compressString = "";
        char length = ' ';
        String word = "";
        for (int i = 1; i < str.length(); i += 2) {
            if (i == 1) {
                length = str.charAt(i);
            }

            if (length == str.charAt(i)) {
                word += str.charAt(i - 1);
            } else {
                compressString += word + "" + length;
                word = "";
                word += str.charAt(i - 1);
                length = str.charAt(i);
            }
        }

        compressString += word + "" + str.charAt(str.length() - 1);
        return compressString;
    }

    public static String compressString(String str) {
        String compressString = "";
        int length = 0;
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                c = str.charAt(i);
                length = 0;
            }

            if (c == str.charAt(i))
                length += 1;
            else {
                compressString += c + "" + length;
                length = 1;
                c = str.charAt(i);
            }
        }
        if (length != 0)
            compressString += c + "" + length;
        return compressString;
    }

    public static String deCompressedString(String str) {
        String decompressString = "";
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 49 && str.charAt(i) <= 57) {
                int length = Integer.valueOf("" + str.charAt(i));
                for (int j = 0; j < word.length(); j++)
                    for (int k = 0; k < length; k++)
                        decompressString += word.charAt(j);

                word = "";
            } else {
                word += str.charAt(i);
            }
        }
        return decompressString;
    }

    public static void main(String[] args) {
        String str = "aabbcaaaccc";

        System.out.println("Given String: "+str);

        String compression = compressString(str);
        System.out.println("Compression String1: "+compression);

        String compresedString2 = compressString2(compression);
        System.out.println("Compressed String2: " + compresedString2);

        String decompressString = deCompressedString(compresedString2);
        System.out.println("decompress string: = " + decompressString);
    }

}