public abstract class Shape {
    private String pixels[][];
    protected final int SIZEX;
    protected final int SIZEY;
    private static final String FILLED = "*";
    private static final String EMPTY  = " ";

    public Shape(int SIZEX, int SIZEY) {
        if (SIZEX <= 0 || SIZEY <= 0) {
            throw new IllegalArgumentException("Illegal size of shape");
        }
        this.SIZEX = SIZEX;
        this.SIZEY = SIZEY;
        pixels = new String[SIZEX][SIZEY];
        for (int x = 0; x < SIZEX; x++) {
            for (int y = 0; y < SIZEY; y++) {
                clearPixel(x, y);
            }
        }
    }

    public abstract void fill();

    public void fillPixel(int x, int y) {
        pixels[x][y] = FILLED;
    }

    public void clearPixel(int x, int y) {
        pixels[x][y] = EMPTY;
    }

    public boolean isFilledPixel(int x, int y) {
        return (pixels[x][y].equals(FILLED));
    }

    public String toString() {
        String output = "";
        for (int y = SIZEY - 1; y >= 0; y--) {
            for (int x = 0; x < SIZEX; x++) {
                output += pixels[x][y];
            }
            output += "\n";
        }
        return output;
    }
}
