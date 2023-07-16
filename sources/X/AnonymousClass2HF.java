package X;

import android.app.DatePickerDialog;
import android.content.Context;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.2HF  reason: invalid class name */
public final class AnonymousClass2HF {
    public static Object A00(AnonymousClass601 r15, C63893iY r16) {
        long j;
        Number number;
        List list = r16.A00;
        C109326jp A0R = C18190wL.A0R(list, 0);
        C127397h3 r3 = (C127397h3) list.get(1);
        if (r3 != null) {
            j = r3.A0I(35, 0);
        } else {
            j = 0;
        }
        Object obj = list.get(2);
        if (obj == null) {
            number = null;
        } else {
            number = (Number) obj;
        }
        AnonymousClass3HX r7 = r15.A00;
        if (r7 != null) {
            Context context = r7.A00;
            Calendar instance = Calendar.getInstance();
            if (number != null) {
                instance.setTimeInMillis(number.longValue() * 1000);
            }
            DatePickerDialog datePickerDialog = new DatePickerDialog(context, new C63943ik(r7, r15, A0R, instance), instance.get(1), instance.get(2), C18240wQ.A07(instance));
            datePickerDialog.getDatePicker().setMinDate(j * 1000);
            C13950oZ.A00(datePickerDialog);
        }
        return null;
    }
}
