package X;

import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import com.facebook.redex.IDxCListenerShape100S0300000_1_I2;
import com.instagram.barcelona.R;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.3J7  reason: invalid class name */
public final class AnonymousClass3J7 {
    public static long A00(Long l, String str) {
        Calendar instance;
        if (str != null) {
            instance = Calendar.getInstance(TimeZone.getTimeZone(str));
        } else {
            instance = Calendar.getInstance();
        }
        instance.setTimeInMillis(l.longValue() * 1000);
        int i = instance.get(1);
        int i2 = instance.get(2);
        int A07 = C18240wQ.A07(instance);
        Calendar instance2 = Calendar.getInstance();
        instance2.set(i, i2, A07);
        return instance2.getTimeInMillis();
    }

    public static void A01(Context context, AnonymousClass3HX r9, AnonymousClass601 r10, C109326jp r11, C109326jp r12, Calendar calendar, boolean z) {
        int i = R.style.CdsSpinnerTimePickerDialogLight;
        if (z) {
            i = R.style.CdsSpinnerTimePickerDialogDark;
        }
        Context context2 = context;
        TimePickerDialog timePickerDialog = new TimePickerDialog(context2, i, new C63983io(r10, r11, calendar), calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(context));
        timePickerDialog.setTitle(context2.getString(2131836810));
        timePickerDialog.setButton(-1, context2.getString(2131824787), timePickerDialog);
        if (!(r12 == null || r10 == null)) {
            timePickerDialog.setOnCancelListener(new IDxCListenerShape100S0300000_1_I2(1, r9, r10, r12));
        }
        C13950oZ.A00(timePickerDialog);
    }
}
