package loppoint2dva3d;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float Y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        return new float[] {x,y};
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
