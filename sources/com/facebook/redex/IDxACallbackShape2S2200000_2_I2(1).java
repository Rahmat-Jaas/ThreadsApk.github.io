package com.facebook.redex;

import X.AnonymousClass0LU;
import X.AnonymousClass583;
import X.AnonymousClass76O;
import X.AnonymousClass7HL;
import X.AnonymousClass7Hq;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.C104996ci;
import X.C107266gT;
import X.C108876j6;
import X.C116986xw;
import X.C1198677j;
import X.C120967Dk;
import X.C120977Dl;
import X.C121157Ek;
import X.C121257Ff;
import X.C121277Fh;
import X.C1373588g;
import X.C143688h9;
import X.C145348kM;
import X.C18180wK;
import X.C18200wM;
import X.C18240wQ;
import X.C86114wI;
import X.C86134wK;
import X.C86154wM;
import X.C86164wN;
import X.C880756q;
import X.C880856r;
import X.C92955kJ;
import X.M5J;
import android.os.Bundle;
import com.fbpay.auth.models.PttPayload;
import com.fbpay.logging.FBPayLoggerData;
import java.util.Collections;
import java.util.HashSet;

public class IDxACallbackShape2S2200000_2_I2 implements C145348kM {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public IDxACallbackShape2S2200000_2_I2(Object obj, Object obj2, String str, String str2, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = obj;
    }

    public final void Bln(Throwable th) {
        C880756q r1;
        int i = this.A04;
        AnonymousClass583 r0 = (AnonymousClass583) this.A00;
        if (i != 0) {
            r1 = r0.A04;
        } else {
            r1 = r0.A03;
        }
        r1.A0G(AnonymousClass7Kx.A0C(th));
    }

    public final void Blo(C108876j6 r20) {
        String str;
        C108876j6 r10 = r20;
        if (this.A04 != 0) {
            Bundle bundle = r10.A00;
            if (bundle == null || !bundle.getBoolean("AUTH_FLOW_UTIL_HAVE_ASKED_FOR_BIO_SETUP", false)) {
                AnonymousClass583 r0 = (AnonymousClass583) this.A00;
                C120967Dk r9 = r10.A01;
                String str2 = this.A02;
                String str3 = this.A03;
                Bundle bundle2 = (Bundle) this.A01;
                C880756q r2 = r0.A04;
                r2.A0G(AnonymousClass7Kx.A09((Object) null));
                int A032 = r0.A01.A03(15);
                if (A032 != 0) {
                    r2.A0G(AnonymousClass7Kx.A0B((Object) null, new C1373588g(A032)));
                    return;
                }
                try {
                    C120967Dk A05 = r0.A08.A05("BIO", Collections.emptyList());
                    Bundle A06 = C18180wK.A06();
                    A06.putString("AUTH_METHOD_TYPE", "BIO");
                    A06.putString("PAYMENT_TYPE", str3);
                    C86154wM.A1E(A06, (FBPayLoggerData) C18240wQ.A0D(bundle2, "logger_data"));
                    C107266gT r8 = new C107266gT(A06);
                    Bundle bundle3 = r8.A01;
                    AnonymousClass7Hq.A03(bundle3, str2);
                    if ("SETUP_PIN_TO_CREATE_BIO_HUB".equals(str2)) {
                        str = "CREATE_BIO";
                    } else {
                        str = "VERIFY_BIO";
                    }
                    AnonymousClass7Hq.A04(bundle3, str);
                    PttPayload byBio = PttPayload.byBio(C1198677j.A00(), r0.A00.getPackageName(), A05.A07, Collections.emptyList());
                    C121157Ek r4 = r0.A07;
                    HashSet A0u = C18200wM.A0u();
                    Collections.addAll(A0u, new C120967Dk[]{r9, A05});
                    IDxSCallbackShape308S0200000_2_I2 iDxSCallbackShape308S0200000_2_I2 = new IDxSCallbackShape308S0200000_2_I2(0, r0, r8);
                    C120977Dl r92 = new C120977Dl(C116986xw.A00(iDxSCallbackShape308S0200000_2_I2, Collections.unmodifiableSet(A0u)), byBio, "CREATE_AUTH_TICKET_BASED_FACTOR", C86134wK.A0n(bundle3), (String) null, (String) null, (String) null, C121257Ff.A00(bundle3), Collections.unmodifiableSet(A0u));
                    C104996ci r14 = r4.A01;
                    IDxFunctionShape17S1200000_2_I2 iDxFunctionShape17S1200000_2_I2 = new IDxFunctionShape17S1200000_2_I2(r4, r92, str3, 8);
                    AnonymousClass76O r12 = r4.A00;
                    M5J A033 = new C92955kJ(iDxFunctionShape17S1200000_2_I2, r12, r12, r14, r92, r92).A03();
                    C121157Ek.A01(A033, r12);
                    C880856r.A05(A033, r2, r0, 181);
                    AnonymousClass7Kz.A07().A07.Bb8("create_biometric", C121257Ff.A00(bundle3));
                } catch (Exception e) {
                    AnonymousClass0LU.A0E("DefaultAuthTicketManager", "create AT Safe", e);
                    r2.A0G(AnonymousClass7Kx.A0B((Object) null, new C1373588g("Unable create auth ticket", 103)));
                }
            } else {
                AnonymousClass583 r02 = (AnonymousClass583) this.A00;
                C121277Fh.A02(r02.A02, r02.A04, C86114wI.A0Q(this, 180));
            }
        } else {
            C143688h9 r22 = AnonymousClass7Kz.A07().A07;
            Bundle bundle4 = ((C107266gT) this.A01).A01;
            r22.Bb8("fbpay_remove_biometric", C121257Ff.A00(bundle4));
            AnonymousClass583 r6 = (AnonymousClass583) this.A00;
            C121157Ek r7 = r6.A07;
            String str4 = this.A03;
            String str5 = this.A02;
            AnonymousClass7HL r82 = r6.A08;
            PttPayload deleteBio = PttPayload.deleteBio(str5);
            C120967Dk r03 = r10.A01;
            r03.getClass();
            C120967Dk[] r1 = {r03};
            HashSet A0u2 = C18200wM.A0u();
            Collections.addAll(A0u2, r1);
            M5J A042 = r7.A04(C120977Dl.A00(new IDxSCallbackShape852S0100000_2_I2(r82, 1), deleteBio, "REVOKE_AUTH_TICKET", C86134wK.A0n(bundle4), (String) null, (String) null, (String) null, C121257Ff.A00(bundle4), A0u2), str4, str5);
            r6.A03.A0K(A042, C86164wN.A0O(A042, this, 14));
        }
    }
}
