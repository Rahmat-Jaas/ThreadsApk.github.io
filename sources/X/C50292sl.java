package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.2sl  reason: invalid class name and case insensitive filesystem */
public final class C50292sl {
    public static void A00(AnonymousClass3TL r5, AnonymousClass12T r6) {
        TextView textView = r6.A00;
        CharSequence charSequence = r5.A08;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setText(r5.A07);
        }
        int i = r5.A03;
        if (i != 0) {
            textView.setTextAppearance(textView.getContext(), i);
        }
        textView.setGravity(r5.A01);
        C57853Cs r0 = r5.A06;
        if (r0 != null) {
            textView.setPadding(r0.A02, r0.A05, r0.A03, r0.A00);
            C09860go.A0S(textView, r5.A06.A04);
            C09860go.A0U(textView, r5.A06.A01);
        }
        textView.setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, r5.A00);
        textView.setBackground(r5.A04);
        textView.setTextAlignment(r5.A02);
        View.OnClickListener onClickListener = r5.A05;
        if (onClickListener != null) {
            textView.setOnClickListener(onClickListener);
            return;
        }
        textView.setClickable(false);
        textView.setLongClickable(false);
    }
}
