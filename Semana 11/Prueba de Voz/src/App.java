import java.io.IOException;
import java.util.List;

import io.github.jonelo.jAdapterForNativeTTS.engines.SpeechEngine;
import io.github.jonelo.jAdapterForNativeTTS.engines.SpeechEngineNative;
import io.github.jonelo.jAdapterForNativeTTS.engines.Voice;
import io.github.jonelo.jAdapterForNativeTTS.engines.VoicePreferences;
import io.github.jonelo.jAdapterForNativeTTS.engines.exceptions.SpeechEngineCreationException;

public class App {
    public static void main(String[] args) throws Exception {
        String text = "The answer to the ultimate question of life, the universe, and everything is 42";
        try {
            SpeechEngine speechEngine = SpeechEngineNative.getInstance();
            List<Voice> voices = speechEngine.getAvailableVoices();
    
            System.out.println("For now the following voices are supported:\n");
            for (Voice voice : voices) {
                System.out.printf("%s%n", voice);
            }
    
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
    
        } catch (SpeechEngineCreationException | IOException e) {
            System.err.println(e.getMessage());
        }    }
}
/* 
//Crear una excepcion personalizada. LO MÁS IMPORTANTE ES EL EXTENDS EXCEPTION.
public class persistanceAlumnoExcecption extends Exception{

    //Modelos.
public persistenceAlumno excepcion(){
}
public persistenceAlumno excepcion(Throwable cause){
}
public persistenceAlumno excepcion(String message){
}
public persistenceAlumno excepcion(String message, Throwable cause){
}
}
*/