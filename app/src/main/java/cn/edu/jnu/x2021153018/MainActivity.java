package cn.edu.jnu.x2021153018;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       Button buttonCalculate = this.findViewById(R.id.button_calculate);
       EditText editTextScore = this.findViewById(R.id.edittext_frame_scores);
       TextView textViewScore = this.findViewById(R.id.textview_score);
       buttonCalculate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                String scores=editTextScore.getText().toString();
                String []arrayScore= scores.split(",");
                BowlingGame game = new BowlingGame();
                for(int i=0;i< arrayScore.length;i++){
                    game.roll(Integer.parseInt(arrayScore[i]));
                }
               textViewScore.setText("Total score is:"+game.score());
           }
       });
    }
}