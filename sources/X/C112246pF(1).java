package X;

import android.content.Context;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: X.6pF  reason: invalid class name and case insensitive filesystem */
public final class C112246pF {
    public int A00 = -1;
    public final TextView A01;

    public C112246pF(TextView textView) {
        C04220Ms.A0B(textView, 1);
        this.A01 = textView;
    }

    public final void A00(float f) {
        int round = Math.round(f / 100.0f);
        if (round != this.A00) {
            this.A00 = round;
            TextView textView = this.A01;
            Context context = textView.getContext();
            String format = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) round) / 10.0f)}, 1));
            C04220Ms.A06(format);
            textView.setText(AnonymousClass0wJ.A0l(context, format, 2131823504));
        }
    }
}
