/**
 * Savaş oyunundaki karakterlerin ana sınıfı.
 * @author student
 */
public class Karakter {
    final int MONSTER_START_HP_DOWN_LIMIT= 20, MONSTER_START_HP_UPPER_LIMIT= 50,
              MONSTER_START_ATACK_DOWN_LIMIT= 15, MONSTER_START_ATACK_UPPER_LIMIT= 30;
    final boolean isMonster = true;
    
    private int hp, atack, id = 0,konumX,konumY,monster_hp_start = 0
                                       ,monster_hp_end = 0
                                        ,monster_atack_start = 0
                                        ,monster_atack_end = 0;
    
    
    /**
     * id == 0 ise player oluşturur
     * id !=0 ise random monster oluşturur.
     * @param id
     * @param konumX
     * @param konumY 
     */
    public Karakter(int id,int konumX, int konumY)
    {
        this.id = id;
        this.konumX = konumX;
        this.konumY = konumY;
        
        if(id == 0)
        {
           this.hp = 100;
           this.atack = 50;
        } else
        {
            this.hp = random(monster_hp_start,monster_hp_end);
            this.atack = random(monster_atack_start,monster_atack_end);
        }
    }
    
    /**
     * id == 0 ise player oluşturur
     * id !=0 ise random monster oluşturur.
     * Alınan monster sınırlamalarına göre hp ve atack belirler.
     * @param id
     * @param konumX
     * @param konumY
     * @param monster_hp_start
     * @param monster_hp_end
     * @param monster_atack_start
     * @param monster_atack_end 
     */
    public Karakter(int id, int konumX, int konumY, int tur)
    {
        this.id = id;
        this.konumX = konumX;
        this.konumY = konumY;
        this.monster_atack_end = MONSTER_START_ATACK_UPPER_LIMIT*tur;
        this.monster_atack_start = MONSTER_START_ATACK_DOWN_LIMIT*tur;
        this.monster_hp_end = MONSTER_START_HP_UPPER_LIMIT*tur;
        this.monster_hp_start = MONSTER_START_HP_DOWN_LIMIT*tur;
        
        if(id == 0)
        {
           this.hp = 100;
           this.atack = 50;
        } else
        {
            this.hp = random(monster_hp_start,monster_hp_end);
            this.atack = random(monster_atack_start,monster_atack_end);
        }
        
        
        
    }
    
    //---------------------------------------------------------------------
    public void adimAt(int x, int y)
    {
        this.konumX = x;
        this.konumY = y;
    }
    
    /**
     * karakter parametresi ile gelen karakterin canı ilk düşecek şekilde sırası ile 
     * atack degeri kadar bu objenin ve karakter objesinin hp si düşürülür.
     * eğer karakterin değeri 0 ise true
     * eğer bu objenin değeri 0 ise false döndürür.
     * @param karakter
     * @return isAtackSuccessfull
     */
    public boolean atack(Karakter karakter)
    {
        if(karakter != null)
        {
            while(true)
            {
                karakter.setHp(karakter.getHp()-this.atack);
                if(karakter.getHp() <= 0)
                    break;
                
                
                this.hp = (this.hp - karakter.getAtack());
                if(this.hp <= 0)
                    return false;
            }
            
        }
        
        return true;
    }
    
    
    
    
    /**
     * start end sayıları arasında random sayı dönden metod.
     * @param start
     * @param end
     * @return random int
     */
    private int random (int start, int end)
    {
        return start + (int)(Math.random() * (end - start));
    }
    
    
    //GETTER && SETTER
    //---------------------------------------------------------------
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }
    
    public int getKonumX() {
        return konumX;
    }

    public void setKonumX(int konumX) {
        this.konumX = konumX;
    }

    public int getKonumY() {
        return konumY;
    }

    public void setKonumY(int konumY) {
        this.konumY = konumY;
    }

    public int getMonster_hp_start() {
        return monster_hp_start;
    }

    public void setMonster_hp_start(int monster_hp_start) {
        this.monster_hp_start = monster_hp_start;
    }

    public int getMonster_hp_end() {
        return monster_hp_end;
    }

    public void setMonster_hp_end(int monster_hp_end) {
        this.monster_hp_end = monster_hp_end;
    }

    public int getMonster_atack_start() {
        return monster_atack_start;
    }

    public void setMonster_atack_start(int monster_atack_start) {
        this.monster_atack_start = monster_atack_start;
    }

    public int getMonster_atack_end() {
        return monster_atack_end;
    }

    public void setMonster_atack_end(int monster_atack_end) {
        this.monster_atack_end = monster_atack_end;
    }
    //----------------------------------------------------------
    
    
    
}
