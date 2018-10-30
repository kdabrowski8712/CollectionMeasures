
public class BookDetails {

    private String type;
    private int nrOfPages;
    private boolean hardCover;

    public BookDetails(String type, int nt , boolean hardCover) {
        this.type = type;
        this.nrOfPages = nt;
        this.hardCover = hardCover;
    }

    @Override
    public String toString() {
        return "Type : " + type + "\n" + "Nr of pages: " + nrOfPages + "\n" + "Hard Cover: " + hardCover ;
    }



}