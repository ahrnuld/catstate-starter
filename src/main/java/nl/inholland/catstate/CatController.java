package nl.inholland.catstate;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import nl.inholland.catstate.cat.Cat;

import java.net.URL;
import java.util.ResourceBundle;

public class CatController implements Initializable {

    private Cat cat;

    @FXML
    private Label statusText;

    @FXML
    ImageView catImageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image catSprites = new Image(
                getClass().getResource("FreeCats.png").toExternalForm()
        );
        catImageView.setImage(catSprites);
        cat = new Cat(catImageView, statusText);
    }

    @FXML
    protected void onFeedButtonClick() {
        cat.feed();
    }

    @FXML
    protected void onPetButtonClick() {
        cat.pet();
    }

    @FXML
    protected void onPlayButtonClick() {
        cat.play();
    }
}