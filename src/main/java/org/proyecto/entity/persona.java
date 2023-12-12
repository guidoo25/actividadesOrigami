package org.proyecto.entity;
import javax.persistence.*;

@Entity
@Table(name = "persona")
public class persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "identificacion")
    private String identificacion;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "id_proceso", referencedColumnName = "id")
    private proceso proceso;

    // Getters and Setters
}
