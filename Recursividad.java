public class Recursividad
{
   public static void main(String[] args)
   {
   
   System.out.println("El resultado es "+sumaPares(0,18,0));
   }
   
   public static int sumaPares(int Par,int Num, int Suma)
   {
      if(Num<=Par)
      return Suma;
      else
         if(Par<Num)
         return sumaPares((Par+2),Num,(Par+Suma));
     
     return 0;
         
   }
}