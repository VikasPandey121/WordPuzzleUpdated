package wordpuzzle.vikas.com.wordpuzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class firstWordGame extends AppCompatActivity {

    TextView txtvw1,txtvw2,txtvw3;
    Button e,n,t,u,i;
    ImageButton back;
   char E = '0',N = '0',T = '0',U ='0', I = '0';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_word_game);

        txtvw1 = findViewById(R.id.txtvw1);
        txtvw2 = findViewById(R.id.txtvw2);
        txtvw3 = findViewById(R.id.txtvw3);


        e = findViewById(R.id.e);
        n = findViewById(R.id.n);
        t = findViewById(R.id.t);
        u = findViewById(R.id.u);
        i = findViewById(R.id.i);


        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                E = 'e';

            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                N = 'n';
            }

        });


        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T = 't';
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                I = 'i';

            }
        });



    }

}
