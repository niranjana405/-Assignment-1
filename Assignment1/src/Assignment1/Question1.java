package Assignment1;

public class Question1 {

    public static void main(String[] args) {
        String[] iPattern = {
            "  I    ",
            "  I    ",
            "  I    ",
            "  I    ",
            "  I    ",
            "  I    ",
            "  I    ",
            "IIIIIII"
        };

        String[] nPattern = {
            "N     N",
            "NN    N",
            "N N   N",
            "N  N  N",
            "N   N N",
            "N    NN",
            "N     N",
            "N     N"
        };

        String[] ePattern = {
            "EEEEEEE",
            "E      ",
            "E      ",
            "EEEEEEE",
            "E      ",
            "E      ",
            "E      ",
            "EEEEEEE"
        };

        String[] uPattern = {
            "U     U",
            "U     U",
            "U     U",
            "U     U",
            "U     U",
            " U   U ",
            "  UUU  "
        };

        String[] rPattern = {
            "RRRRRR ",
            "R     R",
            "R     R",
            "RRRRRR ",
            "R  R   ",
            "R   R  ",
            "R    R "
        };

        String[] oPattern = {
            " OOOOO ",
            "O     O",
            "O     O",
            "O     O",
            "O     O",
            "O     O",
            " OOOOO "
        };
        

        printPattern(iPattern);
        printPattern(nPattern);
        printPattern(ePattern);
        printPattern(uPattern);
        printPattern(rPattern);
        printPattern(oPattern);
        printPattern(nPattern);

    }

    public static void printPattern(String[] pattern) {
        for (String line : pattern) {
            System.out.println(line);
        }
        System.out.println();
    }
}
