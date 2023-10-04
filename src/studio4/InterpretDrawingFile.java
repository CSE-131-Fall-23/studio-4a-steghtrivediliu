package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
	String shapetype = in.next();
	int redComponent = in.nextInt();
	int greenComponent = in.nextInt();
	int blueComponent = in.nextInt();
	boolean isFilled = in.nextBoolean();
	
	StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
	
	
	if (isFilled == true) {
		if (shapetype.equals("rectangle"))
			{
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
		else if (shapetype.equals("ellipse"))
		{
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
		}
		else if (shapetype.equals("triangle"))
		{
			double[] x = new double[3];
			double[] y = new double[3];
			
			for (int i = 0; i<3; i++)
			{
				x[i] = in.nextDouble();
				y[i] = in.nextDouble();
			}
		
			StdDraw.filledPolygon(x, y);
			
					
		}
	}
	else
	{
		//StdDraw.rectangle(x, y, halfWidth, halfHeight);
	}
}}
