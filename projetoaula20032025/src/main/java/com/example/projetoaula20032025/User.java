package com.example.projetoaula20032025;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private long id;

    @NonNull
    private String username;

    @NonNull
    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "usuario" )
    @NonNull
    private List<Phone> phones;
}
