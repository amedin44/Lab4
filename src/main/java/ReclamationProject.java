/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/***.
 * @author amedin44
 */

public class ReclamationProject {
    /**
     * @param a first string
     * @param b second String
     * @return returns
     */

    static String doIt(final String a, final String b) {
        String a2 = a;
        String b2 = b;
        if (a.length() > b.length())    {
            String c = a2;
            a2 = b2;
            b2 = c;
            }
        String r = ""; // I love the ternary operator!
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    }
                }
             } // Ah yeah
        }
        return r;
     }
}
