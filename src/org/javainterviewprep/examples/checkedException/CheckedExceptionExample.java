package org.javainterviewprep.examples.checkedException;

/*
 * Q1. What is Compile Time Exception or Checked Exception ?
 * - Checked Exception in Java are all those exceptions which require being Catched and Handled at Compile Time.
 * - During code compilation if compiler encounter a code which is suspicious to cause error and not being handled with TRY-CATCH, 
 * - we encounter Compilation Error and hence the name Compile Time Exception.
 * - The most common example of this is reading data from a File and the first thing which can go wrong during this is , FILE does not exist. 
 * - So compiler is smart enough to recognize this code and forces us  to Handle it.
 * - Examples : IOException, SQLException
 */

//Read a File 'checkedException.txt'.
//Handle or follow any instructions provided by compiler.
//Resolve the instructions or warning provided by compiler.
public class CheckedExceptionExample {

	public static void main(String[] args) {

	}
}
