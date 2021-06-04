package com.coveros.demo.helloworld;

public class CloneTest2 {

  public static void main(final String[] args) {
    clone();
	cloneWithDifferentVariableName();
	cloneWithDifferentCommentFormatting();
	cloneWithAdditionalComment();
	cloneWithDifferentFreeLines();
	cloneWithDifferentBraceFormatting();
  }
  
  private static void clone() {
	int n1 = 0, n2 = 1, n3, i, count = 10;
	//printing 0 and 1
	System.out.print(n1 + " " + n2);

    //loop starts from 2 because 0 and 1 are already printed
	for(i=2;i<count;++i) {
		n3 = n1 + n2;
		System.out.print(" " + n3);
		n1 = n2;
		n2 = n3;
	}
  }
  
  private static void cloneWithDifferentVariableName() {
	int n1 = 0, n2 = 1, n3, i, renamedVariable = 10;
	//printing 0 and 1
	System.out.print(n1 + " " + n2);

    //loop starts from 2 because 0 and 1 are already printed
	for(i=2;i<renamedVariable;++i) {
		n3 = n1 + n2;
		System.out.print(" " + n3);
		n1 = n2;
		n2 = n3;
	}
  }
  
  private static void cloneWithDifferentCommentFormatting() {
	int n1 = 0, n2 = 1, n3, i, count = 10;
	//printing 0 and 1
	System.out.print(n1 + " " + n2);
    
	for(i=2;i<count;++i) { //loop starts from 2 because 0 and 1 are already printed
		n3 = n1 + n2;
		System.out.print(" " + n3);
		n1 = n2;
		n2 = n3;
	}
  }
  
  private static void cloneWithAdditionalComment() {
	int n1 = 0, n2 = 1, n3, i, count = 10;
	//printing 0 and 1
	System.out.print(n1 + " " + n2);

    //loop starts from 2 because 0 and 1 are already printed
	for(i=2;i<count;++i) {
		n3 = n1 + n2;
		//addtional comment
		System.out.print(" " + n3);
		n1 = n2;
		n2 = n3;
	}
  }
  
  private static void cloneWithDifferentFreeLines() {
	int n1 = 0, n2 = 1, n3, i, count = 10;
	//printing 0 and 1
	System.out.print(n1 + " " + n2);
    //loop starts from 2 because 0 and 1 are already printed
	for(i=2;i<count;++i) {
		n3 = n1 + n2;
		System.out.print(" " + n3);
		n1 = n2;
		n2 = n3;
	}
  }
  
  private static void cloneWithDifferentBraceFormatting() 
  {
	int n1 = 0, n2 = 1, n3, i, count = 10;
	//printing 0 and 1
	System.out.print(n1 + " " + n2);

    //loop starts from 2 because 0 and 1 are already printed
	for(i=2;i<count;++i) 
	{
		n3 = n1 + n2;
		System.out.print(" " + n3);
		n1 = n2;
		n2 = n3;
	}
  }

}
