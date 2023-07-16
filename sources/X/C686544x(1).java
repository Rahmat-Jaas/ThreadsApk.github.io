package X;

import com.instagram.registration.model.RegFlowExtras;
import java.util.concurrent.TimeUnit;

/* renamed from: X.44x  reason: invalid class name and case insensitive filesystem */
public final class C686544x implements C39677Kxw {
    public final /* synthetic */ AnonymousClass35W A00;
    public final /* synthetic */ AnonymousClass3Y3 A01;

    public final void Bwg(Exception exc) {
    }

    public C686544x(AnonymousClass35W r1, AnonymousClass3Y3 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void CHB(Object obj) {
        RegFlowExtras regFlowExtras = (RegFlowExtras) obj;
        if (regFlowExtras != null) {
            AnonymousClass3Y3 r6 = this.A01;
            if (System.currentTimeMillis() - regFlowExtras.A00 > TimeUnit.HOURS.toMillis(24)) {
                r6.A00.A03("reg_flow_extras_serialize_key");
            } else {
                this.A00.A00.A03 = regFlowExtras;
            }
        }
    }
}
