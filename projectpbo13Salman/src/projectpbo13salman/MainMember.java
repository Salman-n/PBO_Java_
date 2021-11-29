/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo13salman;

/**
 *
 * @author Salman
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;
public class MainMember {
    static Scanner scan;
    static ArrayList<Member> data = new ArrayList<Member>();
    public static void main(String[] args) {
        data.add(new Member("M001","Mr. X","Silver"));
        data.add(new Member("M002","Mr. Y","Gold"));
        data.add(new Member("M003","Mr. Z","Platinum"));


	// write your code here
        scan = new Scanner(System.in);
        print("Masukan ID Member                    : ",false);
        String id_member =  scan.nextLine();
        print("Masukan Tanggal Pinjam (1-31)        : ",false);
        int tanggal =  scan.nextInt();
        print("Masukan Bulan Pinjam (1-12)          : ",false);
        int bulan =  scan.nextInt();
        print("Masukan Tahun Pinjam                 : ",false);
        int tahun =  scan.nextInt();
        print("Masukan Tanggal Kembali (1-31)       : ",false);
        int tanggalk =  scan.nextInt();
        print("Masukan Bulan Kembali (1-12)         : ",false);
        int bulank =  scan.nextInt();
        print("Masukan Tahun Kembali                : ",false);
        int tahunk =  scan.nextInt();

        Member member = cariData(id_member);
        if (member.id_member.equals("kosong")) {
            print("ID Member tidak ditemukan");
            System.exit(1);
        }

        LocalDate from = LocalDate.of(tahun, bulan, tanggal);
        LocalDate to = LocalDate.of(tahunk, bulank, tanggalk);
        long days = ChronoUnit.DAYS.between(from, to);

        double totsew = 0;
        double cabe = 0;
        double pulsa = 0;
        long poin = 0;
        switch (member.jenis) {
            case "Silver" : {
                Silver jenis = new Silver();
                Silver.setHarga(25000);
                jenis.setDiskon(1);
                jenis.setPoinPerHari(1);
                totsew = Silver.totalSewa(days);
                poin = Silver.poin(days);
                break;
            }
            case "Gold" : {
                Gold jenis = new Gold();
                Gold.setHarga(35000);
                jenis.setDiskon(2);
                jenis.setPoinPerHari(5);
                jenis.setCabe(5000.00);
                totsew = Gold.totalSewa(days);
                cabe = jenis.cabe();
                poin = Gold.poin(days);
                break;
            }
            case "Platinum" :{
                Platinum jenis = new Platinum();
                Platinum.setHarga(45000);
                jenis.setDiskon(3);
                jenis.setPoinPerHari(10);
                jenis.setCabe(10000.00);
                jenis.setPulsa(5000.00);
                totsew = Platinum.totalSewa(days);
                cabe = jenis.cabe();
                pulsa = jenis.pulsa(days);
                poin = Platinum.poin(days);
                break;
            }
        }
        print("ID Member        : " + member.id_member);
        print("Nama Member      : " + member.nama);
        print("Jenis Member     : " + member.jenis);
        print(" ");
        print("Tanggal Pinjam   : " + from.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        print("Tanggal Kembali  : " + to.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        print("Lama Sewa        : " + days + " hari");
        print(" ");
        print("Total Sewa       : Rp " +totsew);
        print("Jumlah Poin      : " + poin);
        //if gold/plat
        if (cabe > 0) {
            print("Jumlah Cashback  : " + cabe);
        }
        if (pulsa > 0) {
            print("Bonus Pulsa      : " + pulsa);
        }
    }

    private static void print(String message ) {
        System.out.println(message);
    }
    private static void print(String message,Boolean newline ) {
        if (newline) {
            System.out.println(message);
        } else {
            System.out.print(message);
        }

    }

    protected static Member cariData(String kode){
        // status ditemukan, awalnya false (dianggap tidak ketemu)
        boolean ditemukan = false;
        // nilai awal index
        int index = -1;
        // proses pengecekan kesamaan kode barang data dg kode
        for(int i=0; i<data.size(); i++){
            if (data.get(i).id_member.equals(kode)){
                // jika match kode barangnya, maka catat index datanya
                index = i;
                // ubah status ditemukan jadi true
                ditemukan = true;
            }
        }

        // jika status ditemukan true, maka tampilkan data barangnya
        // berdasarkan index hasil pencarian
        if (ditemukan == true){
            return data.get(index);
        } else {
            // jika tidak ditemukan
           return new Member("kosong","kosong","kosong");
        }
    }
}
