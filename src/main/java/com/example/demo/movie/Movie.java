package com.example.demo.movie;


import javax.persistence.*;

@Entity
@Table
public class Movie {
/*    @SequenceGenerator(
            name="movie_sequence",
            sequenceName = "movie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_sequence"
    )*/
    @Id
    private Long id;
    private String name;

    public Movie() {
    }

    public Movie(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Movie(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
