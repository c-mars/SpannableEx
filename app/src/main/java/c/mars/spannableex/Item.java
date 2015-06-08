package c.mars.spannableex;

import android.text.Spannable;
import android.text.SpannableString;

/**
 * Created by mars on 6/8/15.
 */
public class Item {
    public Item(String name, Integer val) {
        this.name = name;
        this.val = val;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    String name;
    Integer val;

    @Override
    public String toString() {
        return name;}//+"="+val.toString();
//    }

    public CharSequence toCharSequence() {
        String name = getName();
        SpannableString spannable = new SpannableString(name);
        int length = spannable.length();
        if (length > 0) {
            spannable.setSpan(
                    new ItemSpan(this),
                    0,
                    length,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            );
        }
        return spannable;
    }
}
