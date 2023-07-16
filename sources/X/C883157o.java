package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2102000_I2;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.57o  reason: invalid class name and case insensitive filesystem */
public final class C883157o extends C62793ak {
    public final C86094wG A00;
    public final UserSession A01;
    public final C86074wE A02;

    public static final C142338eh A00(BKU bku) {
        List list;
        if (bku == null) {
            return null;
        }
        if (bku.A44()) {
            BKN bkn = bku.A0f;
            String str = bkn.A4Y;
            C04220Ms.A06(str);
            int A1j = bku.A1j();
            int A1i = bku.A1i();
            String str2 = bkn.A46;
            C36483JXj BL2 = bku.BL2();
            C04220Ms.A06(BL2);
            return new KtCSuperShape0S2102000_I2(BL2, str, str2, A1j, A1i);
        }
        ImageInfo A2K = bku.A2K();
        if (A2K == null || (list = A2K.A05) == null) {
            return null;
        }
        BKN bkn2 = bku.A0f;
        String str3 = bkn2.A4Y;
        C04220Ms.A06(str3);
        return new KtCSuperShape0S2102000_I2(str3, bkn2.A46, AnonymousClass7C0.A00(list), bku.A1j(), bku.A1i());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r6 < 0) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C883157o(com.instagram.service.session.UserSession r9, java.lang.String r10, java.lang.String r11) {
        /*
            r8 = this;
            r8.<init>()
            r8.A01 = r9
            r5 = 0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2
            r0.<init>()
            X.Enn r0 = X.C18190wL.A0z(r0)
            r8.A02 = r0
            r8.A00 = r0
            X.Awj r4 = X.C19462Awj.A01(r9)
            X.C04220Ms.A06(r4)
            X.BKU r0 = r4.A05(r10)
            if (r0 == 0) goto L_0x007a
            java.util.List r0 = r0.A3I()
            if (r0 == 0) goto L_0x007a
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r0.iterator()
        L_0x002e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r1.next()
            X.BKU r0 = (X.BKU) r0
            X.8eh r0 = A00(r0)
            if (r0 == 0) goto L_0x002e
            r7.add(r0)
            goto L_0x002e
        L_0x0044:
            r6 = 0
            java.util.Iterator r1 = r7.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r0 = r1.next()
            X.8eh r0 = (X.C142338eh) r0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2102000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2102000_I2) r0
            java.lang.String r0 = r0.A04
            boolean r0 = X.C04220Ms.A0I(r0, r11)
            if (r0 == 0) goto L_0x00b3
            if (r6 >= r5) goto L_0x0062
        L_0x0061:
            r6 = 0
        L_0x0062:
            X.4wE r3 = r8.A02
        L_0x0064:
            java.lang.Object r2 = r3.getValue()
            X.8s2 r1 = X.AnonymousClass7C0.A00(r7)
            X.C04220Ms.A0B(r1, r5)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2
            r0.<init>((X.AnonymousClass8s2) r1, (int) r6)
            boolean r0 = r3.ADi(r2, r0)
            if (r0 == 0) goto L_0x0064
        L_0x007a:
            X.4wG r0 = r8.A00
            java.lang.Object r0 = r0.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2) r0
            java.lang.Object r0 = r0.A01
            X.8s2 r0 = (X.AnonymousClass8s2) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00b2
            X.BKU r0 = r4.A05(r11)
            X.8eh r4 = A00(r0)
            if (r4 == 0) goto L_0x00b2
            X.4wE r3 = r8.A02
        L_0x0098:
            java.lang.Object r2 = r3.getValue()
            X.8eh[] r0 = new X.C142338eh[]{r4}
            X.8sK r1 = X.AnonymousClass7C0.A02(r0)
            X.C04220Ms.A0B(r1, r5)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2
            r0.<init>((X.AnonymousClass8s2) r1, (int) r5)
            boolean r0 = r3.ADi(r2, r0)
            if (r0 == 0) goto L_0x0098
        L_0x00b2:
            return
        L_0x00b3:
            int r6 = r6 + 1
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C883157o.<init>(com.instagram.service.session.UserSession, java.lang.String, java.lang.String):void");
    }
}
