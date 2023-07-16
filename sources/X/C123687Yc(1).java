package X;

import android.view.ViewConfiguration;

/* renamed from: X.7Yc  reason: invalid class name and case insensitive filesystem */
public final class C123687Yc implements C146118lf {
    public final ViewConfiguration A00;

    public final /* synthetic */ long Avw() {
        float f = (float) 48;
        return C86104wH.A0C(f, f);
    }

    public final float BHh() {
        return (float) this.A00.getScaledTouchSlop();
    }

    public C123687Yc(ViewConfiguration viewConfiguration) {
        this.A00 = viewConfiguration;
    }

    public final long Ads() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    public final long At7() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }
}
