package ljs;

import java.sql.Date;

public class Book extends Author{
	private String ISBN;
	private String Title;
	private int AuthorID;
	private String Publisher;
	private Date PublishDate;
	private float Price;

	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getAuthorID() {
		return AuthorID;
	}
	public void setAuthorID(int authorID) {
		AuthorID = authorID;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public Date getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(Date publishDate) {
		PublishDate = publishDate;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
}
