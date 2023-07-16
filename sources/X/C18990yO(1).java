package X;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.0yO  reason: invalid class name and case insensitive filesystem */
public final class C18990yO extends FrameLayout implements Checkable {
    public View A00 = findViewById(R.id.row_check_whatsapp_color_imageview);
    public TextView A01 = C18180wK.A0G(this, R.id.row_secondary_text_textview);
    public TextView A02 = C18180wK.A0G(this, R.id.row_primary_text_textview);

    public void setChecked(boolean z) {
        int color;
        Context context = getContext();
        if (z) {
            color = context.getColor(R.color.igds_whatsapp_green);
            View view = this.A00;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            color = context.getColor(R.color.igds_primary_text);
            C18210wN.A0z(this.A00);
        }
        TextView textView = this.A02;
        if (textView != null) {
            C63393hP.A05(textView.getCompoundDrawablesRelative()[0].mutate(), color);
            textView.setTextColor(color);
        }
        TextView textView2 = this.A01;
        if (textView2 != null) {
            textView2.setTextColor(color);
        }
    }

    public final boolean isChecked() {
        View view = this.A00;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public C18990yO(Context context) {
        super(context);
        C18180wK.A0C(this).inflate(R.layout.row_check_secondary_text_whatsapp_color_item, this);
    }

    public final void toggle() {
        setChecked(!isChecked());
    }
}
