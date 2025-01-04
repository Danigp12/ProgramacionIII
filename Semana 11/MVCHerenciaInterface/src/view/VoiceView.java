package view;

import java.io.IOException;
import java.sql.Time;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static com.coti.tools.Esdia.*;


import io.github.jonelo.jAdapterForNativeTTS.engines.SpeechEngine;
import io.github.jonelo.jAdapterForNativeTTS.engines.SpeechEngineNative;
import io.github.jonelo.jAdapterForNativeTTS.engines.Voice;
import io.github.jonelo.jAdapterForNativeTTS.engines.VoicePreferences;
import io.github.jonelo.jAdapterForNativeTTS.engines.exceptions.SpeechEngineCreationException;

public class VoiceView extends ConsolaListadoView{

    @Override
    public void mostrarMenuPrincipal() throws InterruptedException{
        String text = "Voz importada con éxito.";
        try {
            SpeechEngine speechEngine = SpeechEngineNative.getInstance();
            List<Voice> voices = speechEngine.getAvailableVoices();
    
            // We want to find a voice according our preferences
            VoicePreferences voicePreferences = new VoicePreferences();
            voicePreferences.setLanguage("es"); //  ISO-639-1
            voicePreferences.setCountry("ES"); // ISO 3166-1 Alpha-2 code
            voicePreferences.setGender(VoicePreferences.Gender.FEMALE);
            Voice voice = speechEngine.findVoiceByPreferences(voicePreferences);
    
            // simple fallback just in case our preferences didn't match any voice
            if (voice == null) {
                System.out.printf("Warning: Voice has not been found by the voice preferences %s%n", voicePreferences);
                voice = voices.get(0); // it is guaranteed that the speechEngine supports at least one voice
                System.out.printf("Using \"%s\" instead.%n", voice);
            }
    
            speechEngine.setVoice(voice.getName());
            speechEngine.say(text);

            
        int opcion;
        do {
            TimeUnit.SECONDS.sleep(2);

            System.out.println("\n--- MENU ALUMNOS LISTADO COMPLETO ---");
            speechEngine.say("--- MENU ALUMNOS LISTADO COMPLETO ---");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("1. Agregar Alumno");
            speechEngine.say("1. Agregar Alumno");
            TimeUnit.SECONDS.sleep(2);

            System.out.println("2. Eliminar Alumno por DNI");
            speechEngine.say("2. Eliminar Alumno por DNI");
            TimeUnit.SECONDS.sleep(2);

            System.out.println("3. Importar alumnos");
            speechEngine.say("3. Importar alumnos");
            TimeUnit.SECONDS.sleep(2);

            System.out.println("4. Exportar alumnos");
            speechEngine.say("4. Exportar alumnos");
            TimeUnit.SECONDS.sleep(2);

            System.out.println("5. Listar alumnos");
            speechEngine.say("5. Listar alumnos");
            TimeUnit.SECONDS.sleep(2);

            System.out.println("6. Salir");
            speechEngine.say("6. Salir");
            TimeUnit.SECONDS.sleep(2);

            speechEngine.say("Ingrese una opción: ");
            opcion = readInt("Ingrese una opción: ");
            

            switch (opcion) {
                case 1:
                    agregarAlumno();
                    break;
                case 2:
                    eliminarAlumnoPorDNI();
                    break;
                case 3:
                    importarAlumnos();
                    break;
                case 4:
                    exportarAlumnos();
                    break;
                case 5:
                    listarAlumnos();
                    break;
                case 6:
                    speechEngine.say("Saliendo...");
                    System.out.println("Saliendo...");
                    break;
                default:
                    speechEngine.say("Opción no válida.");
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    
        } catch (SpeechEngineCreationException | IOException e) {
            System.err.println(e.getMessage());
        }   
    }

   
}
