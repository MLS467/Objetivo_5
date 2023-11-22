package Sistema_De_Clinica_Veterinaria_Model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Animal")
@Table(name = "Animais")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int idade;
    private String sexo;
    @ManyToOne
    @JoinColumn(name = "especie_id", referencedColumnName = "id")
    private Especie especie;
    @OneToMany(mappedBy = "animal")
    private List<Tratamento> tratamentos;
    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;
}
