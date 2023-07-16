package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import com.instagram.clips.drafts.migrators.ClipsDraftMigrator;
import kotlin.Unit;

public class KtSLambdaShape0S0321000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0321000_I2(Object obj, Object obj2, Object obj3, C146958n9 r5, int i, boolean z, boolean z2) {
        super(2, r5);
        this.A06 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A05 = z;
        this.A04 = z2;
    }

    public final C146958n9 create(Object obj, C146958n9 r13) {
        boolean z;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z2;
        int i;
        C146958n9 r7 = r13;
        switch (this.A06) {
            case 0:
                z = this.A04;
                obj2 = this.A03;
                obj3 = this.A01;
                obj4 = this.A02;
                z2 = this.A05;
                i = 0;
                break;
            case 1:
                KtSLambdaShape0S0321000_I2 ktSLambdaShape0S0321000_I2 = new KtSLambdaShape0S0321000_I2((ClipsDraftMigrator) this.A03, r13, this.A05, this.A04);
                ktSLambdaShape0S0321000_I2.A01 = obj;
                return ktSLambdaShape0S0321000_I2;
            default:
                obj4 = this.A02;
                obj3 = this.A01;
                obj2 = this.A03;
                z2 = this.A05;
                z = this.A04;
                i = 2;
                break;
        }
        return new KtSLambdaShape0S0321000_I2(obj4, obj3, obj2, r7, i, z2, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0 A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A06
            switch(r0) {
                case 0: goto L_0x00de;
                case 1: goto L_0x0038;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r10.A00
            r7 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 != r7) goto L_0x0132
            X.AnonymousClass0OU.A00(r11)
        L_0x0011:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x0014:
            X.AnonymousClass0OU.A00(r11)
            java.lang.Object r0 = r10.A02
            X.066 r0 = (X.AnonymousClass066) r0
            X.062 r1 = r0.getLifecycle()
            java.lang.Object r0 = r10.A01
            X.061 r0 = (X.AnonymousClass061) r0
            r6 = 0
            java.lang.Object r5 = r10.A03
            boolean r9 = r10.A05
            boolean r8 = r10.A04
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0221000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0221000_I2
            r4.<init>(r5, r6, r7, r8, r9)
            r10.A00 = r7
            java.lang.Object r0 = X.AnonymousClass3J4.A00(r0, r1, r10, r4)
            if (r0 != r3) goto L_0x0011
            return r3
        L_0x0038:
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r10.A00
            r5 = 2
            r2 = 1
            java.lang.String r4 = "CLIPS_DRAFT_MIGRATOR"
            if (r0 == 0) goto L_0x0050
            java.lang.Object r6 = r10.A02
            java.util.Iterator r6 = (java.util.Iterator) r6
            if (r0 == r2) goto L_0x004d
            java.lang.Object r2 = r10.A01
            com.instagram.clips.drafts.migrators.ClipsDraftMigrator r2 = (com.instagram.clips.drafts.migrators.ClipsDraftMigrator) r2
            goto L_0x00a7
        L_0x004d:
            java.lang.Object r1 = r10.A01
            goto L_0x0064
        L_0x0050:
            X.AnonymousClass0OU.A00(r11)
            java.lang.Object r1 = r10.A01
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r10.A03
            com.instagram.clips.drafts.migrators.ClipsDraftMigrator r0 = (com.instagram.clips.drafts.migrators.ClipsDraftMigrator) r0
            java.util.List r0 = r0.A02     // Catch:{ all -> 0x0084 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0084 }
            goto L_0x0067
        L_0x0064:
            X.AnonymousClass0OU.A00(r11)     // Catch:{ all -> 0x0084 }
        L_0x0067:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x0084 }
            X.4pQ r0 = (X.C82314pQ) r0     // Catch:{ all -> 0x0084 }
            r10.A01 = r1     // Catch:{ all -> 0x0084 }
            r10.A02 = r6     // Catch:{ all -> 0x0084 }
            r10.A00 = r2     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = r0.BgE(r10)     // Catch:{ all -> 0x0084 }
            if (r0 != r3) goto L_0x0067
            goto L_0x0137
        L_0x0081:
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x0084 }
            goto L_0x008a
        L_0x0084:
            r1 = move-exception
            X.0OW r0 = new X.0OW
            r0.<init>(r1)
        L_0x008a:
            java.lang.Throwable r1 = X.AnonymousClass0OV.A00(r0)
            if (r1 == 0) goto L_0x0098
            java.lang.String r0 = "migration failed"
            X.AnonymousClass0LU.A0E(r4, r0, r1)
            X.C10450iM.A06(r4, r0, r1)
        L_0x0098:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0011
            java.lang.Object r2 = r10.A03
            com.instagram.clips.drafts.migrators.ClipsDraftMigrator r2 = (com.instagram.clips.drafts.migrators.ClipsDraftMigrator) r2
            java.util.List r0 = r2.A01     // Catch:{ all -> 0x00c8 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x00c8 }
            goto L_0x00aa
        L_0x00a7:
            X.AnonymousClass0OU.A00(r11)     // Catch:{ all -> 0x00c8 }
        L_0x00aa:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x00c8 }
            X.4pP r1 = (X.C82304pP) r1     // Catch:{ all -> 0x00c8 }
            com.instagram.service.session.UserSession r0 = r2.A00     // Catch:{ all -> 0x00c8 }
            r10.A01 = r2     // Catch:{ all -> 0x00c8 }
            r10.A02 = r6     // Catch:{ all -> 0x00c8 }
            r10.A00 = r5     // Catch:{ all -> 0x00c8 }
            java.lang.Object r0 = r1.CfO(r0, r10)     // Catch:{ all -> 0x00c8 }
            if (r0 != r3) goto L_0x00aa
            goto L_0x0138
        L_0x00c5:
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x00c8 }
            goto L_0x00ce
        L_0x00c8:
            r1 = move-exception
            X.0OW r0 = new X.0OW
            r0.<init>(r1)
        L_0x00ce:
            java.lang.Throwable r1 = X.AnonymousClass0OV.A00(r0)
            if (r1 == 0) goto L_0x0011
            java.lang.String r0 = "clean up failed"
            X.AnonymousClass0LU.A0E(r4, r0, r1)
            X.C10450iM.A06(r4, r0, r1)
            goto L_0x0011
        L_0x00de:
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r10.A00
            r5 = 1
            if (r0 == 0) goto L_0x010e
            if (r0 != r5) goto L_0x013e
            X.AnonymousClass0OU.A00(r11)
        L_0x00ea:
            boolean r0 = r11 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0105
            X.1jA r11 = X.C62903b6.A03()
        L_0x00f2:
            java.lang.Object r2 = r10.A02
            X.3ZL r2 = (X.AnonymousClass3ZL) r2
            boolean r1 = r10.A05
            boolean r0 = r11 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0011
            boolean r0 = r11 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0139
            r2.A05(r1)
            goto L_0x0011
        L_0x0105:
            boolean r0 = r11 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x00f2
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x010e:
            X.AnonymousClass0OU.A00(r11)
            boolean r2 = r10.A04
            java.lang.Object r1 = r10.A03
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r10.A01
            X.3HX r0 = (X.AnonymousClass3HX) r0
            X.0kW r0 = X.C63913ic.A09(r0)
            X.H8c r4 = X.C49272r7.A00(r0, r1, r2)
            r2 = 388566873(0x17290f59, float:5.4626217E-25)
            r1 = 0
            r0 = 14
            r10.A00 = r5
            java.lang.Object r11 = X.C63623hv.A01(r4, r10, r2, r1, r0)
            if (r11 != r3) goto L_0x00ea
            return r3
        L_0x0132:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0137:
            return r3
        L_0x0138:
            return r3
        L_0x0139:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x013e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S0321000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S0321000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0321000_I2(ClipsDraftMigrator clipsDraftMigrator, C146958n9 r3, boolean z, boolean z2) {
        super(2, r3);
        this.A06 = 1;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = clipsDraftMigrator;
    }
}
