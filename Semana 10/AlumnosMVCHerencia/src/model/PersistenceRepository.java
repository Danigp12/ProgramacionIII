package model;

import java.util.List;

public interface PersistenceRepository {
        public List<Alumno> importarAlumnos() throws Exception;

        public boolean exportarAlumnos(List<Alumno> alumnos) throws Exception;
}
