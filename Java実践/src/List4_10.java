import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

class Book implements Comparable<Book>{
	// 書名
	private String title;
	// 発効日
	private Date publishDate;
	// コメント
	private String comment;

	// コンストラクタ
	public Book(String title, Date publishDate) {
		this.title = title;
		this.publishDate = publishDate;
	}

	// equals メソッドのオーバーライド
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (!(o instanceof Book)) {
			return false;
		}
		Book b = (Book) o;
		return b.title.equals(this.title) && b.publishDate.equals(this.publishDate);
	}

	// equals メソッドのオーバーライド
	public int compareTo(Book o) {
		return this.publishDate.compareTo(o.publishDate);
	}

	// ゲッター ・ セッター
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}

public class List4_10{
	public static void main(String[] args) throws InterruptedException {

		// 1. 等価チェック
		Date now = new Date();
		Book b1 = new Book("Java", now);
		Book b2 = new Book("Java", now);
		System.out.println("等しいこと：" + b1.equals(b2));

		b2 = new Book("スッキリ", now);
		System.out.println("等しくないこと：" + b1.equals(b2));

		b2 = new Book("Java", new Date());
		System.out.println("等しくないこと：" + b1.equals(b2));

		// 2. 発効日の古い順
		List<Book> books = new ArrayList<>();
		Book b3 = new Book("book3", new Date());
		Thread.sleep(1000);
		Book b4 = new Book("book4", new Date());
		Thread.sleep(1000);
		Book b5 = new Book("book5", new Date());
		Thread.sleep(1000);
		Book b6 = new Book("book6", new Date());
		Thread.sleep(1000);
		Book b7 = new Book("book7", new Date());
		books.add(b4);
		books.add(b5);
		books.add(b7);
		books.add(b6);
		books.add(b3);

		Collections.sort(books);
		for (Book b : books) {
			System.out.print(b.getTitle() + " ⇒ ");
		}

	}
}
