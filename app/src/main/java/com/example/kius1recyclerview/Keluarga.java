package com.example.kius1recyclerview;

public class Keluarga {
    private String nama, ket;
    private Integer foto;

    public Keluarga (String nama, String ket, Integer foto){
        this.nama = nama;
        this.ket = ket;
        this.foto = foto;
    }
    public String GetNama() {return nama;}

    public void setNama(String nama) {this.nama = nama;}

    public String GetKet() {return ket;}

    public void setKet(String ket) {this.ket = ket;}

    public Integer GetFoto() {return foto;}

    public void setFoto(Integer foto) {this.foto = foto;}
}
