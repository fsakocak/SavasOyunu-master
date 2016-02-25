


import java.util.Scanner;

/**Konsoldan veri okumaya yarar.
 * Kullanıcı yanlış değer girdiğinde tekrar veri okur.
 * Hatalı girişleri yakalar.
 * @author ZENCİ
 */
public class KeyboardReader
{
    
    
    
 /**
  * Konsoldan double değer okur ve döndürür.
  * Hatalı giriş durumunda hatayı yakalar ve uyarı mesajı verir.
  * Kullanıcıya konsolda yazılacak soruyu alır.
  * @param message
  * @return 
  */   
  public static double okuDouble(String message){
      double sayi = 0;
      while(true)
      {
          try {
              Scanner scan = new Scanner(System.in);
              System.out.println(message);
              sayi = scan.nextDouble();
              break;
          }
          catch (Exception e) {
              System.err.println("Hata !\nLütfen sadece sayı girişi yapınız..");
          }
      }
      
      return sayi;
  }
  
  
  /**
  * Konsoldan int değer okur ve döndürür.
  * Hatalı giriş durumunda hatayı yakalar ve uyarı mesajı verir.
  * Kullanıcıya konsolda yazılacak soruyu alır.
  * @param message
  * @return 
  */ 
  public static int okuInt(String message){
      int sayi = 0;
      while(true)
      {
          try {
              Scanner scan = new Scanner(System.in);
              System.out.println(message);
              sayi = scan.nextInt();
              break;
          }
          catch (Exception e) {
              System.err.println("Hata !\nLütfen sadece sayı girişi yapınız..");
          }
      }
      return sayi;
  }
  
  
  /**
  * Konsoldan String değer okur ve döndürür.
  * Hatalı giriş durumunda hatayı yakalar ve uyarı mesajı verir.
  * Kullanıcıya konsolda yazılacak soruyu alır.
  * @param message
  * @return 
  */ 
  public static String okuString(String message){
      String text = "";
      while(true)
      {
          try {
              Scanner scan = new Scanner(System.in);
              System.out.println(message);
              text = scan.nextLine();
              break;
          }
          catch (Exception e) {
              System.err.println("Hatalı !");
          }
      }
      return text;
  }
  
  /**
  * Konsoldan long değer okur ve döndürür.
  * Hatalı giriş durumunda hatayı yakalar ve uyarı mesajı verir.
  * Kullanıcıya konsolda yazılacak soruyu alır.
  * @param message
  * @return 
  */ 
  public static long okuLong(String message){
      long sayi = 0;
      while(true)
      {
          try {
              Scanner scan = new Scanner(System.in);
              System.out.println(message);
              sayi = scan.nextLong();
              break;
          }
          catch (Exception e) {
              System.err.println("Hata !\nLütfen sadece sayı girişi yapınız..");
          }
      }
      return sayi;
  }
  
  
  /**
  * Konsoldan boolean değer okur ve döndürür.
  * Hatalı giriş durumunda hatayı yakalar ve uyarı mesajı verir.
  * Kullanıcıya konsolda yazılacak soruyu alır.
  * @param message
  * @return 
  */ 
  public static boolean okuBoolean(String message){
      boolean bool = true;
      while(true)
      {
          try {
              Scanner scan = new Scanner(System.in);
              System.out.println(message);
              bool = scan.nextBoolean();
              break;
          }
          catch (Exception e) {
              System.err.println("Hata !\nSadece True False değeri girilebilir.");
          }
      }
      return bool;
  }
    
  
  
}
