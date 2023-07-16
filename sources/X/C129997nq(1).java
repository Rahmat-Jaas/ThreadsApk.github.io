package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7nq  reason: invalid class name and case insensitive filesystem */
public final class C129997nq implements C83334rD {
    public final AtomicReference A00;
    public final McB A01;

    public final void onFailure(Throwable th) {
        AnonymousClass7EC r0;
        C143718hC r2 = (C143718hC) this.A00.getAndSet((Object) null);
        if (r2 != null) {
            try {
                r0 = AnonymousClass7EC.A01((Throwable) this.A01.apply(th));
            } catch (Exception e) {
                r0 = AnonymousClass7EC.A01(e);
            } catch (Throwable th2) {
                r2.CRe(AnonymousClass7EC.A01(th));
                throw th2;
            }
            r2.CRe(r0);
        }
    }

    public final void onSuccess(Object obj) {
        AnonymousClass7EC A012;
        C143718hC r1 = (C143718hC) this.A00.getAndSet((Object) null);
        if (r1 != null) {
            if (obj != null) {
                A012 = AnonymousClass7EC.A00(obj);
            } else {
                A012 = AnonymousClass7EC.A01(C18180wK.A0a("Result is null on onSuccess"));
            }
            r1.CRe(A012);
        }
    }

    public C129997nq(C143718hC r2, McB mcB) {
        this.A00 = new AtomicReference(r2);
        this.A01 = mcB;
    }
}
