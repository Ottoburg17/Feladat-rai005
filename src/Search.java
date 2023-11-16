public class Search implements Searchable {

    @Override
    public boolean containsKeyword(String keyword) {
        System.out.println("Tratalmazás vizsgáló metódus");
        return true;
       
    }

    @Override
    public int countWords() {
        System.out.println("Szószólás");
       return 60;
    }
    
}
