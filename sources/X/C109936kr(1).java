package X;

import kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11;

/* renamed from: X.6kr  reason: invalid class name and case insensitive filesystem */
public final class C109936kr {
    public C147168nV A00;
    public final AnonymousClass7A5 A01;
    public final boolean A02;
    public final C142638fL A03;

    public C109936kr(C142638fL r7, AnonymousClass67T r8, AnonymousClass0YY r9, boolean z) {
        this.A03 = r7;
        this.A02 = z;
        AnonymousClass67T r2 = r8;
        this.A01 = new AnonymousClass7A5(r7, r2, new KtLambdaShape31S0100000_I2_11(this, 31), C86164wN.A0s(this, 49), r9);
        if (z && r8 == AnonymousClass67T.HalfExpanded) {
            throw C18190wL.A0a("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }
}
