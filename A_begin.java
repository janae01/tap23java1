/*
 * Hello world
 *  * Create integer, double, float
 * Show the java repl - jshell
 * show how System.out.println(a) with lowercase system fails
 * Create function p()
 * Prints a line
 * 
 */

public class A_begin {

    public static void main(String[] args) {
        
        System.out.println("Hello world!");
        int myNumber = 5;
        System.out.println(myNumber);

        String str = "Abc";
        p(str + ":" + myNumber);
        
    }

    public static void p(Object line){
        System.out.println(line);
    }

}