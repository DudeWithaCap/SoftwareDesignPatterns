package assignment3_Adapter;

public class Adapter {
    public static void main(String[] args) {
        FrenchLanguage frenchSpeaker = new TranslatorAdapter(new EnglishLanguage());
        frenchSpeaker.speakFrench("Bonjour");
        frenchSpeaker.speakFrench("Merci");
        frenchSpeaker.speakFrench("Au revoir");
        frenchSpeaker.speakFrench("Je m'appelle Adilet");
        frenchSpeaker.speakFrench("Une phrase très complexe que le traducteur ne pourrait pas traduire");

    }
}