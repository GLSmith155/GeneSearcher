public class FindGeneWhile {
    public String findGene(String dna) {
    //Find first occurrence of "atg" name its startIndex
    int startIndex = dna.indexOf("ATG");
    //Find the "taa" starrting with (startIndex+3)
    int currIndex = dna.indexOf("TAA", startIndex + 3);
    //As long as currIndex is not equal to -1 (meaning there is no startIndex
    while (currIndex != -1) {
    //check if (currIndex = startIndex) is a multiple of 3
    if((currIndex - startIndex) % 3 == 0) {
    //If so, the text between startIndex and
    return dna.substring(startIndex, currIndex +3);
      }
      else {
          currIndex = dna.indexOf("TAA", currIndex + 1);
      }
    //Your answer is the empty string
    }
    return "";
    
    }
}
