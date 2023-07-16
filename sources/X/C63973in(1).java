package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

/* renamed from: X.3in  reason: invalid class name and case insensitive filesystem */
public final class C63973in implements TimePickerDialog.OnTimeSetListener {
    public final /* synthetic */ C82984qb A00;
    public final /* synthetic */ C29361xq A01;

    public C63973in(C82984qb r1, C29361xq r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.A00.CPC(AnonymousClass00U.A0K(":", i, i2));
    }
}
