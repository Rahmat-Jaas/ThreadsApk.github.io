package X;

import android.widget.NumberPicker;

/* renamed from: X.7S7  reason: invalid class name */
public final class AnonymousClass7S7 implements NumberPicker.OnValueChangeListener {
    public final /* synthetic */ AnonymousClass3HX A00;
    public final /* synthetic */ C127397h3 A01;
    public final /* synthetic */ C109326jp A02;

    public AnonymousClass7S7(AnonymousClass3HX r1, C127397h3 r2, C109326jp r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        C127397h3 r4 = this.A01;
        C109326jp r3 = this.A02;
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        A002.A02(r4, 0);
        A002.A02(Integer.valueOf(i), 1);
        A002.A02(Integer.valueOf(i2), 2);
        AnonymousClass3HX r1 = this.A00;
        A002.A02(r1, 3);
        C122047Jt.A07(r1, r4, A002, r3);
    }
}
