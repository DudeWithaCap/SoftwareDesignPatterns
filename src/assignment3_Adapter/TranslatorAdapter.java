package assignment3_Adapter;

class TranslatorAdapter implements FrenchLanguage {
    private EnglishLanguage englishSpeaker;
    public TranslatorAdapter(EnglishLanguage englishSpeaker) {
        this.englishSpeaker = englishSpeaker;
    }


    public void speakFrench(String words) {
        String translated = translateFrenchToEnglish(words);
        englishSpeaker.speakEnglish(translated);
    }

    private String translateFrenchToEnglish(String words) {
        if (words.equalsIgnoreCase("Bonjour")) return "Hello";
        if (words.equalsIgnoreCase("Merci")) return "Thank you";
        if (words.equalsIgnoreCase("Au revoir")) return "Goodbye";
        if (words.equalsIgnoreCase("Je m'appelle Adilet")) return "My name is Adilet";
        return "Unknown translation: " + words + " ";
    }
}
