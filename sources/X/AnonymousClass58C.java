package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1400000_I2;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import com.instagram.archive.data.ArchiveStoryRepository;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0111000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.58C  reason: invalid class name */
public final class AnonymousClass58C extends C62793ak {
    public final ArchiveStoryRepository A00;
    public final C11630kW A01 = new C130357pp(this);
    public final UserSession A02;
    public final String A03;
    public final C86074wE A04;
    public final C86094wG A05;
    public final boolean A06;
    public final boolean A07;

    public static final void A01(AnonymousClass58C r13, C62903b6 r14) {
        Object value;
        Object value2;
        KtCSuperShape0S1400000_I2 A002;
        if (r14 instanceof AnonymousClass1jA) {
            C86074wE r3 = r13.A04;
            do {
                value2 = r3.getValue();
                KtCSuperShape0S1400000_I2 ktCSuperShape0S1400000_I2 = (KtCSuperShape0S1400000_I2) value2;
                UserSession userSession = r13.A02;
                boolean A0E = C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36322924969401890L);
                Integer num = AnonymousClass006.A0C;
                if (!A0E) {
                    AnonymousClass37M r0 = (AnonymousClass37M) ((AnonymousClass1jA) r14).A00;
                    A002 = KtCSuperShape0S1400000_I2.A00(ktCSuperShape0S1400000_I2, r0.A00, num, (Integer) null, (String) null, r0.A01, 24);
                } else {
                    A002 = KtCSuperShape0S1400000_I2.A00(ktCSuperShape0S1400000_I2, (BKU) null, num, (Integer) null, (String) null, ((AnonymousClass37M) ((AnonymousClass1jA) r14).A00).A01, 26);
                }
            } while (!r3.ADi(value2, A002));
        } else if (r14 instanceof AnonymousClass1jB) {
            C86074wE r2 = r13.A04;
            do {
                value = r2.getValue();
            } while (!r2.ADi(value, KtCSuperShape0S1400000_I2.A00((KtCSuperShape0S1400000_I2) value, (BKU) null, AnonymousClass006.A00, (Integer) null, (String) null, (Map) null, 30)));
        }
    }

    public final void A02(boolean z, boolean z2) {
        Object value;
        UserSession userSession = this.A02;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass0TJ r5 = AnonymousClass0TJ.A05;
        if (!C63803iN.A0E(r5, userSession, 36322924969336353L) || ((KtCSuperShape0S1400000_I2) this.A04.getValue()).A01 != AnonymousClass006.A01) {
            C86074wE r4 = this.A04;
            do {
                value = r4.getValue();
            } while (!r4.ADi(value, KtCSuperShape0S1400000_I2.A00((KtCSuperShape0S1400000_I2) value, (BKU) null, AnonymousClass006.A01, (Integer) null, (String) null, (Map) null, 30)));
            boolean A0E = C63803iN.A0E(r5, userSession, 36322924969336353L);
            C83224qz A002 = AnonymousClass3J5.A00(this);
            if (A0E) {
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0111000_I2((Object) this, (C146958n9) null, 3, z2), A002, 3);
            } else {
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0101000_I2_1(this, (C146958n9) null, 3), A002, 3);
            }
        }
        if (z) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0101000_I2_1(this, (C146958n9) null, 2), AnonymousClass3J5.A00(this), 3);
        }
    }

    public final void onCleared() {
        this.A00.onUserSessionWillEnd(false);
    }

    public AnonymousClass58C(ArchiveStoryRepository archiveStoryRepository, UserSession userSession, String str, boolean z, boolean z2) {
        this.A02 = userSession;
        this.A00 = archiveStoryRepository;
        this.A06 = z;
        this.A03 = str;
        this.A07 = z2;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S1400000_I2((BKU) null, (Integer) null, (Integer) null, (String) null, (Map) null, (DefaultConstructorMarker) null, 31, 2));
        this.A04 = A0z;
        IDxFlowShape94S0200000_2_I2 iDxFlowShape94S0200000_2_I2 = new IDxFlowShape94S0200000_2_I2(13, (Object) A0z, (Object) this);
        this.A05 = C25753DrP.A04(new KtCSuperShape0S1400000_I2(), AnonymousClass3J5.A00(this), iDxFlowShape94S0200000_2_I2, AnonymousClass74I.A01);
        AnonymousClass3J5.A01(this, new KtSLambdaShape5S0200000_I2(this, (C146958n9) null, 39), AnonymousClass7E6.A00(userSession).A02(C131167rW.class), 34);
    }

    public static final List A00(UserSession userSession, Map map, boolean z) {
        List list;
        Collection<AnonymousClass79P> values = map.values();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (AnonymousClass79P r0 : values) {
            C22179CKt cKt = (C22179CKt) r0.A00;
            Reel reel = (Reel) r0.A01;
            if (reel.A0r(userSession)) {
                list = AnonymousClass0ZV.A00;
            } else if (!reel.A0s(userSession)) {
                List A0P = reel.A0P(userSession);
                C04220Ms.A06(A0P);
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                for (Object next : A0P) {
                    BKH bkh = (BKH) next;
                    if (!z || bkh.A0G() != C23920D1i.CLOSE_FRIENDS) {
                        A0v2.add(next);
                    }
                }
                ArrayList A0x = AnonymousClass0wJ.A0x(A0v2, 10);
                int i = 0;
                for (Object next2 : A0v2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C06750aI.A1A();
                        throw null;
                    }
                    BKH bkh2 = (BKH) next2;
                    C04220Ms.A04(bkh2);
                    A0x.add(new AnonymousClass5vC(reel, bkh2, i, cKt.A01));
                    i = i2;
                }
                List A0s = C18200wM.A0s(A0x);
                Iterator A0t = C86134wK.A0t(reel.A1A);
                while (A0t.hasNext()) {
                    Number number = (Number) A0t.next();
                    C04220Ms.A04(number);
                    A0s.add(new AnonymousClass5vE(reel, number.intValue(), cKt.A01));
                }
                list = A0s;
            } else {
                AnonymousClass8bH A0C = AnonymousClass8bI.A0C(0, cKt.A00);
                ArrayList A0x2 = AnonymousClass0wJ.A0x(A0C, 10);
                Iterator it = A0C.iterator();
                while (it.hasNext()) {
                    A0x2.add(new AnonymousClass5vD(reel, ((C1367083z) it).A00(), cKt.A01));
                }
                list = A0x2;
            }
            C000300e.A0r(list, A0v);
        }
        return A0v;
    }
}
