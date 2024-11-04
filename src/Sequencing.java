//This program will receive a string, that will contain
public class Sequencing {
    public static void main(String[] args){
        //variables.
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna4 = "ATGCGATAGA";
        String dna = dna2;
        int dnaLength = dna.length();
        String start = dna.substring(0,3);
        String stop = dna.substring(dnaLength - 3, dnaLength);
        System.out.println(stop);
        if(start.equals("ATG") && stop.equals("TGA") && dnaLength%3 == 0){
            System.out.println("It is a protein");
        }else{
            System.out.println("It is NOT a protein");
        }
    }
}
