package com.jeremy.redtree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity
{

    private EditText username;
    private EditText password;

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(LoginActivity.this, MainPageActivity.class);
                startActivity(intent);

//                String usernameInput = username.getText().toString();
//                String passwordInput = password.getText().toString();
//
//                String name = "jeremy";
//                String pass = "www";
//
//                if (usernameInput.equals(""))
//                {
//                    Toast toast = Toast.makeText(LoginActivity.this, "请输入用户名", Toast.LENGTH_SHORT);
//                    toast.setGravity(Gravity.CENTER, 0, 0);
//                    toast.show();
//                }
//                else if (passwordInput.equals(""))
//                {
//                    Toast toast = Toast.makeText(LoginActivity.this, "请输入密码", Toast.LENGTH_SHORT);
//                    toast.setGravity(Gravity.CENTER, 0, 0);
//                    toast.show();
//                }
//                else if (!usernameInput.equals(name) || !passwordInput.equals(pass))
//                {
//
//                    Toast toast = Toast.makeText(LoginActivity.this, "用户名或密码错误", Toast.LENGTH_SHORT);
//                    toast.setGravity(Gravity.CENTER, 0, 0);
//                    toast.show();
//                }
//                else if (usernameInput.equals(name) && passwordInput.equals(pass))
//                {
//                    Intent intent = new Intent(LoginActivity.this, MainPageActivity.class);
//                    startActivity(intent);
//                }
            }
        });

    }

}
