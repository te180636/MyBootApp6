package jp.te4a.spring.boot.myapp9;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@Table(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBean {
@Id
@GeneratedValue
	Integer id;
	@Column(nullable = false)
	String title;
	String writer;
	String publisher;
	Integer price;
}
