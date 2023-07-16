package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YY;
import X.C146958n9;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape2S0311000_I2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape2S0311000_I2(Object obj, Object obj2, Object obj3, C146958n9 r5, int i, boolean z) {
        super(1, r5);
        this.A05 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A04 = z;
    }

    public final C146958n9 create(C146958n9 r8) {
        Object obj;
        Object obj2;
        boolean z;
        int i;
        int i2 = this.A05;
        Object obj3 = this.A03;
        C146958n9 r4 = r8;
        switch (i2) {
            case 0:
                obj = this.A02;
                obj2 = this.A01;
                z = this.A04;
                i = 0;
                break;
            case 1:
                obj = this.A02;
                obj2 = this.A01;
                z = this.A04;
                i = 1;
                break;
            default:
                z = this.A04;
                obj = this.A02;
                obj2 = this.A01;
                i = 2;
                break;
        }
        return new KtSLambdaShape2S0311000_I2(obj3, obj, obj2, r4, i, z);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((KtSLambdaShape2S0311000_I2) create((C146958n9) obj)).invokeSuspend(Unit.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0171, code lost:
        r0.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0177, code lost:
        if (X.C25599DoZ.A00(r0, r7, r9) != r1) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0179, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b0, code lost:
        X.AnonymousClass0OU.A00(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e7, code lost:
        X.C879956a.A04(r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ec, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r13 = r18
            int r1 = r0.A05
            switch(r1) {
                case 0: goto L_0x014b;
                case 1: goto L_0x00b3;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 != r5) goto L_0x00ae
            X.AnonymousClass0OU.A00(r13)
        L_0x0015:
            r1 = r13
            java.lang.Object r5 = r0.A02
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            boolean r4 = r0.A04
            java.lang.Object r3 = r0.A01
            X.4qv r3 = (X.C83184qv) r3
            boolean r0 = r13 instanceof X.AnonymousClass1jA
            r2 = 0
            if (r0 == 0) goto L_0x004c
            r5.A2X(r4)
            if (r3 == 0) goto L_0x004a
            r3.CNQ(r4)
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x002f:
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
        L_0x0033:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0049
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00a9
            r0 = r4 ^ 1
            r5.A2X(r0)
            if (r3 == 0) goto L_0x0044
            kotlin.Unit r2 = kotlin.Unit.A00
        L_0x0044:
            X.1jB r1 = new X.1jB
            r1.<init>(r2)
        L_0x0049:
            return r1
        L_0x004a:
            r0 = r2
            goto L_0x002f
        L_0x004c:
            boolean r0 = r13 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0033
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0055:
            X.AnonymousClass0OU.A00(r13)
            java.lang.Object r2 = r0.A03
            X.3H1 r2 = (X.AnonymousClass3H1) r2
            com.instagram.service.session.UserSession r9 = r2.A01
            boolean r4 = r0.A04
            r0.A00 = r5
            X.3am r2 = X.C63043bN.A01
            r7 = 0
            android.content.SharedPreferences r2 = r2.A06(r9)
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.String r2 = "HAS_EVER_ENABLED_QUIET_MODE"
            X.AnonymousClass0wJ.A13(r3, r2, r5)
            X.H1T r8 = X.AnonymousClass0wJ.A0O(r9)
            java.lang.String r2 = "mental_well_being/update_quiet_time_window/"
            r8.A0J(r2)
            java.lang.String r2 = "quiet_mode_enabled"
            r8.A0R(r2, r4)
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r2 = 36601835850829580(0x82092d00040f0c, double:3.210486603603198E-306)
            long r4 = X.C63803iN.A03(r6, r9, r2)
            r2 = 36601835850698507(0x82092d00020f0b, double:3.210486603520307E-306)
            long r2 = X.C63803iN.A03(r6, r9, r2)
            X.C18180wK.A1I(r8, r4, r2)
            java.lang.Class<X.4vo> r3 = X.C85814vo.class
            java.lang.Class<X.3Za> r2 = X.AnonymousClass3Za.class
            X.H8c r3 = X.AnonymousClass0wJ.A0T(r8, r3, r2)
            r2 = 1440554863(0x55dd1f6f, float:3.03908845E13)
            java.lang.Object r13 = X.C63623hv.A00(r3, r0, r2, r7)
            if (r13 != r1) goto L_0x0015
            return r1
        L_0x00a9:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00b3:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r3 = r0.A00
            r2 = 2
            r6 = 1
            if (r3 == 0) goto L_0x00de
            if (r3 != r6) goto L_0x01b0
            X.AnonymousClass0OU.A00(r13)
        L_0x00c0:
            X.3b6 r13 = (X.C62903b6) r13
            boolean r3 = r13 instanceof X.AnonymousClass1jA
            if (r3 == 0) goto L_0x0114
            X.EgD r7 = X.C25295DjG.A01
            java.lang.Object r8 = r0.A03
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A01
            boolean r3 = r0.A04
            r14 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0410000_I2 r9 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0410000_I2
            r10 = r8
            r11 = r5
            r12 = r4
            r15 = r6
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0171
        L_0x00de:
            X.AnonymousClass0OU.A00(r13)
            java.lang.Object r7 = r0.A03
            X.56a r7 = (X.C879956a) r7
            X.4wE r5 = r7.A0D
        L_0x00e7:
            java.lang.Object r4 = r5.getValue()
            r8 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2 r8 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2) r8
            r9 = 0
            r16 = 0
            java.lang.Integer r11 = X.AnonymousClass006.A01
            r15 = 111(0x6f, float:1.56E-43)
            r10 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2 r3 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r3 = r5.ADi(r4, r3)
            if (r3 == 0) goto L_0x00e7
            com.instagram.barcelona.share.data.PermalinkRepository r5 = r7.A05
            java.lang.Object r4 = r0.A02
            X.BKU r4 = (X.BKU) r4
            X.0kW r3 = r7.A06
            r0.A00 = r6
            java.lang.Object r13 = r5.A00(r3, r4, r0)
            if (r13 != r1) goto L_0x00c0
            return r1
        L_0x0114:
            boolean r1 = r13 instanceof X.AnonymousClass1jB
            if (r1 == 0) goto L_0x01ea
            java.lang.Object r2 = r0.A03
            X.56a r2 = (X.C879956a) r2
            X.4wE r3 = r2.A0D
        L_0x011e:
            java.lang.Object r1 = r3.getValue()
            r4 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2) r4
            r5 = 0
            r12 = 0
            java.lang.Integer r7 = X.AnonymousClass006.A0N
            r11 = 111(0x6f, float:1.56E-43)
            r6 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r3.ADi(r1, r0)
            if (r0 == 0) goto L_0x011e
            X.2L8 r1 = X.AnonymousClass1jB.A00(r13)
            boolean r0 = r1 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x0149
            X.1j8 r1 = (X.AnonymousClass1j8) r1
            java.lang.Throwable r1 = r1.A00
        L_0x0145:
            java.lang.String r0 = "add_to_your_story"
            goto L_0x01e7
        L_0x0149:
            r1 = 0
            goto L_0x0145
        L_0x014b:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r3 = r0.A00
            r2 = 2
            r6 = 1
            if (r3 == 0) goto L_0x017a
            if (r3 != r6) goto L_0x01b0
            X.AnonymousClass0OU.A00(r13)
        L_0x0158:
            X.3b6 r13 = (X.C62903b6) r13
            boolean r3 = r13 instanceof X.AnonymousClass1jA
            if (r3 == 0) goto L_0x01b4
            X.EgD r7 = X.C25295DjG.A01
            java.lang.Object r10 = r0.A03
            java.lang.Object r11 = r0.A02
            java.lang.Object r12 = r0.A01
            boolean r3 = r0.A04
            r14 = 0
            r15 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0410000_I2 r9 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0410000_I2
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L_0x0171:
            r0.A00 = r2
            java.lang.Object r0 = X.C25599DoZ.A00(r0, r7, r9)
            if (r0 != r1) goto L_0x01ea
            return r1
        L_0x017a:
            X.AnonymousClass0OU.A00(r13)
            java.lang.Object r7 = r0.A03
            X.56a r7 = (X.C879956a) r7
            X.4wE r5 = r7.A0D
        L_0x0183:
            java.lang.Object r4 = r5.getValue()
            r8 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2 r8 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2) r8
            r9 = 0
            r16 = 0
            java.lang.Integer r12 = X.AnonymousClass006.A01
            r15 = 95
            r10 = r9
            r11 = r9
            r13 = r9
            r14 = r9
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2 r3 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r3 = r5.ADi(r4, r3)
            if (r3 == 0) goto L_0x0183
            com.instagram.barcelona.share.data.PermalinkRepository r5 = r7.A05
            java.lang.Object r4 = r0.A02
            X.BKU r4 = (X.BKU) r4
            X.0kW r3 = r7.A06
            r0.A00 = r6
            java.lang.Object r13 = r5.A00(r3, r4, r0)
            if (r13 != r1) goto L_0x0158
            return r1
        L_0x01b0:
            X.AnonymousClass0OU.A00(r13)
            goto L_0x01ea
        L_0x01b4:
            boolean r1 = r13 instanceof X.AnonymousClass1jB
            if (r1 == 0) goto L_0x01ea
            java.lang.Object r2 = r0.A03
            X.56a r2 = (X.C879956a) r2
            X.4wE r3 = r2.A0D
        L_0x01be:
            java.lang.Object r1 = r3.getValue()
            r4 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2) r4
            r5 = 0
            r12 = 0
            java.lang.Integer r8 = X.AnonymousClass006.A0N
            r11 = 95
            r6 = r5
            r7 = r5
            r9 = r5
            r10 = r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r3.ADi(r1, r0)
            if (r0 == 0) goto L_0x01be
            X.2L8 r1 = X.AnonymousClass1jB.A00(r13)
            boolean r0 = r1 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x01ed
            X.1j8 r1 = (X.AnonymousClass1j8) r1
            java.lang.Throwable r1 = r1.A00
        L_0x01e5:
            java.lang.String r0 = "share_to_ig_feed"
        L_0x01e7:
            X.C879956a.A04(r2, r0, r1)
        L_0x01ea:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x01ed:
            r1 = 0
            goto L_0x01e5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape2S0311000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
