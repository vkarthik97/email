package training;

public class Member {

	private String name;
	private Book book;
	private Object member;

	public Member() {
	}

	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	public void issuedBook()
	{
		if(book!=null)
		{
			System.out.println(title+"is already issued"+member.getName());
		}
		else
		{
			mbr.setBook(this);
			this.member=mbr;
			System.out.println(title+"is issued to"+ mbr.g);
		}
	}
	public void returnBook(Member mbr)
	{
		if(member==null||!member.getName().equals(mbr.getName() )|| mbr.getBook()==null))
          System.out.println(title+"is not issued to "+mbr.getName());
        else
	}

}
