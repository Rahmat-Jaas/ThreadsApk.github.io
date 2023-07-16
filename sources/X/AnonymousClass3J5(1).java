package X;

import com.facebook.redex.IDxFlowShape93S0200000_1_I2;

/* renamed from: X.3J5  reason: invalid class name */
public final class AnonymousClass3J5 {
    public static final C83224qz A00(C62793ak r3) {
        C04220Ms.A0B(r3, 0);
        C83224qz r0 = (C83224qz) r3.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (r0 != null) {
            return r0;
        }
        Object tagIfAbsent = r3.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C72224Nc(C25235DiG.A01(new AnonymousClass8bb((C148838sG) null), AnonymousClass6ZB.A00.A06())));
        C04220Ms.A06(tagIfAbsent);
        return (C83224qz) tagIfAbsent;
    }

    public static void A01(C62793ak r2, AnonymousClass0YP r3, C84714tk r4, int i) {
        C25817DsW.A06(A00(r2), new IDxFlowShape93S0200000_1_I2(r3, r4, i));
    }
}
