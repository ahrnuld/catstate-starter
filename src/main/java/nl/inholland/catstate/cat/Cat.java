package nl.inholland.catstate.cat;

import javafx.animation.Animation;
import javafx.animation.PauseTransition;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import nl.inholland.catstate.graphics.SpriteFactory;

public class Cat {
    private CatState state;
    private final ImageView view;
    private Animation currentAnim;
    private Label statusLabel;

    public Cat(ImageView view, Label statusLabel) {
        this.view = view;
        this.statusLabel = statusLabel;
        setState(new ExampleState()); // TODO: replace this with the sleeping state
    }

    public void setState(CatState newState) {
        this.state = newState;
        state.enter(this);
    }

    public void setState(CatState newState, double delay) {
        PauseTransition pause = new PauseTransition(Duration.seconds(delay));
        pause.setOnFinished(e ->  this.setState(newState));
        pause.play();
    }

    public void playAnimation(String type) {
        if (currentAnim != null) {
            currentAnim.stop();
        }
        currentAnim = SpriteFactory.createAnimation(view, type);
        currentAnim.setCycleCount(Animation.INDEFINITE);
        currentAnim.play();
    }

    public void setStatusText(String text) {
        statusLabel.setText(text);
    }

    public void feed() { state.feed(this); }
    public void pet() { state.pet(this); }
    public void play() { state.play(this); }

    public ImageView getView() {
        return view;
    }
}

