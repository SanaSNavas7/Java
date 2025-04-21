class parent {
    int l, b;

    parent(int x, int y) {
        l = x;
        b = y;
    }

    void area() {
        System.out.println("Area is: " + l * b);
    }
}

class childs extends parent {
    int h;

    childs(int m, int n, int z) {
        super(m, n);
        h = z;
        System.out.println(h);
    }

    void volume() {
        System.out.println("Volume is: " + l * b * h);
    }

    public static void main(String[] args) {
        childs obj = new childs(2, 3, 4);
        obj.area();
        obj.volume();
    }
}