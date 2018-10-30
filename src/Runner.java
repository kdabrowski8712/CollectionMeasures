import java.util.LinkedList;
import java.util.HashMap;
import java.util.Objects;


class Runner {
    public static void main (String[] args) {
        LinkedList<Book> books = new LinkedList<Book>();

        Book firstBook = new Book("AuthorFirst" , "FirstBook");
        Book lastBook  = new Book("AuthorLast", "LastBook");
        boolean res = false;

        for (int i=0 ; i<1000000; i++) {

            String author = "Author" + i;
            String title = "Titile" + i;

            books.add(new Book(author,title));
        }

        long firstAddTimeRecordBeginning = System.nanoTime();

        res = books.offerFirst(firstBook);

        long firstAddTimeRecordEnd = System.nanoTime();

        System.out.println("LinkedList - Result add element on the beginning: " + res);
        System.out.println("Time for operation " + (firstAddTimeRecordEnd - firstAddTimeRecordBeginning) + "ns");

        long lastAddTimeRecordBeginning = System.nanoTime();

        res = books.add(lastBook);

        long lastAddTimeRecordEnd = System.nanoTime();

        System.out.println("LinkedList - Result add element on the end: " + res);
        System.out.println("Time for operation " + (lastAddTimeRecordEnd - lastAddTimeRecordBeginning) + "ns");


        long firstRemoveTimeRecordBeginning = System.nanoTime();

        res = books.remove(firstBook);

        long firstRemoveTimeRecordEnd = System.nanoTime();

        System.out.println("LinkedList - Result remove element on the beginning: " + res);
        System.out.println("Time for operation " + ( firstRemoveTimeRecordEnd - firstRemoveTimeRecordBeginning) + "ns");

        long lastRemoveTimeRecordBeginning = System.nanoTime();

        res = books.remove(lastBook);

        long lastRemoveTimeRecordEnd = System.nanoTime();

        System.out.println("Result remove element on the end: " + res);
        System.out.println("Time for operation " + ( lastRemoveTimeRecordEnd - lastRemoveTimeRecordBeginning) + "ns");

        BookDetails firstDetails = new BookDetails("novel",300,true);
        BookDetails lastDetails = new BookDetails("criminal",400,false);

        HashMap<Book,BookDetails> mapTest = new HashMap<Book,BookDetails>();

        Book testKey = new Book("TestAuthor","TestTitle");
        BookDetails testVal = new BookDetails("testtype",300,true);


        for(int i=0; i<1000000; i++) {

            String tempAuth = "Author" + i;
            String tempTitle = "Title" + i;

            Book actualBook = new Book(tempAuth,tempTitle);
            BookDetails actBookDetails = new BookDetails("testType",i,true);
            mapTest.put(actualBook,actBookDetails);
        }


        long addTimeBeginning = System.nanoTime();

        mapTest.put(testKey,testVal);

        long addtimeEnd =  System.nanoTime();


        System.out.println();
        System.out.println();


        System.out.println("HashMap - add value key pair");

        System.out.println("Time for operation " + ( addtimeEnd- addTimeBeginning ) + "ns");


        long searchimeBeginning = System.nanoTime();

        res = mapTest.containsKey(testKey);


        long searchimeEnd = System.nanoTime();

        System.out.println("HashMap - search key: " + res);
        System.out.println("Time for operation " + ( searchimeEnd- searchimeBeginning ) + "ns");

        long removeTimeBeginning = System.nanoTime();

        mapTest.remove(testKey,testVal);

        long removeTimeEnd = System.nanoTime();

        System.out.println("HashMap - remove  key ");
        System.out.println("Time for operation " + ( removeTimeEnd- removeTimeBeginning ) + "ns");


    }
}

