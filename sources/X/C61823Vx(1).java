package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.redex.IDxObjectShape119S0200000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3Vx  reason: invalid class name and case insensitive filesystem */
public abstract class C61823Vx {
    public static C61823Vx A01;
    public C81634o7 A00;

    public final void A05(UserSession userSession) {
        AnonymousClass0gN.A00().AKp(new C25161md((C28181to) this, userSession));
    }

    public final void A07(UserSession userSession, String str, int i) {
        AnonymousClass3Ie A03;
        boolean z;
        C62253Xz r2;
        UserSession userSession2 = userSession;
        int i2 = i;
        if (i2 != 1) {
            A03 = A04(userSession2);
        } else {
            A03 = A03();
        }
        if (A03 != null) {
            Context context = A03.A00;
            String str2 = str;
            if (i2 != 1) {
                z = false;
                C551131u.A01 = AnonymousClass2R1.A00(context, userSession2, (C62253Xz) null, str2, C63383hO.A01(11, 9, 12), (String) null, 2, true, false);
                C18240wQ.A1D(C09120et.A02().A0D, str2);
                r2 = C551131u.A01;
            } else {
                z = false;
                C551131u.A00 = AnonymousClass2R1.A00(context, userSession2, (C62253Xz) null, "", str2, (String) null, 1, true, false);
                C18240wQ.A1D(C09120et.A02().A0B, str2);
                r2 = C551131u.A00;
            }
            if (r2 != null) {
                AnonymousClass0TM r1 = new AnonymousClass0TM();
                r1.A03 = true;
                r1.A00 = 30000;
                r1.A01 = new C67663zv();
                AnonymousClass0wJ.A1L(C09120et.A02().A0C, z);
                C67603zp r0 = r2.A00;
                r0.A0A();
                r0.A06().updateConfigs(r1);
            }
        }
    }

    public final void A08(UserSession userSession, boolean z) {
        C28181to r2 = (C28181to) this;
        AnonymousClass0gN.A00().AKp(new C25241ml(r2, r2.A03(), r2.A04(userSession), userSession, z));
    }

    public static C61823Vx A01() {
        return A01;
    }

    public final AnonymousClass3Ie A03() {
        C28181to r0 = (C28181to) this;
        if (r0.A02 != null) {
            return r0.A02;
        }
        synchronized (r0.A01) {
            if (r0.A02 != null) {
                AnonymousClass3Ie r02 = r0.A02;
                return r02;
            }
            String A0g = C18200wM.A0g();
            if (TextUtils.isEmpty(A0g)) {
                A0g = "EMPTY_DEVICE_ID";
                AnonymousClass0LU.A0N("QuickExperimentManagerFactoryImpl", "Intializing device MetaConfig with empty id:%s", A0g);
            }
            C13270nL r8 = C10260hz.A00;
            String A002 = AnonymousClass2R0.A00();
            Context context = r0.A00;
            String[] strArr = C551231v.A00;
            HashSet A0u = C18200wM.A0u();
            for (String add : strArr) {
                A0u.add(add);
            }
            r0.A02 = new AnonymousClass3Ie(context, r8, AnonymousClass2R1.A00(context, r8, (C62253Xz) null, "", A0g, A002, 1, false, C18210wN.A1S(36323977236455631L)), A0g, Collections.unmodifiableSet(A0u));
            AnonymousClass3Ie r03 = r0.A02;
            return r03;
        }
    }

    public final AnonymousClass3Ie A04(UserSession userSession) {
        return (AnonymousClass3Ie) userSession.A01(AnonymousClass3Ie.class, new IDxObjectShape119S0200000_1_I2(2, this, userSession));
    }

    public final C10060hf A02(C10300i6 r3, C07940cT r4) {
        AnonymousClass3Ie A03;
        if (r4.ordinal() == 1) {
            A03 = A03();
        } else if (r3 instanceof UserSession) {
            A03 = A04(C05030Qo.A02(r3));
        } else {
            A03 = null;
        }
        A03.getClass();
        H8S.A01.getValue();
        return A03.A01();
    }

    public final void A06(UserSession userSession) {
        AnonymousClass3Ie A03 = A03();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(A03.A01());
        AnonymousClass3Ie A04 = A04(userSession);
        if (A04 != null) {
            A0v.add(A04.A01());
        }
        Iterator it = A0v.iterator();
        while (it.hasNext()) {
            try {
                ((C10060hf) it.next()).A02.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public final void A09(UserSession userSession, boolean z) {
        AnonymousClass3Ie A04 = A04(userSession);
        if (A04 != null) {
            C62253Xz r3 = A04.A01;
            C67603zp r0 = r3.A00;
            r0.A0A();
            r0.A06().fetchNames(z, new C67673zx(r3, 0, z));
        }
    }
}
