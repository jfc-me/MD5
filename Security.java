package jfc_me;

import java.security.MessageDigest;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SecMD5{
 
    public String Crt_MD5(String msg){
         String preposicionado = "";
        try  {
            MessageDigest coneudo_md5 = MessageDigest.getInstance("MD5");
            coneudo_md5.update(msg.getBytes());
            byte[] sintese = coneudo_md5.digest();
    
            for (int i = 0; i < sintese.length; i++){
                preposicionado += Integer.toHexString(sintese[i] >> 4 & 0xF);
                preposicionado += Integer.toHexString(sintese[i] & 0xF);
              }
      
            }catch (Exception ex){
      Logger.getLogger(SecMD5.class.getName()).log(Level.SEVERE, null, ex);
               }
     return  preposicionado;
    }
  
    
    
    
    
  public static void main(String... run) {
     SecMD5 cript_md5 = new SecMD5();
    
 String hash = "6e7906b7fb3f8e1c6366c0910050e595"; 
  
 String[] inp = new String[ 10 ] ;
 inp[ 0 ] = "brahma";
 inp[ 1 ] = "skol";
 inp[ 2 ] = "heineken";
 inp[ 3 ] = "budweiser";
 inp[ 4 ] = "bolgo";
 inp[ 5 ] = "crystal";
 inp[ 6 ] = "testes";
 inp[ 7 ] = "linux";
 inp[ 8 ] = "windows";
 inp[ 9 ] = "r2d2";
 
        for (String passa : inp) {
            String deCript_md5 = cript_md5.Crt_MD5(passa);
            if (hash.equals(deCript_md5)) {
                System.out.println("[S] = " + passa + " = " + deCript_md5);
            } else {
                System.out.println("[N]" + passa + " = " + deCript_md5);
            }
        }

     
 

  }
}
