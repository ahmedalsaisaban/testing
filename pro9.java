import java.util.Scanner;

public class pro9
{
//2x2, 2x3, 3x2, 3x3
static int[][] a = new int[2][2];
static int[][] b = new int[2][3];
static int[][] c = new int[3][2];
static int[][] d = new int[3][3];

static int choise1 = 0;
static int choise2 = 0;
static int choise3 = 0;

static String st1 = "";
static String st2 = "";
static String st3 = "";

static boolean valid = false;


public static void main (String[] args)

{
     assigner ();
     printer (5);
     input();
     printer (choise1);
     printer (choise2);
     Operation();
}//end of main 
   
    
static void input()
{
 Scanner scan = new Scanner(System.in);
     
//question 1
            while(!(st1.equalsIgnoreCase("A") || st1.equalsIgnoreCase("B")|| st1.equalsIgnoreCase("C")|| st1.equalsIgnoreCase("D")))
            {
              System.out.println("Select the first matrix (A,B,C,D):");
               st1 = scan.nextLine();             
            }
                  if (st1.equalsIgnoreCase("A"))
                     {
                         choise1 = 1;
                     }     
                  else if(st1.equalsIgnoreCase("B"))
                     {
                        choise1 = 2;
                     }
                  else if(st1.equalsIgnoreCase("C"))
                     {
                        choise1 = 3;
                     }
                  else if(st1.equalsIgnoreCase("D"))
                     {
                        choise1 = 4;
                     }
//question 2
            while(!(st2.equalsIgnoreCase("A") || st2.equalsIgnoreCase("B")|| st2.equalsIgnoreCase("C")|| st2.equalsIgnoreCase("D")))
            {
              System.out.println("Select the second matrix (A,B,C,D): ");
               st2 = scan.nextLine();              
            }     
                  if (st2.equalsIgnoreCase("A"))
                     {
                         choise2 = 1;
                     }     
                  else if(st2.equalsIgnoreCase("B"))
                     {
                        choise2 = 2;
                     }
                  else if(st2.equalsIgnoreCase("C"))
                     {
                        choise2 = 3;
                     }
                  else if(st2.equalsIgnoreCase("D"))
                     {
                        choise2 = 4;
                     }
//question 3
            while(!(st3.equalsIgnoreCase("A") || st3.equalsIgnoreCase("M")))
            {
              System.out.println("Do you want to add or multiply them (A, M): ");
               st3 = scan.nextLine();              
            }      
                 if (st3.equalsIgnoreCase("A"))
                     {
                         choise3 = 1;
                     }
      
                  else if(st3.equalsIgnoreCase("M"))
                     {
                        choise3 = 2;
                     }
}//end of input     
static void Operation()
{
boolean validate = false;
boolean validate1 = false;
   if(choise3 == 1)
      {
         if(choise1 == 1 && choise2 == 1)
            {
               System.out.println("(A + A) = ");
               validate1 = true;
               int r[][] = new int[2][2];
                     for(int i =0; i< a.length; i++)
                        {
                           for(int j=0; j< a[i].length; j++)
                              {
                                 r[i][j] = a[i][j] +a[i][j];
                              }
                        }
               for (int b = 0; b <2; b++)
                     {
                        for(int y=0; y <2; y++)
                        {
                           System.out.print(r[b][y]+ "  " );
                        }
                        System.out.println();
                     }
   
            }//end a+a
    if(choise1 == 2 && choise2 == 2)
       {
         System.out.println("(B + B) = ");
         validate1 = true;
         int r[][] = new int[2][3];
               for(int i =0; i< b.length; i++)
               {
                  for(int j=0; j< b[i].length; j++)
                  {
                     r[i][j] = b[i][j] + b[i][j];
                  }
               }
                     for (int b = 0; b <2; b++)
                     {
                        for(int y=0; y <3; y++)
                        {
                           System.out.print(r[b][y]+ "  " );
                        }
                     System.out.println();
                     }
      }//end b+b
      if(choise1 == 3 && choise2 == 3)
         {
            System.out.println("(C + C) = ");
            validate1 = true;
            int r[][] = new int[3][2];
               for(int i =0; i< c.length; i++)
               {
                     for(int j=0; j< c[i].length; j++)
                     {
                     r[i][j] = c[i][j] +c[i][j];
                     }
               }
                     for (int b = 0; b <3; b++)
                     {
                        for(int y=0; y <2; y++)
                        {
                           System.out.print(r[b][y]+ "  " );
                        }
                     System.out.println();
                     }
               }//end c+c
      if(choise1 == 4 && choise2 == 4)
      {
      System.out.println("(D + D) = ");
      validate1 = true;
      int r[][] = new int[3][3];
         for(int i =0; i< d.length; i++)
         {
            for(int j=0; j< d[i].length; j++)
            {
            r[i][j] = d[i][j] +d[i][j];
            }
         }
                  for (int b = 0; b <3; b++)
                  {
                     for(int y=0; y <3; y++)
                     {
                        System.out.print(r[b][y]+ "  " );
                     }
                  System.out.println();
                  }
        }//end d+d
}//end of addition
         if (choise3 == 2)
         {
         if(choise1 == 1 && choise2 == 1)
         {
         System.out.println("(A x A) = ");
         validate = true;
         int sum = 0;
         int r[][] = new int[2][2];           
            for(int i=0; i < 2; i++)
            {
               for (int j =0; j < 2; j++)
               {
                  for(int k =0; k < 2; k++)
                  {
                     sum = sum + a[i][k]*a[k][j];
                  }
                 r[i][j] = sum;
                 sum =0;
               }
             }
                  for (int b = 0; b <2; b++)
                  {
                     for(int y=0; y <2; y++)
                     {
                        System.out.print(r[b][y]+ "  " );
                     }
                  System.out.println();
                  }
        }
      if(choise1 == 1 && choise2 == 2)
         {
            System.out.println("(A X B) = ");
            validate = true;
            int sum = 0;
            int r[][] = new int[2][3];  
               for(int i=0; i < 2; i++)
               {
                  for (int j =0; j < 3; j++)
                  {
                     for(int k =0; k < 2; k++)
                        {
                           sum = sum + a[i][k]*b[k][j];
                        }
                           r[i][j] = sum;
                           sum =0;
                   }
                }
   
                   for (int b = 0; b <2; b++)
                        {
                           for(int y=0; y <3; y++)
                                 {
                                    System.out.print(r[b][y]+ "  " );
                                 }
                                    System.out.println();
                          }
       }
      if(choise1 == 2 && choise2 == 3)
         {
         System.out.println("(B x C) = ");
         validate = true;
         int sum = 0;
         int r[][] = new int[2][2];
            for(int i=0; i < 2; i++)
            {
               for (int j =0; j < 2; j++)
                     {
                        for(int k =0; k < 3; k++)
                              {
                                 sum = sum + b[i][k]*c[k][j];
                              }
                           r[i][j] = sum;
                           sum =0;
                     }
             }                 
                            for (int b = 0; b <2; b++)
                                 {
                                    for(int y=0; y <2; y++)
                                          {
                                             System.out.print(r[b][y]+ "  " );
                                          }
                                    System.out.println();
                                  }
         }//end of b-c
      if(choise1 == 2 && choise2 == 4)
         {
            System.out.println("(B X D) = ");
            validate = true;
            int sum = 0;
            int r[][] = new int[2][3];
               for(int i=0; i < 2; i++)
               {
                  for (int j =0; j < 3; j++)
                  {
                     for(int k =0; k < 3; k++)
                        {
                           sum = sum + b[i][k]*d[k][j];
                        }
                  r[i][j] = sum;
                  sum =0;
                  }
               }
   
                   for (int b = 0; b <2; b++)
                           {
                              for(int y=0; y <3; y++)
                                 {
                                    System.out.print(r[b][y]+ "  " );
                                  }
                     System.out.println();
                     }
}//end of b-d
      if(choise1 == 3 && choise2 == 1)
            {
               System.out.println("(C X A) = ");
               validate = true;
               int sum = 0;
               int r[][] = new int[3][2]; 
                  for(int i=0; i < 3; i++)
                        {
                           for (int j =0; j < 2; j++)
                                 {
                                    for(int k =0; k < 2; k++)
                                          {
                                          sum = sum + c[i][k]*a[k][j];
                                          }
                                          r[i][j] = sum;
                                          sum =0;
                                 }
                         } 
                                              for (int b = 0; b <3; b++)
                                                   {
                                                      for(int y=0; y <2; y++)
                                                            {
                                                            System.out.print(r[b][y]+ "  " );
                                                             }
                                                      System.out.println();
                                                    }
}//end of c-a
      if(choise1 == 4 && choise2 == 4)
            {
               System.out.println("(D X D) = ");
               validate = true;
                int sum = 0;
                int r[][] = new int[3][3];
                  for(int i=0; i < 3; i++)
                       {
                         for (int j =0; j < 3; j++)
                               {
                                for(int k =0; k < 3; k++)
                                   {
                                    sum = sum + d[i][k]*d[k][j];
                                    }
                         r[i][j] = sum;
                          sum =0;
                              }
                        }
                              for (int b = 0; b <3; b++)
                                    {
                                       for(int y=0; y <3; y++)
                                          {
                                             System.out.print(r[b][y]+ "  " );
                                          }
                                       System.out.println();
                                     }
      }//end of d-d
   if(choise1 == 4 && choise2 == 3)
      {
         System.out.println("(D X C) = ");
         validate = true;
         int sum = 0;
         int r[][] = new int[3][2];
            for(int i=0; i < 3; i++)
                  {
                     for (int j =0; j < 2; j++)
                           {
                           for(int k =0; k < 3; k++)
                              {
                                 sum = sum + d[i][k]*c[k][j];
                              }
                           r[i][j] = sum;
                           sum =0;
                           }
                  }
   
                                  for (int b = 0; b <3; b++)
                                       {
                                       for(int y=0; y <2; y++)
                                          {
                                          System.out.print(r[b][y]+ "  " );
                                           }
                                        System.out.println();
                                        }
   }//end of d-c
     if(choise1 == 3 && choise2 == 2)
     {
      System.out.println("(C X B) = ");
      validate = true;
      int sum = 0;
      int r[][] = new int[3][3]; 
         for(int i=0; i < 3; i++)
            {
               for (int j =0; j < 3; j++)
                     {
                     for(int k =0; k < 2; k++)
                        {
                        sum = sum + c[i][k]*b[k][j];
                        }
               r[i][j] = sum;
               sum =0;
                     }
            }
                         for (int b = 0; b <3; b++)
                              {
                                 for(int y=0; y <3; y++)
                                    {
                                    System.out.print(r[b][y]+ "  " );
                                    }
                              System.out.println();
                              }
   }//end of c-b

}
if (choise3 == 2 && validate == false)
{
System.out.println("Invalid. You cannot multiply " + st1.toUpperCase() +" and " +  st2.toUpperCase() + " together." );
}

if (choise3 == 1 && validate1 == false)
{
System.out.println("Invalid. You cannot add " + st1.toUpperCase() +" and " +  st2.toUpperCase() + " together." );
}
}//end of operation   
       
 static void assigner () //change values lator and test
 {
 //A2x2, 
 a[0][0] = 1; a[0][1] = -2;
 a[1][0] = 6; a[1][1] = 7; 
 //B2x3,
 b[0][0] = 1; b[0][1] = 2; b[0][2] = 3; 
 b[1][0] = 6; b[1][1] = 7; b[1][2] = 8; 
 //C3x2, 
 c[0][0] = 1; c[0][1] = 2; 
 c[1][0] = 6; c[1][1] = 7; 
 c[2][0] = 1; c[2][1] = 2; 
 //D3x3
 d[0][0] = 1; d[0][1] = 2; d[0][2] = 3; 
 d[1][0] = 6; d[1][1] = 7; d[1][2] = 8; 
 d[2][0] = 1; d[2][1] = 2; d[2][2] = 3; 
 }     
   
 static void printer (int pick)
 {
      //print A 2x2
      if(pick == 5 || pick == 1)
      {
      System.out.print("A =  \n");
          for (int i = 0; i < 2; i++)
             {
                 for (int j = 0; j < 2; j++)
                   {
                   System.out.print(a[i][j] + "   ");
                   }
             System.out.print("    \n");
             }
    }
 //print B 2x3
      if(pick == 5 || pick == 2)
         {
            System.out.print("B =  \n");
             for (int ii = 0; ii < 2; ii++)
                   {
                       for (int jj = 0; jj < 3; jj++)
                         {
                         System.out.print(b[ii][jj] + "   ");
                         }
                   System.out.print("    \n");
                   }
    }
//print C 3x2
      if(pick == 5 || pick == 3)
         {
            System.out.print("C =  \n");
             for (int iii = 0; iii < 3; iii++)
                   {
                    for (int jjj = 0; jjj < 2; jjj++)
                         {
                            System.out.print(c[iii][jjj] + "   ");
                         }
                   System.out.print("    \n");
                   }
          }
//print D 3x3
      if(pick == 5 || pick == 4)
            {
            System.out.print("D =  \n");
                for (int iiii = 0; iiii < 3; iiii++)
                      {
                       for (int jjjj = 0; jjjj < 3; jjjj++)
                               {
                               System.out.print(d[iiii][jjjj] + "   ");
                               }
                         System.out.print("    \n");
                      }
          }
 }//end of function      
   
  }//end of class
 
