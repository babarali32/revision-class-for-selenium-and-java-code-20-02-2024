package class14And15;

public class task01Daniel {
    public static void main(String[] args) {
        //1.    Write a program that reads two people's first
        //names and if they expecting boy or girl?
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name: DANRY
        //
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? girl
        //Suggested baby name: MAIEL
        String fathername="makesh";
        String mothername="anita";
        String isBoyOrgirl="Boy";
        if (isBoyOrgirl.equalsIgnoreCase("boy")){
            String fa=fathername.substring(0,fathername.length()/2);
            String mot=mothername.substring(mothername.length()/2);
            System.out.println("boy name will be "+fa+mot);
        } else if (isBoyOrgirl.equalsIgnoreCase("girl")){
            String mom=mothername.substring(0,mothername.length()/2);
           String dad= fathername.substring(fathername.length()/2);
            System.out.println("girl name will be "+mom+dad);
        } else {
            System.out.println(" wrong enter names");
        }

    }
}
