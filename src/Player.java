abstract class Player {
    String name;//nombre jugadora

    int[] guesses;//historias de intentos de adivinanza

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGuesses() {
        return guesses;
    }

    public void setGuesses(int[] guesses) {
        this.guesses = guesses;
    }

    abstract int makeGuess();

}
