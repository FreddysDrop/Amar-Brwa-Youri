package console;

public class Rectangle extends Shape {
    public Rectangle(int SIZEX, int SIZEY) {
        super(SIZEX, SIZEY);
        fill();
    }

    @Override
    public void fill() {
        for (int x = 0; x < SIZEX; x++) {
            for (int y = 0; y < SIZEY; y++) {
                fillPixel(x, y);

            }
        }
    }
}
