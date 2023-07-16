package X;

import java.io.Serializable;

/* renamed from: X.7yA  reason: invalid class name and case insensitive filesystem */
public final class C134677yA implements Serializable {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C134677yA)) {
            return false;
        }
        Throwable th = this.A00;
        Throwable th2 = ((C134677yA) obj).A00;
        if (th == th2) {
            return true;
        }
        if (th == null || !th.equals(th2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("NotificationLite.Error[");
        A0s.append(this.A00);
        return C18180wK.A0i("]", A0s);
    }

    public C134677yA(Throwable th) {
        this.A00 = th;
    }
}
