package pixLab.classes;
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
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testAllBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.allBlue();
    beach.explore();
  }
  
  public static void testAllRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.allRed();
    beach.explore();
  }
  
  public static void testAllGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.allGreen();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture moon = new Picture("moon-surface.jpg");
    moon.explore();
    moon.mirrorVertical();
    moon.explore();
  }
  
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture moon = new Picture("moon-surface.jpg");
	    moon.explore();
	    moon.mirrorVerticalRightToLeft();
	    moon.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture island = new Picture("CumberlandIsland.jpg");
	    island.explore();
	    island.mirrorHorizontal();
	    island.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
	  Picture island = new Picture("CumberlandIsland.jpg");
	    island.explore();
	    island.mirrorHorizontalBottomToTop();
	    island.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection(15);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(15);
    swan.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("butterfly1.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture water = new Picture("water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testAllBlue();
    //testAllRed();
    //testAllGreen();
    //testNegate();
    //testGrayscale();
    testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBottomToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}