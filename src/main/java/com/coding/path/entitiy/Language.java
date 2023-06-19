package com.coding.path.entitiy;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer language_id;

    @Column(name = "language_name")
    private String name;
}
