package com.example.nkpta;

public class NilaiKpItem {
    private String namaM;
    private String nimM;
    private String judulM;

    public NilaiKpItem(String namaM, String nimM, String judulM) {
        this.namaM = namaM;
        this.nimM = nimM;
        this.judulM = judulM;
    }

    public String getNamaM() {
        return namaM;
    }
    public void setNamaM(String namaM) {
        this.namaM = namaM;
    }

    public String getNimM() {
        return nimM;
    }
    public void setNimM(String nimM) {
        this.nimM = nimM;
    }

    public String getJudulM() {
        return judulM;
    }
    public void setJudulM(String judulM) {this.judulM = judulM;}

}
