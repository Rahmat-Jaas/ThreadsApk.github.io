package X;

import android.app.TimePickerDialog;
import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.facebook.redex.IDxSListenerShape50S0400000_1_I2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2HG  reason: invalid class name */
public final class AnonymousClass2HG {
    public static final Object A00(AnonymousClass601 r14, C63893iY r15) {
        String str;
        Date parse;
        AnonymousClass601 r7 = r14;
        boolean A1Z = AnonymousClass0wJ.A1Z(r15, r14);
        List list = r15.A00;
        C109326jp A0R = C18190wL.A0R(list, 0);
        C127397h3 r1 = (C127397h3) list.get(A1Z ? 1 : 0);
        AnonymousClass3HX A01 = C63893iY.A01(r15, 2);
        if (r1 != null) {
            str = C18220wO.A0o(r1);
        } else {
            str = null;
        }
        Calendar instance = Calendar.getInstance();
        Context context = A01.A00;
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str) && (parse = new SimpleDateFormat("HH:mm", Locale.US).parse(str)) != null) {
                    instance.setTime(parse);
                }
            } catch (ParseException e) {
                C30967GcS.A03("got wrong time format from server", e);
            }
        }
        C13950oZ.A00(new TimePickerDialog(context, new IDxSListenerShape50S0400000_1_I2(A01, r7, A0R, instance, 0), instance.get(11), instance.get(12), DateFormat.is24HourFormat(context)));
        return null;
    }
}
