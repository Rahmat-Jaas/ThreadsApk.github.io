package X;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.785  reason: invalid class name */
public final class AnonymousClass785 {
    public static AnonymousClass785 A04;
    public Boolean A00 = null;
    public Boolean A01 = null;
    public String A02 = null;
    public final Queue A03 = new ArrayDeque();

    public static synchronized AnonymousClass785 A00() {
        AnonymousClass785 r0;
        synchronized (AnonymousClass785.class) {
            r0 = A04;
            if (r0 == null) {
                r0 = new AnonymousClass785();
                A04 = r0;
            }
        }
        return r0;
    }

    public final boolean A01(Context context) {
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(C18180wK.A1W(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK")));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.A00.booleanValue();
    }
}
