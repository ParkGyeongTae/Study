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
//		bookShelf[0] = new Book("����", "�ڰ渮");
//		bookShelf[1] = new Book("�¹���", "������");
//		bookShelf[2] = new Book("��ŵ��� õ��", "��û��");
//		bookShelf[3] = new Book("����", "�ڿϼ�");
//		bookShelf[4] = new Book("���̾�", "�츣�� �켼");
//		
//		System.arraycopy(bookShelf, 0, copyShelf, 0, 5);
//		
//		copyShelf[0].setTitle("����");
//		copyShelf[0].setAuthor("�ڿϼ�");
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
////		bookShelf[0] = new Book("����", "�ڰ渮");
////		bookShelf[1] = new Book("�¹���", "������");
////		bookShelf[2] = new Book("��ŵ��� õ��", "��û��");
////		bookShelf[3] = new Book("����", "�ڿϼ�");
////		bookShelf[4] = new Book("���̾�", "�츣�� �켼");
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
////		bookShelf[0].setTitle("����");
////		bookShelf[0].setAuthor("�޹�");
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