package club.veev.aid;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Veev on 2017/11/3
 * Tel:         18365264930
 * QQ:          384506557
 * Email:       veev520@hotmail.com
 * Function:    MainController
 */
public class MiniController implements Initializable {

    @FXML private StackPane rootView;
    @FXML private Label mText;
    private boolean is = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        mText.setOnMouseClicked(event -> {
//            float alpha = is ? 0.1f : 0.0f;
//            is = !is;
//            rootView.setBackground(new Background(new BackgroundFill(new Color(0, 0, 0, 0.1),null,null)));
////            rootView.setOpacity(alpha);
//        });

        rootView.setOnMouseEntered(event -> {
            rootView.setBackground(new Background(new BackgroundFill(new Color(0, 0, 0, 0.1),null,null)));
        });

        rootView.setOnMouseExited(event -> {
            rootView.setBackground(new Background(new BackgroundFill(new Color(0, 0, 0, 0),null,null)));
        });
    }
}
