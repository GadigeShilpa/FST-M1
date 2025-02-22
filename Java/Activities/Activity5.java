package activities;

abstract class Book{
	//Variable to hold the book's title
		String title;
		
		//Abstract method to set the title.
		public abstract void setTitle(String title);
		
		//concrete method to return the title of a book
		public String getTitle() {
			return this.title;
			
		}
}

class MyBook extends Book{
	//Implement the setTitle function 
	public void setTitle(String title) {
		this.title = title;
	}
}

class MyBook2 extends Book{
	//Implement the setTitle function 
	public void setTitle(String title) {
		if (title.length() < 4){
			System.out.println("Title is too small");
		} else {
			this.title = title;
		}	
		
	}
}
public class Activity5 {
	
	public static void main(String[] args) {
		MyBook bookObj = new MyBook();
		MyBook2 bookObj2 = new MyBook2();
		bookObj.setTitle("Insearch of Mother");
		System.out.println(bookObj.getTitle());
		bookObj2.setTitle("An eye on I");
		System.out.println(bookObj2.getTitle());
	}
       
}
