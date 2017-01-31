package lancepogi.mobiledevelopmentproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DBHelper dbHelper = new DBHelper(this);

        if(AlarmReceiver.ringtone != null) {
            if(AlarmReceiver.ringtone.isPlaying() == true) {
                AlarmReceiver.ringtone.stop();
            }
        }
        if (dbHelper.isSemesterExisting() == true) {
            startActivity(new Intent(this, MainActivity.class));
        } else {
            startActivity(new Intent(this, NewSemesterActivity.class));
        }

        finish();

    }
}
