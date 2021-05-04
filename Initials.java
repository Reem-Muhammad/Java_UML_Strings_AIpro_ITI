public class Initials{

  public static void main(String[] args){
    //Loops through full names
    for(String arg: args){

      // split each full name by space to its compartments
      String[] split_name = arg.split(" ");

      //loops through the compartments of the full name
      for(String name: split_name){
        System.out.print(name.charAt(0)+". "); //Prints the 1st character of each compartment
      }

      System.out.println(); // moves to next line after printing initials of each name
    }

  }
}
