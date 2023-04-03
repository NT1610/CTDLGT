package bai4;

public class Sphere {
    private double r;
    private double x, y, z;

    public Sphere() {
        r = 0;
        x = 0;
        y = 0;
        z = 0;
    }

    public Sphere(double r, double x, double y, double z) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Diện tích hình cầu
    public double area() {
        return 4 * Math.PI * this.r * this.r;
    }

    // Thể tích hình cầu
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.r, 3);
    }

    // Hai hình cầu bao nhau
    public boolean overlap(Sphere sphere) {
        double centerDistance = Math.sqrt(Math.pow(sphere.x - x, 2) + Math.pow(sphere.y - y, 2) + Math.pow(sphere.z - z, 2));

        if (centerDistance <= Math.abs(this.r - sphere.r)) {
            return true;
        }
        return false;
    }

    // Hai hình cầu giao nhau
    public boolean intersect(Sphere sphere) {
        double centerDistance = Math.sqrt(Math.pow(sphere.x - x, 2) + Math.pow(sphere.y - y, 2) + Math.pow(sphere.z - z, 2));
        if (centerDistance >= Math.abs(this.r - sphere.r) && centerDistance <= (this.r + sphere.r)) {
            return true;
        }
        return false;
    }
}
