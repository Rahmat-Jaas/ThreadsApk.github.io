package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;

/* renamed from: X.2GA  reason: invalid class name */
public final class AnonymousClass2GA {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        C81514nv r0;
        C81514nv r02;
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        Object A0B = C63893iY.A0B(r9, 0);
        A0B.getClass();
        AnonymousClass3HX r1 = (AnonymousClass3HX) A0B;
        C109326jp A06 = C63893iY.A06(r9, A1Z ? 1 : 0);
        AnonymousClass3SY r5 = AnonymousClass3SY.A02;
        FragmentActivity A05 = C63913ic.A05(r8);
        C04220Ms.A04(r1);
        AnonymousClass3FL r3 = new AnonymousClass3FL(r1, r8, A06);
        C63643hy.A02();
        A05.getClass();
        C63643hy.A02();
        if (!(r5.A00 == null || (r0 = r5.A01) == null || !((C18370x4) r0).A03.get())) {
            C63643hy.A02();
            C63643hy.A02();
            if (!(r5.A00 == null || (r02 = r5.A01) == null || !((C18370x4) r02).A03.get())) {
                if (r5.A00 != null) {
                    r5.A00 = null;
                }
                C81514nv r03 = r5.A01;
                if (r03 != null && ((C18370x4) r03).A03.get()) {
                    C18370x4 r12 = (C18370x4) r5.A01;
                    if (r12.A03.getAndSet(false)) {
                        r12.A02.unregisterReceiver(r12);
                    }
                    r5.A01 = null;
                }
            }
        }
        r5.A00 = r3;
        C62783aj instance = C62783aj.getInstance();
        if (instance == null || !C09650fs.A04(A05)) {
            return null;
        }
        C81514nv listenForSmsResponse = instance.listenForSmsResponse(A05, A1Z);
        r5.A01 = listenForSmsResponse;
        ((C18370x4) listenForSmsResponse).A00 = new IDxACallbackShape15S0300000_1_I2(12, (Object) A05, (Object) r3, (Object) r5);
        return null;
    }
}
