package X;

import com.instagram.common.task.IDxLTaskShape28S0300000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.1h3  reason: invalid class name */
public final class AnonymousClass1h3 extends C63873iU {
    public UserSession A00;
    public final /* synthetic */ AnonymousClass3TI A01;

    public AnonymousClass1h3(AnonymousClass3TI r1, UserSession userSession) {
        this.A01 = r1;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C14030oh.A03(-1728334691);
        int A032 = C14030oh.A03(1394812817);
        AnonymousClass33A r0 = ((AnonymousClass1R4) obj).A00;
        if (r0 == null) {
            C18250wR.A0m();
            throw null;
        }
        String str = r0.A00;
        if (str == null) {
            i = 1818940943;
        } else {
            AnonymousClass3TI r5 = this.A01;
            UserSession userSession = this.A00;
            AnonymousClass32O r3 = new AnonymousClass32O();
            r3.A00.putByteArray("challenge", AnonymousClass3TI.A07.A03(str));
            r3.A00.putBoolean("useDebugKey", false);
            C31155GhB.A03(new IDxLTaskShape28S0300000_1_I2(0, r5, userSession, r3));
            i = -1474190458;
        }
        C14030oh.A0A(i, A032);
        C14030oh.A0A(-1489168822, A03);
    }
}
