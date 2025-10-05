package nl.inholland.catstate.graphics;

import javafx.animation.Animation;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class SpriteFactory {
    private static final int FRAME_WIDTH = 64;
    private static final int FRAME_HEIGHT = 64;
    private static final int COLUMNS = 4;
    private static final int COUNT = 4;

    public static Animation createAnimation(ImageView view, String type) {
        switch (type.toLowerCase()) {
            case "hungry":
                return makeAnimation(view, 0, 4);
            case "content":
                return makeAnimation(view, 1, 2);
            case "sleeping":
                return makeAnimation(view, 2, 4);
            default:
                throw new IllegalArgumentException("Unknown animation type: " + type);
        }
    }

    private static Animation makeAnimation(ImageView view, int row, int frameCount) {
        return new SpriteAnimation(
                view,
                Duration.millis(1000),
                COUNT,
                COLUMNS,
                0, row * FRAME_HEIGHT,
                FRAME_WIDTH, FRAME_HEIGHT
        );
    }
}