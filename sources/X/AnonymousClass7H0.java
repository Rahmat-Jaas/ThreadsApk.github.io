package X;

import android.view.View;

/* renamed from: X.7H0  reason: invalid class name */
public final class AnonymousClass7H0 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("MeasureResult:[width ");
        A0s.append(this.A01);
        A0s.append(" height ");
        A0s.append(this.A00);
        A0s.append(" layoutData ");
        A0s.append(this.A02);
        A0s.append(" mHadExceptions ");
        A0s.append(this.A03);
        return C18180wK.A0i("]", A0s);
    }

    public AnonymousClass7H0(int i, int i2, Object obj) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = false;
    }

    public static AnonymousClass7H0 A00(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            return new AnonymousClass7H0(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
        throw C18190wL.A0a(AnonymousClass00U.A0d("The sizes must be exact, but width is ", AnonymousClass7I7.A00(i), " and height is ", AnonymousClass7I7.A00(i2)));
    }

    public AnonymousClass7H0(int i, int i2) {
        this(i, i2, (Object) null);
    }

    public AnonymousClass7H0() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
        this.A03 = true;
    }
}
