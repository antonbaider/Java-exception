package jom.com.softserve.s1.task2;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXYPair() {
        return new int[]{x, y};
    }

    public double distance(int x, int y) {
        return Math.sqrt((double) (this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point point) {
        return Math.sqrt((double) (this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y));
    }

    public double distance() {
        return Math.sqrt((double) (this.x) * (this.x) + (this.y) * (this.y));
    }
}