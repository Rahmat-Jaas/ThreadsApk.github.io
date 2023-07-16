package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.3Uk  reason: invalid class name */
public final class AnonymousClass3Uk {
    public final int A00;
    public final String A01;
    public final Throwable A02;
    public final ImmutableList A03;

    public final Throwable A01() {
        AnonymousClass4Vc r2 = new AnonymousClass4Vc(this);
        Throwable th = this.A02;
        if (th != null) {
            A00(th, r2);
            return th;
        }
        String str = this.A01;
        if (str != null) {
            C73934Vd r1 = new C73934Vd(this, str);
            A00(r1, r2);
            return r1;
        }
        C73934Vd r12 = new C73934Vd(this, AnonymousClass00U.A0J("Remote error code ", this.A00));
        A00(r12, r2);
        return r12;
    }

    public AnonymousClass3Uk(ImmutableList immutableList, String str, Throwable th, int i) {
        this.A00 = i;
        this.A02 = th;
        this.A01 = str;
        this.A03 = immutableList;
    }

    public static final void A00(Throwable th, Throwable th2) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        if (th.getClass() != th2.getClass()) {
            try {
                th.initCause(th2);
            } catch (IllegalStateException unused) {
            }
        }
    }
}
