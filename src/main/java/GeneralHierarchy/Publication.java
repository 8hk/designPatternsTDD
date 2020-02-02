package GeneralHierarchy;

import java.util.Date;

public class Publication {
    private String name;
    private int ISBN;
    private PublishSpec specs;
    private AuthorList authorList;


    public Publication(String name, int ISBN, PublishSpec specs, AuthorList authorList) {
        this.name = name;
        this.ISBN = ISBN;
        this.specs = specs;
        this.authorList = authorList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public PublishSpec getSpecs() {
        return specs;
    }

    public void setSpecs(PublishSpec specs) {
        this.specs = specs;
    }

    public AuthorList getAuthorList() {
        return authorList;
    }

    public void setAuthorList(AuthorList authorList) {
        this.authorList = authorList;
    }
}
