package eecs1022.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab3Activity extends AppCompatActivity {

    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        game = new Game();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
    }

    public void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    private String getInputOfTextField(int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    private String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    public void computeRound1Clicked(View view) {
        String name1 = getInputOfTextField(R.id.editName1);
        String name2 = getInputOfTextField(R.id.editName2);
        String player1Choice = getItemSelected(R.id.spinnerP1R1Choice);
        String player2Choice = getItemSelected(R.id.spinnerP2R1Choice);

        game.setIdentity(name1, name2);
        if(game.roundNumber==0) {
            game.finishRound(player1Choice, player2Choice);

            setContentsOfTextView(R.id.textResult, game.toString());
        }

    }

    public void computeRound2Clicked(View view) {

        String player1Choice = getItemSelected(R.id.spinnerP1R2Choice);
        String player2Choice = getItemSelected(R.id.spinnerP2R2Choice);
        if(game.roundNumber==1) {
            game.finishRound(player1Choice, player2Choice);

            setContentsOfTextView(R.id.textResult, game.toString());
        }
    }

    public void computeRound3Clicked(View view) {
        String player1Choice = getItemSelected(R.id.spinnerP1R3Choice);
        String player2Choice = getItemSelected(R.id.spinnerP2R3Choice);
        if (game.roundNumber == 2){
            game.finishRound(player1Choice, player2Choice);

        setContentsOfTextView(R.id.textResult, game.toString());
        }

    }

    public void startNewGameClicked(View view) {
        game = new Game();

        setContentsOfTextView(R.id.textResult, "New game has started.Enter names of players");
    }
}