package com.learning.vcube;

public class Quiz {
	
	String subject;
	int totalQuetion;
	double timeLimit;
	
	public Quiz() {
		this("Mathes");
	}
	
	public Quiz(String subject) {
		this(subject, 100);
	}
	public Quiz(String subject, int totalQuetion){
		this(subject, totalQuetion, 1.30);
	} 
	
	public Quiz(String subject, int totalQuetion,double timeLimit ) {
		
		this.subject = subject;
		this.totalQuetion = totalQuetion;
		this.timeLimit = timeLimit;
	}
	
	void show() {
		System.out.println("Subject : " + subject);
		System.out.println("Total Quetion : " + totalQuetion);
		System.out.println("Time Limit : " + timeLimit);
		
	}
	
	public static void main(String [] args) {
		
		Quiz Q = new Quiz();
		Q.show();
	}

}
