package m2s08.funcionario.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cargo;
    private Float salario;

    @OneToMany(mappedBy = "employee", orphanRemoval = true, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Registro> registros;
}
