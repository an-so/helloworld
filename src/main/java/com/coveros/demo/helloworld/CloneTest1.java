package com.coveros.demo.helloworld;

public class HelloWorld {

  public static void main(final String[] args) {
    clone();
	cloneWithDifferentVariableName();
	cloneWithDifferentCommentFormatting();
	cloneWithAdditionalComment();
	cloneWithDifferentFreeLines();
	cloneWithDifferentBraceFormatting();
  }
  
  private static clone() {
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
  
  private static cloneWithDifferentVariableName() {
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
  
  private static cloneWithDifferentCommentFormatting() {
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
  
  private static cloneWithAdditionalComment() {
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
  
  private static cloneWithDifferentFreeLines() {
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
  
  private static cloneWithDifferentBraceFormatting() {
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

}
