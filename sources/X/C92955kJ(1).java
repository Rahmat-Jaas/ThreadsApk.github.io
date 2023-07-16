package X;

import com.facebook.graphql.impls.FBPayAuthTicketFragmentImpl;

/* renamed from: X.5kJ  reason: invalid class name and case insensitive filesystem */
public final class C92955kJ extends C92975kL {
    public final /* synthetic */ AnonymousClass76O A00;
    public final /* synthetic */ C120977Dl A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92955kJ(C142618fJ r1, AnonymousClass76O r2, AnonymousClass76O r3, C104996ci r4, C120977Dl r5, C120977Dl r6) {
        super(r1, r2, r4, r5);
        this.A01 = r6;
        this.A00 = r3;
    }

    public final AnonymousClass7Kx A05(AnonymousClass7EC r7) {
        Throwable th = r7.A02;
        if (C18220wO.A1U(th)) {
            Object obj = r7.A01;
            obj.getClass();
            FBPayAuthTicketFragmentImpl fBPayAuthTicketFragmentImpl = (FBPayAuthTicketFragmentImpl) ((C107446gl) obj).A00;
            for (C120967Dk r2 : this.A01.A08) {
                if (fBPayAuthTicketFragmentImpl.getStringValue("fingerprint") != null && fBPayAuthTicketFragmentImpl.getStringValue("fingerprint").equalsIgnoreCase(r2.A05)) {
                    return AnonymousClass7Kx.A0A(this.A00.A01.A04(fBPayAuthTicketFragmentImpl, r2));
                }
            }
            th = C18250wR.A0V("Auth ticket not found in local");
        } else {
            th.getClass();
        }
        return AnonymousClass7Kx.A0B((Object) null, th);
    }
}
