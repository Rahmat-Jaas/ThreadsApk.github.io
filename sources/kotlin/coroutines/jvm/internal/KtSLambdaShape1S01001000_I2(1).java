package kotlin.coroutines.jvm.internal;

import X.AnonymousClass061;
import X.AnonymousClass062;
import X.AnonymousClass0YP;
import X.C107706hB;
import X.C110466lj;
import X.C146958n9;
import X.C171189wD;
import X.C18220wO;
import X.C2M;
import X.C39142Kno;
import X.C83224qz;
import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Unit;

public class KtSLambdaShape1S01001000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public final int A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S01001000_I2(Context context, C107706hB r3, C171189wD r4, C2M c2m, UserSession userSession, C146958n9 r7, int i) {
        super(2, r7);
        this.A0B = i;
        this.A02 = c2m;
        this.A03 = r4;
        this.A04 = userSession;
        this.A01 = context;
        this.A0A = r3;
    }

    public final C146958n9 create(Object obj, C146958n9 r12) {
        int i;
        UserSession userSession;
        C2M c2m;
        C171189wD r5;
        C107706hB r4;
        Context context;
        C146958n9 r8 = r12;
        switch (this.A0B) {
            case 0:
                return new KtSLambdaShape1S01001000_I2((AnonymousClass061) this.A03, (AnonymousClass062) this.A04, r12, (AnonymousClass0YP) this.A02, (C83224qz) this.A01);
            case 1:
                c2m = (C2M) this.A02;
                r5 = (C171189wD) this.A03;
                userSession = (UserSession) this.A04;
                context = (Context) this.A01;
                r4 = (C107706hB) this.A0A;
                i = 1;
                break;
            case 2:
                c2m = (C2M) this.A02;
                r5 = (C171189wD) this.A03;
                userSession = (UserSession) this.A04;
                context = (Context) this.A01;
                r4 = (C107706hB) this.A0A;
                i = 2;
                break;
            default:
                return new KtSLambdaShape1S01001000_I2((C110466lj) this.A0A, (Integer) this.A03, (List) this.A01, (List) this.A02, r12);
        }
        return new KtSLambdaShape1S01001000_I2(context, r4, r5, c2m, userSession, r8, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x025f, code lost:
        X.C67453za.A00(r7).AMA(r1, new com.facebook.redex.IDxFCallbackShape36S0400000_3_I2(r5, r6, r7, r8, r9));
        r1 = r3.A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x026f, code lost:
        if (r1 != r2) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0271, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x028c, code lost:
        X.AnonymousClass0OU.A00(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x028f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A0B
            switch(r0) {
                case 0: goto L_0x0120;
                case 1: goto L_0x01b5;
                case 2: goto L_0x020b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r13.A00
            r8 = 1
            if (r0 == 0) goto L_0x005c
            java.lang.Object r10 = r13.A09
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r11 = r13.A08
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r0 = r13.A07
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r6 = r13.A06
            X.6lj r6 = (X.C110466lj) r6
            java.lang.Object r9 = r13.A05
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r7 = r13.A04
            X.6hd r7 = (X.C107986hd) r7
            X.AnonymousClass0OU.A00(r14)
        L_0x0027:
            r10.add(r14)
            r10 = r0
        L_0x002b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r5 = r11.next()
            r13.A04 = r7
            r13.A05 = r9
            r13.A06 = r6
            r13.A07 = r10
            r13.A08 = r11
            r13.A09 = r10
            r13.A00 = r8
            X.4u0 r3 = r6.A03
            r4 = 0
            r1 = 935297209(0x37bf80b9, float:2.2828915E-5)
            r0 = 3
            X.0gQ r3 = r3.BQy(r1, r0)
            r1 = 6
            kotlin.coroutines.jvm.internal.KtSLambdaShape7S0200000_I2_2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0200000_I2_2
            r0.<init>(r5, r6, r4, r1)
            java.lang.Object r14 = X.C25599DoZ.A00(r13, r3, r0)
            if (r14 == r2) goto L_0x00e3
            r0 = r10
            goto L_0x0027
        L_0x005c:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r6 = r13.A0A
            X.6lj r6 = (X.C110466lj) r6
            r1 = 0
            X.6hd r7 = new X.6hd
            r7.<init>()
            java.lang.Object r0 = r13.A03
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.String r5 = "source"
            X.C04220Ms.A0B(r0, r1)
            X.01V r4 = r7.A01
            int r3 = r7.A00
            r1 = 17640025(0x10d2a59, float:2.5927993E-38)
            r4.markerStart((int) r1, (int) r3)
            int r0 = r0.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "LEGACY"
        L_0x0086:
            r4.markerAnnotate((int) r1, (int) r3, (java.lang.String) r5, (java.lang.String) r0)
            java.lang.Object r0 = r13.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r5 = 10
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0x(r0, r5)
            java.util.Iterator r1 = r0.iterator()
        L_0x0097:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r1.next()
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0I
            r3.add(r0)
            goto L_0x0097
        L_0x00a9:
            java.lang.String r0 = "EFFECT_COLLECTION"
            goto L_0x0086
        L_0x00ac:
            java.util.Set r4 = X.AnonymousClass00J.A0c(r3)
            java.lang.Object r0 = r13.A02
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = X.AnonymousClass00J.A0J(r0)
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r3 = r0.iterator()
        L_0x00c0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0I
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x00c0
            r9.add(r1)
            goto L_0x00c0
        L_0x00d9:
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0x(r9, r5)
            java.util.Iterator r11 = r9.iterator()
            goto L_0x002b
        L_0x00e3:
            return r2
        L_0x00e4:
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r10.iterator()
        L_0x00ec:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r1 = r2.next()
            boolean r0 = X.AnonymousClass0wJ.A1X(r1)
            if (r0 == 0) goto L_0x00ec
            r3.add(r1)
            goto L_0x00ec
        L_0x0100:
            int r5 = r3.size()
            int r4 = r9.size()
            X.01V r3 = r7.A01
            int r2 = r7.A00
            r1 = 17640025(0x10d2a59, float:2.5927993E-38)
            java.lang.String r0 = "smart_eviction_count"
            r3.markerAnnotate((int) r1, (int) r2, (java.lang.String) r0, (int) r5)
            java.lang.String r0 = "smart_eviction_candidates_count"
            r3.markerAnnotate((int) r1, (int) r2, (java.lang.String) r0, (int) r4)
            r0 = 2
            r3.markerEnd(r1, r2, r0)
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x0120:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r13.A00
            r6 = 1
            if (r0 == 0) goto L_0x0134
            java.lang.Object r3 = r13.A06
            X.0MJ r3 = (X.AnonymousClass0MJ) r3
            java.lang.Object r9 = r13.A05
            X.0MJ r9 = (X.AnonymousClass0MJ) r9
            X.AnonymousClass0OU.A00(r14)     // Catch:{ all -> 0x019c }
            goto L_0x0272
        L_0x0134:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A04
            X.062 r4 = (X.AnonymousClass062) r4
            r0 = r4
            X.0pE r0 = (X.C14340pE) r0
            X.061 r2 = r0.A00
            X.061 r0 = X.AnonymousClass061.DESTROYED
            if (r2 == r0) goto L_0x0289
            X.0MJ r9 = X.C86144wL.A17()
            X.0MJ r3 = X.C86144wL.A17()
            java.lang.Object r5 = r13.A03     // Catch:{ all -> 0x019c }
            X.061 r5 = (X.AnonymousClass061) r5     // Catch:{ all -> 0x019c }
            java.lang.Object r11 = r13.A01     // Catch:{ all -> 0x019c }
            X.4qz r11 = (X.C83224qz) r11     // Catch:{ all -> 0x019c }
            java.lang.Object r8 = r13.A02     // Catch:{ all -> 0x019c }
            X.0YP r8 = (X.AnonymousClass0YP) r8     // Catch:{ all -> 0x019c }
            r13.A05 = r9     // Catch:{ all -> 0x019c }
            r13.A06 = r3     // Catch:{ all -> 0x019c }
            r13.A07 = r5     // Catch:{ all -> 0x019c }
            r13.A08 = r4     // Catch:{ all -> 0x019c }
            r13.A09 = r11     // Catch:{ all -> 0x019c }
            r13.A0A = r8     // Catch:{ all -> 0x019c }
            r13.A00 = r6     // Catch:{ all -> 0x019c }
            X.EnC r10 = X.C18220wO.A11(r13)     // Catch:{ all -> 0x019c }
            r0 = 0
            int r2 = X.C18230wP.A04(r5, r0)     // Catch:{ all -> 0x019c }
            r0 = 2
            if (r2 == r0) goto L_0x017d
            r0 = 3
            if (r2 == r0) goto L_0x0180
            r0 = 4
            if (r2 == r0) goto L_0x017a
            r6 = 0
            goto L_0x0182
        L_0x017a:
            X.060 r6 = X.AnonymousClass060.ON_RESUME     // Catch:{ all -> 0x019c }
            goto L_0x0182
        L_0x017d:
            X.060 r6 = X.AnonymousClass060.ON_CREATE     // Catch:{ all -> 0x019c }
            goto L_0x0182
        L_0x0180:
            X.060 r6 = X.AnonymousClass060.ON_START     // Catch:{ all -> 0x019c }
        L_0x0182:
            X.060 r7 = X.C012805y.A00(r5)     // Catch:{ all -> 0x019c }
            X.Dnh r12 = new X.Dnh     // Catch:{ all -> 0x019c }
            r12.<init>()     // Catch:{ all -> 0x019c }
            androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r5 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch:{ all -> 0x019c }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x019c }
            r3.A00 = r5     // Catch:{ all -> 0x019c }
            r4.A07(r5)     // Catch:{ all -> 0x019c }
            java.lang.Object r0 = r10.A0B()     // Catch:{ all -> 0x019c }
            if (r0 != r1) goto L_0x0272
            return r1
        L_0x019c:
            r2 = move-exception
            java.lang.Object r1 = r9.A00
            X.8sG r1 = (X.C148838sG) r1
            if (r1 == 0) goto L_0x01a7
            r0 = 0
            r1.AC7(r0)
        L_0x01a7:
            java.lang.Object r1 = r3.A00
            X.065 r1 = (X.AnonymousClass065) r1
            if (r1 == 0) goto L_0x01b4
            java.lang.Object r0 = r13.A04
            X.062 r0 = (X.AnonymousClass062) r0
            r0.A08(r1)
        L_0x01b4:
            throw r2
        L_0x01b5:
            r1 = r14
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r13.A00
            r3 = 1
            if (r0 != 0) goto L_0x028c
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r6 = r13.A02
            X.C2M r6 = (X.C2M) r6
            java.lang.Object r4 = r13.A03
            X.9wD r4 = (X.C171189wD) r4
            java.lang.Object r7 = r13.A04
            com.instagram.service.session.UserSession r7 = (com.instagram.service.session.UserSession) r7
            java.lang.Object r1 = r13.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r13.A0A
            r13.A05 = r6
            r13.A06 = r4
            r13.A07 = r7
            r13.A08 = r1
            r13.A09 = r0
            r13.A00 = r3
            X.EnC r3 = X.C18220wO.A11(r13)
            X.AqU r8 = com.instagram.save.api.SaveApiUtil.A04(r1, r4, r6, r7)
            X.3zb r5 = X.C67463zb.A00()
            java.lang.String r1 = r6.getId()
            java.lang.String r0 = "effect_id"
            r5.A05(r0, r1)
            boolean r0 = X.AnonymousClass0wJ.A1W(r1)
            X.AnonymousClass7Ko.A0B(r0)
            java.lang.Class<X.5Fo> r4 = X.AnonymousClass5Fo.class
            java.lang.String r0 = "IGAREffectSaveMutation"
            X.3zc r1 = new X.3zc
            r1.<init>(r5, r4, r0)
            r0 = 6
            com.facebook.redex.IDxFCallbackShape314S0100000_2_I2 r5 = new com.facebook.redex.IDxFCallbackShape314S0100000_2_I2
            r5.<init>(r3, r0)
            r9 = 0
            goto L_0x025f
        L_0x020b:
            r1 = r14
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r13.A00
            r9 = 1
            if (r0 != 0) goto L_0x028c
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r6 = r13.A02
            X.C2M r6 = (X.C2M) r6
            java.lang.Object r4 = r13.A03
            X.9wD r4 = (X.C171189wD) r4
            java.lang.Object r7 = r13.A04
            com.instagram.service.session.UserSession r7 = (com.instagram.service.session.UserSession) r7
            java.lang.Object r1 = r13.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r13.A0A
            r13.A05 = r6
            r13.A06 = r4
            r13.A07 = r7
            r13.A08 = r1
            r13.A09 = r0
            r13.A00 = r9
            X.EnC r3 = X.C18220wO.A11(r13)
            X.AqU r8 = com.instagram.save.api.SaveApiUtil.A04(r1, r4, r6, r7)
            X.3zb r5 = X.C67463zb.A00()
            java.lang.String r1 = r6.getId()
            java.lang.String r0 = "effect_id"
            r5.A05(r0, r1)
            boolean r0 = X.AnonymousClass0wJ.A1W(r1)
            X.AnonymousClass7Ko.A0B(r0)
            java.lang.Class<X.5Fp> r4 = X.AnonymousClass5Fp.class
            java.lang.String r0 = "IGAREffectUnsaveMutation"
            X.3zc r1 = new X.3zc
            r1.<init>(r5, r4, r0)
            r0 = 7
            com.facebook.redex.IDxFCallbackShape314S0100000_2_I2 r5 = new com.facebook.redex.IDxFCallbackShape314S0100000_2_I2
            r5.<init>(r3, r0)
        L_0x025f:
            com.facebook.redex.IDxFCallbackShape36S0400000_3_I2 r4 = new com.facebook.redex.IDxFCallbackShape36S0400000_3_I2
            r4.<init>(r5, r6, r7, r8, r9)
            X.3za r0 = X.C67453za.A00(r7)
            r0.AMA(r1, r4)
            java.lang.Object r1 = r3.A0B()
            if (r1 != r2) goto L_0x028b
            return r2
        L_0x0272:
            java.lang.Object r1 = r9.A00
            X.8sG r1 = (X.C148838sG) r1
            if (r1 == 0) goto L_0x027c
            r0 = 0
            r1.AC7(r0)
        L_0x027c:
            java.lang.Object r1 = r3.A00
            X.065 r1 = (X.AnonymousClass065) r1
            if (r1 == 0) goto L_0x0289
            java.lang.Object r0 = r13.A04
            X.062 r0 = (X.AnonymousClass062) r0
            r0.A08(r1)
        L_0x0289:
            kotlin.Unit r1 = kotlin.Unit.A00
        L_0x028b:
            return r1
        L_0x028c:
            X.AnonymousClass0OU.A00(r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape1S01001000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape1S01001000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S01001000_I2(AnonymousClass061 r2, AnonymousClass062 r3, C146958n9 r4, AnonymousClass0YP r5, C83224qz r6) {
        super(2, r4);
        this.A0B = 0;
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = r6;
        this.A02 = r5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S01001000_I2(C110466lj r2, Integer num, List list, List list2, C146958n9 r6) {
        super(2, r6);
        this.A0B = 3;
        this.A0A = r2;
        this.A03 = num;
        this.A01 = list;
        this.A02 = list2;
    }
}
