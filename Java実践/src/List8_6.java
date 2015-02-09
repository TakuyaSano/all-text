import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

class Book implements Comparable<Book>{
	// 書名
	private String title;
	// 発効日
	private Date publishDate;
	// コメント
	private String comment;

	// コンストラクタ
	public Book(String title, Date publishDate, String comment) {
		this.title = title;
		this.publishDate = publishDate;
		this.comment = comment;
	}

	// equals メソッドのオーバーライド
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}

	// equals メソッドのオーバーライド
	public int compareTo(Book o) {
		return CompareToBuilder.reflectionCompare(this, o);
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

public class List8_6 {
	public static void main(String[] args) throws InterruptedException {

		// 1. 等価チェック
		Date now = new Date();
		Book b1 = new Book("Java", now, "コメント");
		Book b2 = new Book("Java", now, "コメント");
		System.out.println("等しいこと：" + b1.equals(b2));

		b2 = new Book("スッキリ", now, "コメント");
		System.out.println("タイトルが異なる：" + b1.equals(b2));

		b2 = new Book("Java", new Date(), "コメント");
		System.out.println("発効日が異なる：" + b1.equals(b2));

		b2 = new Book("Java", now, "コンドル");
		System.out.println("コメントが異なる：" + b1.equals(b2));

		// 2. 発効日の古い順
		List<Book> books = new ArrayList<>();
		Book b3 = new Book("book3", new Date(), "コメント");
		Thread.sleep(1000);
		Book b4 = new Book("book4", new Date(), "コメント");
		Thread.sleep(1000);
		Book b5 = new Book("book5", new Date(), "コメント");
		Thread.sleep(1000);
		Book b6 = new Book("book6", new Date(), "コメント");
		Thread.sleep(1000);
		Book b7 = new Book("book7", new Date(), "コメント");
		books.add(b4);
		books.add(b5);
		books.add(b7);
		books.add(b6);
		books.add(b3);

		Collections.sort(books);
		for (Book b : books) {
			System.out.print(b.getTitle() + " ⇒ ");
		}

		System.out.println("\r\n" + ToStringBuilder.reflectionToString(b4));
	}
}