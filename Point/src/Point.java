public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(new Point(0 , 0));

    }

    public double distance(Point point) {
        return  ( Math.sqrt( (Math.pow(( (double)point.x - (double)this.x), 2)) +
                (Math.pow(( (double)point.y - (double)this.y ), 2)) ) );
    }

    public double distance(int x, int y) {
        return distance(new Point(x , y));
    }
}
