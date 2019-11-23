public class Snail {

    public static void printTable(int[][] tab, int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int height = 5;
        int width = 5;
        int[][] tab = new int[height][width];

        int w = 0;
        int h = 0;
        int numb = 0;
        int numberOfLoops = 0;

        while (numb < (height * width)) {
            // w lewo
            while (w < (width - numberOfLoops) && tab[h][w] == 0) {
                tab[h][w] = numb;
                numb++;
                w++;
            }
            w--;
            h++;
            //w dol
            while (h < (height - numberOfLoops) && tab[h][w] == 0) {
                tab[h][w] = numb;
                numb++;
                h++;
            }
            w--;
            h--;
            // w prawo
            while (w >= (0 + numberOfLoops) && tab[h][w] == 0) {
                tab[h][w] = numb;
                numb++;
                w--;
            }

            w++;
            h--;
            numberOfLoops++;
            //w gore
            while (h >= (0 + numberOfLoops) && tab[h][w] == 0) {
                tab[h][w] = numb;
                numb++;
                h--;
            }
            h++;
            w++;
        }

        printTable(tab, height, width);

    }
}
