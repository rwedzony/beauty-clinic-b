package it.arcade.hospital.user;

import java.util.Date;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "entry_date")
    private Date entryDate;
}
