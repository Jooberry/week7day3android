package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button rockButton;
    private Button paperButton;
    private Button scissorButton;
    private Button spockButton;
    private Button lizardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rockButton = (Button) findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorButton = (Button) findViewById(R.id.scissor_button);
        textView = (TextView) findViewById(R.id.text_box);
    }

    public void onRockButtonClicked(View button) {
        RockPaperScissors game1 = new RockPaperScissors();

        String response = game1.play("Rock");

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", response);
        startActivity(intent);
    }

    public void onScissorButtonClicked(View button) {
        RockPaperScissors game1 = new RockPaperScissors();

        String response = game1.play("Scissors");

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", response);
        startActivity(intent);
    }

    public void onPaperButtonClicked(View button) {
        RockPaperScissors game1 = new RockPaperScissors();

        String response = game1.play("Paper");

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", response);
        startActivity(intent);
    }

    public void onSpockButtonClicked(View button) {
        RockPaperScissors game1 = new RockPaperScissors();

        String response = game1.play("Spock");

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", response);
        startActivity(intent);
    }

    public void onLizardButtonClicked(View button) {
        RockPaperScissors game1 = new RockPaperScissors();

        String response = game1.play("Lizard");

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", response);
        startActivity(intent);
    }
}
