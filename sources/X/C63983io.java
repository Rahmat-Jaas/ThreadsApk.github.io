package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.Calendar;

/* renamed from: X.3io  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63983io implements TimePickerDialog.OnTimeSetListener {
    public final /* synthetic */ AnonymousClass601 A00;
    public final /* synthetic */ C109326jp A01;
    public final /* synthetic */ Calendar A02;

    public /* synthetic */ C63983io(AnonymousClass601 r1, C109326jp r2, Calendar calendar) {
        this.A02 = calendar;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        Calendar calendar = this.A02;
        AnonymousClass601 r4 = this.A00;
        C109326jp r3 = this.A01;
        calendar.set(11, i);
        calendar.set(12, i2);
        if (r4 != null) {
            C63893iY.A0F(r4, AnonymousClass3VO.A00(), r3, String.valueOf(C18210wN.A07(calendar)), 0);
        }
    }
}
