package c.mars.spannableex;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends ActionBarActivity {

    private static final String[] ACVALUES={"a", "b", "c", "adapter", "banana", "room"};

    @InjectView(R.id.e)
    MultiAutoCompleteTextView e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);

        ArrayAdapter<String> a=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, ACVALUES);
        e.setAdapter(a);
        e.setTokenizer(new MultiAutoCompleteTextView.Tokenizer() {
            @Override
            public int findTokenStart(CharSequence charSequence, int i) {
                int f=charSequence.toString().lastIndexOf(' ');
                return (f!=-1?f:i);
            }

            @Override
            public int findTokenEnd(CharSequence charSequence, int i) {
                return i;
            }

            @Override
            public CharSequence terminateToken(CharSequence charSequence) {
                return charSequence + " ";
            }
        });
    }

}
