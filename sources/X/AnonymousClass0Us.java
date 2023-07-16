package X;

import android.app.Application;
import android.os.SystemClock;
import java.util.Calendar;

/* renamed from: X.0Us  reason: invalid class name */
public final class AnonymousClass0Us implements C04050Mb {
    public Application A00;

    public final void CWp(C04170Mn r7, AnonymousClass0ND r8) {
        AnonymousClass0Y1 A002 = AnonymousClass0Y1.A00(this.A00);
        r7.A02(AnonymousClass0MU.A1g, Long.valueOf((Calendar.getInstance().getTimeInMillis() - SystemClock.elapsedRealtime()) / 1000));
        AnonymousClass0OO r4 = AnonymousClass0MU.A1f;
        String str = "0";
        String str2 = str;
        try {
            str2 = A002.A00.getString(r4.A00, str);
            if (str2 != null) {
                r7.A02(r4, Long.valueOf(Long.parseLong(str2)));
            }
        } catch (Exception unused) {
            AnonymousClass0LU.A0B("lacrima", "Failed to read from SharedPreferences");
            C04790Pd.A00();
        }
        AnonymousClass0OO r2 = AnonymousClass0MU.A1h;
        try {
            str = A002.A00.getString(r2.A00, str);
            if (str != null) {
                r7.A02(r2, Long.valueOf(Long.parseLong(str)));
            }
        } catch (Exception unused2) {
            AnonymousClass0LU.A0B("lacrima", "Failed to read from SharedPreferences");
            C04790Pd.A00();
        }
    }

    public AnonymousClass0Us(Application application) {
        this.A00 = application;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0a;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
