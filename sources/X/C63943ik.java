package X;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.widget.DatePicker;
import com.facebook.redex.IDxSListenerShape50S0400000_1_I2;
import com.instagram.barcelona.R;
import java.util.Calendar;

/* renamed from: X.3ik  reason: invalid class name and case insensitive filesystem */
public final class C63943ik implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ AnonymousClass3HX A00;
    public final /* synthetic */ AnonymousClass601 A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ Calendar A03;

    public C63943ik(AnonymousClass3HX r1, AnonymousClass601 r2, C109326jp r3, Calendar calendar) {
        this.A03 = calendar;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar calendar = this.A03;
        calendar.set(i, i2, i3);
        AnonymousClass3HX r4 = this.A00;
        C109326jp r6 = this.A02;
        AnonymousClass601 r5 = this.A01;
        Context context = r4.A00;
        C13950oZ.A00(new TimePickerDialog(context, R.style.SpinnerTimePickerDialog, new IDxSListenerShape50S0400000_1_I2(r4, r5, r6, calendar, 1), calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(context)));
    }
}
