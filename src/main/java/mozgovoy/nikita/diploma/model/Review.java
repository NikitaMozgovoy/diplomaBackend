package mozgovoy.nikita.diploma.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class Review implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private Long filmId;
    private String text;
    private Integer rating;

    @JsonIdentityReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    private UserModel author;
}
