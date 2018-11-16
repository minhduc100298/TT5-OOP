public abstract class Shape {
    protected double Area, Volume;
    protected String Name;

    protected double calArea() {
        return this.Area;
    }

    protected double calVolume() {
        return this.Volume;
    }

    protected abstract String getName();
}

class Point extends Shape {
    protected double x, y;

    protected Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected double calArea() {
        return super.calArea();
    }

    @Override
    protected double calVolume() {
        return super.calVolume();
    }

    @Override
    protected String getName() {
        Name = "Point";
        return Name;
    }
}

class Circle extends Point {
    protected double r;

    protected Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    @Override
    protected double calArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    protected double calVolume() {
        System.out.println("A circle does not have a volume");
        return super.calVolume();
    }

    @Override
    protected String getName() {
        Name = "Circle";
        return Name;
    }
}

class Cylinder extends Circle {
    protected double h;

    protected Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    @Override
    protected double calArea() {
        return 2 * Math.PI * r * (h + r);
    }

    @Override
    protected double calVolume() {
        return Math.PI * Math.pow(r, 2) * h;
    }

    @Override
    protected String getName() {
        Name = "Cylinder";
        return Name;
    }
}
