package projects.arrays;

import org.jetbrains.annotations.Nullable;

import java.util.Locale;

public class AlphabetWithLocale {

//    private char[] getAlphabet() {
//        return getAlphabet(false);
//    }

//    private char[] getAlphabet(boolean flagToUpperCase) {
//        Locale locale = getResources().getConfiguration().locale;
//        LocaleLanguage language = LocaleLanguage.getLocalLanguage(locale);
//        return getAlphabet(language, flagToUpperCase);
//    }

    private char[] getAlphabet(LocaleLanguage localeLanguage, boolean flagToUpperCase) {
        if (localeLanguage == null) localeLanguage = LocaleLanguage.ENGLISH;

        char firstLetter = localeLanguage.getFirstLetter();
        char lastLetter = localeLanguage.getLastLetter();
        int alphabetSize = lastLetter - firstLetter + 1;

        char[] alphabet = new char[alphabetSize];

        for (int index = 0; index < alphabetSize; index++) {
            alphabet[index] = (char) (index + firstLetter);
        }

        if (flagToUpperCase) {
            alphabet = new String(alphabet).toUpperCase().toCharArray();
        }

        return alphabet;
    }

    private enum LocaleLanguage {
        ARMENIAN(new Locale("hy"), 'ա', 'ֆ'),
        RUSSIAN(new Locale("ru"), 'а', 'я'),
        ENGLISH(new Locale("en"), 'a', 'z');

        private final Locale mLocale;
        private final char mFirstLetter;
        private final char mLastLetter;

        LocaleLanguage(Locale locale, char firstLetter, char lastLetter) {
            this.mLocale = locale;
            this.mFirstLetter = firstLetter;
            this.mLastLetter = lastLetter;
        }

        public Locale getLocale() {
            return mLocale;
        }

        public char getFirstLetter() {
            return mFirstLetter;
        }

        public char getLastLetter() {
            return mLastLetter;
        }

        public String getDisplayLanguage() {
            return getLocale().getDisplayLanguage();
        }

        public String getDisplayLanguage(LocaleLanguage locale) {
            return getLocale().getDisplayLanguage(locale.getLocale());
        }

        @Nullable
        public static LocaleLanguage getLocalLanguage(Locale locale) {
            if (locale == null) return LocaleLanguage.ENGLISH;

            for (LocaleLanguage localeLanguage : LocaleLanguage.values()) {
                if (localeLanguage.getLocale().getLanguage().equals(locale.getLanguage())) return localeLanguage;
            }
            return null;
        }
    }
}
