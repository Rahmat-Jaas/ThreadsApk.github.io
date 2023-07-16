package X;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;

/* renamed from: X.77y  reason: invalid class name and case insensitive filesystem */
public final class C1199977y {
    public static C1199977y A03;
    public GoogleSignInAccount A00;
    public GoogleSignInOptions A01;
    public final AnonymousClass7HJ A02;

    /* JADX INFO: finally extract failed */
    public final synchronized void A01() {
        AnonymousClass7HJ r0 = this.A02;
        Lock lock = r0.A01;
        lock.lock();
        try {
            C18190wL.A11(r0.A00);
            lock.unlock();
            this.A00 = null;
            this.A01 = null;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public static synchronized C1199977y A00(Context context) {
        C1199977y r0;
        synchronized (C1199977y.class) {
            Context applicationContext = context.getApplicationContext();
            r0 = A03;
            if (r0 == null) {
                r0 = new C1199977y(applicationContext);
                A03 = r0;
            }
        }
        return r0;
    }

    public C1199977y(Context context) {
        AnonymousClass7HJ A002 = AnonymousClass7HJ.A00(context);
        this.A02 = A002;
        this.A00 = A002.A02();
        this.A01 = A002.A03();
    }
}
