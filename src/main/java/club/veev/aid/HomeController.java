package club.veev.aid;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Veev on 2017/11/3
 * Tel:         18365264930
 * QQ:          384506557
 * Email:       veev520@hotmail.com
 * Function:    MainController
 */
public class HomeController implements Initializable {

    @FXML
    private ImageView btnClose;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnClose.setOnMouseClicked(event -> {
            System.exit(0);
        });
    }
}
