
@Entity
@Tabla(name="empleados")
Public class Empleado{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="fecha_ingreso")
    private LocalDate fechaIngreso;

    @Column(name="nombre", length = 200, nullable =false)
    private String nombre;

    @Colum(name="salario", precision = 10, scale= 2)
    private BigDecimal salario;

    //constructot
    //mètodos getter y setters
}


public interface EmpleadoRepository extends JpaRepository <Empleado>



