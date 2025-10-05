package nl.inholland.catstate.cat;

interface CatState {
    void enter(Cat cat);
    void feed(Cat cat);
    void pet(Cat cat);
    void play(Cat cat);
}
