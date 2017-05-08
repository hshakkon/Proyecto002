package hendershakkon.proyecto002;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);
    }

    // este método se ejecutará cuando se presione el botón sumar
    public void sumar(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        int suma=nro1+nro2;
        String resu=String.valueOf(suma);
        tv1.setText(resu);
    }

    // este método se ejecutará cuando se presione el botón borrar
    public void borrar(View view2) {
        et1.setText("");
        et2.setText("");
        tv1.setText("");
        et1.requestFocus();
    }

}
