package X;

import android.widget.DatePicker;
import java.util.Calendar;

/* renamed from: X.3vh  reason: invalid class name and case insensitive filesystem */
public final class C65743vh implements DatePicker.OnDateChangedListener {
    public final /* synthetic */ AnonymousClass3HX A00;
    public final /* synthetic */ C127397h3 A01;
    public final /* synthetic */ C109326jp A02;

    public C65743vh(AnonymousClass3HX r1, C127397h3 r2, C109326jp r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3, 0, 0, 0);
        C127397h3 r4 = this.A01;
        C109326jp r3 = this.A02;
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        A002.A02("0", 0);
        C122047Jt.A03(this.A00, r4, C63893iY.A05(A002, Long.valueOf(C18210wN.A07(instance)), 1), r3);
    }
}
