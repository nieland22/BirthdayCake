package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{

    private CakeView myCakeView;
    private CakeModel diffCakeModel;

    public CakeController(CakeView diffCakeView)
    {
          this.myCakeView=diffCakeView;
          this.diffCakeModel=diffCakeView.getMyCakeModel();
    }

    public void onClick(View v)
    {
        Log.d(null, "Blew Out");
        diffCakeModel.isLit = false;
        myCakeView.invalidate();
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    {
        if(diffCakeModel.hasCandles==true) {
            diffCakeModel.hasCandles = false;
        }
        else
        {
            diffCakeModel.hasCandles=true;
        }
        myCakeView.invalidate();

    }

    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
    {
        diffCakeModel.numCandles = progress;
        myCakeView.invalidate();
    }

    public void onStartTrackingTouch(SeekBar seekBar)
    {

    }

    public void onStopTrackingTouch(SeekBar seekBar)
    {

    }


}
