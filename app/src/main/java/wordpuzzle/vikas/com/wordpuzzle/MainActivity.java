package wordpuzzle.vikas.com.wordpuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton imgbtn;
Button instruction,facebook,twitter,blogspot;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgbtn = findViewById(R.id.imgbtn);
        instruction = findViewById(R.id.instruction);
        facebook = findViewById(R.id.facebook);
        twitter = findViewById(R.id.twitter);
        blogspot = findViewById(R.id.blogspot);

        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,firstWordGame.class);
                startActivity(intent1);
            }
        });


    }
}
