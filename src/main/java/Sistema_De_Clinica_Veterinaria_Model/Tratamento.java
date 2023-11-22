package Sistema_De_Clinica_Veterinaria_Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "Tratamento")
@Table(name = "tratamentos")
public class Tratamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate inicio;
    private LocalDate fim;
    @ManyToOne
    @JoinColumn(name = "animal_id", referencedColumnName = "id")
    private Animal animal;

}
