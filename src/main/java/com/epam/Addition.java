package com.epam;

/**
* The add program performs addition of numbers of string format.
*
* @author  Mangesh Gawade
* @version 1.0
* @since   2018-04-02 
*/
public class Addition {


	
	 /**
	   * This method is used to addition of numbers of string format
	   * @param str This is the string parameter for numbers
	   * @return int This returns sum of numbers.
	   */
	 int add(String str){
		    int sum = 0;
		    for(int i=0; i<str.length(); i++){              
		            if(Character.isDigit(str.charAt(i))){
		                    sum+=str.charAt(i)-'0';
		                }
		        }
		    return sum;
		}
		public static void main(String[] args) {
			Addition addition=new Addition();
			int result=addition.add("1,1,2,3");
			System.out.println("Addition :"+result);
		}
}
