package SixChapter;

public class Book {
	private String title;
	private String author;
	private double price;
	public Book(String title,String author,double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public double getPrice()
	{
		return price;
	}
	
	
	
	public static void main(String[] args)
	{
		Book book=new Book("<java>","shits",250);
		System.out.println("����:"+book.getTitle());
		System.out.println("����:"+book.getAuthor());
		System.out.println("�۸�:"+book.getPrice());
	}
}
