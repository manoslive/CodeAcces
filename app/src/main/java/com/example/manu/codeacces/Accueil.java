package com.example.manu.codeacces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Accueil extends AppCompatActivity {

    String password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        final TextView textView = (TextView) findViewById(R.id.TB_Password);
        final EditText editText = (EditText) findViewById(R.id.TB_Username);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (editText.length() == 0)
                    findViewById(R.id.BTN_Valider).setEnabled(false);
                else
                {
                    if(textView.length() == 4)
                        findViewById(R.id.BTN_Valider).setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        textView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(textView.length() != 4)
                    findViewById(R.id.BTN_Valider).setEnabled(false);
                else
                    if(editText.length() > 0)
                        findViewById(R.id.BTN_Valider).setEnabled(true);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void onKeyPress(View view) {
        TextView passwordText = (TextView) findViewById(R.id.TB_Password);
        TextView usernameText = (TextView) findViewById(R.id.TB_Username);
        /*if (passwordText.length() == 4 && usernameText.length() < 0) {
            Button bouton = (Button) findViewById(R.id.BTN_Valider);
            bouton.setEnabled(true);
        } else */if (passwordText.length() <= 3) {
            switch (view.getId()) {
                case R.id.BTN_1:
                    password += "1";
                    break;
                case R.id.BTN_2:
                    password += "2";
                    break;
                case R.id.BTN_3:
                    password += "3";
                    break;
                case R.id.BTN_4:
                    password += "4";
                    break;
                case R.id.BTN_5:
                    password += "5";
                    break;
                case R.id.BTN_6:
                    password += "6";
                    break;
                case R.id.BTN_7:
                    password += "7";
                    break;
                case R.id.BTN_8:
                    password += "8";
                    break;
                case R.id.BTN_9:
                    password += "9";
                    break;
                case R.id.BTN_0:
                    password += "0";
                    break;
            }
            passwordText.setText(passwordText.getText() + "*");
        } else
            Toast.makeText(getApplicationContext(), "ERREUR: Votre mot de passe ne peut pas dépasser 4 chiffres!", Toast.LENGTH_LONG).show();
    }

    public void effacerPassword(View v) {
        TextView passwordText = (TextView) findViewById(R.id.TB_Password);
        passwordText.setText("");
        password = "";
/*        Button bouton = (Button) findViewById(R.id.BTN_Valider);
        bouton.setEnabled(false);*/
    }

    public void effacerUsername(View v) {
        TextView usernameText = (TextView) findViewById(R.id.TB_Username);
        usernameText.setText("");
    }

    public void verifierInfo(View v) {
        Intent intent = new Intent(this, Affichage.class);

        EditText usernameText = (EditText) findViewById(R.id.TB_Username);
        String username = usernameText.getText().toString();

        intent.putExtra("username", username);
        intent.putExtra("password", password);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_accueil, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
