package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.7hU  reason: invalid class name and case insensitive filesystem */
public final class C127647hU implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        Object obj4 = obj3;
        RCTextView rCTextView = (RCTextView) obj;
        if (obj3 != null) {
            C111076mk r4 = (C111076mk) obj4;
            CharSequence charSequence = r4.A04;
            Layout layout = r4.A02;
            float f = r4.A00;
            float f2 = r4.A01;
            MNV mnv = r4.A03;
            ColorStateList colorStateList = mnv.A0S;
            int i = mnv.A0Q;
            int i2 = mnv.A0L;
            ImageSpan[] imageSpanArr = r4.A08;
            ClickableSpan[] clickableSpanArr = r4.A07;
            int i3 = mnv.A0M;
            boolean z = r4.A06;
            rCTextView.A07 = charSequence;
            rCTextView.A06 = layout;
            rCTextView.A00 = f;
            rCTextView.A01 = f2;
            rCTextView.A02 = i2;
            rCTextView.A03 = i3;
            rCTextView.A08 = z;
            if (i != 0) {
                rCTextView.A05 = null;
                rCTextView.A04 = i;
            } else {
                rCTextView.A05 = colorStateList;
                rCTextView.A04 = colorStateList.getDefaultColor();
                Layout layout2 = rCTextView.A06;
                if (layout2 != null) {
                    layout2.getPaint().setColor(rCTextView.A05.getColorForState(rCTextView.getDrawableState(), rCTextView.A04));
                }
            }
            RCTextView.A02(rCTextView, 0, 0);
            if (imageSpanArr != null) {
                for (ImageSpan drawable : imageSpanArr) {
                    Drawable drawable2 = drawable.getDrawable();
                    drawable2.setCallback(rCTextView);
                    drawable2.setVisible(true, false);
                }
            }
            rCTextView.A0B = imageSpanArr;
            rCTextView.A0A = clickableSpanArr;
            rCTextView.invalidate();
            return null;
        }
        throw C18250wR.A0V("Missing text layout context!");
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RCTextView rCTextView = (RCTextView) obj;
        rCTextView.A07 = null;
        rCTextView.A06 = null;
        rCTextView.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        rCTextView.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        rCTextView.A02 = 0;
        rCTextView.A03 = 0;
        rCTextView.A05 = null;
        rCTextView.A04 = 0;
        ImageSpan[] imageSpanArr = rCTextView.A0B;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i = 0; i < length; i++) {
                Drawable drawable = rCTextView.A0B[i].getDrawable();
                drawable.setCallback((Drawable.Callback) null);
                drawable.setVisible(false, false);
            }
            rCTextView.A0B = null;
        }
        rCTextView.A0A = null;
        AnonymousClass55t r0 = rCTextView.A0H;
        if (r0 != null) {
            r0.A0S();
        }
        if (obj3 == null) {
            throw C18250wR.A0V("Missing text layout context!");
        }
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
