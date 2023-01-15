/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

/**
 *
 * @author ASUS
 */
public class Ppdb {
    
private String nama;
    private int nik;
    private String ttl;
    private String kelamin;
    private String sekolah;
    private String alamat;
    private int hp;
    private String jurusan;
    private String ortu;

    Ppdb(String nama, int nik, String ttl, String kelamin, String sekolah, String alamat, int hp, String jurusan, String ortu) {
        this.nama = nama;
        this.nik = nik;
        this.ttl = ttl;
        this.kelamin = kelamin;
        this.sekolah = sekolah;
        this.alamat = alamat;
        this.hp = hp;
        this.jurusan = jurusan;
        this.ortu =ortu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public String getSekolah() {
        return sekolah;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getOrtu() {
        return ortu;
    }

    public void setOrtu(String ortu) {
        this.ortu = ortu;
    }
    
    
}
