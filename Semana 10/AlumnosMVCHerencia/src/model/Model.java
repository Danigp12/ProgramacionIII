package model;

import java.util.ArrayList;
import java.util.List;

import javax.naming.ldap.PagedResultsControl;

import org.xml.sax.SAXException;

public class Model {

    //tratar los estados del listado de alumnos.
    private ArrayList<Alumno> alumnos;

    //Gestionar la Importacion/Exportación de las fuentes extrnas (TSV, CSV,...).
    private PersistenceRepository repository;

    public Model(PersistenceRepository repository){
        this.repository = repository;
        this.alumnos = new ArrayList<>();
    }

    public boolean exportarAlumnos() throws Exception{
        return repository.exportarAlumnos(alumnos);
    }

    public boolean importarAlumnos() throws Exception{
        List<Alumno> alumnosImportados = repository.importarAlumnos();

        if(alumnosImportados != null){
            for (Alumno alumno : alumnosImportados) {
                //Tenemos que verificar si ya existe el alumno.

                if(!alumnos.contains(alumno)){
                    this.alumnos.add(alumno);
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public boolean agregarAlumno() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarAlumno'");
    }

}
