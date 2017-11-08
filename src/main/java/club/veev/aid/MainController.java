package club.veev.aid;

import com.jfoenix.controls.JFXToolbar;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Veev on 2017/11/3
 * Tel:         18365264930
 * QQ:          384506557
 * Email:       veev520@hotmail.com
 * Function:    MainController
 */
public class MainController implements Initializable {

    @FXML private JFXToolbar mainToolbar;
    @FXML private StackPane minBurger;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        minBurger.setOnMouseClicked(event -> {
            System.exit(0);
        });
    }
}
