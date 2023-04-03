package bai1;

public class Complex {
    private float real; //phần thực
    private float image; //phần ảo

    public Complex(float r, float i) {
        // Hàm khởi tạo
        this.real = r;
        this.image = i;
    }

    public Complex add(Complex c) {
        // Cộng số phức hiện tại với số phức c
        return new Complex(this.real + c.real, this.image + c.image);
    }

    public Complex minus(Complex c) {
        // Trừ số phức hiện tại cho số phức c
        return new Complex(this.real - c.real, this.image - c.image);

    }

    public Complex time(Complex c) {
        // Nhân số phức hiện tại với số phức c
        return new Complex(this.real * c.real + this.image * c.image, this.image * c.real + this.real * c.image);
    }

    public float realpart() {
        return real;
    }

    public float imagepart() {
        return image;
    }

    @Override
    public String toString() {
        String result;
        if (this.image < 0) {
            return this.real + " - " + Math.abs(this.image) + "*i";
        }
        return this.real + " + " + this.image + "*i";

    }
}
