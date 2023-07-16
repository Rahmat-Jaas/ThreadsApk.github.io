package X;

import java.net.URI;
import java.util.List;
import java.util.Map;

/* renamed from: X.44h  reason: invalid class name and case insensitive filesystem */
public final class C685644h implements C83444rO {
    public final C61793Vp A00;
    public final AnonymousClass3G1 A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        r0 = (r4 = (com.instagram.service.session.UserSession) r4).getUserId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C685644h(X.C10300i6 r4) {
        /*
            r3 = this;
            r0 = 1
            X.C04220Ms.A0B(r4, r0)
            X.3Vp r2 = X.C61793Vp.A00(r4)
            X.C04220Ms.A06(r2)
            X.3G1 r1 = X.C48992qf.A00(r4)
            r0 = 3
            X.C04220Ms.A0B(r1, r0)
            r3.<init>()
            r3.A00 = r2
            r3.A01 = r1
            boolean r0 = r4 instanceof com.instagram.service.session.UserSession
            r3.A03 = r0
            if (r0 == 0) goto L_0x002a
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            if (r4 == 0) goto L_0x002a
            java.lang.String r0 = r4.getUserId()
            if (r0 != 0) goto L_0x002c
        L_0x002a:
            java.lang.String r0 = "0"
        L_0x002c:
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C685644h.<init>(X.0i6):void");
    }

    public final void A9t(URI uri, List list) {
        C04220Ms.A0B(list, 1);
        if (C48982qe.A00(uri)) {
            if (this.A03) {
                A01(C28174Ezk.A00(318), this.A00.A04, list);
            }
            A01("X-MID", this.A00.A01.A00, list);
            A00(this, list);
            list.add(new AnonymousClass3Ud("IG-INTENDED-USER-ID", this.A02));
        }
    }

    public final void D8b(URI uri, Map map) {
        C04220Ms.A0B(map, 1);
        if (C48982qe.A00(uri)) {
            String A002 = C48972qd.A00("IG-Set-Authorization", map);
            if (A002 != null) {
                this.A00.A05(A002);
            }
            String A003 = C48972qd.A00("IG-Set-X-MID", map);
            if (A003 != null) {
                this.A00.A04(A003);
            }
            String A004 = C48972qd.A00("IG-SET-IG-U-IG-DIRECT-REGION-HINT", map);
            if (A004 != null) {
                AnonymousClass3G1 r1 = this.A01;
                if (!A004.equals(r1.A00)) {
                    r1.A00 = A004;
                    C18180wK.A0v(r1.A05.edit(), "IG-U-IG-DIRECT-REGION-HINT", r1.A00);
                }
            }
            String A005 = C48972qd.A00("IG-SET-IG-U-SHBID", map);
            if (A005 != null) {
                AnonymousClass3G1 r12 = this.A01;
                if (!A005.equals(r12.A03)) {
                    r12.A03 = A005;
                    C18180wK.A0v(r12.A05.edit(), "IG-U-SHBID", r12.A03);
                }
            }
            String A006 = C48972qd.A00("IG-SET-IG-U-SHBTS", map);
            if (A006 != null) {
                AnonymousClass3G1 r13 = this.A01;
                if (!A006.equals(r13.A04)) {
                    r13.A04 = A006;
                    C18180wK.A0v(r13.A05.edit(), "IG-U-SHBTS", r13.A04);
                }
            }
            String A007 = C48972qd.A00("IG-SET-IG-U-DS-USER-ID", map);
            if (A007 != null) {
                AnonymousClass3G1 r14 = this.A01;
                if (!A007.equals(r14.A01)) {
                    r14.A01 = A007;
                    C18180wK.A0v(r14.A05.edit(), "IG-U-DS-USER-ID", r14.A01);
                }
            }
            String A008 = C48972qd.A00("IG-SET-IG-U-RUR", map);
            if (A008 != null) {
                AnonymousClass3G1 r15 = this.A01;
                if (!A008.equals(r15.A02)) {
                    r15.A02 = A008;
                }
            }
        }
    }

    public static void A00(C685644h r2, List list) {
        AnonymousClass3G1 r22 = r2.A01;
        A01("IG-U-IG-DIRECT-REGION-HINT", r22.A00, list);
        A01("IG-U-SHBID", r22.A03, list);
        A01("IG-U-SHBTS", r22.A04, list);
        A01("IG-U-DS-USER-ID", r22.A01, list);
        A01("IG-U-RUR", r22.A02, list);
    }

    public static final void A01(String str, String str2, List list) {
        if (str2 != null && str2.length() != 0) {
            list.add(new AnonymousClass3Ud(str, str2));
        }
    }
}
