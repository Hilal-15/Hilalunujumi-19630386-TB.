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
public class guru {
    private String nama;
    private int nik;
    private int nip;
    private String ttl;
    private String kelamin;
    private String alamat;
    private int hp;

    guru(String nama,int nik,int nip,String ttl,String kelamin,String alamat,int hp) {
       this.nama = nama;
       this.nik = nik;
       this.nip = nip;
       this.ttl = ttl;
       this.kelamin = kelamin;
       this.alamat = alamat;
       this.hp = hp;
       
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

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
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
    
    
}
