package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgCheckBox;

/* renamed from: X.1jW  reason: invalid class name */
public final class AnonymousClass1jW extends C90995fQ {
    public final /* synthetic */ AnonymousClass3HX A00;

    /* renamed from: A0T */
    public final IgCheckBox AFU(Context context) {
        C04220Ms.A0B(context, 0);
        IgCheckBox igCheckBox = new IgCheckBox(context);
        igCheckBox.setBackground(this.A00.A00.getDrawable(R.drawable.bridged_checkbox_selector));
        igCheckBox.setButtonDrawable((Drawable) null);
        igCheckBox.setGravity(17);
        igCheckBox.setClickable(false);
        igCheckBox.setFocusable(false);
        igCheckBox.setFocusableInTouchMode(false);
        return igCheckBox;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jW(AnonymousClass3HX r1, C127397h3 r2) {
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
        if (A0T2) {
            return null;
        }
        float f = 1.0f;
        if (A0T) {
            f = 0.3f;
        }
        compoundButton.setAlpha(f);
        Drawable background = compoundButton.getBackground();
        int i = 255;
        if (A0T) {
            i = 77;
        }
        background.setAlpha(i);
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0R(View view, AnonymousClass3HX r2, C127397h3 r3, Object obj, Object obj2) {
    }
}
