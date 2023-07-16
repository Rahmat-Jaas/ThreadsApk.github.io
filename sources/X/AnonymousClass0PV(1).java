package X;

import com.facebook.common.mindeputils.IVerboseDebuggable;

/* renamed from: X.0PV  reason: invalid class name */
public final class AnonymousClass0PV extends AnonymousClass0EY implements IVerboseDebuggable {
    public static final AnonymousClass0KC A02 = new AnonymousClass0KC(AnonymousClass0PV.class, new Class[]{Throwable.class, C03610Jx.class}, 10);
    public C03610Jx A00;
    public Throwable A01;

    public final void CZZ() {
        this.A01 = null;
        this.A00 = C03610Jx.A06;
    }

    public final void A03(int i, int i2, Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        C03610Jx r4 = (C03610Jx) obj2;
        th.getClass();
        this.A01 = th;
        r4.getClass();
        this.A00 = r4;
    }

    public final String toString() {
        Throwable th = this.A01;
        AnonymousClass0KW.A00(th, "This class has been cleaned or is not inited");
        if (th == null) {
            return "Error! No Throwable Given!!!";
        }
        return AnonymousClass00U.A0d("Err ", th.getClass().getName(), ": ", th.getMessage());
    }

    public AnonymousClass0PV(Throwable th, C03610Jx r3) {
        this();
        th.getClass();
        this.A01 = th;
        r3.getClass();
        this.A00 = r3;
    }

    public AnonymousClass0PV() {
        super(true);
        this.A01 = null;
        C03610Jx r1 = C03610Jx.A06;
        this.A00 = r1;
        this.A01 = null;
        C03610Jx r0 = C03610Jx.A06;
        this.A00 = r1;
    }
}
