package club.veev.aid;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Veev on 2017/11/13
 */
public class MiniStage extends Application {

    private double clickX, clickY, stageX, stageY;
    private double mWidth = 400, mHeight = 100;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("layout/stage_mini.fxml"));
        Scene scene = new Scene(root, mWidth, mHeight);
        scene.setFill(null);
        stage.setTitle("Veev Aid");
        //设置窗口的图标.
        stage.getIcons().add(new Image(
                getClass().getClassLoader().getResourceAsStream("mipmap/icon_aids.png")));
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);//设定窗口无边框
        final ObservableList<String> stylesheets = root.getStylesheets();
        stylesheets.addAll(
                getClass().getClassLoader().getResource("css/mini_stage.css").toExternalForm());
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setAlwaysOnTop(true);
        stage.show();

        stageX = stage.getX();
        stageY = stage.getY();
        scene.setOnMouseDragged(event -> {
            //计算
            stage.setX(stageX + event.getScreenX() - clickX);
            stage.setY(stageY + event.getScreenY() - clickY);
        });

        scene.setOnMousePressed(event -> {
            clickX = event.getScreenX();
            clickY = event.getScreenY();
            stageX = stage.getX();
            stageY = stage.getY();
        });

        //添加系统托盘图标.
        SystemTray tray = SystemTray.getSystemTray();
        BufferedImage image = ImageIO.read(getClass().getClassLoader().getResource("mipmap/icon_aids.png"));
        TrayIcon trayIcon = new TrayIcon(image, "自动备份工具");
        trayIcon.setToolTip("自动备份工具");
        tray.add(trayIcon);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
