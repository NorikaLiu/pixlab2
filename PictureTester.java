/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue() {

  
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testkeepOnlyBlue() {

  
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.testkeepOnlyBlue();
    beach.explore();
   
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("swan.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture caterpillar = new Picture("swan.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorVerticalRighToLeft();
	    caterpillar.explore();  
  }
  public static void testMirrorHorizontal()
  {
	  Picture caterpillar = new Picture("caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.MirrorHorizontal();
	    caterpillar.explore();  
  
 }

public static void testMirrorHorizontalBotToTop()
{
	  Picture caterpillar = new Picture("caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.MirrorHorizontalBotToTop();
	    caterpillar.explore();  
}

public static void testMirrorDiagonal()
{
	  Picture swan = new Picture("beach.jpg");
	    swan.explore();
	   swan.MirrorDiagonal();
	    swan.explore();  
}
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  } 
  
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGulls();
    seagull.explore();
  } 
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  public static void testCopy()
  {
    Picture swan = new Picture("swan.jpg");
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.copy2(swan, 110, 105, 60, 70, 290, 400);
    seagull.explore();
  }
  private static void myCollage() {
		// TODO Auto-generated method stub
	  Picture canvas = new Picture("640x480.jpg");
	    canvas.myCollage();
	    canvas.explore();
	  
	}
	
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2();
    swan.explore();
  }
public static void testNegate () 
{
	Picture swan = new Picture ("swan.jpg");
	swan.testNegate();
	swan.explore();

}
public static void testGrayscale () 
{
	Picture swan = new Picture ("swan.jpg");
	swan.grayscale();
	swan.explore();

} 
public static void testFixUnderwater () 
{
	Picture water = new Picture ("water.jpg");
	water.testFixUnderwater();
	water.explore();

} 
/** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testkeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    testCopy();
	  myCollage();
    //testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}