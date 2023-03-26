/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.congtyx;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuyenXe {
    private String Masochuyen;
    private String Hotentaixe;
    private int Soxe;
    private double Doanhthu;

    public ChuyenXe() {
    }

    public ChuyenXe(String Masochuyen, String Hotentaixe, int Soxe) {
        this.Masochuyen = Masochuyen;
        this.Hotentaixe = Hotentaixe;
        this.Soxe = Soxe;
    }

    public String getMasochuyen() {
        return Masochuyen;
    }

    public void setMasochuyen(String Masochuyen) {
        this.Masochuyen = Masochuyen;
    }

    public String getHotentaixe() {
        return Hotentaixe;
    }

    public void setHotentaixe(String Hotentaixe) {
        this.Hotentaixe = Hotentaixe;
    }

    public int getSoxe() {
        return Soxe;
    }

    public void setSoxe(int Soxe) {
        this.Soxe = Soxe;
    }

    public double getDoanhthu() {
        return Doanhthu;
    }

    public void setDoanhthu(double Doanhthu) {
        this.Doanhthu = Doanhthu;
    }

    @Override
    public String toString() {
        return "ChuyenXe{" + "Masochuyen=" + Masochuyen + ", Hotentaixe=" + Hotentaixe + ", Soxe=" + Soxe + ", Doanhthu=" + Doanhthu + '}';
    }


}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.congtyx;

/**
 *
 * @author ADMIN
 */
public class CXNoiT extends ChuyenXe{
   
    private String Sokmdiduoc;
    private String sotuyen;

    public CXNoiT() {
    }

  
    public CXNoiT(String Sokmdiduoc, String sotuyen, String Masochuyen, String Hotentaixe, int Soxe) {
        super(Masochuyen, Hotentaixe, Soxe);
        this.Sokmdiduoc = Sokmdiduoc;
        this.sotuyen = sotuyen;
    }

   

    public String getSokmdiduoc() {
        return Sokmdiduoc;
    }

    public void setSokmdiduoc(String Sokmdiduoc) {
        this.Sokmdiduoc = Sokmdiduoc;
    }

    public String getSotuyen() {
        return sotuyen;
    }

    public void setSotuyen(String sotuyen) {
        this.sotuyen = sotuyen;
    }

    @Override
    public String toString() {
        return super.toString()+ "CXNoiT{" + "Sokmdiduoc=" + Sokmdiduoc + ", sotuyen=" + sotuyen + '}';
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.congtyx;

/**
 *
 * @author ADMIN
 */
public class CXNgoaiT extends ChuyenXe{
    private String Noiden;
    private String SoNgaydiduoc;

    public CXNgoaiT() {
        
    }

   
    public CXNgoaiT(String Noiden, String SoNgaydiduoc, String Masochuyen, String Hotentaixe, int Soxe) {
        super(Masochuyen, Hotentaixe, Soxe);
        this.Noiden = Noiden;
        this.SoNgaydiduoc = SoNgaydiduoc;
    }

    
   
    public String getNoiden() {
        return Noiden;
    }

    public void setNoiden(String Noiden) {
        this.Noiden = Noiden;
    }

    public String getSoNgaydiduoc() {
        return SoNgaydiduoc;
    }

    public void setSoNgaydiduoc(String SoNgaydiduoc) {
        this.SoNgaydiduoc = SoNgaydiduoc;
    }

    @Override
    public String toString() {
        return  super.toString()+"CXNgoaiT{" + "Noiden=" + Noiden + ", SoNgaydiduoc=" + SoNgaydiduoc + '}';
    }
    

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.congtyx;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CongTyX {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //  ArrayList<ChuyenXe> listCX;
    
        //listCX = new ArrayList<ChuyenXe>();
       
       //ChuyenXe cx = new CXNoiT();
       
        while(true){
         //Scanner sc = new Scanner(System.in);
            System.out.println("Nhap1 de nhap thong tin chuyen xe noi thanh");
            System.out.println("Nhap 2 de nhap thong tin chuyen xe ngoai thnah");
            System.out.println("Nhap 3 de ngung nhap");
             int nhap=Integer.parseInt(sc.nextLine());
             if(nhap==1){
                  ArrayList<CXNoiT> arrNoi = new ArrayList<CXNoiT>();
               CXNoiT noiT = new CXNoiT();
               
               System.out.println("masochuyen=");
               noiT.setMasochuyen(sc.nextLine());
               System.out.println("HotenTaixe=");
               noiT.setHotentaixe(sc.nextLine());
               System.out.println("soxe=");
               noiT.setSoxe(sc.nextInt());
               System.out.println("sotuyen=");
               noiT.setSotuyen(sc.nextLine());
               noiT.setSotuyen(sc.nextLine());
                 System.out.println("sokmdiduoc=");
                 noiT.setSokmdiduoc(sc.nextLine());
                 System.out.println("doanhthu=");
                 noiT.setDoanhthu(sc.nextDouble());
                 
                 //cx =new CXNoiT();
                 arrNoi.add(noiT);
                   for(CXNoiT i: arrNoi) {
               System.out.println(i.toString());
                       
            }
               
           }
             if(nhap==2){{
                  ArrayList<CXNgoaiT> arrNgoai = new ArrayList<CXNgoaiT>();
                 CXNgoaiT ngoaiT = new CXNgoaiT();
               System.out.println("masochuyen=");
               ngoaiT.setMasochuyen(sc.nextLine());
               System.out.println("HotenTaixe=");
               ngoaiT.setHotentaixe(sc.nextLine());
               System.out.println("soxe=");
               ngoaiT.setSoxe(sc.nextInt());
                 System.out.println("noiden=");
                 ngoaiT.setNoiden(sc.nextLine());
                 System.out.println("songaydiduoc");
                 ngoaiT.setSoNgaydiduoc(sc.nextLine());
                System.out.println("doanhthu=");
                 ngoaiT.setDoanhthu(sc.nextDouble());
                 
                 arrNgoai.add(ngoaiT);
                   for(CXNgoaiT i: arrNgoai) {
               System.out.println(i.toString());
                       
            }
             }
                
             }
             if(nhap==3){
                 System.out.println("Err");
                 break;
             }      
             
         
            }
        }
     
}