package Hw3_19000308.exercise1;

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
        Complex a = this;
        float r = a.real + c.real;
        float i = a.image + c.image;
        return new Complex(r, i);
    }


    public Complex minus(Complex c) {
        // Trừ số phức hiện tại cho số phức c
        Complex a = this;
        float r = a.real - c.real;
        float i = a.image - c.image;
        return new Complex(r, i);
    }

    public Complex times(Complex c) {
        // Nhân số phức hiện tại với số phức c
        Complex a = this;
        float r = a.real * c.real - a.image * c.image;
        float i = a.real * c.image + a.image * c.real;
        return new Complex(r, i);
    }

    public float realpart() {
        return real;
    }

    public float imagepart() {
        return image;
    }

    @Override
    public String toString() {
        // In ra số phức
        if (real == 0) return image + "*i";
        if (image == 0) return real + " ";
        if (image < 0) return real + "-" + (-image) + "*i";
        return real + " + " + image + "*i";
    }
}
