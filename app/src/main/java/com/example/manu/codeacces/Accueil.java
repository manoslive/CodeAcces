package com.example.manu.codeacces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
    }

    public void onKeyPress(View view)
    {
        TextView passwordText = (TextView) findViewById(R.id.TB_Password);
        if(passwordText.length() <= 10) {
            switch (view.getId()) {
                case R.id.BTN_1:
                    passwordText.setText(passwordText.getText() + "1");
                    break;
                case R.id.BTN_2:
                    passwordText.setText(passwordText.getText() + "2");
                    break;
                case R.id.BTN_3:
                    passwordText.setText(passwordText.getText() + "3");
                    break;
                case R.id.BTN_4:
                    passwordText.setText(passwordText.getText() + "4");
                    break;
                case R.id.BTN_5:
                    passwordText.setText(passwordText.getText() + "5");
                    break;
                case R.id.BTN_6:
                    passwordText.setText(passwordText.getText() + "6");
                    break;
                case R.id.BTN_7:
                    passwordText.setText(passwordText.getText() + "7");
                    break;
                case R.id.BTN_8:
                    passwordText.setText(passwordText.getText() + "8");
                    break;
                case R.id.BTN_9:
                    passwordText.setText(passwordText.getText() + "9");
                    break;
                case R.id.BTN_0:
                    passwordText.setText(passwordText.getText() + "0");
                    break;
            }
        }
        else
            Toast.makeText(getApplicationContext(), "ERREUR: Votre mot de passe ne peut pas dépasser 10 chiffres!", Toast.LENGTH_LONG).show();
    }

    public void effacerPassword(View v)
    {
        TextView passwordText = (TextView) findViewById(R.id.TB_Password);
        passwordText.setText("");
    }

    public void effacerUsername(View v)
    {
        TextView usernameText = (TextView) findViewById(R.id.TB_Username);
        usernameText.setText("");
    }

    public void verifierInfo(View v)
    {
        Intent intent = new Intent(this, Affichage.class);

        EditText usernameText = (EditText)findViewById(R.id.TB_Username);
        String username = usernameText.getText().toString();

        TextView passwordText = (TextView)findViewById(R.id.TB_Password);
        String password = passwordText.getText().toString();

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
