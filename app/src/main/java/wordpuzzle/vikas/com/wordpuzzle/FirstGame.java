package wordpuzzle.vikas.com.wordpuzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FirstGame extends AppCompatActivity {

    ImageButton imgbtn;
    Button  E , N , T , U , I;
    TextView txtvww1,txtvw2,txtvw3;
    double j;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_game);
        final int i =0;
        imgbtn = findViewById(R.id.imgbtn);
        E = findViewById(R.id.e);
        N = findViewById(R.id.n);
        T = findViewById(R.id.t);
        U = findViewById(R.id.u);
        I = findViewById(R.id.i);
        txtvww1 = findViewById(R.id.txtvw1);
        txtvw2 = findViewById(R.id.txtvw2);
        txtvw3 = findViewById(R.id.txtvw3);


        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j==0)
                {
                    txtvww1.setText("E");
                    j++;
                }
                else if (j==1)
                {
                    txtvw2.setText("E");
                    j++;
                }
                else if (j==2)
                {
                    txtvw3.setText("E");
                    j++;
                }
            }
        });

        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j==0)
                {
                    txtvww1.setText("N");
                    j++;
                }
                else if (j==1)
                {
                    txtvw2.setText("N");
                    j++;
                }
                else if (j==2)
                {
                    txtvw3.setText("N");
                    j++;
                }
            }
        });

        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j==0)
                {
                    txtvww1.setText("T");
                    j++;
                }
                else if (j==1)
                {
                    txtvw2.setText("T");
                    j++;
                }
                else if (j==2)
                {
                    txtvw3.setText("T");
                    j++;
                }
            }
        });
        U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j==0)
                {
                    txtvww1.setText("U");
                    j++;
                }
                else if (j==1)
                {
                    txtvw2.setText("U");
                j++;
                }
                else if (j==2)
                {
                    txtvw3.setText("U");
                    j++;
                }
            }
        });
        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j==0)
                {
                    txtvww1.setText("I");
                    j++;
                }
                else if (j==1)
                {
                    txtvw2.setText("I");
                    j++;
                }
                else if (j==2)
                {
                    txtvw3.setText("I");
                    j++;
                }
            }
        });




    }
}
