package idv.liucheyu.gitcat;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pomreader2Application extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        launch(Pomreader2Application.class, MainView.class, new CustomSplash(),args);
    }

}
