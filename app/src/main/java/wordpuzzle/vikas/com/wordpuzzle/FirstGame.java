package wordpuzzle.vikas.com.wordpuzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FirstGame extends AppCompatActivity {

    ImageButton imgbtn;
    Button  E , N , T , U , I;
    TextView txtvww1,txtvw2,txtvw3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_game);
        int i =0;
        imgbtn = findViewById(R.id.imgbtn);
        E = findViewById(R.id.e);
        N = findViewById(R.id.n);
        T = findViewById(R.id.t);
        U = findViewById(R.id.u);
        I = findViewById(R.id.i);
        txtvww1 = findViewById(R.id.txtvw1);
        txtvw2 = findViewById(R.id.txtvw2);
        txtvw3 = findViewById(R.id.txtvw3);






    }
}
