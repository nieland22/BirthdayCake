package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView mainCakeView = (CakeView) findViewById(R.id.cakeview);
        CakeController mainCakeController = new CakeController(mainCakeView);
        Button myBlowOutButton = (Button) findViewById(R.id.button2);
        myBlowOutButton.setOnClickListener(mainCakeController);
        Switch myCandleSwitch = (Switch) findViewById(R.id.candleSwitch);
        myCandleSwitch.setOnCheckedChangeListener(mainCakeController);
        SeekBar mySeekBar = (SeekBar) findViewById(R.id.seekBar);
        mySeekBar.setOnSeekBarChangeListener(mainCakeController);

    }
    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }
}
