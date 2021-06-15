/*
 * Universidad Nacional de Costa Rica  2020
 *
 * mike@guzmanalan.com
 */

package info.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Entity for the user
 */
@Entity
@Table( name = "USERS" )
public class User {
    // Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    @Getter
    @Setter
    private Long idUser;
    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;
}
