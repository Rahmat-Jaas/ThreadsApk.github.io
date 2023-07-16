package X;

import com.facebook.redex.IDxCListenerShape201S0200000_2_I2;

/* renamed from: X.7Ya  reason: invalid class name and case insensitive filesystem */
public final class C123667Ya implements C146888n2 {
    public static final C123667Ya A00 = new C123667Ya();

    public final AnonymousClass0ZU BQf(C871950n r4) {
        if (r4.isAttachedToWindow()) {
            AnonymousClass066 A002 = C116066wM.A00(r4);
            if (A002 != null) {
                return AnonymousClass6FB.A00(r4, A002.getLifecycle());
            }
            StringBuilder A0s = C18190wL.A0s("View tree for ");
            A0s.append(r4);
            throw C18180wK.A0a(C18180wK.A0i(" has no ViewTreeLifecycleOwner", A0s));
        }
        AnonymousClass0MJ A17 = C86144wL.A17();
        IDxCListenerShape201S0200000_2_I2 iDxCListenerShape201S0200000_2_I2 = new IDxCListenerShape201S0200000_2_I2(0, r4, A17);
        r4.addOnAttachStateChangeListener(iDxCListenerShape201S0200000_2_I2);
        A17.A00 = C86164wN.A0v(iDxCListenerShape201S0200000_2_I2, r4, 23);
        return C86154wM.A13(A17, 29);
    }
}
