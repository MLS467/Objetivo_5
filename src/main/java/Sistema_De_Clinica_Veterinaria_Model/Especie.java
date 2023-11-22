package Sistema_De_Clinica_Veterinaria_Model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Especie")
@Table(name = "especies")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @OneToMany(mappedBy = "especie")
    private List<Animal> especies;
}
