package software.netcore.radman.data.radius.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @since v. 1.0.0
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "radreply")
public class RadReply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "UNSIGNED INT(11)")
    private Integer id;

    @Column(name = "username", nullable = false, length = 64)
    private String username;

    @Column(nullable = false, length = 64)
    private String attribute;

    @Column(columnDefinition = "CHAR(2)", nullable = false)
    private String op;

    @Column(length = 253, nullable = false)
    private String value;

}
