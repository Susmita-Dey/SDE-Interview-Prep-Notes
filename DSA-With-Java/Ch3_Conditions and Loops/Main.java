public class Main {

    public static void main(String[] args) {
	    /*
	    Syntax of if else statements:
	    if ( boolean expression T or F) {
	        // body
	    } else {
	        // do this
	    }
	     */

        int salary = 25400;
        if(salary > 10000){
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }

        System.out.println(salary);
    }
}
