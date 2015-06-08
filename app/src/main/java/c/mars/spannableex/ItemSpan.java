package c.mars.spannableex;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/**
 * Created by Constantine Mars on 6/9/15.
 */
public class ItemSpan extends ClickableSpan{

    private final Item item;

    public ItemSpan(Item item) {
        super();
        this.item = item;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        ds.setUnderlineText(true);
    }

    @Override
    public void onClick(View widget) {

    }
}
