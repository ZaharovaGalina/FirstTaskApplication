package ru.skblab.firsttaskapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LaunchActivity extends AppCompatActivity {
    private EditText mInputText;
    private Button mButton;

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent openViewIntent =
                    new Intent(LaunchActivity.this, ViewActivity.class);
            openViewIntent.putExtra(ViewActivity.TEXT, mInputText.getText().toString());
            startActivity(openViewIntent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        mInputText = findViewById(R.id.inputText);
        mButton = findViewById(R.id.btn_1);
        mButton.setOnClickListener(onClickListener);
    }

}
