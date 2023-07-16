package X;

import com.facebook.papaya.client.type.PapayaRestrictions;
import java.util.Map;

/* renamed from: X.77P  reason: invalid class name */
public final class AnonymousClass77P {
    public final Map A00 = AnonymousClass0wJ.A0y();

    public final void A01(C972968u r3, long j) {
        C04220Ms.A0B(r3, 0);
        this.A00.put(r3, Long.valueOf(j));
    }

    public static PapayaRestrictions A00(C972968u r2, AnonymousClass77P r3, long j) {
        r3.A01(r2, j);
        PapayaRestrictions papayaRestrictions = new PapayaRestrictions();
        papayaRestrictions.A00.putAll(r3.A00);
        return papayaRestrictions;
    }
}
