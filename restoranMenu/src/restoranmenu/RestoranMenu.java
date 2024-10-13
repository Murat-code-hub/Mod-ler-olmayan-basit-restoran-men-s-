
package restoranmenu;
import java.util.Scanner;
public class RestoranMenu {

    public static void main(String[] args) {
       int secim ,secim1;
       String yemek="",icecek="";
       Scanner gir = new Scanner(System.in);
       System.out.println("Ana yemek 1: || Icecek 2:");
       secim = gir.nextInt();
       if(secim == 1)
       {
           System.out.println("Lahmacun :1 || Pide :2");
           secim1=gir.nextInt();
           switch(secim1)
           {
               case 1:
               {
               System.out.println("Lahmacun sectiniz");
               yemek = "Lahmacun";
               char d;int n;
               System.out.println("Secimi degismek istiyormusunuz(e/h)");
               d = gir.next().charAt(0);
               if(d == 'e')
               {
                   System.out.println("Lahmacun :1 Pide 2:");
                   n = gir.nextInt();
                   switch(n)
                   {
                       case 1:
                       {
                       System.out.println("Yine Lahmacun sectiniz");
                       yemek = "Lahmacun";break;
                       }
                       case 2:
                       {
                       System.out.println("Seciminiz Lamacundan ---> Pideye olmustur");
                       yemek = "Pide";break;
                       }
                   }
               }
               char kontrol;
               System.out.println("Icecek secmek istiyormusunuz(e/h)");
               kontrol=gir.next().charAt(0);
               if(kontrol=='e')
               {
               int a;
               System.out.println("Ayran :1 || Su 2:");
               a = gir.nextInt();
               switch(a)
               {
                   case 1:
                   {int c;char f;
                   System.out.println("Ayran sectiniz");
                   icecek = "Ayran";
                   System.out.println("icecek seciminizi onayliyormusunuz(e/h)");
                   f = gir.next().charAt(0);
                   if(f == 'h')
                   {
                   System.out.println("Ayran :1 || Su 2:");
                   c = gir.nextInt();
                   switch(c)
                   {
                       case 1:
                       {
                           System.out.println("Seciminiz yine ayran olmustur");
                           icecek = "Ayran";System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                       }
                       case 2:
                       {
                           System.out.println("Seciminiz Ayrandan ---->Su ya olmustur");
                           icecek = "Su";System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                       }
                   }
                   }
                   else
                   {
                   System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                   }
                   System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);break;
                   }
                   case 2:
                   {int c;char f;
                   System.out.println("Su sectiniz");
                   icecek = "Su";
                   System.out.println("icecek seciminizi onayliyormusunuz(e/h)");
                   f = gir.next().charAt(0);
                   if(f == 'h')
                   {
                   System.out.println("Ayran :1 || Su 2:");
                   c = gir.nextInt();
                   switch(c)
                   {
                       case 1:
                       {
                           System.out.println("Seciminiz sudan -----> Ayrana olmustur");
                           icecek = "Ayran";break;
                       }
                       case 2:
                       {
                           System.out.println("Seciminiz yine su olmustur olmustur");
                           icecek = "Su";break;
                       }
                   }
                   }                   
                   System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                   }
               }
               }
               else 
               {
                   
                  System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek); return;
                   
               }
               }
               case 2:
               {
               System.out.println("Pide sectiniz");
               yemek = "Pide";
               char d;int n;
               System.out.println("Secimi degismek istiyormusunuz(e/h)");
               d = gir.next().charAt(0);
               if(d == 'e')
               {
                   System.out.println("Lahmacun :1 Pide 2:");
                   n = gir.nextInt();
                   switch(n)
                   {
                       case 1:
                       {
                       System.out.println("Seciminiz Pideden -----> Lahmacuna olmustur");
                       yemek = "Lahmacun";break;
                       }
                       case 2:
                       {
                       System.out.println("Seciminiz yine pide olmustur");
                       yemek = "Pide";break;
                       }
                   }
               }               
               char kontrol;
               System.out.println("Icecek secmek istiyormusunuz(e/h)");
               kontrol=gir.next().charAt(0);
               if(kontrol=='e')
               {
               int a;
               System.out.println("Ayran :1 || Su 2:");
               a = gir.nextInt();
               switch(a)
               {
                   case 1:
                   {int c;char f;
                   System.out.println("Ayran sectiniz");
                   icecek = "Ayran";
                   System.out.println("icecek seciminizi onaylıyormusunuz(e/h)");
                   f = gir.next().charAt(0);
                   if(f == 'h')
                   {
                   System.out.println("Ayran :1 || Su 2:");
                   c = gir.nextInt();
                   switch(c)
                   {
                       case 1:
                       {
                           System.out.println("Seciminiz yine ayran olmustur");
                           icecek = "Ayran";break;
                       }
                       case 2:
                       {
                           System.out.println("Seciminiz Ayrandan ---->Su ya olmustur");
                           icecek = "Su";break;
                       }
                   }
                   }                   
                   System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                   }
                   case 2:
                   {int c;char f;
                   System.out.println("Su sectiniz");
                   icecek = "Su";
                   System.out.println("icecek seciminizi onaylıyormusunuz(e/h)");
                   f = gir.next().charAt(0);
                   if(f == 'h')
                   {
                   System.out.println("Ayran :1 || Su 2:");
                   c = gir.nextInt();
                   switch(c)
                   {
                       case 1:
                       {
                           System.out.println("Seciminiz Su dan -----> Ayrana olmustur olmustur");
                           icecek = "Ayran";break;
                       }
                       case 2:
                       {
                           System.out.println("Seciminiz yine su olmustur olmustur");
                           icecek = "Su";break;
                       }
                   }
                   }                    
                   System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                   }
               }
               }
               else{System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;}
               }
           }
       }
       
       if(secim == 2)
       {
           System.out.println("Ayran 1: Su 2:");
           secim1=gir.nextInt();
           switch(secim1)
           {
               case 1:
               {char e;int u;
               System.out.println("Ayran sectiniz");
               icecek = "Ayran";
               System.out.println("Icecek seciminizi onayliyormusunuz(e/h)");
               e = gir.next().charAt(0);
               if(e=='h')
               {
               System.out.println("Ayran :1 || Su :2");
               u = gir.nextInt();
               switch(u)
               {
                   case 1:
                   {
                   System.out.println("Seciminiz yine ayran olmustur");
                   icecek ="Ayran";break;
                   }
                   case 2:
                   {
                   System.out.println("Seciminiz Ayrandan -----> Suya olmustur");
                   icecek="Su";break;
                   }
                           
               }
               }
               char kontrol;
               System.out.println("Ana yemek secmek istiyormusunuz(e/h)");
               kontrol = gir.next().charAt(0);
               if(kontrol == 'e')
               {int a;
                   System.out.println("Lahmacun :1 || Pide 2:");
                   a = gir.nextInt();
                   switch(a)
                   {
                       case 1:
                       {int t;char y;
                       System.out.println("Lahmacun sectiniz");
                       yemek = "Lahmacun";
                       System.out.println("Seciminizi Onayliyormusunuz(e/h)");
                       y = gir.next().charAt(0);
                       if(y == 'h')
                       {
                       System.out.println("Lahmacun 1: || Pide 2:");
                       t = gir.nextInt();
                       switch(t)
                       {
                           case 1:
                           {
                           System.out.println("Yine lanmacun sectiniz");
                           yemek = "Lahmacun";System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                           }
                           case 2:
                           {
                           System.out.println("Secimini Lahmacundan -----> Pideye olmustur");
                           yemek = "Pide";System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                           }
                       }
                       }
                       System.out.println("Secimleriminiz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                       }
                       case 2:
                       {int t;char y;
                       System.out.println("Pide sectiniz");
                       yemek = "Pide";
                        System.out.println("Seciminizi Onayliyormusunuz(e/h)");
                       y = gir.next().charAt(0);
                       if(y == 'h')
                       {
                       System.out.println("Lahmacun 1: || Pide 2:");
                       t = gir.nextInt();
                       switch(t)
                       {
                           case 1:
                           {
                           System.out.println("Seciminiz Pideden ----> Lahmacuna olmustur");
                           yemek = "Lahmacun";System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                           }
                           case 2:
                           {
                           System.out.println("Yine Pide sectiniz");
                           yemek = "Pide";System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                           }
                       }
                       }                       
                       System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                       }
                   }
               }
               else{System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;}
               }
               case 2:
               {char e;int u;
               System.out.println("Su sectiniz");
               icecek = "Su";
               System.out.println("Icecek seciminizi onayliyormusunuz(e/h)");
               e = gir.next().charAt(0);
               if(e=='h')
               {
               System.out.println("Ayran :1 || Su :2");
               u = gir.nextInt();
               switch(u)
               {
                   case 1:
                   {
                   System.out.println("Seciminiz Su dan -----> Ayrana  olmustur");
                   icecek ="Ayran";break;
                   }
                   case 2:
                   {
                   System.out.println("Seciminiz yine su olmustur");
                   icecek="Su";break;
                   }
                           
               }
               }               
               char kontrol;
               System.out.println("Ana yemek secmek istiyormusunuz(e/h)");
               kontrol = gir.next().charAt(0);
               if(kontrol == 'e')
               {int a;
                   System.out.println("Lahmacun :1 || Pide 2:");
                   a = gir.nextInt();
                   switch(a)
                   {
                       case 1:
                       {int t ;char y;
                       System.out.println("Lahmacun sectiniz");
                       yemek = "Lahmacun";
                       System.out.println("Seciminizi Onayliyormusunuz(e/h)");
                       y = gir.next().charAt(0);
                       if(y == 'h')
                       {
                       System.out.println("Lahmacun 1: || Pide 2:");
                       t = gir.nextInt();
                       switch(t)
                       {
                           case 1:
                           {
                           System.out.println("Yine lanmacun sectiniz");
                           yemek = "Lahmacun";System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                           }
                           case 2:
                           {
                           System.out.println("Secimini Lahmacundan -----> Pideye olmustur");
                           yemek = "Pide";System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                           }
                       }
                       }
                       System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                       }
                       case 2:
                       {int t;char y;
                       System.out.println("Pide sectiniz");
                       yemek = "Pide";
                       System.out.println("Seciminizi Onayliyormusunuz(e/h)");
                       y = gir.next().charAt(0);
                       if(y == 'h')
                       {
                       System.out.println("Lahmacun 1: || Pide 2:");
                       t = gir.nextInt();
                       switch(t)
                       {
                           case 1:
                           {
                           System.out.println("Seciminiz Pideden -----> Lahmacuna olmustur");
                           yemek = "Lahmacun";System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                           }
                           case 2:
                           {
                           System.out.println("Yine pide seciniz");
                           yemek = "Pide";System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                           }
                       }
                       }
                       System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;
                       }
                   }
               }
               else{System.out.println("Secimleriniz -----> Yemek :" + yemek + "|| Icecek :" + icecek);return;}
               }
           }
       } 
       
    }
    
}
