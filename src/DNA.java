// this program determines whether there is a protein in a strand of DNA.
public class DNA {

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-


        String dna1 = "ATGCGATACGCTTGA"; // Contains a protein
        String dna2 = "ATGCGATACGTGA"; // Does not contain a protein
        String dna3 = "ATTAATATGTACTGA"; // Contains a protein

        String dna = dna1;

        // check the length of the dna string
        System.out.println(dna1.length());

        // check if it begins with a start codon ATG
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);

        // check if it ends with a stop codon TGA
        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);

        // check if the number of nucleotides is divisible by 3
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            String protein = dna.substring(start, stop+3 );
            System.out.println("Protein: " + protein);
            System.out.println("Condition 1 and 2 and 3 are satisfied.");
        } else {
            System.out.println("No protein.");
        }


    }

}