package X;

import java.text.DateFormat;
import java.util.Locale;

/* renamed from: X.6p5  reason: invalid class name and case insensitive filesystem */
public final class C112156p5 {
    public final long A00;
    public final Integer A01;

    public final String toString() {
        String str;
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(1, 1);
        Locale locale = Locale.US;
        String A0i = C18240wQ.A0i(dateTimeInstance, this.A00);
        Integer num = this.A01;
        if (num == null || (str = AnonymousClass6I1.A00(num)) == null) {
            str = "Purchased";
        }
        return C86154wM.A0o(locale, "Checkout Timestamp [%s], Checkout Outcome [%s]", C86144wL.A1a(A0i, str));
    }

    public C112156p5(long j, Integer num) {
        this.A00 = j;
        this.A01 = num;
    }
}
