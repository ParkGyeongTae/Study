//package four;
//
//class Book {
//	
//	private String title;
//	private String author;
//	
//	public Book() {
//	}
//	
//	public Book(String title, String author) {
//		this.title = title;
//		this.author = author;
//	}
//	
//	public String getTitle() {
//		return title;
//	}
//	
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	
//	public String getAuthor() {
//		return author;
//	}
//	
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//	
//	public void showBookInfo() {
//		System.out.println(title + "," + author);
//	}
//}
//
//public class BookArrayTest {
//	public static void main(String[] args) {
//		
//		Book[] bookShelf = new Book[5];
//		Book[] copyShelf = new Book[5];
//		
//		bookShelf[0] = new Book("토지", "박경리");
//		bookShelf[1] = new Book("태백산맥", "조정래");
//		bookShelf[2] = new Book("당신들의 천국", "이청준");
//		bookShelf[3] = new Book("나목", "박완서");
//		bookShelf[4] = new Book("데미안", "헤르만 헤세");
//		
//		System.arraycopy(bookShelf, 0, copyShelf, 0, 5);
//		
//		copyShelf[0].setTitle("나목");
//		copyShelf[0].setAuthor("박완서");
//		
//		for (Book aBook : bookShelf) {
//			aBook.showBookInfo();
//		}
//		System.out.println("===========");
//		for (Book aBook : copyShelf) {
//			aBook.showBookInfo();
//		}
//		
////		Book[] bookShelf = new Book[5];
////		Book[] copyShelf = new Book[5];
////		
////		bookShelf[0] = new Book("토지", "박경리");
////		bookShelf[1] = new Book("태백산맥", "조정래");
////		bookShelf[2] = new Book("당신들의 천국", "이청준");
////		bookShelf[3] = new Book("나목", "박완서");
////		bookShelf[4] = new Book("데미안", "헤르만 헤세");
////		
////		copyShelf[0] = new Book();
////		copyShelf[1] = new Book();
////		copyShelf[2] = new Book();
////		copyShelf[3] = new Book();
////		copyShelf[4] = new Book();
////		
////		for (int i = 0; i < bookShelf.length; i++) {
////			copyShelf[i].setTitle(bookShelf[i].getTitle());
////			copyShelf[i].setAuthor(bookShelf[i].getAuthor());
////		}
////		bookShelf[0].setTitle("대지");
////		bookShelf[0].setAuthor("펄벅");
////		
////		for (Book book: bookShelf) {
////			book.showBookInfo();
////		}
////		
////		System.out.println("==========");
////		
////		for (Book book: copyShelf) {
////			book.showBookInfo();
////		}
//		
//	}
//
//}