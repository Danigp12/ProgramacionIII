package model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class QuinielaModel {

    private ArrayList<Partido> partidos;

    public QuinielaModel(){
        this.partidos = new ArrayList<>();
    }

public int cargarPartidos(Path archivoPartidos){

    List<String> lineas = null;
    try {
        lineas = Files.readAllLines(archivoPartidos, StandardCharsets.UTF_8);//StandardCharsets es como la fuente, para los simbolos especiales y eso.
        for(String linea : lineas){

            String[] equipo = linea.split("-");
            Partido p = new Partido(equipo[0], equipo[1]);
            this.partidos.add(p);
        }

        return this.partidos.size();
   
    } catch (IOException e) {
        System.out.println(e.getMessage());
        return -1;
    }


}


    public void setPartidos(ArrayList<Partido> partidos){
        this.partidos = partidos;
    }

    public ArrayList<Partido> getPartidos(){
        return partidos;
    }

    public void introducirResultados(ArrayList<Partido> resultados){

        for(Partido part : resultados){
            if(part.getGolesLocal() > part.getGolesVisitante()){
                part.setResultado("1");
            }else{
                if(part.getGolesLocal() < part.getGolesVisitante()){
                    part.setResultado("2");

                }else{
                    part.setResultado("X");
                }
            }
        }
        setPartidos(resultados);
    }
}
