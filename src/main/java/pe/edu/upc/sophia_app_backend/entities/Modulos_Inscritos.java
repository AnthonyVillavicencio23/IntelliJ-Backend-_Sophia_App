package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "modulos_inscritos")
public class Modulos_Inscritos
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idModulosInscritos;

    @Column(name = "estadoModulo",length = 40,nullable = false)
    private String estadoModulo;

    @Column(name = "aprobado",length = 40,nullable = false)
    private String aprobado;
    @ManyToOne
    @JoinColumn(name = "idModulosSugeridos")
    private Modulos_Sugeridos modulos_sugeridos;

    public Modulos_Inscritos() {
    }

    public Modulos_Inscritos(int idModulosInscritos, String estadoModulo, String aprobado, Modulos_Sugeridos modulos_sugeridos) {
        this.idModulosInscritos = idModulosInscritos;
        this.estadoModulo = estadoModulo;
        this.aprobado = aprobado;
        this.modulos_sugeridos = modulos_sugeridos;
    }

    public int getIdModulosInscritos() {
        return idModulosInscritos;
    }

    public void setIdModulosInscritos(int idModulosInscritos) {
        this.idModulosInscritos = idModulosInscritos;
    }

    public String getEstadoModulo() {
        return estadoModulo;
    }

    public void setEstadoModulo(String estadoModulo) {
        this.estadoModulo = estadoModulo;
    }

    public String getAprobado() {
        return aprobado;
    }

    public void setAprobado(String aprobado) {
        this.aprobado = aprobado;
    }

    public Modulos_Sugeridos getModulos_sugeridos() {
        return modulos_sugeridos;
    }

    public void setModulos_sugeridos(Modulos_Sugeridos modulos_sugeridos) {
        this.modulos_sugeridos = modulos_sugeridos;
    }
}
