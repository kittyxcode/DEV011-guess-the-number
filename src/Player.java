abstract class Player {
    String name;//nombre jugadora

    int[] guesses;//intentos de adivinar nro

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
