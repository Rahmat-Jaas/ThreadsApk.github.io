package X;

import java.util.concurrent.Executor;

/* renamed from: X.3za  reason: invalid class name and case insensitive filesystem */
public final class C67453za implements C83304rA {
    public C10300i6 A00;

    public final void AMA(C146418mD r2, C83334rD r3) {
        AMB(r2, r3, (Executor) null);
    }

    public static synchronized C67453za A00(C10300i6 r2) {
        C67453za r0;
        Class<C67453za> cls = C67453za.class;
        synchronized (cls) {
            r0 = (C67453za) C18180wK.A0c(r2, cls, 21);
        }
        return r0;
    }

    public C67453za(C10300i6 r1) {
        this.A00 = r1;
    }

    public final void AMB(C146418mD r3, C83334rD r4, Executor executor) {
        AnonymousClass7Ko.A0B(C18220wO.A1U(executor));
        C32165H8c A0K = C18210wN.A0K(r3, this.A00);
        C63873iU.A0F(A0K, this, r4, 20);
        C31155GhB.A03(A0K);
    }
}
