package nl.inholland.catstate.cat;

// This is an example of how to implement the CatState interface
// Create three states for a sleeping, hungry and happy cat.
// Then change the Cat class so that it starts in the sleeping state
class ExampleState implements CatState {

    @Override
    public void enter(Cat cat) {
        // TODO: play the correct animation, see the SpriteFactory for what's available
        // TODO: Display a relevant status text
        // example: cat.playAnimation("someAnimation");
    }

    @Override
    public void feed(Cat cat) {
        cat.setStatusText("This has not been implemented yet.");
    }

    @Override
    public void pet(Cat cat) {
        cat.setStatusText("This has not been implemented yet.");
        ///  TODO: Switch to another state
        // example: cat.setState(new SomeState());
        // or for a 1.5 second delay: cat.setState(new SomeState(), 1.5);
    }

    @Override
    public void play(Cat cat) {
        cat.setStatusText("This has not been implemented yet.");
    }
}
