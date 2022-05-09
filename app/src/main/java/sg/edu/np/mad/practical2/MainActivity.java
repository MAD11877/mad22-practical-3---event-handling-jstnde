package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        Button followBtn = findViewById(R.id.follow);
        Button msgBtn = findViewById(R.id.message);
        TextView title = findViewById(R.id.textView);
        Intent intent = getIntent();

        title.setText("MAD " + intent.getIntExtra("rand", -1));
        followBtn.setText(user.followed ? "Unfollow" : "Follow");

        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.ToggleFollow();
                Toast.makeText(getApplicationContext(), user.followed ? "Followed" : "Unfollowed", Toast.LENGTH_SHORT).show();
                followBtn.setText(user.followed ? "Unfollow" : "Follow");
            }
        });

        msgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(intent);
            }
        });
    }
}