package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape36S0100000_I2_16 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape36S0100000_I2_16(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0146, code lost:
        r0 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x014a, code lost:
        r1.CrC(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x01d7;
                case 1: goto L_0x000f;
                case 2: goto L_0x0007;
                case 3: goto L_0x0122;
                case 4: goto L_0x0141;
                case 5: goto L_0x0007;
                case 6: goto L_0x0007;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x0007;
                case 10: goto L_0x01e1;
                case 11: goto L_0x0201;
                case 12: goto L_0x0007;
                case 13: goto L_0x0007;
                case 14: goto L_0x0007;
                case 15: goto L_0x0007;
                case 16: goto L_0x0007;
                case 17: goto L_0x0007;
                case 18: goto L_0x0016;
                case 19: goto L_0x014f;
                case 20: goto L_0x0044;
                case 21: goto L_0x014f;
                case 22: goto L_0x0076;
                case 23: goto L_0x0209;
                case 24: goto L_0x0007;
                case 25: goto L_0x0007;
                case 26: goto L_0x0007;
                case 27: goto L_0x0099;
                case 28: goto L_0x0007;
                case 29: goto L_0x0007;
                case 30: goto L_0x0007;
                case 31: goto L_0x0007;
                case 32: goto L_0x0007;
                case 33: goto L_0x0007;
                case 34: goto L_0x00b8;
                case 35: goto L_0x0164;
                case 36: goto L_0x0164;
                case 37: goto L_0x00ca;
                case 38: goto L_0x0214;
                case 39: goto L_0x0007;
                case 40: goto L_0x0007;
                case 41: goto L_0x00e2;
                case 42: goto L_0x0100;
                case 43: goto L_0x0007;
                case 44: goto L_0x0141;
                case 45: goto L_0x0109;
                case 46: goto L_0x0122;
                case 47: goto L_0x0128;
                case 48: goto L_0x0007;
                case 49: goto L_0x0141;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.C18240wQ.A1G(r0)
        L_0x000c:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x000f:
            java.lang.Object r1 = r1.A00
            X.8pE r1 = (X.C147368pE) r1
            r0 = 0
            goto L_0x014a
        L_0x0016:
            java.lang.Object r3 = r1.A00
            com.instagram.barcelona.profile.ui.ProfileViewModel r3 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r3
            com.instagram.service.session.UserSession r0 = r3.A0D
            X.Dnj r1 = X.AnonymousClass6VR.A00(r0)
            java.lang.String r0 = r3.A00
            com.instagram.user.model.User r4 = r1.A03(r0)
            if (r4 == 0) goto L_0x000c
            boolean r7 = r4.A3M()
            r0 = r7 ^ 1
            r4.A2M(r0)
            com.instagram.barcelona.profile.ui.ProfileViewModel.A03(r3, r4)
            X.4qz r1 = X.AnonymousClass3J5.A00(r3)
            r5 = 0
            r6 = 7
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 3
            X.C25237DiI.A00(r5, r5, r2, r1, r0)
            goto L_0x000c
        L_0x0044:
            java.lang.Object r4 = r1.A00
            com.instagram.barcelona.profile.ui.ProfileViewModel r4 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r4
            X.3En r3 = r4.A04
            java.lang.String r2 = r4.A00
            r1 = 2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape2S1000000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape2S1000000_I2
            r0.<init>(r2, r1)
            r3.A00(r0)
            com.instagram.service.session.UserSession r0 = r4.A0D
            X.Dnj r1 = X.AnonymousClass6VR.A00(r0)
            java.lang.String r0 = r4.A00
            com.instagram.user.model.User r3 = r1.A03(r0)
            if (r3 == 0) goto L_0x000c
            com.instagram.barcelona.share.data.PermalinkRepository r0 = r4.A09
            java.lang.String r2 = r0.A02(r3)
            X.6dd r0 = r4.A08
            X.5M3 r1 = new X.5M3
            r1.<init>(r3, r2)
            X.8pE r0 = r0.A00
            r0.CrC(r1)
            goto L_0x000c
        L_0x0076:
            java.lang.Object r5 = r1.A00
            X.3ak r5 = (X.C62793ak) r5
            X.4qz r4 = X.AnonymousClass3J5.A00(r5)
            r3 = 0
            r1 = 32
            kotlin.coroutines.jvm.internal.KtSLambdaShape12S0100000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape12S0100000_I2_1
            r0.<init>(r5, r3, r1)
            r2 = 3
            X.C25237DiI.A00(r3, r3, r0, r4, r2)
            X.4qz r1 = X.AnonymousClass3J5.A00(r5)
            r0 = 43
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0101000_I2_2 r0 = X.C86154wM.A0x(r5, r3, r0)
            X.C25237DiI.A00(r3, r3, r0, r1, r2)
            goto L_0x000c
        L_0x0099:
            java.lang.Object r4 = r1.A00
            X.57u r4 = (X.C883757u) r4
            com.instagram.user.model.User r3 = r4.A05
            if (r3 == 0) goto L_0x000c
            com.instagram.barcelona.share.data.PermalinkRepository r0 = r4.A02
            java.lang.String r2 = r0.A02(r3)
            X.6dd r0 = r4.A01
            X.5M3 r1 = new X.5M3
            r1.<init>(r3, r2)
            X.8pE r0 = r0.A00
            r0.CrC(r1)
            X.C883757u.A00(r4)
            goto L_0x000c
        L_0x00b8:
            java.lang.Object r2 = r1.A00
            com.instagram.barcelona.search.SearchScreenViewModel r2 = (com.instagram.barcelona.search.SearchScreenViewModel) r2
            X.KKE r1 = r2.A08
            monitor-enter(r1)
            X.Jja r0 = r1.A00     // Catch:{ all -> 0x0229 }
            r0.A03()     // Catch:{ all -> 0x0229 }
            monitor-exit(r1)
            com.instagram.barcelona.search.SearchScreenViewModel.A02(r2)
            goto L_0x000c
        L_0x00ca:
            java.lang.Object r2 = r1.A00
            com.instagram.barcelona.search.SearchScreenViewModel r2 = (com.instagram.barcelona.search.SearchScreenViewModel) r2
            X.4wE r0 = r2.A0C
            java.lang.Object r0 = r0.getValue()
            X.5IV r0 = (X.AnonymousClass5IV) r0
            java.lang.Integer r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 != r0) goto L_0x000c
            r0 = 1
            com.instagram.barcelona.search.SearchScreenViewModel.A04(r2, r0)
            goto L_0x000c
        L_0x00e2:
            java.lang.Object r0 = r1.A00
            X.56Q r0 = (X.AnonymousClass56Q) r0
            X.4wE r5 = r0.A01
        L_0x00e8:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2) r0
            r3 = 0
            boolean r2 = r0.A00
            r1 = 2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2
            r0.<init>(r2, r3, r1)
            boolean r0 = r5.ADi(r4, r0)
            if (r0 == 0) goto L_0x00e8
            goto L_0x000c
        L_0x0100:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.C62413Zr.A00(r0)
            goto L_0x000c
        L_0x0109:
            java.lang.Object r0 = r1.A00
            X.57G r0 = (X.AnonymousClass57G) r0
            X.4wE r3 = r0.A02
        L_0x010f:
            java.lang.Object r2 = r3.getValue()
            X.67x r1 = X.C970967x.Retry
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2
            r0.<init>((X.C970967x) r1)
            boolean r0 = r3.ADi(r2, r0)
            if (r0 == 0) goto L_0x010f
            goto L_0x000c
        L_0x0122:
            java.lang.Object r1 = r1.A00
            X.8pE r1 = (X.C147368pE) r1
            r0 = 1
            goto L_0x0146
        L_0x0128:
            java.lang.Object r3 = r1.A00
            X.0YP r3 = (X.AnonymousClass0YP) r3
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r1 = "ExplorePeopleFragment.ARGUMENT_ONLY_ALLOW_CONNECT_CONTACTS_UPSELL"
            r0 = 1
            r2.putBoolean(r1, r0)
            r0 = 868(0x364, float:1.216E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.invoke(r0, r2)
            goto L_0x000c
        L_0x0141:
            java.lang.Object r1 = r1.A00
            X.8pE r1 = (X.C147368pE) r1
            r0 = 0
        L_0x0146:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x014a:
            r1.CrC(r0)
            goto L_0x000c
        L_0x014f:
            java.lang.Object r1 = r1.A00
            X.3ak r1 = (X.C62793ak) r1
            X.4qz r3 = X.AnonymousClass3J5.A00(r1)
            r2 = 0
            r0 = 42
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0101000_I2_2 r1 = X.C86154wM.A0x(r1, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            goto L_0x000c
        L_0x0164:
            java.lang.Object r4 = r1.A00
            com.instagram.barcelona.search.SearchScreenViewModel r4 = (com.instagram.barcelona.search.SearchScreenViewModel) r4
            X.4wE r2 = r4.A0C
            java.lang.Object r0 = r2.getValue()
            X.5IV r0 = (X.AnonymousClass5IV) r0
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x000c
            X.8sG r0 = r4.A05
            r6 = 0
            if (r0 == 0) goto L_0x017c
            r0.AC7(r6)
        L_0x017c:
            X.8sG r0 = r4.A04
            if (r0 == 0) goto L_0x0183
            r0.AC7(r6)
        L_0x0183:
            java.lang.Object r1 = r2.getValue()
            r5 = r1
            X.5IV r5 = (X.AnonymousClass5IV) r5
            r15 = 0
            java.lang.Integer r8 = X.AnonymousClass006.A0C
            r14 = 255(0xff, float:3.57E-43)
            r7 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            X.5IV r0 = X.AnonymousClass5IV.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x0183
            java.lang.Object r0 = r2.getValue()
            X.5IV r0 = (X.AnonymousClass5IV) r0
            java.lang.Integer r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x01c1
            r2.getValue()
            X.4qz r2 = X.AnonymousClass3J5.A00(r4)
            r0 = 46
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0101000_I2_2 r1 = X.C86154wM.A0x(r4, r6, r0)
            r0 = 3
            X.8sG r0 = X.C25237DiI.A00(r6, r6, r1, r2, r0)
            r4.A05 = r0
            goto L_0x000c
        L_0x01c1:
            java.lang.String r3 = r4.A01
            X.4qz r2 = X.AnonymousClass3J5.A00(r4)
            r0 = 19
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2
            r1.<init>(r4, r3, r6, r0)
            r0 = 3
            X.8sG r0 = X.C25237DiI.A00(r6, r6, r1, r2, r0)
            r4.A04 = r0
            goto L_0x000c
        L_0x01d7:
            java.lang.Object r0 = r1.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            com.instagram.barcelona.profile.editor.data.EditProfileRepositoryProfileEditorImpl r1 = new com.instagram.barcelona.profile.editor.data.EditProfileRepositoryProfileEditorImpl
            r1.<init>(r0)
            return r1
        L_0x01e1:
            java.lang.Object r0 = r1.A00
            X.57k r0 = (X.C882757k) r0
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x01f8
            X.21k r2 = X.C304621k.Follower
            X.21k r1 = X.C304621k.Following
            X.21k r0 = X.C304621k.Pending
            X.21k[] r0 = new X.C304621k[]{r2, r1, r0}
        L_0x01f3:
            X.8sK r1 = X.AnonymousClass7C0.A02(r0)
            return r1
        L_0x01f8:
            X.21k r1 = X.C304621k.Follower
            X.21k r0 = X.C304621k.Following
            X.21k[] r0 = new X.C304621k[]{r1, r0}
            goto L_0x01f3
        L_0x0201:
            java.lang.Object r0 = r1.A00
            X.4tk[] r0 = (X.C84714tk[]) r0
            int r0 = r0.length
            java.lang.Object[] r1 = new java.lang.Object[r0]
            return r1
        L_0x0209:
            java.lang.Object r0 = r1.A00
            X.35w r0 = (X.C561235w) r0
            X.0ZU r0 = r0.A00
            java.lang.Object r1 = r0.invoke()
            return r1
        L_0x0214:
            java.lang.Object r0 = r1.A00
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            X.5IV r0 = (X.AnonymousClass5IV) r0
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass006.A00
            boolean r0 = X.C18180wK.A1Z(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x0229:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16.invoke():java.lang.Object");
    }
}
