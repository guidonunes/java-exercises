package title;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;


public class UserTitle extends Application {

    @Override
    public void start(Stage window) {
        Parameters params = getParameters();
        String title = params.getRaw().get(0);

        window.setTitle(title);
        window.show();
    }

}
