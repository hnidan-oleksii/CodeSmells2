package Part2.Task15;

public class Shape {
    private final double dim1;
    private final double dim2;
    private final String type;

    public Shape(String type, double dim1, double dim2) {
        this.type = type;
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double getArea() {
        if (type.equals("circle")) {
            return Math.PI * dim1 * dim1;
        } else if (type.equals("rectangle")) {
            return dim1 * dim2;
        }
        return 0;
    }

    public double getPerimeter() {
        if (type.equals("circle")) {
            return 2 * Math.PI * dim1;
        } else if (type.equals("rectangle")) {
            return 2 * (dim1 + dim2);
        }
        return 0;
    }
}

