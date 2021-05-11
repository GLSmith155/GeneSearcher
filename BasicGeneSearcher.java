public class BasicGeneSearcher {


    public String GeneSearcher(String dna) {
        // start codon is "ATG"
        // end codon is "TAA"


        String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) //no ATG
        {
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        if (stopIndex == -1) {  //no TAA
            return "";
        }
        //this allows the program to begin searching for the stop codon
        //after 3 characters past the occurence of a start codon.
        result = dna.substring(startIndex, stopIndex + 3);

        return result;
    }

    public void testGeneSearcher() {
        String dna = "CGATGGTTTG";
        System.out.println("DNA strand is " + dna);
        String gene = GeneSearcher(dna);
        System.out.println("Gene is " + gene);

        dna = "CGATGGTTTAAAAGT";
        System.out.println("DNA strand is " + dna);
        gene = GeneSearcher(dna);
        System.out.println("Gene is " + gene);
    }
}