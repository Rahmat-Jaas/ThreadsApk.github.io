package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.1lq  reason: invalid class name and case insensitive filesystem */
public final class C25121lq extends IgLinearLayout {
    public C25121lq(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Integer num, int i) {
        super(context);
        Drawable drawable;
        int i2;
        LayoutInflater.from(context).inflate(R.layout.checklist_status_row_with_text, this, true);
        TextView A0G = C18180wK.A0G(this, R.id.primary_text);
        if (A0G != null) {
            C18220wO.A17(A0G, charSequence2, 0, 8);
        }
        TextView A0G2 = C18180wK.A0G(this, R.id.secondary_text);
        if (A0G2 != null) {
            C18220wO.A17(A0G2, charSequence3, 0, 8);
        }
        TextView A0G3 = C18180wK.A0G(this, R.id.circle_text_icon);
        if (A0G3 != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                drawable = context.getDrawable(R.drawable.circle_in_tertiary_icon_color_filled_24);
                A0G3.setText(charSequence);
                i2 = R.color.igds_primary_text;
                C18180wK.A0s(context, A0G3, i2);
            } else if (intValue != 1) {
                drawable = context.getDrawable(R.drawable.circle_check_in_primary_button_color_filled_24);
            } else {
                drawable = context.getDrawable(R.drawable.circle_in_primary_button_color_filled_24);
                A0G3.setText(charSequence);
                i2 = R.color.igds_icon_on_color;
                C18180wK.A0s(context, A0G3, i2);
            }
            A0G3.setBackgroundDrawable(drawable);
            A0G3.setVisibility(0);
        }
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        if (progressBar == null) {
            return;
        }
        if (i == -1) {
            progressBar.setVisibility(8);
            return;
        }
        progressBar.setProgress(i);
        progressBar.setVisibility(0);
    }
}
