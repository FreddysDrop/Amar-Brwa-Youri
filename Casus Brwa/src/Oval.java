public class Oval extends Shape{

    public Oval(int SIZEX, int SIZEY) {
        super(SIZEX, SIZEY);
        fill();
    }

    private static double offCenter(double center, int size, int pixel) {
        return 2 * (pixel + 0.5 - center) / size;
    }

    @Override
    public void fill() {
        double xCenter = SIZEX / 2.0;
        double yCenter = SIZEY / 2.0;

        for (int xPixel = 0; xPixel < SIZEX; xPixel++) {
            double xOffCenter = offCenter(xCenter, SIZEX, xPixel);
            for (int yPixel = 0; yPixel < SIZEY; yPixel++) {
                double yOffCenter = offCenter(yCenter, SIZEY, yPixel);
                if (xOffCenter * xOffCenter + yOffCenter * yOffCenter <= 1) {
                    fillPixel(xPixel, yPixel);
                }
            }
        }
    }
}
