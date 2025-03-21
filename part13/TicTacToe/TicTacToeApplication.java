package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private String currentPlayer = "X"; // Track the current player
    private boolean gameEnded = false; // Track if the game has ended
    private Button[][] buttons = new Button[3][3]; // Store references to the buttons

    @Override
    public void start(Stage stage) {
        // Create the layout using BorderPane
        BorderPane layout = new BorderPane();

        // Create a Label for the top of the BorderPane
        Label turnLabel = new Label("Turn: " + currentPlayer);
        layout.setTop(turnLabel);

        // Create a GridPane for the center of the BorderPane
        GridPane grid = new GridPane();

        // Add 9 buttons to the GridPane (3x3 grid)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button button = new Button(" ");
                button.setPrefSize(100, 100); // Set button size

                // Store the button in the buttons array
                buttons[row][col] = button;

                // Add event handler to the button
                button.setOnAction(event -> {
                    if (!gameEnded && button.getText().equals(" ")) { // Check if the game is ongoing and the button is empty
                        button.setText(currentPlayer); // Set the current player's symbol
                        if (checkForWin()) { // Check if the current player has won
                            turnLabel.setText("The end!");
                            gameEnded = true; // End the game
                            disableButtons(); // Disable all buttons
                        } else if (checkForDraw()) { // Check if the game is a draw
                            turnLabel.setText("The end!");
                            gameEnded = true; // End the game
                            disableButtons(); // Disable all buttons
                        } else {
                            switchPlayer(turnLabel); // Switch turns and update the label
                        }
                    }
                });

                grid.add(button, col, row); // Add button to the grid at (col, row)
            }
        }

        // Add the GridPane to the center of the BorderPane
        layout.setCenter(grid);

        // Create the scene and set it in the stage
        Scene scene = new Scene(layout, 300, 300);
        stage.setScene(scene);
        stage.setTitle("Tic-Tac-Toe");
        stage.show();
    }

    // Helper method to switch turns and update the turn label
    private void switchPlayer(Label turnLabel) {
        if (currentPlayer.equals("X")) {
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }
        turnLabel.setText("Turn: " + currentPlayer); // Update the turn label
    }

    // Helper method to check for a win
    private boolean checkForWin() {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (!buttons[row][0].getText().equals(" ") &&
                buttons[row][0].getText().equals(buttons[row][1].getText()) &&
                buttons[row][0].getText().equals(buttons[row][2].getText())) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (!buttons[0][col].getText().equals(" ") &&
                buttons[0][col].getText().equals(buttons[1][col].getText()) &&
                buttons[0][col].getText().equals(buttons[2][col].getText())) {
                return true;
            }
        }

        // Check diagonals
        if (!buttons[0][0].getText().equals(" ") &&
            buttons[0][0].getText().equals(buttons[1][1].getText()) &&
            buttons[0][0].getText().equals(buttons[2][2].getText())) {
            return true;
        }

        if (!buttons[0][2].getText().equals(" ") &&
            buttons[0][2].getText().equals(buttons[1][1].getText()) &&
            buttons[0][2].getText().equals(buttons[2][0].getText())) {
            return true;
        }

        return false; // No win found
    }

    // Helper method to check for a draw
    private boolean checkForDraw() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (buttons[row][col].getText().equals(" ")) {
                    return false; // There is still an empty button
                }
            }
        }
        return true; // All buttons are filled
    }

    // Helper method to disable all buttons
    private void disableButtons() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col].setDisable(true); // Disable the button
            }
        }
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
