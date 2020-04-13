import greenfoot.*;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Write a description of class Baie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baie extends World
{
   Counter Counter = new Counter();
    public int shot = 1;
    /**
     * Constructor for objects of class Baie.
     * 
     */
    public Baie()
    {    
        super(720, 480, 1);

         prepare();
        inamic();
            if (Greenfoot.isKeyDown("p"))
                {
                   Greenfoot.stop();
                }

             
        
    }
  

    public Counter getCounter()
    {
        return Counter;
        
        
        
    }
    
       
        
    
    private void prepare()
    {
        addObject(Counter, 650,40);

        //actors
        wombat wombat = new wombat();
        addObject(wombat,55,350);
        lemur lemur = new lemur();
        addObject(lemur,50,425);
        lemur1 lemur1= new lemur1();
        addObject(lemur1,650,425);

        //apples
        apple apple=new apple();
        addObject(apple,280,385);
        apple apple1=new apple();
        addObject(apple1,100,350);
        apple apple2=new apple();
        addObject(apple2,140,350);
        apple apple3=new apple();
        addObject(apple3,180,350);
        apple apple4=new apple();
        addObject(apple4,220,350);
        apple apple5=new apple();
        addObject(apple5,260,350);
        apple apple6=new apple();
        addObject(apple6,300,350);
        apple apple7=new apple();
        addObject(apple7,340,350);
        apple apple8=new apple();
        addObject(apple8,380,350);
        apple apple9=new apple();
        addObject(apple9,420,350);
        apple apple10=new apple();
        addObject(apple10,460,350);
        apple apple11=new apple();
        addObject(apple11,500,350);
        apple apple12=new apple();
        addObject(apple12,540,350);

        apple apple13 = new apple();
        addObject(apple13,60,420);
        apple apple14=new apple();
        addObject(apple14,100,420);
        apple apple15=new apple();
        addObject(apple15,140,420);
        apple apple16=new apple();
        addObject(apple16,180,420);
        apple apple17=new apple();
        addObject(apple17,220,420);
        apple apple18=new apple();
        addObject(apple18,260,420);
        apple apple19=new apple();
        addObject(apple19,300,420);
        apple apple20=new apple();
        addObject(apple20,340,420);
        apple apple21=new apple();
        addObject(apple21,380,420);
        apple apple22=new apple();
        addObject(apple22,420,420);
        apple apple23=new apple();
        addObject(apple23,460,420);
        apple apple24=new apple();
        addObject(apple24,500,420);
        apple apple25=new apple();
        addObject(apple25,540,420);
        apple apple26=new apple();
        addObject(apple26,580,420);
        apple apple27=new apple();
        addObject(apple27,620,420);
        apple apple28=new apple();
        addObject(apple28,660,420);
        apple apple29=new apple();
        addObject(apple29,620,380);
        apple apple30=new apple();
        addObject(apple30,660,380);
        apple apple31=new apple();
        addObject(apple31,620,340);
        apple apple32=new apple();
        addObject(apple32,620,340);
        apple apple33=new apple();
        addObject(apple33,660,300);
        apple apple34=new apple();
        addObject(apple34,660,300);

        //wallsegments
        wallsegment wallsegment = new wallsegment();
        addObject(wallsegment,75,385);
        wallsegment wallsegment1 = new wallsegment();
        addObject(wallsegment1,160,385);
        wallsegment wallsegment2 = new wallsegment();
        addObject(wallsegment2,400,385);
        wallsegment wallsegment3 = new wallsegment();
        addObject(wallsegment3,495,385);

        wallsegment wallsegment4 = new wallsegment();
        addObject(wallsegment4,580,319);
        wallsegment4.turn(90);
        wallsegment wallsegment14 = new wallsegment();
        addObject(wallsegment14,710,145);
        wallsegment14.turn(90);
        wallsegment wallsegment15 = new wallsegment();
        addObject(wallsegment15,710,240);
        wallsegment15.turn(90);
        wallsegment wallsegment16 = new wallsegment();
        addObject(wallsegment16,710,385);
        wallsegment16.turn(90);
        wallsegment wallsegment18 = new wallsegment();
        addObject(wallsegment18,575,0);
        wallsegment18.turn(90);
        wallsegment wallsegment24 = new wallsegment();
        addObject(wallsegment24,10,135);
        wallsegment24.turn(90);
        wallsegment wallsegment25 = new wallsegment();
        addObject(wallsegment25,10,240);
        wallsegment25.turn(90);
        wallsegment wallsegment26 = new wallsegment();
        addObject(wallsegment26,10,385);
        wallsegment26.turn(90);
        wallsegment wallsegment27 = new wallsegment();
        addObject(wallsegment27,10,0);
        wallsegment27.turn(90);

        wallsegment wallsegment5 = new wallsegment();
        addObject(wallsegment5,160,315);
        wallsegment wallsegment6 = new wallsegment();
        addObject(wallsegment6,215,315);
        wallsegment wallsegment7 = new wallsegment();
        addObject(wallsegment7,355,315);
        wallsegment wallsegment8 = new wallsegment();
        addObject(wallsegment8,405,315);

        wallsegment wallsegment9 = new wallsegment();
        addObject(wallsegment9,75,470);
        wallsegment wallsegment10 = new wallsegment();
        addObject(wallsegment10,220,470);
        wallsegment wallsegment11 = new wallsegment();
        addObject(wallsegment11,360,470);
        wallsegment wallsegment12 = new wallsegment();
        addObject(wallsegment12,500,470);
        wallsegment wallsegment13 = new wallsegment();
        addObject(wallsegment13,645,470);
        wallsegment wallsegment28 = new wallsegment();
        addObject(wallsegment28,75,10);
        wallsegment wallsegment29 = new wallsegment();
        addObject(wallsegment29,220,10);
        wallsegment wallsegment30 = new wallsegment();
        addObject(wallsegment30,360,10);
        wallsegment wallsegment31 = new wallsegment();
        addObject(wallsegment31,500,10);
        wallsegment wallsegment32 = new wallsegment();
        addObject(wallsegment32,645,10);

        wallsegment wallsegment19 = new wallsegment();
        addObject(wallsegment19,643,80);
        wallsegment wallsegment20 = new wallsegment();
        addObject(wallsegment20,573,80);
        wallsegment wallsegment21 = new wallsegment();
        addObject(wallsegment21,352,80);
        wallsegment wallsegment22 = new wallsegment();
        addObject(wallsegment22,211,80);
        wallsegment wallsegment23 = new wallsegment();
        addObject(wallsegment23,160,80);

        wallsegment wallsegment34 = new wallsegment();
        addObject(wallsegment34,173,234);
        wallsegment wallsegment33 = new wallsegment();
        addObject(wallsegment33,224,234);
        wallsegment wallsegment35 = new wallsegment();
        addObject(wallsegment35,365,234);
        wallsegment wallsegment36 = new wallsegment();
        addObject(wallsegment36,515,234);

        apple apple36 = new apple();
        addObject(apple36, 624, 306);
        apple apple37 = new apple();
        addObject(apple37, 664, 262);
        apple apple38 = new apple();
        addObject(apple38, 620, 261);
        apple apple39 = new apple();
        addObject(apple39, 657, 219);
        apple apple40 = new apple();
        addObject(apple40, 620, 218);
        apple apple41 = new apple();
        addObject(apple41, 657, 184);
        apple apple42 = new apple();
        addObject(apple42, 621, 175);
        apple apple43 = new apple();
        addObject(apple43, 660, 144);
        apple apple44 = new apple();
        addObject(apple44, 619, 136);
        apple apple45 = new apple();
        addObject(apple45, 650, 112);
        apple apple46 = new apple();
        addObject(apple46, 576, 116);
        apple apple47 = new apple();
        addObject(apple47, 575, 179);
        apple apple48 = new apple();
        addObject(apple48, 535, 128);
        apple apple49 = new apple();
        addObject(apple49, 528, 180);
        apple apple50 = new apple();
        addObject(apple50, 487, 131);
        apple apple51 = new apple();
        addObject(apple51, 484, 183);
        apple apple52 = new apple();
        addObject(apple52, 446, 130);
        apple apple53 = new apple();
        addObject(apple53, 442, 181);
        apple apple54 = new apple();
        addObject(apple54, 391, 116);
        apple apple55 = new apple();
        addObject(apple55, 387, 182);
        apple apple56 = new apple();
        addObject(apple56, 347, 121);
        apple apple57 = new apple();
        addObject(apple57, 351, 181);
        apple apple58 = new apple();
        addObject(apple58, 311, 125);
        apple apple59 = new apple();
        addObject(apple59, 303, 186);
        apple apple60 = new apple();
        addObject(apple60, 277, 124);
        apple apple61 = new apple();
        addObject(apple61, 265, 187);
        apple apple62 = new apple();
        addObject(apple62, 232, 126);
        apple apple63 = new apple();
        addObject(apple63, 227, 184);
        apple apple64 = new apple();
        addObject(apple64, 198, 130);
        apple apple65 = new apple();
        addObject(apple65, 192, 190);
        apple apple66 = new apple();
        addObject(apple66, 166, 131);
        apple apple67 = new apple();
        addObject(apple67, 155, 184);
        apple apple68 = new apple();
        addObject(apple68, 118, 123);
        apple apple69 = new apple();
        addObject(apple69, 114, 179);
        apple apple70 = new apple();
        addObject(apple70, 78, 125);
        apple apple71 = new apple();
        addObject(apple71, 74, 186);
        apple apple72 = new apple();
        addObject(apple72, 43, 135);
        apple apple73 = new apple();
        addObject(apple73, 44, 187);
        apple apple74 = new apple();
        addObject(apple74, 60, 238);
        apple apple75 = new apple();
        addObject(apple75, 45, 282);
        apple apple76 = new apple();
        addObject(apple76, 87, 283);
        apple apple77 = new apple();
        addObject(apple77, 118, 284);
        apple apple78 = new apple();
        addObject(apple78, 148, 281);
        apple apple79 = new apple();
        addObject(apple79, 184, 280);
        apple apple80 = new apple();
        addObject(apple80, 215, 280);
        apple apple81 = new apple();
        addObject(apple81, 236, 281);
        apple apple82 = new apple();
        addObject(apple82, 271, 279);
        apple apple83 = new apple();
        addObject(apple83, 315, 279);
        apple81.setLocation(355, 280);
        apple82.setLocation(263, 279);
        apple80.setLocation(221, 279);
        apple78.setLocation(150, 281);
        apple76.setLocation(82, 280);
        apple77.setLocation(116, 282);
        apple83.setLocation(303, 277);
        apple81.setLocation(348, 275);
        apple apple84 = new apple();
        addObject(apple84, 385, 276);
        apple apple85 = new apple();
        addObject(apple85, 422, 277);
        apple apple86 = new apple();
        addObject(apple86, 459, 276);
        apple apple87 = new apple();
        addObject(apple87, 495, 275);
        apple apple88 = new apple();
        addObject(apple88, 536, 275);
        apple apple89 = new apple();
        addObject(apple89, 523, 313);
        apple apple90 = new apple();
        addObject(apple90, 49, 74);
        apple apple91 = new apple();
        addObject(apple91, 462, 77);
        apple apple92 = new apple();
        addObject(apple92, 40, 41);
        apple apple93 = new apple();
        addObject(apple93, 98, 39);
        apple apple94 = new apple();
        addObject(apple94, 155, 45);
        apple apple95 = new apple();
        addObject(apple95, 206, 44);
        apple apple96 = new apple();
        addObject(apple96, 252, 48);
        apple apple97 = new apple();
        addObject(apple97, 288, 46);
        apple apple98 = new apple();
        addObject(apple98, 327, 45);
        apple apple99 = new apple();
        addObject(apple99, 373, 44);
        apple apple100 = new apple();
        addObject(apple100, 417, 44);
        apple apple101 = new apple();
        addObject(apple101, 461, 44);
        apple apple102 = new apple();
        addObject(apple102, 498, 44);
        apple apple103 = new apple();
        addObject(apple103, 544, 42);
        apple apple104 = new apple();
        addObject(apple104, 667, 344);
        
    }
    public void inamic(){
      
        inamicul inamicul = new inamicul();
        addObject(inamicul, 143, 166);
        inamicul inamicul2 = new inamicul();
        addObject(inamicul2, 397, 312);
        lemur lemur2 = new lemur();
        addObject(lemur2, 56, 163);
        inamicul.setLocation(340, 71);
        removeObject(inamicul2);
        removeObject(lemur2);
        inamicul.setLocation(78, 149);
        inamicul inamicul3 = new inamicul();
        addObject(inamicul3, 320, 273);
    }
     public boolean CanShoot()
    {
        if (shot == 1) {
            return true;
        } else {
            return false;
        }
    }
    public void ShootSet(int arg)
    {
        shot = arg;
    }
}
