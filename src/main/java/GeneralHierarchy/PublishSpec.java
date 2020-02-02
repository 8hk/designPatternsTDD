package GeneralHierarchy;

import java.util.Date;

public class PublishSpec {
    private String publisher;
    private Date publishYear;
    private String publishPlace;

    public PublishSpec(String publisher, Date publishYear, String publishPlace) {
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.publishPlace = publishPlace;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Date publishYear) {
        this.publishYear = publishYear;
    }

    public String getPublishPlace() {
        return publishPlace;
    }

    public void setPublishPlace(String publishPlace) {
        this.publishPlace = publishPlace;
    }
}
