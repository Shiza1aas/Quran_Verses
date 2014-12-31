package com.shiza.islamic_question;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import  android.view.View.OnClickListener;
import  android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button getAnswer = (Button)findViewById(R.id.getAnswerButton);
        getAnswer.setOnClickListener(getAnswerListener);

    }
//    private int surah_input;

    private int getInt(EditText editText) throws NumberFormatException {
        return Integer.valueOf(editText.getText().toString());
    }

    private OnClickListener getAnswerListener = new OnClickListener()
    {
        public void onClick( View v)
        {
            String text="";
            EditText num = (EditText) findViewById(R.id.surah) ;
            int val = Integer.parseInt( num.getText().toString() );

//            surah_input = findViewById(R.id.surah);
//            int surah = getInt(findViewById(R.id.surah));
//            Random surahGen = new Random();
//            int surah = surahGen.nextInt(114);
//            surah++;

            switch(val)
            {
                case 1: text=getString(R.string.string1);break;
                case 2: text=getString(R.string.string2);break;
                case 3: text=getString(R.string.string3);break;
                case 4: text=getString(R.string.string4);break;
                case 5: text=getString(R.string.string5);break;
                case 6: text=getString(R.string.string6);break;
                case 7: text=getString(R.string.string7);break;
                case 8: text=getString(R.string.string8);break;
                case 9: text=getString(R.string.string9);break;
                case 10: text=getString(R.string.string10);break;
                case 11: text=getString(R.string.string11);break;
                case 12: text=getString(R.string.string12);break;
                case 13: text=getString(R.string.string13);break;
                case 14: text=getString(R.string.string14);break;
                case 15: text=getString(R.string.string15);break;
                case 16: text=getString(R.string.string16);break;
                case 17: text=getString(R.string.string17);break;
                case 18: text=getString(R.string.string18);break;
                case 19: text=getString(R.string.string19);break;
                case 20: text=getString(R.string.string20);break;
                case 21: text=getString(R.string.string21);break;
                case 22: text=getString(R.string.string22);break;
                case 23: text=getString(R.string.string23);break;
                case 24: text=getString(R.string.string24);break;
                case 25: text=getString(R.string.string25);break;
                case 26: text=getString(R.string.string26);break;
                case 27: text=getString(R.string.string27);break;
                case 28: text=getString(R.string.string28);break;
                case 29: text=getString(R.string.string29);break;
                case 30: text=getString(R.string.string30);break;
                case 31: text=getString(R.string.string31);break;
                case 32: text=getString(R.string.string32);break;
                case 33: text=getString(R.string.string33);break;
                case 34: text=getString(R.string.string34);break;
                case 35: text=getString(R.string.string35);break;
                case 36: text=getString(R.string.string36);break;
                case 37: text=getString(R.string.string37);break;
                case 38: text=getString(R.string.string38);break;
                case 39: text=getString(R.string.string39);break;
                case 40: text=getString(R.string.string40);break;
                case 41: text=getString(R.string.string41);break;
                case 42: text=getString(R.string.string42);break;
                case 43: text=getString(R.string.string43);break;
                case 44: text=getString(R.string.string44);break;
                case 45: text=getString(R.string.string45);break;
                case 46: text=getString(R.string.string46);break;
                case 47: text=getString(R.string.string47);break;
                case 48: text=getString(R.string.string48);break;
                case 49: text=getString(R.string.string49);break;
                case 50: text=getString(R.string.string50);break;
                case 51: text=getString(R.string.string51);break;
                case 52: text=getString(R.string.string52);break;
                case 53: text=getString(R.string.string53);break;
                case 54: text=getString(R.string.string54);break;
                case 55: text=getString(R.string.string55);break;
                case 56: text=getString(R.string.string56);break;
                case 57: text=getString(R.string.string57);break;
                case 58: text=getString(R.string.string58);break;
                case 59: text=getString(R.string.string59);break;
                case 60: text=getString(R.string.string60);break;
                case 61: text=getString(R.string.string61);break;
                case 62: text=getString(R.string.string62);break;
                case 63: text=getString(R.string.string63);break;
                case 64: text=getString(R.string.string64);break;
                case 65: text=getString(R.string.string65);break;
                case 66: text=getString(R.string.string66);break;
                case 67: text=getString(R.string.string67);break;
                case 68: text=getString(R.string.string68);break;
                case 69: text=getString(R.string.string69);break;
                case 70: text=getString(R.string.string70);break;
                case 71: text=getString(R.string.string71);break;
                case 72: text=getString(R.string.string72);break;
                case 73: text=getString(R.string.string73);break;
                case 74: text=getString(R.string.string74);break;
                case 75: text=getString(R.string.string75);break;
                case 76: text=getString(R.string.string76);break;
                case 77: text=getString(R.string.string77);break;
                case 78: text=getString(R.string.string78);break;
                case 79: text=getString(R.string.string79);break;
                case 80: text=getString(R.string.string80);break;
                case 81: text=getString(R.string.string81);break;
                case 82: text=getString(R.string.string82);break;
                case 83: text=getString(R.string.string83);break;
                case 84: text=getString(R.string.string84);break;
                case 85: text=getString(R.string.string85);break;
                case 86: text=getString(R.string.string86);break;
                case 87: text=getString(R.string.string87);break;
                case 88: text=getString(R.string.string88);break;
                case 89: text=getString(R.string.string89);break;
                case 90: text=getString(R.string.string90);break;
                case 91: text=getString(R.string.string91);break;
                case 92: text=getString(R.string.string92);break;
                case 93: text=getString(R.string.string93);break;
                case 94: text=getString(R.string.string94);break;
                case 95: text=getString(R.string.string95);break;
                case 96: text=getString(R.string.string96);break;
                case 97: text=getString(R.string.string97);break;
                case 98: text=getString(R.string.string98);break;
                case 99: text=getString(R.string.string99);break;
                case 100: text=getString(R.string.string100);break;
                case 101: text=getString(R.string.string101);break;
                case 102: text=getString(R.string.string102);break;
                case 103: text=getString(R.string.string103);break;
                case 104: text=getString(R.string.string104);break;
                case 105: text=getString(R.string.string105);break;
                case 106: text=getString(R.string.string106);break;
                case 107: text=getString(R.string.string107);break;
                case 108: text=getString(R.string.string108);break;
                case 109: text=getString(R.string.string109);break;
                case 110: text=getString(R.string.string110);break;
                case 111: text=getString(R.string.string111);break;
                case 112: text=getString(R.string.string112);break;
                case 113: text=getString(R.string.string113);break;
                case 114: text=getString(R.string.string114);break;
                default: text="Sorry, Incorrect Input";break;
            }
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context,text,duration);
            toast.show();
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
