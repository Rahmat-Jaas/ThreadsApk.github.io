package X;

import android.app.DatePickerDialog;
import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2HE  reason: invalid class name */
public final class AnonymousClass2HE {
    public static Object A00(AnonymousClass601 r11, C63893iY r12) {
        String str;
        String str2;
        Date parse;
        List list = r12.A00;
        C109326jp A0R = C18190wL.A0R(list, 0);
        C127397h3 r0 = (C127397h3) list.get(1);
        Object A0B = C63893iY.A0B(r12, 2);
        A0B.getClass();
        AnonymousClass3HX r1 = (AnonymousClass3HX) A0B;
        if (r0 != null) {
            str2 = C18220wO.A0o(r0);
            str = C18230wP.A0o(r0);
        } else {
            str = null;
            str2 = null;
        }
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(r1.A00, new C63933ij(r1, r11, A0R, instance), instance.get(1), instance.get(2), C18240wQ.A07(instance));
        try {
            if (!TextUtils.isEmpty(str2)) {
                Date parse2 = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str2);
                if (parse2 != null) {
                    datePickerDialog.getDatePicker().setMinDate(parse2.getTime());
                }
            }
            if (!TextUtils.isEmpty(str) && (parse = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str)) != null) {
                datePickerDialog.getDatePicker().setMaxDate(parse.getTime());
            }
        } catch (ParseException e) {
            C30967GcS.A03("got wrong date format from server", e);
        }
        C13950oZ.A00(datePickerDialog);
        return null;
    }
}
