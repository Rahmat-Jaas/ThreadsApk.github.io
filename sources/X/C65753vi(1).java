package X;

import android.widget.DatePicker;
import java.util.Calendar;

/* renamed from: X.3vi  reason: invalid class name and case insensitive filesystem */
public final class C65753vi implements DatePicker.OnDateChangedListener {
    public final /* synthetic */ AnonymousClass1jP A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ C127397h3 A02;
    public final /* synthetic */ C109326jp A03;

    public C65753vi(AnonymousClass1jP r1, AnonymousClass3HX r2, C127397h3 r3, C109326jp r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        C109326jp r5 = this.A03;
        if (r5 != null) {
            Calendar instance = Calendar.getInstance();
            instance.set(i, i2, i3, 0, 0);
            C127397h3 r4 = this.A02;
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A03("0", 0);
            C122047Jt.A03(this.A01, r4, C63893iY.A04(A002, Long.valueOf(C18210wN.A07(instance)), 1), r5);
        }
    }
}
