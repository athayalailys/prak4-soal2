package soal2;

import java.util.HashMap;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = -1;
        this.bulanKemerdekaan = -1;
        this.tahunKemerdekaan = -1;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggal, int bulan, int tahun) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggal;
        this.bulanKemerdekaan = bulan;
        this.tahunKemerdekaan = tahun;
    }

    public String getDetail(HashMap<Integer, String> daftarBulan) {
        StringBuilder detail = new StringBuilder();
        detail.append("Negara ").append(nama).append(" mempunyai ");

        if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            detail.append("Raja bernama ").append(namaPemimpin).append("\n");
        } else {
            detail.append(jenisKepemimpinan.substring(0, 1).toUpperCase())
                  .append(jenisKepemimpinan.substring(1))
                  .append(" bernama ").append(namaPemimpin).append("\n");

            if (tanggalKemerdekaan != -1) {
                String bulan = daftarBulan.get(bulanKemerdekaan);
                detail.append("Deklarasi Kemerdekaan pada Tanggal ")
                      .append(tanggalKemerdekaan).append(" ")
                      .append(bulan).append(" ").append(tahunKemerdekaan).append("\n");
            }
        }
        return detail.toString();
    }
}