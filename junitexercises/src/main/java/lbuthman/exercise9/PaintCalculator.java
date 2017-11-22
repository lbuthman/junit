package lbuthman.exercise9;

public class PaintCalculator {

    private static int GALLONS_IN_FEET = 350;

    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateGallons() {
        int gallons = 0;
        int area = length * width;

        while (area > 0) {
            gallons++;
            area -= GALLONS_IN_FEET;
        }

        return gallons;
    }
}
