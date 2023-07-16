package X;

import com.instagram.common.api.base.IDxACallbackShape5S0400000_1_I2;
import com.instagram.registration.model.RegFlowExtras;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4Jr  reason: invalid class name and case insensitive filesystem */
public final class C71664Jr implements C82964qZ {
    public final /* synthetic */ C313625r A00;
    public final /* synthetic */ C34640IcN A01;
    public final /* synthetic */ C28451uI A02;
    public final /* synthetic */ RegFlowExtras A03;
    public final /* synthetic */ C07530bf A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ AtomicInteger A06;

    public C71664Jr(C34640IcN icN, C28451uI r2, RegFlowExtras regFlowExtras, C07530bf r4, C313625r r5, Integer num, AtomicInteger atomicInteger) {
        this.A04 = r4;
        this.A06 = atomicInteger;
        this.A03 = regFlowExtras;
        this.A00 = r5;
        this.A01 = icN;
        this.A02 = r2;
        this.A05 = num;
    }

    public final void AAA(AnonymousClass3XX r22, AnonymousClass3EW r23) {
        Object obj;
        int i;
        C07530bf r10 = this.A04;
        AnonymousClass01V.A0p.markerEnd(4197923, 3);
        AnonymousClass3XX r3 = r22;
        AnonymousClass3EW r2 = r23;
        if (r3.A01 != null || (obj = r3.A00) == null || ((i = ((C685344e) obj).mStatusCode) >= 500 && i < 600)) {
            AtomicInteger atomicInteger = this.A06;
            if (atomicInteger.get() == 1) {
                RegFlowExtras regFlowExtras = this.A03;
                if (!(regFlowExtras.A0Z == null || regFlowExtras.A0P == null || C67283zI.A00() == AnonymousClass006.A00)) {
                    C61763Vg A032 = C63313hF.A03(r10, this.A00, AnonymousClass265.DONE, "register_account_retry");
                    String A002 = AnonymousClass2TS.A00(C67283zI.A00());
                    int i2 = atomicInteger.get();
                    A032.A03("retry_strategy", A002);
                    A032.A02("attempt_count", i2);
                    A032.A01();
                    int intValue = C67283zI.A00().intValue();
                    if (intValue == 1) {
                        C34640IcN icN = this.A01;
                        String A0d = C18240wQ.A0d(icN);
                        String A052 = C09140ev.A02.A05(icN.requireContext());
                        atomicInteger.incrementAndGet();
                        String str = regFlowExtras.A0Z;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = regFlowExtras.A0P;
                        if (str2 == null) {
                            str2 = "";
                        }
                        C32165H8c A0D = C63883iV.A0D(r10, (String) null, A0d, (String) null, (String) null, A052, str2, (String) null, str, (List) null, C63593hs.A00());
                        A0D.A00 = new IDxACallbackShape5S0400000_1_I2(10, this, r3, r10, r2);
                        icN.schedule(A0D);
                        return;
                    } else if (intValue == 2) {
                        atomicInteger.incrementAndGet();
                        C67283zI.A05(this.A01, this.A02, regFlowExtras, r10, this.A05);
                        return;
                    } else {
                        throw C18180wK.A0a("Unsupported retry strategy type.");
                    }
                }
            }
        }
        r2.A00(r3);
    }
}
