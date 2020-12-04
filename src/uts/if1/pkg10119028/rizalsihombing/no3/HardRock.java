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
public class HardRock extends MusicGenre implements PopRock, ProgressiveRock, PsychedelicRock{
    public void genreHardRock(String artistName) {
        System.out.println(artistName + " adalah musisi Hard Rock");
    }
    
    public void genrePopRock(String artistName) {
        System.out.println(artistName + " adalah musisi Pop Rock");
    }
    
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName + " adalah musisi Progressive Rock");
    }
    
    public void genrePsychedelicRock(String artistName) {
        System.out.println(artistName + " adalah musisi Psychedellic Rock");
    }
}
