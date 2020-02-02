package GeneralHierarchy;

import java.util.ArrayList;

public class Book extends  Publication {
    private ArrayList <Publication> publications;


    public Book(String name, int ISBN, PublishSpec specs, AuthorList authorList) {
        super(name, ISBN, specs, authorList);
        if(publications == null){
            publications = new ArrayList<Publication>();
        }
    }

    public void addPublication(Publication pub){
        publications.add(pub);
    }

    public ArrayList<Publication> getPublications() {
        return publications;
    }

    public void setPublications(ArrayList<Publication> publications) {
        this.publications = publications;
    }
}
