package com.mycompany.cinemaproject.entities.concretes;

import lombok.*;
import javax.persistence.*;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    //Film tablomuzu oluşturduğumuz entity sınıfımız
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private Integer movieId;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_director")
    private String movieDirector;

    @Column(name = "movie_release_year")
    private Integer releaseYear;

    //Enum class olarak entitye genre'nin entegre edilmesi
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "genre")
    private Genres genre;

    //   @ManyToOne
    //  @JoinColumn(name = "genre_id")
    // private Genre genre;

}
