package ru.skblab.firsttaskapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class ViewActivity extends AppCompatActivity {
    public static String TEXT = "TEXT";

    private TextView textView;
    private Button btn;

    private View.OnClickListener onClickViewListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        textView = findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        textView.setText(Objects.requireNonNull(bundle.get(TEXT)).toString());

        btn = findViewById(R.id.btn_2);
        btn.setOnClickListener(onClickViewListener);
    }
}
