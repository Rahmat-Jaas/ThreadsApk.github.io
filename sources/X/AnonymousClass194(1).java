package X;

import android.view.View;

/* renamed from: X.194  reason: invalid class name */
public final class AnonymousClass194 extends AnonymousClass0Sf implements C41882MfV {
    public final View.OnClickListener A00;
    public final C57943Dd A01;
    public final C57943Dd A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass194) {
                AnonymousClass194 r5 = (AnonymousClass194) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C04220Ms.A0B(obj, 0);
        return equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        return ((C18210wN.A04(this.A02) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A07(this.A00);
    }

    public AnonymousClass194(View.OnClickListener onClickListener, C57943Dd r2, C57943Dd r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = onClickListener;
    }
}
