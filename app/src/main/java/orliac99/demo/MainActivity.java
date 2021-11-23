package orliac99.demo;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import orliac99.demo.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputonFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.display).equals(diplay.getText().toSting()))
                    display.setText("");
            }
        })

    }

    private void updateText(String strToAdd) {
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if (getString(R.string.display).equals(display.getText().toString())) {
            display.setText(strToAdd);
            display.setSelection(cursorPos + 1);
        }
        else {
            display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
            display.setSelection(cursorPos + 1);
        }
    }

    public void zeroBTN(View view) {
        updateText(strToAdd:"0");
    }
    public void unBTN(View view) {
        updateText(strToAdd:"1");
    }
    public void deuxBTN(View view) {
        updateText(strToAdd:"2");
    }
    public void troisBTN(View view) {
        updateText(strToAdd:"3");
    }
    public void quatreBTN(View view) {
        updateText(strToAdd:"4");
    }
    public void cinqBTN(View view) {
        updateText(strToAdd:"5");
    }
    public void sixBTN(View view) {
        updateText(strToAdd:"6");
    }
    public void septBTN(View view) {
        updateText(strToAdd:"7");
    }
    public void huitBTN(View view) {
        updateText(strToAdd:"8");
    }
    public void neufBTN(View view) {
        updateText(strToAdd:"9");
    }
    public void additionBTN(View view) {
        updateText(strToAdd:"+");
    }
    public void soustractionBTN(View view) {
        updateText(strToAdd:"-");
    }
    public void multiplicationBTN(View view) {
        updateText(strToAdd:"*");
    }
    public void divisionBTN(View view) {
        updateText(strToAdd:"/");
    }
    public void virguleBTN(View view) {
        updateText(strToAdd:".");
    }
    public void pourcentageBTN(View view) {
        updateText(strToAdd:"%");
    }
    public void plusmoinsBTN(View view) {
        updateText(strToAdd:"-");
    }
    public void effacerBTN(View view) {
        display.setText("");
    }
    public void egaleBTN(View view) {
        String userExp = display.getText().toString();

        String result = String.valueOf(exp.calculate());

        display.setText(result);
        display.setSelection(result.length());
    }

}