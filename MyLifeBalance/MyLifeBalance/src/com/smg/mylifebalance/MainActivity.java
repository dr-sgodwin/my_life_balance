package com.smg.mylifebalance;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends Activity {
	TextView textOfLife;
	ImageView imageOfLife;
	ImageView imageScale;
	SeekBar seekBarOfLife;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textOfLife = (TextView)findViewById(R.id.textLife);
        imageOfLife = (ImageView)findViewById(R.id.imageLife);
        imageScale = (ImageView)findViewById(R.id.imageScale);
        seekBarOfLife = (SeekBar)findViewById(R.id.seekBar1);
        seekBarOfLife.setProgress(3);

        seekBarOfLife.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {        
        
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				// TODO Auto-generated method stub
				Resources res = getResources();
				String[] LifeQuotes = res.getStringArray(R.array.lifeQuote);
			
				switch (progress) {
				case 0:
					imageOfLife.setBackgroundResource(R.drawable.zero);
					imageScale.setBackgroundResource(R.drawable.scales0);
					textOfLife.setText(LifeQuotes[0]);
					break;
				case 1:
					imageOfLife.setBackgroundResource(R.drawable.one);
					imageScale.setBackgroundResource(R.drawable.scales1);
					textOfLife.setText(LifeQuotes[1]);
					break;
				case 2:
					imageOfLife.setBackgroundResource(R.drawable.two);
					imageScale.setBackgroundResource(R.drawable.scales2);
					textOfLife.setText(LifeQuotes[2]);
					break;
				case 3:
					imageOfLife.setBackgroundResource(R.drawable.three);
					imageScale.setBackgroundResource(R.drawable.scales3);
					textOfLife.setText(LifeQuotes[3]);
					break;
				case 4:
					imageOfLife.setBackgroundResource(R.drawable.four);
					imageScale.setBackgroundResource(R.drawable.scales4);
					textOfLife.setText(LifeQuotes[4]);
					break;
				case 5:
					imageOfLife.setBackgroundResource(R.drawable.five);
					imageScale.setBackgroundResource(R.drawable.scales5);
					textOfLife.setText(LifeQuotes[5]);
					break;
				case 6:
					imageOfLife.setBackgroundResource(R.drawable.six);					
					imageScale.setBackgroundResource(R.drawable.scales6);
					textOfLife.setText(LifeQuotes[6]);
					break;
				}
			}

			@Override
			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}
    });

    }
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
