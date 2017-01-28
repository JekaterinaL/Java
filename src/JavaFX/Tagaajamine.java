package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */
public class Tagaajamine extends Application {
    public void start (Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene ringiScene = new Scene(pane, 500, 500);
        primaryStage.setScene(ringiScene);
        primaryStage.show();

        Circle ring = new Circle(50);
        pane.getChildren().add(ring);

        ring.setOnMouseEntered(event -> {
            ring.setCenterX(Math.random() * 500);
            ring.setCenterY(Math.random() * 500);
        });
    }
}
