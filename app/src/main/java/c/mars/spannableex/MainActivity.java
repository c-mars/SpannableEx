package c.mars.spannableex;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends ActionBarActivity {

    private Character[] s;

    @InjectView(R.id.e)
    MultiAutoCompleteTextView e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);

        s=new Character[26];
        char c='a';
        for (int i=0;i<26;i++) {
            s[i]=c++;
        }
        ArrayAdapter<Character> a=new ArrayAdapter<Character>(this, android.R.layout.simple_dropdown_item_1line, s);
        e.setAdapter(a);
        e.setThreshold(1);
        e.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

}
