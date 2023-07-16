package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

/* renamed from: X.3im  reason: invalid class name and case insensitive filesystem */
public final class C63963im implements TimePickerDialog.OnTimeSetListener {
    public final /* synthetic */ C83194qw A00;

    public C63963im(C83194qw r1) {
        this.A00 = r1;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.A00.CPB((((long) i) * 3600) + (((long) i2) * 60));
    }
}
