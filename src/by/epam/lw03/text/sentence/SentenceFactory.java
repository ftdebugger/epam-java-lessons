package by.epam.lw03.text.sentence;

import by.epam.lw03.parser.ParseException;
import by.epam.lw03.text.Factory;

/**
 */
public class SentenceFactory implements Factory<SentencePart> {

    @Override
    public SentencePart factory(String type, String text) throws ParseException {
        if (Punctuation.ID.equals(type)) {
            return new Punctuation(text);
        }

        if (Whitespace.ID.equals(type)) {
            return new Whitespace(text);
        }

        if (Word.ID.equals(type)) {
            return new Word(text);
        }

        throw new ParseException("Cannot create sentence part");
    }
}