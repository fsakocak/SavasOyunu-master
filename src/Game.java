public class Game {
    static final int MAP_SIZE = 9, MONSTER_CNT = 3,
                                    YUKARI = 8, 
                                    ASAGI = 2, 
                                    SOL = 4, 
                                    SAG = 6, 
                                    SOL_UST = 7, 
                                    SOL_ALT = 1, 
                                    SAG_UST = 9, 
                                    SAG_ALT = 3;
    
    static int tur = 1;
    static String 
            harita[][],//Konsola çizilen haritanın görsel karakterleri( ----  ||| vb.)
            karakterKonum[][];//Harita üzerindeki karakterlerin koordinatları.
    
    static Karakter player, monsterArr[];
    
    //static Karakter monsterArr[];//Random oluşturulan monsterların dizisi
    public static void main(String[] args) {
        setup();
    }
    
    /**
     * Oyunun başlangıç pozisyonunu almasını sağlayan metod.
     * harita monsterArr değişkenleri tanımlanır.
     * harita konsola çizilir.
     */
    public static void setup()
    {
        harita = new String[(MAP_SIZE*2)+1][(MAP_SIZE*4)+1];
        karakterKonum = new String[MAP_SIZE][MAP_SIZE];
        player = new Karakter(0, MAP_SIZE/2+1, MAP_SIZE/2+1);
        monsterArr = new Karakter[tur*MONSTER_CNT];
        
        for (int i = 0; i < monsterArr.length; i++) {
            
            while(true)
            {
               int x = (int)Math.random() * MAP_SIZE;
               int y = (int)Math.random() * MAP_SIZE;
            
               int count = 0;
               
                if (player.getKonumX() == x || player.getKonumY() == y) {
                    break;
                }
               
               
               count++;
               if(count > i)
                   break;
            }
            
            monsterArr[i] = new Karakter(i, SOL, SOL);
        }
        
        karakterKonumStartSetup();
       //monsterArr = new Karakter[MONSTER_CNT];
       
       
       haritaCiz();
    }
    
    /**
     * Karakterkonum dizisinin içerisini space karakteri ile doldurur.
     */
    public static void karakterKonumStartSetup()
    {
        for (int i = 0; i < karakterKonum.length; i++) {
            for (int j = 0; j < karakterKonum[i].length; j++) {
                karakterKonum[i][j] = " ";
            }
        }
    }
    
    
    /**
     * Haritayı konsola çizer.
     * karakterkonum dizisinin elemanlarına göre çizim yapar.
     */
    public static void haritaCiz()
    {
        for (int i = 0; i < harita.length; i++) {
            for (int j = 0; j < harita[i].length; j++) {
                
                if(i % 2 == 0)
                {
                    harita[i][j] = "-";
                }else if(j % 4 == 0)
                {
                    harita[i][j] = "|";
                }else if(j % 4 == 2)
                {
                    harita[i][j] = karakterKonum[(i-1)/2][(j-1)/4];
                }
                else
                    harita[i][j] = " ";
                
                System.out.print(harita[i][j]);
            }
            System.out.println("");
        }
        
        
    }
    
    
    /**
     * Karakterlerin güncel konumlarına göre karakterKonum dizisini günceller.
     */
    public static void karakterKonumGuncelle()
    {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                karakterKonum[i][j]
            }
        }
    }
    
    private static int[] getNewCoord()
    {
        
    }
    
    
    //Verilen koordinatın koordinatArr sınırları içerisinde olup olmadığını kontrol eder.
    public static boolean isAvaiblePoint(int oyuncu, int x, int y)
    {
        
       
    }
    
    
    
    public static int readNewWay(int yon)
    {
       int pX = player.getKonumX(), pY = player.getKonumY();
       if(yon == YUKARI && isAvaiblePoint(oyuncu, pX, pY - 1))
                {
                    kullaniciKonumGuncelle(oyuncu, pX, pY - 1);
                }
                else if(yon == ASAGI && isAvaiblePoint(oyuncu, pX, pY + 1))
                {
                    kullaniciKonumGuncelle(oyuncu, pX, pY + 1);
                }
                else if(yon == SAG && isAvaiblePoint(oyuncu, pX + 1, pY))
                {
                    kullaniciKonumGuncelle(oyuncu, pX + 1, pY);
                }
                else if(yon == SOL && isAvaiblePoint(oyuncu, pX - 1, pY))
                {
                    kullaniciKonumGuncelle(oyuncu, pX - 1, pY);
                }
                else{
                    System.err.println("Yanlış Yön !");
                    System.out.println("YUKARI :8\tAŞAĞI :2\tSAĞ :6\tSOL :4");
                    return false;
                }
       return true;
    }
    
    /**
     * Verilen koordinatın harita sınırlarında olup olmadığını kontrol eder
     * Eğer sınırlar içerisindeyse true döndürür
     * değilse false döndürür.
     * @param x
     * @param y
     * @return 
     */
    private boolean checkWall(int x, int y)
    {
         if(((karakterKonum.length > y && y >= 0) && (karakterKonum[0].length > x && x >= 0)))
            return true;
           
        return false;
    }
    
    
    
    private boolean checkMonster(int x, int y)
    {
        for (int i = 0; i < monsterArr.length; i++) 
        {
            if ( monsterArr[i].getKonumX() == x && monsterArr[i].getKonumY() == y)
                return true;
            
        }
      return false; 
    }
    
    
            
}
