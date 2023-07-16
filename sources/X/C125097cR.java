package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7cR  reason: invalid class name and case insensitive filesystem */
public final class C125097cR implements C015106z {
    public Bundle A00;
    public boolean A01;
    public final AnonymousClass070 A02;
    public final C04530Oa A03;

    public C125097cR(AnonymousClass06C r2, AnonymousClass070 r3) {
        AnonymousClass0wJ.A1O(r3, r2);
        this.A02 = r3;
        this.A03 = AnonymousClass0OY.A02(C86154wM.A13(r2, 47));
    }

    public final Bundle Cfz() {
        Bundle A06 = C18180wK.A06();
        Bundle bundle = this.A00;
        if (bundle != null) {
            A06.putAll(bundle);
        }
        Iterator A0z = AnonymousClass0wJ.A0z(((C881156u) this.A03.getValue()).A00);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            String A0p = C18200wM.A0p(A0o);
            Bundle Cfz = ((C121177En) A0o.getValue()).A00.Cfz();
            if (!C04220Ms.A0I(Cfz, Bundle.EMPTY)) {
                A06.putBundle(A0p, Cfz);
            }
        }
        this.A01 = false;
        return A06;
    }
}
