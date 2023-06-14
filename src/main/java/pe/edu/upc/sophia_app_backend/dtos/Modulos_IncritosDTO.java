package pe.edu.upc.sophia_app_backend.dtos;

import pe.edu.upc.sophia_app_backend.entities.Modulos_Sugeridos;


public class Modulos_IncritosDTO
{
    private int idModulosInscritos;
    private String estadoModulo;
    private String aprobado;
    private Modulos_Sugeridos modulos_sugeridos;

    public Modulos_IncritosDTO() {
    }

    public Modulos_IncritosDTO(int idModulosInscritos, String estadoModulo, String aprobado, Modulos_Sugeridos modulos_sugeridos) {
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
