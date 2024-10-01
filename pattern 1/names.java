package pattern;

public class names {
    public static void main(String[] args) {
        printS();
        System.out.println();
        printA();
        System.out.println();
        printR();
        System.out.println();
        printA();
        System.out.println();
        printT();
        System.out.println();
        printH();
        System.out.println();
        printI();
    }

    public static void printS() {
        String[] s = {
                " SSSSS ",
                "S     S",
                "S      ",
                " SSSSS ",
                "      S",
                "S     S",
                " SSSSS "
        };
        for (String line : s) {
            System.out.println(line);
        }
    }

    public static void printA() {
        String[] a = {
                "   A   ",
                "  A A  ",
                " A   A ",
                "AAAAAAA",
                "A     A",
                "A     A",
                "A     A"
        };
        for (String line : a) {
            System.out.println(line);
        }
    }

    public static void printR() {
        String[] r = {
                "RRRRRR ",
                "R     R",
                "R     R",
                "RRRRRR ",
                "R   R  ",
                "R    R ",
                "R     R"
        };
        for (String line : r) {
            System.out.println(line);
        }
    }

    public static void printT() {
        String[] t = {
                "TTTTTTT",
                "   T   ",
                "   T   ",
                "   T   ",
                "   T   ",
                "   T   ",
                "   T   "
        };
        for (String line : t) {
            System.out.println(line);
        }
    }

    public static void printH() {
        String[] h = {
                "H     H",
                "H     H",
                "H     H",
                "HHHHHHH",
                "H     H",
                "H     H",
                "H     H"
        };
        for (String line : h) {
            System.out.println(line);
        }
    }

    public static void printI() {
        String[] i = {
                "IIIIIII",
                "   I   ",
                "   I   ",
                "   I   ",
                "   I   ",
                "   I   ",
                "IIIIIII"
        };
        for (String line : i) {
            System.out.println(line);
        }
    }
}
