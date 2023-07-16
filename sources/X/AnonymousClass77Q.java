package X;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: X.77Q  reason: invalid class name */
public final class AnonymousClass77Q {
    public final String A00;

    public static String A00(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = AnonymousClass00U.A0d(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return AnonymousClass00U.A0V(str, " : ", str2);
    }

    public final void A01(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            A00(this.A00, str, objArr);
        }
    }

    public AnonymousClass77Q(String str) {
        this.A00 = AnonymousClass00U.A0Z("UID: [", "]  PID: [", "] ", Process.myUid(), Process.myPid()).concat(str);
    }
}
