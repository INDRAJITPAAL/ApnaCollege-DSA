public class directionShortPathFind {
    public static void findShortPath(String str) {
        int X = 0;
        int Y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {c
                X++;
            } else if (str.charAt(i) == 'E') {
                Y++;
            } else if (str.charAt(i) == 'S') {
                X--;
            } else {
                X--;
            }

        }

        int x2 = X * X;
        int y2 = Y * Y;
        System.out.println(Math.sqrt(x2 + y2));
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        findShortPath(str);
    }
}
