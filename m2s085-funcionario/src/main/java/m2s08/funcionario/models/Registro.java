package m2s08.funcionario.models;

import jakarta.persistence.*;

@Entity
@Table(name = "REGISTROS")
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String idFuncionario;
    private String horaDeRegistro;
    @Enumerated(EnumType.STRING)
    private TipoRegistro tipoRegistro;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false, referencedColumnName = "id")
    private Funcionario funcionario;
}
