package X;

import com.facebook.redex.IDxProviderShape105S0000000_2_I2;
import com.fbpay.ptt.impl.ServerCertsVerifier;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.76l  reason: invalid class name and case insensitive filesystem */
public final class C1196876l {
    public static final C1202379i A05 = new C1202379i();
    public final C104996ci A00;
    public final C106136eY A01;
    public final Map A02;
    public final C04560Oe A03;
    public final boolean A04;

    public C1196876l(C104996ci r8, C106136eY r9, boolean z) {
        IDxProviderShape105S0000000_2_I2 iDxProviderShape105S0000000_2_I2 = new IDxProviderShape105S0000000_2_I2(3);
        Map synchronizedMap = Collections.synchronizedMap(AnonymousClass0wJ.A0y());
        this.A02 = synchronizedMap;
        this.A01 = r9;
        this.A00 = r8;
        this.A03 = iDxProviderShape105S0000000_2_I2;
        this.A04 = z;
        C1202379i r2 = A05;
        ServerCertsVerifier serverCertsVerifier = (ServerCertsVerifier) iDxProviderShape105S0000000_2_I2.get();
        synchronizedMap.put(r2, new AnonymousClass5k3(r2, serverCertsVerifier, r8, r9, z));
    }
}
