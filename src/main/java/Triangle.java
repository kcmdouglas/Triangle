public class Triangle {
  private int mSideOne;
  private int mSideTwo;
  private int mSideThree;
  private boolean mIsTriangle;

  public Triangle(int sideOne, int sideTwo, int sideThree) {
      mSideOne = sideOne;
      mSideTwo = sideTwo;
      mSideThree = sideThree;
  }

  public boolean isATriangle(){
    if ((mSideOne + mSideTwo < mSideThree) || (mSideTwo + mSideThree < mSideOne) || (mSideThree + mSideOne < mSideTwo)){
      mIsTriangle = false;
    }
    else {
      mIsTriangle = true;
    }
    return mIsTriangle;
  }

  public String typeOfTriangle(){
    if ((mSideOne==mSideTwo) && (mSideTwo==mSideThree)) {
      return "It's an equilateral!";
    } else if ((mSideOne==mSideTwo) || (mSideTwo==mSideThree) || (mSideThree==mSideOne)){
      return "It's an isosceles!";
    } else {
      return "It's a scalene!";
    }
  }

}
