public class Triangle {
  private int mSideOne;
  private int mSideTwo;
  private int mSideThree;
  private boolean mIsTriangle;


  public boolean isATriangle(int sideOne, int sideTwo, int sideThree){
    if ((sideOne + sideTwo > sideThree) || (sideTwo + sideThree > sideOne) || (sideThree + sideOne > sideTwo)){
      mIsTriangle = false;
    }
    else {
      mIsTriangle = true;
    }
    return mIsTriangle;
  }



}
