package X;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: X.78d  reason: invalid class name */
public final class AnonymousClass78d {
    public final String A00;

    public static String A00(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", C86114wI.A0p(String.valueOf(str2), "Unable to format "), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(str2) + 3 + C86104wH.A0A(join));
                A0s.append(str2);
                A0s.append(" [");
                A0s.append(join);
                str2 = C18180wK.A0i("]", A0s);
            }
        }
        StringBuilder A0s2 = C86114wI.A0s(C86104wH.A0A(str) + 3 + C86104wH.A0A(str2));
        A0s2.append(str);
        A0s2.append(" : ");
        return C18180wK.A0i(str2, A0s2);
    }

    public final void A01(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            A00(this.A00, str, objArr);
        }
    }

    public final void A02(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", A00(this.A00, str, objArr));
        }
    }

    public AnonymousClass78d(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder A0s = C86114wI.A0s(39);
        A0s.append("UID: [");
        A0s.append(myUid);
        A0s.append("]  PID: [");
        A0s.append(myPid);
        this.A00 = C86104wH.A0w(str, C18180wK.A0i("] ", A0s));
    }
}
