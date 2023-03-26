import java.util.ArrayList;
import java.util.Scanner;

public class Hinh {

    public double dientich() {
        return 0;
    }
}

class HinhChuNhat extends Hinh {
    private float cd;
    private float cr;

    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }

    @Override
    public double dientich() {
        return cd * cr;
    }

    @Override
    public String toString() {
        return "Hinh chu nhat: cd = " + cd + ", cr = " + cr + ", dien tich = " + dientich();
    }
}

class HinhTron extends Hinh {
    private float r;

    public HinhTron(float r) {
        this.r = r;
    }

    @Override
    public double dientich() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "Hinh tron: r = " + r + ", dien tich = " + dientich();
    }
}

class DanhSachHinh {
    private ArrayList<Hinh> list = new ArrayList<Hinh>();

    public void them(Hinh h) {
        list.add(h);
    }

    public void inDanhSach() {
        for (Hinh h : list) {
            System.out.println(h.toString());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DanhSachHinh danhSach = new DanhSachHinh();

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thong tin hinh chu nhat:");
        System.out.print("Nhap chieu dai: ");
        float cd = sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        float cr = sc.nextFloat();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(cd, cr);
        danhSach.them(hinhChuNhat);

        System.out.println("Nhap thong tin hinh tron:");
        System.out.print("Nhap ban kinh: ");
        float r = sc.nextFloat();
        HinhTron hinhTron = new HinhTron(r);
        danhSach.them(hinhTron);

        danhSach.inDanhSach();
    }
}
