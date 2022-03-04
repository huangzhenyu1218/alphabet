package io.github.alphabet;

public class AlphabetContext {
    public Alphabet alphabet;

    public void setAlphabet(Alphabet alphabet) {
        this.alphabet = alphabet;
    }
    public Alphabet getAlphabet(){
        return this.alphabet;
    }
    public String alphabetFormat(String alphabet){
        return this.alphabet.createAlphabet(alphabet);
    }
}
