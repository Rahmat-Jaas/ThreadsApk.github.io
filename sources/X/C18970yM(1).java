package X;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.0yM  reason: invalid class name and case insensitive filesystem */
public final class C18970yM extends FrameLayout implements Checkable {
    public View A00 = findViewById(R.id.row_check_imageview);
    public TextView A01 = C18180wK.A0G(this, R.id.row_simple_text_textview);

    public void setChecked(boolean z) {
        int color;
        Context context = getContext();
        if (z) {
            color = context.getColor(R.color.igds_primary_button);
            this.A00.setVisibility(0);
        } else {
            color = context.getColor(R.color.igds_primary_text);
            this.A00.setVisibility(8);
        }
        TextView textView = this.A01;
        C63393hP.A05(textView.getCompoundDrawablesRelative()[0].mutate(), color);
        textView.setTextColor(color);
    }

    public final boolean isChecked() {
        return C18180wK.A1W(this.A00.getVisibility());
    }

    public C18970yM(Context context) {
        super(context);
        C18180wK.A0C(this).inflate(R.layout.row_check_item, this);
    }

    public final void toggle() {
        setChecked(!isChecked());
    }
}
