package yukihira1992.flavoredapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private void setUpView() {
        TextView textView = findViewById(R.id.text_view);
        textView.setText("Environment is " + BuildConfig.FLAVOR_env + ".");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpView();
    }
}
