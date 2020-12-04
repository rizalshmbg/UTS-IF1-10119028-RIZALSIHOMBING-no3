/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119028.rizalsihombing.no3;

/**
 *
 * @author RizalSihombing
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan genre musik setiap band
 */
public class Metal extends MusicGenre implements Punk, HeavyMetal {
    public void genreMetal(String artistName) {
        System.out.println(artistName + " adalah musisi Metal");
    }
    
    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName + " adalah musisi Heavy Metal");
    }
    
    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName + " adalah musisi Punk");
    }
    
    public void genreGrunge(String artistName) {
        System.out.println(artistName + " adalah musisi Grunge");
    }
}
