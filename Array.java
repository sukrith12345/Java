class myMarket 
{
  public static void main(String args[]) {
    int[] myMarket = new int[5]; // Array start with 0 
    myMarket[0] = 120;
    myMarket[1] = 50;
    myMarket[2] = 800;
    myMarket[3] = 100;
    myMarket[4] = 69;

    for (int i = 0; i < myMarket.length; i++) {
      System.out.println("myMarket  in list " + i + " is: " + myMarket[i]);
    }
  }
}
