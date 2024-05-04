package Part2.Task4;

public final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ImmutablePoint that = (ImmutablePoint) obj;
        return x == that.x && y == that.y;
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
