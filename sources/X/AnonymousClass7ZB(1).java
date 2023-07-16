package X;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.7ZB  reason: invalid class name */
public final class AnonymousClass7ZB implements C143098g6 {
    public LocaleList A00;
    public AnonymousClass83Y A01;
    public final AnonymousClass6FY A02 = new AnonymousClass6FY();

    public final AnonymousClass83Y Ab9() {
        AnonymousClass83Y r1;
        LocaleList localeList = LocaleList.getDefault();
        C04220Ms.A06(localeList);
        synchronized (this.A02) {
            r1 = this.A01;
            if (r1 == null || localeList != this.A00) {
                int size = localeList.size();
                ArrayList A0k = C18240wQ.A0k(size);
                for (int i = 0; i < size; i++) {
                    Locale locale = localeList.get(i);
                    C04220Ms.A06(locale);
                    A0k.add(new AnonymousClass79B(new AnonymousClass7ZA(locale)));
                }
                r1 = new AnonymousClass83Y(A0k);
                this.A00 = localeList;
                this.A01 = r1;
            }
        }
        return r1;
    }
}
