/**
 * @author 
 * @version 
 */

public class MagicSquare
{
    /** The magic square array data */
    private int[][] array;

    /**
     * Constructs a MagicSquare object.
     * @param input the magic square array data.
     */
    public MagicSquare(int[][] input)
    {
        array = input;
    }

    /**
     * Tests to see if array is indeed a magic square
     * @return true if array is a magic square
     * @return false if the array is not a magic square
     */
    public boolean isMagicSquare()
    {
      boolean magic = false;
      int sum = 0;
      for(int r = 0; r<array.length; r++){
        sum=sum+array[r][0];
      }
      int len = array.length;
      boolean square = false;
      int nr = 0;
      for(int rows = 0; rows<array.length; rows++){
          if (array[rows].length==len){
            nr++;
        }
      }
      if (nr==len){
        square=true; 
      }

    if (square==true){
      if(checkrow(sum)){
        if(checkcol(sum)){
          if(checkd(sum)){
            if(checkd2(sum)){
              magic=true;
            }
          }
        }
      }
    }
        return magic;   // complete this method
    }

    public boolean checkrow(int sum){
      int sumr = 0;
      int countr = 0;
      boolean checkSumR = false;
      for(int c = 0; c<array[0].length; c++){
        for (int r = 0; r<array.length; r++){
          sumr=sumr+array[r][c];
        }
        if (sumr==sum){
          countr++;
        }
        sumr=0;
      }
      if (countr==array.length){
        checkSumR=true;
      }
      return checkSumR;
    }
    public boolean checkcol(int sum){
      int sumc = 0;
      int countc = 0;
      boolean checkSumC = false;
      for(int r = 0; r<array.length; r++){
        for (int c = 0; c<array[r].length; c++){
          sumc=sumc+array[r][c];
        }
        if (sumc==sum){
          countc++;
        }
        sumc=0;
      }
      if (countc==array.length){
        checkSumC=true;
      }
      return checkSumC;
    }
    public boolean checkd(int sum){
      int sumd = 0;
      int countd = 0;
      boolean checkSumD = false;
      for(int r = 0; r<array[0].length; r++){
          sumd=sumd+array[r][r];
        }
        if (sumd==sum){
          countd++;
        }
      
      
      if (countd==1){
        checkSumD=true;
      }
      return checkSumD;
    }
    public boolean checkd2(int sum){
      int sumd2 = 0;
      int countd2=0;
      boolean checkSumD2 = false;
      int c= array.length-1;
      for(int r = 0; r<array[0].length; r++){
          sumd2 += array[r][c];
          c--;
          
        }
        if (sumd2==sum){
          countd2++;
        }
      if (countd2==1){
        checkSumD2=true;
      }
      return checkSumD2;
    }

    /**
     * Returns a String which represents the array.
     */
    public String toString()
    {
        String result = "";
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                result += array[r][c];
                result += "\t";
            }
            result += "\n";
        }
        return result;
    }
}
