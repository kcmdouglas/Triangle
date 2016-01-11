public class Triangle {
  private int mSideOne;
  private int mSideTwo;
  private int mSideThree;
  private boolean mIsTriangle;


  public boolean isATriangle(int sideOne, int sideTwo, int sideThree){
    if ((sideOne + sideTwo < sideThree) || (sideTwo + sideThree < sideOne) || (sideThree + sideOne < sideTwo)){
      mIsTriangle = false;
    }
    else {
      mIsTriangle = true;
    }
    return mIsTriangle;
  }

  public String typeOfTriangle(int sideOne, int sideTwo, int sideThree){
    if ((sideOne==sideTwo) && (sideTwo==sideThree)) {
      return "It's an equilateral!";
    } else if ((sideOne==sideTwo) || (sideTwo==sideThree) || (sideThree==sideOne)){
      return "It's an isosceles!";
    } else {
      return "It's a scalene";
    }
  }

}
