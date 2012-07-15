package com.ritolaaudio.convolvej;

/**
Convolve-J - A simple WAV file CLI convolution utility in java.
Copyright (C) 2012  Chuck Ritola

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

import java.io.File;


public class RunMe
	{
	/**
	 * Usage: java -jar ConvolveJ.jar input.wav impulse.wav output.wav
	 * @param args
	 * @since Jul 6, 2012
	 */
	public static void main(String[] args)
		{
		System.out.println("Convolve-J Copyright (C) 2012 Chuck Ritola.\n" +
				"This program comes with ABSOLUTELY NO WARRANTY. \n"+
				"This is free software, and you are welcome to redistribute it\n"+
				"under certain conditions of the GPL version 3. \n"+
				"See the included file inside this .JAR named 'COPYING' for details or see\n" +
				"http://www.gnu.org/licenses/gpl-3.0.txt");
		
		if(args.length!=3)fail();
		
		File inputFile= new File(args[0]);
		File impFile= new File(args[1]);
		File outputFile= new File(args[2]);
		
		try
			{
			System.out.println("Loading WAV source...");
			System.out.println("Convolving with "+(Runtime.getRuntime().availableProcessors()+1)+" threads.");
			Convolver.convolve(inputFile, impFile, outputFile,Runtime.getRuntime().availableProcessors()+1);
			}
		catch(Exception e){e.printStackTrace();fail();}
		}
	
	private static void fail()
		{
		System.out.println("Usage: java -jar ConvolveJ.jar input.wav impulse.wav output.wav");
		System.out.println("Aborted.");
		System.exit(1);
		}
	}//end Main
