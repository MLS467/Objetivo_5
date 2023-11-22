package Sistema_De_Clinica_Veterinaria_Model;

import jakarta.persistence.*;

import java.util.List;


@Entity(name = "Cliente")
@Table(name = "Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String endereco;
    private String telefone;
    private long cep;
    private String email;
    @OneToMany(mappedBy = "cliente")
    private List<Animal> animais;
}
