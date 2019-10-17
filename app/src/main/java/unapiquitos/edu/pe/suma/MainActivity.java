package unapiquitos.edu.pe.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et01, et02;
    TextView tv01;
    Button btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et01 = findViewById(R.id.et01);
        et02 = findViewById(R.id.et02);
        tv01 = findViewById(R.id.tv01);
        btn_calcular = findViewById(R.id.btn_calcular);
    }

    public void calcular( View view){

        int num1, num2;

        num1 = Integer.parseInt(et01.getText().toString());
        num2 = Integer.parseInt(et02.getText().toString());

        int suma = num1 + num2;

        tv01.setText("El Resultado:" +suma);
    }
}
