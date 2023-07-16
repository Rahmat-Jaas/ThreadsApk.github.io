package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgRadioButton;

/* renamed from: X.1jX  reason: invalid class name */
public final class AnonymousClass1jX extends C90995fQ {
    public final /* synthetic */ AnonymousClass3HX A00;

    public static IgRadioButton A00(Context context, AnonymousClass1jX r5) {
        C04220Ms.A0B(context, 0);
        IgRadioButton igRadioButton = new IgRadioButton(context);
        igRadioButton.setBackground(r5.A00.A00.getDrawable(R.drawable.radio_button_state_selector));
        igRadioButton.setButtonDrawable((Drawable) null);
        igRadioButton.setClickable(false);
        igRadioButton.setFocusable(false);
        igRadioButton.setFocusableInTouchMode(false);
        return igRadioButton;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jX(AnonymousClass3HX r1, C127397h3 r2) {
        super(r1, r2);
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object A0P(View view, AnonymousClass3HX r5, C127397h3 r6, Object obj) {
        CompoundButton compoundButton = (CompoundButton) view;
        AnonymousClass0wJ.A1M(compoundButton, 0, r6);
        boolean A0T = r6.A0T(36, false);
        boolean A0T2 = r6.A0T(35, false);
        compoundButton.setEnabled(!A0T);
        compoundButton.setChecked(A0T2);
        Drawable background = compoundButton.getBackground();
        int i = 255;
        if (A0T) {
            i = 77;
        }
        background.setAlpha(i);
        return null;
    }

    public final /* bridge */ /* synthetic */ View A0O(Context context) {
        return A00(context, this);
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        return A00(context, this);
    }

    public final /* bridge */ /* synthetic */ void A0R(View view, AnonymousClass3HX r2, C127397h3 r3, Object obj, Object obj2) {
    }
}
