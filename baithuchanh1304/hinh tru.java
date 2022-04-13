package shapes;

import java.util.scanner;

public class HinhTru extends HinhHoc {

    public float Chieucao;

    //Constructor
    public HinhTru() {
        ten = "hinh tru";
    }

    public void nhapChieuCao() {
        nhapBanKinh();

        System.out.println("Chieu cao = ");
        Scanner scanner = new scanner(System.in);
        Chieucao = scanner.nextFloat();
    }
    public void tinhTheTich() {
        tinhTheTich();
        TheTich = DienTich * Chieucao;
    }
}