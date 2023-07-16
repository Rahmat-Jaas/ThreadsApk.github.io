package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape5S0100000_I2;
import com.instagram.barcelona.feed.post.data.PostRepository;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1;

/* renamed from: X.58B  reason: invalid class name */
public final class AnonymousClass58B extends C62793ak {
    public KtCSuperShape5S0100000_I2 A00;
    public final PostRepository A01;
    public final C24805DaJ A02;
    public final C11630kW A03;
    public final UserSession A04;
    public final String A05;
    public final C86074wE A06;
    public final C86094wG A07;
    public final boolean A08;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3 = r4.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.content.Context r5) {
        /*
            r4 = this;
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape5S0100000_I2 r0 = r4.A00
            if (r0 == 0) goto L_0x0028
            com.instagram.service.session.UserSession r3 = r4.A04
            com.instagram.user.model.User r2 = r0.A01(r3)
            if (r2 == 0) goto L_0x0028
            boolean r0 = r2.BRq()
            if (r0 == 0) goto L_0x0029
            X.0kW r0 = r4.A03
            java.lang.String r1 = X.C18230wP.A0n(r0)
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.String r0 = r2.getId()
            X.AnonymousClass6N4.A00(r5, r3, r1, r0)
        L_0x0025:
            A01(r4)
        L_0x0028:
            return
        L_0x0029:
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.String r0 = "post_actions"
            X.C25791Ds4.A01(r5, r3, r2, r0)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58B.A02(android.content.Context):void");
    }

    public /* synthetic */ AnonymousClass58B(C24805DaJ daJ, C11630kW r17, UserSession userSession, String str, boolean z) {
        KtCSuperShape5S0100000_I2 ktCSuperShape5S0100000_I2;
        Object value;
        UserSession userSession2 = userSession;
        PostRepository A002 = C100166Mg.A00(userSession2);
        C04220Ms.A0B(A002, 6);
        String str2 = str;
        this.A05 = str2;
        this.A08 = z;
        this.A04 = userSession2;
        this.A03 = r17;
        this.A02 = daJ;
        this.A01 = A002;
        AnonymousClass0ZV r12 = AnonymousClass0ZV.A00;
        C970367r r9 = C970367r.None;
        C27457Enn A0z = C18190wL.A0z(new AnonymousClass5IS((KtCSuperShape0S1000000_I2) null, r9, r9, r9, r12, false, false));
        this.A06 = A0z;
        this.A07 = C18230wP.A0x((C148838sG) null, A0z);
        BKU A0W = C86114wI.A0W(userSession2, str2);
        if (A0W != null) {
            ktCSuperShape5S0100000_I2 = new KtCSuperShape5S0100000_I2(A0W);
        } else {
            PendingMedia A062 = PendingMediaStore.A01(userSession2).A06(str2);
            if (A062 != null) {
                ktCSuperShape5S0100000_I2 = new KtCSuperShape5S0100000_I2(A062);
            } else {
                ktCSuperShape5S0100000_I2 = null;
            }
        }
        this.A00 = ktCSuperShape5S0100000_I2;
        C86074wE r3 = this.A06;
        do {
            value = r3.getValue();
        } while (!r3.ADi(value, AnonymousClass5IS.A00((KtCSuperShape0S1000000_I2) null, (C970367r) null, (C970367r) null, (C970367r) null, (AnonymousClass5IS) value, A00(this), 124, C18220wO.A1U(this.A00), false)));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0101000_I2_1(this, (C146958n9) null, 48), AnonymousClass3J5.A00(this), 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r1 != true) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.AnonymousClass58B r13) {
        /*
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape5S0100000_I2 r8 = r13.A00
            if (r8 != 0) goto L_0x0007
            X.0ZV r3 = X.AnonymousClass0ZV.A00
        L_0x0006:
            return r3
        L_0x0007:
            r4 = 1
            boolean r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape5S0100000_I2.A00(r4, r8)
            if (r0 == 0) goto L_0x0037
            X.7ot r0 = X.AnonymousClass7ot.A00
            java.util.List r0 = X.C06750aI.A15(r0)
            java.util.List r0 = X.C18180wK.A0n(r0)
        L_0x0018:
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x0020:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0006
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x0020
            r3.add(r1)
            goto L_0x0020
        L_0x0037:
            r7 = 0
            boolean r12 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape5S0100000_I2.A00(r7, r8)
            if (r12 == 0) goto L_0x0073
            com.instagram.service.session.UserSession r0 = r13.A04
            java.lang.Object r1 = r8.A00
            X.BKU r1 = (X.BKU) r1
            boolean r0 = X.C19573AyZ.A00(r1, r0)
            if (r0 == 0) goto L_0x0073
            r0 = 2
            java.util.List[] r3 = new java.util.List[r0]
            X.7ox r2 = X.C130227ox.A00
            if (r12 == 0) goto L_0x0071
            boolean r1 = r1.A4K()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0010000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0010000_I2
            r0.<init>(r1, r4)
        L_0x005a:
            X.8ei[] r0 = new X.C142348ei[]{r2, r0}
            java.util.List r0 = X.AnonymousClass8AP.A0A(r0)
            r3[r7] = r0
            X.7ot r0 = X.AnonymousClass7ot.A00
            java.util.List r0 = X.C06750aI.A15(r0)
        L_0x006a:
            r3[r4] = r0
            java.util.List r0 = X.C06750aI.A17(r3)
            goto L_0x0018
        L_0x0071:
            r0 = 0
            goto L_0x005a
        L_0x0073:
            r10 = 2
            java.util.List[] r3 = new java.util.List[r10]
            com.instagram.service.session.UserSession r6 = r13.A04
            com.instagram.user.model.User r0 = r8.A01(r6)
            if (r0 == 0) goto L_0x0085
            boolean r1 = r0.A3P()
            r0 = 1
            if (r1 == r4) goto L_0x0086
        L_0x0085:
            r0 = 0
        L_0x0086:
            r5 = 0
            if (r0 == 0) goto L_0x0112
            r9 = 0
            com.instagram.user.model.User r11 = r8.A01(r6)
            if (r11 == 0) goto L_0x00aa
            X.D0g r2 = r11.Aj4()
            r1 = -1
            if (r2 == 0) goto L_0x00aa
            int r0 = r2.ordinal()
            if (r0 == r1) goto L_0x00aa
            if (r0 == r7) goto L_0x00aa
            if (r0 == r4) goto L_0x00aa
            boolean r0 = r11.A3Q()
            X.5Lq r9 = new X.5Lq
            r9.<init>(r2, r0)
        L_0x00aa:
            com.instagram.user.model.User r0 = r8.A01(r6)
            if (r0 != 0) goto L_0x0108
            r1 = 0
        L_0x00b1:
            X.8ei[] r0 = new X.C142348ei[]{r9, r1}
            java.util.List r0 = X.AnonymousClass8AP.A0A(r0)
            r3[r7] = r0
            if (r12 == 0) goto L_0x00fe
            java.lang.Object r0 = r8.A00
            X.BKU r0 = (X.BKU) r0
            X.BKN r0 = r0.A0f
            X.5Ml r0 = r0.A1J
            if (r0 == 0) goto L_0x00fe
            X.5Kk r0 = r0.A00
            if (r0 == 0) goto L_0x00fe
            boolean r0 = r0.A00
            if (r0 != r4) goto L_0x00fe
            X.7ov r2 = X.C130207ov.A00
        L_0x00d1:
            X.8ei r2 = (X.C142348ei) r2
            com.instagram.user.model.User r0 = r8.A01(r6)
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r0.BRq()
        L_0x00dd:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0010000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0010000_I2
            r1.<init>(r0, r7)
            com.instagram.user.model.User r0 = r8.A01(r6)
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r0.A3P()
            if (r0 != r4) goto L_0x00fa
        L_0x00ee:
            X.7oy r0 = X.C130237oy.A00
            X.8ei[] r0 = new X.C142348ei[]{r2, r5, r0}
            java.util.List r0 = X.AnonymousClass8AP.A0A(r0)
            goto L_0x006a
        L_0x00fa:
            r5 = r1
            goto L_0x00ee
        L_0x00fc:
            r0 = 0
            goto L_0x00dd
        L_0x00fe:
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x0105
            X.7ow r2 = X.C130217ow.A00
            goto L_0x00d1
        L_0x0105:
            X.7ou r2 = X.C130197ou.A00
            goto L_0x00d1
        L_0x0108:
            boolean r0 = r0.A38()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0010000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0010000_I2
            r1.<init>(r0, r10)
            goto L_0x00b1
        L_0x0112:
            r9 = r5
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58B.A00(X.58B):java.util.List");
    }

    public static final void A01(AnonymousClass58B r11) {
        Object value;
        C86074wE r2 = r11.A06;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, AnonymousClass5IS.A00((KtCSuperShape0S1000000_I2) null, (C970367r) null, (C970367r) null, (C970367r) null, (AnonymousClass5IS) value, (List) null, 123, false, true)));
    }
}
