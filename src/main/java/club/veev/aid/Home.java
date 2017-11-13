package club.veev.aid;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by Veev on 2017/11/10
 * Tel:         18365264930
 * QQ:          384506557
 * Email:       veev520@hotmail.com
 * Function:    Home
 */
public class Home extends Application {

    private double clickX, clickY, stageX, stageY;
    private double mWidth = 400, mHeight = 600;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("layout/home_scene.fxml"));
        stage.setTitle("Veev Aid");
        //设置窗口的图标.
        stage.getIcons().add(new Image(
                getClass().getClassLoader().getResourceAsStream("mipmap/ic_launcher.png")));
        stage.setScene(new Scene(root, mWidth, mHeight));
        stage.initStyle(StageStyle.UNDECORATED);//设定窗口无边框
        final ObservableList<String> stylesheets = root.getStylesheets();
        stylesheets.addAll(
                getClass().getClassLoader().getResource("css/home.css").toExternalForm());
        stage.show();

        stageX = stage.getX();
        stageY = stage.getY();
        root.setOnMouseDragged(event -> {
            //计算
            stage.setX(stageX + event.getScreenX() - clickX);
            stage.setY(stageY + event.getScreenY() - clickY);
        });

        root.setOnMousePressed(event -> {
            clickX = event.getScreenX();
            clickY = event.getScreenY();
            stageX = stage.getX();
            stageY = stage.getY();
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
