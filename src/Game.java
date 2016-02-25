public class Game {
    static final int MAP_SIZE = 9, MONSTER_CNT = 5;
    static String 
            harita[][],//Konsola çizilen haritanın görsel karakterleri( ----  ||| vb.)
            karakterKonum[][];//Harita üzerindeki karakterlerin koordinatları.
    
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
        
    }
    
    private static int[] getNewCoord()
    {
        return new int[] {1,1};
    }
    
    
    public static int readNewWay()
    {
        System.out.println("Yeni yön :");
        return 6;
    }
    
    private boolean checkWall(int x, int y)
    {
        
    }
    
    private boolean checkMonster()
    {
        
    }
    
    
            
}
