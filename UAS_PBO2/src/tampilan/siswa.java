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
public class siswa {
    private String nama;
    private int nik;
    private String ttl;
    private String jurusan;
    private String alamat;
    private String ortu;
    private int hp;
    private String kelamin;

    siswa(String nama, int nik, String ttl, String jurusan, String alamat, String ortu, int hp, String kelamin) {
        this.nama = nama;
        this.nik = nik;
        this.ttl = ttl;
        this.jurusan = jurusan;
        this.alamat = alamat;
        this.ortu = ortu;
        this.hp = hp;
        this.kelamin = kelamin;
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

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getOrtu() {
        return ortu;
    }

    public void setOrtu(String ortu) {
        this.ortu = ortu;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }
    
    
}
