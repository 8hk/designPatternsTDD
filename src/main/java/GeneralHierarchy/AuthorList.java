package GeneralHierarchy;

import java.util.ArrayList;

public class AuthorList extends Author {
    private ArrayList <Author> authors;

    public AuthorList() {
        if(authors == null){
            authors = new ArrayList<Author>();
        }
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }
}
