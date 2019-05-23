/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg54;

/**
 *
 * @author DADAR GULUNG JUMBO
 */
public class WarnaKoordinat extends Koordinat {
   private String namaWarna;
   public WarnaKoordinat (String namaWarna, int x, int y){
       super(x, y);
       this.namaWarna = namaWarna;
   }
   
   public String getNamaWarna(){
       return namaWarna;   
   }
   public void setNamaWarna(String namaWarna){
        this.namaWarna = namaWarna;
    }
   
}
