package X;

import android.view.View;

/* renamed from: X.5fR  reason: invalid class name and case insensitive filesystem */
public abstract class C91005fR extends M5L implements C143468gn {
    public long A00;
    public boolean A01;

    public final long A08() {
        return this.A00;
    }

    public final void A0O(long j) {
        if (!this.A01) {
            this.A00 = j;
            this.A01 = true;
            return;
        }
        throw C18250wR.A0V("Id can only be set once for any Mountable");
    }

    public final C41822MeD ABY(C112976qV r17, int i, int i2) {
        AnonymousClass7H0 A0P;
        C112976qV r11 = r17;
        Object obj = r11.A02;
        r11.A02 = null;
        int i3 = i;
        int i4 = i2;
        if (this instanceof C90905fH) {
            C90905fH r2 = (C90905fH) this;
            A0P = C121977Jb.A00(C90905fH.A04, r11, r2.A02, r2.A03, i3, i4);
        } else if (this instanceof C90895fG) {
            Object AFU = C90895fG.A00.AFU(r11.A04);
            C04220Ms.A06(AFU);
            View view = (View) AFU;
            view.measure(i3, i4);
            A0P = new AnonymousClass7H0(view.getMeasuredWidth(), view.getMeasuredHeight());
        } else if (this instanceof C90915fI) {
            C90915fI r22 = (C90915fI) this;
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (!(mode == Integer.MIN_VALUE || mode == 1073741824)) {
                size = 0;
            }
            int mode2 = View.MeasureSpec.getMode(i4);
            int size2 = View.MeasureSpec.getSize(i4);
            if (!(mode2 == Integer.MIN_VALUE || mode2 == 1073741824)) {
                size2 = 0;
            }
            A0P = new AnonymousClass7H0(size, size2, r22.A00.invoke(new AnonymousClass79C(C86104wH.A0C((float) size, (float) size2))));
        } else {
            A0P = ((C90925fJ) this).A0P(new AnonymousClass39P(r11, obj), i3, i4);
        }
        return new C127377h1(this, A0P.A02, i3, i4, A0P.A01, A0P.A00);
    }

    public C91005fR(Integer num) {
        super(num);
    }
}
