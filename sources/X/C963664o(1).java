package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2;
import com.instagram.api.schemas.LineType;
import com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleNetworkRequest$2;
import com.instagram.service.session.UserSession;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape3S0300000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.64o  reason: invalid class name and case insensitive filesystem */
public final class C963664o extends C134647y7 implements Closeable {
    public final AnonymousClass3V6 A00 = AnonymousClass2LT.A00();
    public final C21839C2o A01;
    public final UserSession A02;
    public final C20309BYl A03 = C20309BYl.A00();
    public final String A04;
    public final String A05;
    public final C84714tk A06;
    public final C86074wE A07;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r5 = X.C86164wN.A06(r4, r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            X.4wE r0 = r7.A07
            java.lang.Object r0 = r0.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r0 = r0.A01
            java.util.Iterator r6 = X.C86144wL.A0y(r0)
            r5 = 0
        L_0x0013:
            boolean r1 = r6.hasNext()
            r0 = -1
            if (r1 == 0) goto L_0x004d
            java.util.List r4 = X.AnonymousClass5I1.A00(r6)
            java.util.Iterator r3 = r4.iterator()
            r2 = 0
        L_0x0023:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0048
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2 r1 = X.AnonymousClass5IF.A00(r3)
            java.lang.String r0 = r1.A01()
            boolean r0 = X.C04220Ms.A0I(r0, r8)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = r1.A02()
            boolean r0 = X.C04220Ms.A0I(r0, r8)
            if (r0 != 0) goto L_0x0044
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0044:
            if (r2 < 0) goto L_0x0048
            int r5 = r5 + r2
            return r5
        L_0x0048:
            int r5 = X.C86164wN.A06(r4, r5)
            goto L_0x0013
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C963664o.A01(java.lang.String):int");
    }

    public final AnonymousClass9BI A02(String str) {
        C90535Mj r0;
        BKU bku;
        Iterator A0y = C86144wL.A0y(((KtCSuperShape0S0400000_I2) this.A07.getValue()).A01);
        while (A0y.hasNext()) {
            Iterator it = AnonymousClass5I1.A00(A0y).iterator();
            while (true) {
                if (it.hasNext()) {
                    KtCSuperShape6S0100000_I2 A002 = AnonymousClass5IF.A00(it);
                    if (KtCSuperShape6S0100000_I2.A00(0, A002)) {
                        if (C04220Ms.A0I(A002.A01(), str)) {
                            return ((BKU) A002.A00).A2A();
                        }
                        if (C04220Ms.A0I(A002.A02(), str)) {
                            C90555Ml r02 = ((BKU) A002.A00).A0f.A1J;
                            if (r02 == null || (r0 = r02.A03) == null || (bku = r0.A02) == null) {
                                return null;
                            }
                            return bku.A2A();
                        }
                    }
                }
            }
        }
        return null;
    }

    public final Object A03(C146958n9 r5, boolean z, boolean z2) {
        AnonymousClass3V6 r3 = this.A00;
        BarcelonaPermalinkRepository$handleNetworkRequest$2 barcelonaPermalinkRepository$handleNetworkRequest$2 = new BarcelonaPermalinkRepository$handleNetworkRequest$2(this, (C146958n9) null, z2, z);
        Unit unit = Unit.A00;
        Object A002 = r3.A00(unit, r5, barcelonaPermalinkRepository$handleNetworkRequest$2);
        if (A002 != D0E.COROUTINE_SUSPENDED) {
            return unit;
        }
        return A002;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C963664o(C21839C2o c2o, UserSession userSession, String str, String str2) {
        super(C28174Ezk.A00(168), AnonymousClass2TZ.A00(1340669765));
        C1198477g A002 = AnonymousClass6NK.A00(userSession);
        C04220Ms.A0B(A002, 5);
        this.A05 = str;
        this.A04 = str2;
        this.A02 = userSession;
        this.A01 = c2o;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0400000_I2((KtCSuperShape0S2000000_I2) null, (KtCSuperShape0S2100000_I2) null, (Integer) null, (List) null, (DefaultConstructorMarker) null, 15, 7));
        this.A07 = A0z;
        this.A06 = C25240DiL.A01(C25239DiK.A01(new KtSLambdaShape16S0201000_I2_2((C146958n9) null, C25240DiL.A01(C25239DiK.A01(new KtSLambdaShape9S0301000_I2_1((Object) AnonymousClass3LY.A00(userSession), (Object) C25807DsL.A01(new KtSLambdaShape3S0300000_I2(this, (C146958n9) null, 3, 42), A0z, A002.A01), (C146958n9) null, 48))))));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 19), this.A01, 3);
    }

    public static final List A00(C963664o r16, String str, List list, boolean z) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator A0q = C86154wM.A0q(((KtCSuperShape0S0400000_I2) r16.A07.getValue()).A01);
        while (A0q.hasNext()) {
            AnonymousClass5I1 r6 = (AnonymousClass5I1) A0q.next();
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            AnonymousClass5HQ r2 = r6.A00;
            for (AnonymousClass5IF r1 : r2.A03) {
                KtCSuperShape6S0100000_I2 ktCSuperShape6S0100000_I2 = r1.A00;
                if (C04220Ms.A0I(ktCSuperShape6S0100000_I2.A01(), str)) {
                    List list2 = list;
                    if (C18190wL.A1a(list2)) {
                        A0v2.addAll(list2);
                    } else {
                        LineType lineType = r1.A01;
                        List list3 = r1.A04;
                        A0v2.add(new AnonymousClass5IF(ktCSuperShape6S0100000_I2, lineType, r1.A02, r1.A03, list3, r1.A07, r1.A05, z));
                    }
                } else {
                    A0v2.add(r1);
                }
            }
            A0v.add(new AnonymousClass5I1(new AnonymousClass5HQ(r2.A00, r2.A02, r2.A01, A0v2), r6.A01));
        }
        return A0v;
    }
}
