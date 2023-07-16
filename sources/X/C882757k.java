package X;

import android.content.Context;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import com.instagram.barcelona.profile.followinggraph.data.FollowingGraphRepository;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2;
import kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16;

/* renamed from: X.57k  reason: invalid class name and case insensitive filesystem */
public final class C882757k extends C62793ak {
    public final FollowingGraphRepository A00;
    public final AnonymousClass3V6 A01 = AnonymousClass2LT.A00();
    public final AnonymousClass3V6 A02 = AnonymousClass2LT.A00();
    public final UserSession A03;
    public final String A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final C04530Oa A08;
    public final C86074wE A09;
    public final C86074wE A0A;
    public final C86074wE A0B;
    public final C86074wE A0C;
    public final C86074wE A0D;
    public final C86074wE A0E;
    public final C86094wG A0F;
    public final boolean A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (r0 != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C304621k r6) {
        /*
            r5 = this;
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            com.instagram.barcelona.profile.followinggraph.data.FollowingGraphRepository r0 = r5.A00
            com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource r2 = com.instagram.barcelona.profile.followinggraph.data.FollowingGraphRepository.A00(r6, r0)
            X.4wE r1 = r2.A06
            java.lang.Object r0 = r1.getValue()
            X.33u r0 = (X.C555833u) r0
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r0
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r0 instanceof X.AnonymousClass1jC
            r1 = 1
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            java.lang.String r0 = r2.A00
            if (r0 != 0) goto L_0x0030
            if (r1 == 0) goto L_0x0041
        L_0x0030:
            java.util.Map r4 = r5.A05
            java.lang.Object r0 = r4.get(r6)
            X.8sG r0 = (X.C148838sG) r0
            r1 = 1
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.isActive()
            if (r0 != r1) goto L_0x0042
        L_0x0041:
            return
        L_0x0042:
            X.4qz r3 = X.AnonymousClass3J5.A00(r5)
            r2 = 0
            r0 = 13
            kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2
            r1.<init>((java.lang.Object) r6, (java.lang.Object) r5, (X.C146958n9) r2, (int) r0)
            r0 = 3
            X.8sG r0 = X.C25237DiI.A00(r2, r2, r1, r3, r0)
            r4.put(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C882757k.A00(X.21k):void");
    }

    public /* synthetic */ C882757k(Context context, C11630kW r36, UserSession userSession, String str) {
        UserSession userSession2 = userSession;
        String str2 = str;
        FollowingGraphRepository followingGraphRepository = new FollowingGraphRepository(C18230wP.A09(context), userSession2, str2, C18230wP.A0n(r36));
        this.A03 = userSession2;
        this.A04 = str2;
        this.A00 = followingGraphRepository;
        C27457Enn A0z = C18190wL.A0z(DIV.A01);
        this.A0E = A0z;
        C27457Enn A0z2 = C18190wL.A0z(0);
        this.A0D = A0z2;
        C27457Enn A0z3 = C18190wL.A0z(AnonymousClass4WJ.A0A());
        this.A0C = A0z3;
        C304621k r16 = C304621k.Follower;
        C27457Enn A0z4 = C18190wL.A0z(r16);
        this.A09 = A0z4;
        C970867w r26 = C970867w.None;
        C27457Enn A0z5 = C18190wL.A0z(r26);
        this.A0B = A0z5;
        C27457Enn A0z6 = C18190wL.A0z(r26);
        this.A0A = A0z6;
        this.A07 = C18220wO.A0y();
        this.A05 = C18220wO.A0y();
        C86094wG r5 = followingGraphRepository.A07;
        Pair A0p = C18180wK.A0p(r16, r5);
        C304621k r0 = C304621k.Following;
        C86094wG r3 = followingGraphRepository.A08;
        Pair A0p2 = C18180wK.A0p(r0, r3);
        C304621k r02 = C304621k.Pending;
        C86094wG r1 = followingGraphRepository.A09;
        this.A06 = AnonymousClass4WJ.A0H(A0p, A0p2, C18180wK.A0p(r02, r1));
        this.A0G = C19573AyZ.A07(userSession2, str2);
        this.A08 = AnonymousClass0OY.A02(new KtLambdaShape36S0100000_I2_16(this, 10));
        C86094wG r18 = r5;
        C86094wG r19 = r3;
        IDxFlowShape94S0200000_2_I2 iDxFlowShape94S0200000_2_I2 = new IDxFlowShape94S0200000_2_I2(21, (Object) new C84714tk[]{A0z, r18, r19, r1, A0z3, A0z5, A0z2, A0z4, A0z6}, (Object) this);
        this.A0F = C25753DrP.A04(new AnonymousClass5Hg(r26, r26, r16, "", AnonymousClass4WJ.A0A(), (AnonymousClass8s2) this.A08.getValue(), false, false), AnonymousClass3J5.A00(this), iDxFlowShape94S0200000_2_I2, AnonymousClass74I.A00);
        User A0P = C18210wN.A0P(userSession2, str2);
        if (A0P != null && C04220Ms.A0I(A0P.getId(), this.A04)) {
            this.A0E.CrC(A0P);
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 32), AnonymousClass3J5.A00(this), 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 33), AnonymousClass3J5.A00(this), 3);
        Iterator A0q = C86154wM.A0q(this.A08.getValue());
        while (A0q.hasNext()) {
            Object next = A0q.next();
            this.A05.put(next, C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0201000_I2_2(next, (Object) this, (C146958n9) null, 12), AnonymousClass3J5.A00(this), 3));
        }
    }
}
