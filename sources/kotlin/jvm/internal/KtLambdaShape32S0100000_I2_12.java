package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape32S0100000_I2_12 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape32S0100000_I2_12(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x042d, code lost:
        return java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0247, code lost:
        X.C147368pE.A04(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r21 = this;
            r1 = r21
            int r0 = r1.A01
            switch(r0) {
                case 6: goto L_0x02fc;
                case 7: goto L_0x02f2;
                case 8: goto L_0x041f;
                case 9: goto L_0x0412;
                case 10: goto L_0x028a;
                case 11: goto L_0x0281;
                case 12: goto L_0x0237;
                case 13: goto L_0x017b;
                case 14: goto L_0x03f1;
                case 15: goto L_0x0276;
                case 16: goto L_0x026b;
                case 17: goto L_0x0260;
                case 18: goto L_0x0237;
                case 19: goto L_0x0237;
                case 20: goto L_0x017b;
                case 21: goto L_0x0007;
                case 22: goto L_0x0007;
                case 23: goto L_0x0007;
                case 24: goto L_0x03e7;
                case 25: goto L_0x024c;
                case 26: goto L_0x03da;
                case 27: goto L_0x023d;
                case 28: goto L_0x03d3;
                case 29: goto L_0x0237;
                case 30: goto L_0x0221;
                case 31: goto L_0x01ff;
                case 32: goto L_0x01dc;
                case 33: goto L_0x01b9;
                case 34: goto L_0x0196;
                case 35: goto L_0x0182;
                case 36: goto L_0x017b;
                case 37: goto L_0x03c9;
                case 38: goto L_0x0007;
                case 39: goto L_0x0170;
                case 40: goto L_0x0165;
                case 41: goto L_0x015a;
                case 42: goto L_0x0007;
                case 43: goto L_0x0130;
                case 44: goto L_0x00e2;
                case 45: goto L_0x0019;
                case 46: goto L_0x000f;
                case 47: goto L_0x0343;
                case 48: goto L_0x032b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.C18240wQ.A1G(r0)
        L_0x000c:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x000f:
            java.lang.Object r0 = r1.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            if (r0 == 0) goto L_0x000c
            r0.invoke()
            goto L_0x000c
        L_0x0019:
            java.lang.Object r4 = r1.A00
            X.56S r4 = (X.AnonymousClass56S) r4
            java.lang.String r0 = r4.A05
            com.instagram.service.session.UserSession r3 = r4.A04
            X.0kW r6 = r4.A03
            X.BKU r5 = X.C86114wI.A0W(r3, r0)
            if (r5 == 0) goto L_0x0055
            X.0nS r1 = X.C13330nS.A01(r6, r3)
            java.lang.String r0 = "barcelona_organic_repost_tap"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 82
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = X.C86114wI.A0n(r2, r6)
            com.instagram.user.model.User r0 = X.C86104wH.A0Z(r2, r6, r5, r0)
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x00df
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
        L_0x004d:
            java.lang.String r0 = "media_author_id"
            r2.A0S(r0, r1)
            r2.Bb4()
        L_0x0055:
            com.instagram.barcelona.feed.post.data.PostRepository r9 = r4.A02
            X.BKU r5 = r4.A00
            r8 = 0
            if (r5 == 0) goto L_0x00dd
            java.lang.String r7 = r5.A33()
        L_0x0060:
            java.lang.String r6 = "Required value was null."
            if (r7 == 0) goto L_0x0438
            X.4qz r2 = r9.A01
            r0 = 7
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2
            r1.<init>(r9, r7, r8, r0)
            r0 = 3
            X.C25237DiI.A00(r8, r8, r1, r2, r0)
            if (r5 == 0) goto L_0x0433
            X.BKN r2 = r5.A0f
            X.5Ml r0 = r2.A1J
            if (r0 == 0) goto L_0x0433
            X.5Mj r0 = r0.A03
            if (r0 == 0) goto L_0x0433
            boolean r15 = r0.AVg()
            boolean r16 = r0.AVk()
            r0.BXt()
            X.BKU r13 = r0.B5g()
            com.instagram.api.schemas.RepostRestrictedReason r12 = r0.B7L()
            X.BKU r14 = r0.B7M()
            r10 = 1
            X.420 r1 = new X.420
            r1.<init>()
            X.6p7 r0 = new X.6p7
            r0.<init>(r1)
            X.5Mj r11 = new X.5Mj
            r17 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.5Ml r1 = r2.A1J
            if (r1 == 0) goto L_0x042e
            X.6qo r0 = new X.6qo
            r0.<init>(r1)
            r0.A03 = r11
            X.5Ml r0 = r0.A00()
            r2.A07(r0)
            r5.AAy(r3)
            X.4wE r2 = r4.A07
        L_0x00bc:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.5IE r0 = (X.AnonymousClass5IE) r0
            java.lang.String r6 = r0.A03
            java.lang.String r7 = r0.A02
            java.util.List r8 = r0.A04
            java.lang.Boolean r5 = r0.A01
            boolean r9 = r0.A06
            X.67s r4 = r0.A00
            X.5IE r3 = new X.5IE
            r11 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r2.ADi(r1, r3)
            if (r0 == 0) goto L_0x00bc
            goto L_0x000c
        L_0x00dd:
            r7 = r8
            goto L_0x0060
        L_0x00df:
            r1 = 0
            goto L_0x004d
        L_0x00e2:
            java.lang.Object r5 = r1.A00
            X.56S r5 = (X.AnonymousClass56S) r5
            java.lang.String r1 = r5.A05
            com.instagram.service.session.UserSession r0 = r5.A04
            X.0kW r4 = r5.A03
            X.BKU r3 = X.C86114wI.A0W(r0, r1)
            if (r3 == 0) goto L_0x011e
            X.0nS r1 = X.C13330nS.A01(r4, r0)
            java.lang.String r0 = "barcelona_organic_repost_remove_tap"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 81
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = X.C86114wI.A0n(r2, r4)
            com.instagram.user.model.User r0 = X.C86104wH.A0Z(r2, r4, r3, r0)
            if (r0 == 0) goto L_0x012e
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x012e
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
        L_0x0116:
            java.lang.String r0 = "media_author_id"
            r2.A0S(r0, r1)
            r2.Bb4()
        L_0x011e:
            X.4qz r3 = X.AnonymousClass3J5.A00(r5)
            r2 = 0
            r0 = 1
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0101000_I2_2 r1 = X.C86154wM.A0x(r5, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            goto L_0x000c
        L_0x012e:
            r1 = 0
            goto L_0x0116
        L_0x0130:
            java.lang.Object r0 = r1.A00
            X.56S r0 = (X.AnonymousClass56S) r0
            X.4wE r2 = r0.A07
        L_0x0136:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.5IE r0 = (X.AnonymousClass5IE) r0
            X.67s r4 = X.C970467s.None
            java.lang.String r6 = r0.A03
            java.lang.String r7 = r0.A02
            java.util.List r8 = r0.A04
            java.lang.Boolean r5 = r0.A01
            boolean r9 = r0.A06
            boolean r10 = r0.A05
            boolean r11 = r0.A07
            X.5IE r3 = new X.5IE
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r2.ADi(r1, r3)
            if (r0 == 0) goto L_0x0136
            goto L_0x000c
        L_0x015a:
            java.lang.Object r1 = r1.A00
            X.57e r1 = (X.C882157e) r1
            X.68c r0 = X.C971468c.MentionedOnly
            r1.A00(r0)
            goto L_0x000c
        L_0x0165:
            java.lang.Object r1 = r1.A00
            X.57e r1 = (X.C882157e) r1
            X.68c r0 = X.C971468c.AccountsYouFollow
            r1.A00(r0)
            goto L_0x000c
        L_0x0170:
            java.lang.Object r1 = r1.A00
            X.57e r1 = (X.C882157e) r1
            X.68c r0 = X.C971468c.Anyone
            r1.A00(r0)
            goto L_0x000c
        L_0x017b:
            java.lang.Object r1 = r1.A00
            X.8pE r1 = (X.C147368pE) r1
            r0 = 1
            goto L_0x0247
        L_0x0182:
            java.lang.Object r1 = r1.A00
            X.3ak r1 = (X.C62793ak) r1
            X.4qz r3 = X.AnonymousClass3J5.A00(r1)
            r2 = 0
            r0 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0101000_I2_2 r1 = X.C86154wM.A0x(r1, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            goto L_0x000c
        L_0x0196:
            java.lang.Object r0 = r1.A00
            X.58B r0 = (X.AnonymousClass58B) r0
            X.4wE r2 = r0.A06
        L_0x019c:
            java.lang.Object r1 = r2.getValue()
            r7 = r1
            X.5IS r7 = (X.AnonymousClass5IS) r7
            r3 = 0
            r10 = 0
            X.67r r6 = X.C970367r.None
            r9 = 63
            r4 = r3
            r5 = r3
            r8 = r3
            r11 = r10
            X.5IS r0 = X.AnonymousClass5IS.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x019c
            goto L_0x000c
        L_0x01b9:
            java.lang.Object r0 = r1.A00
            X.58B r0 = (X.AnonymousClass58B) r0
            X.4wE r2 = r0.A06
        L_0x01bf:
            java.lang.Object r1 = r2.getValue()
            r7 = r1
            X.5IS r7 = (X.AnonymousClass5IS) r7
            r3 = 0
            r10 = 0
            X.67r r5 = X.C970367r.None
            r9 = 111(0x6f, float:1.56E-43)
            r4 = r3
            r6 = r3
            r8 = r3
            r11 = r10
            X.5IS r0 = X.AnonymousClass5IS.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x01bf
            goto L_0x000c
        L_0x01dc:
            java.lang.Object r0 = r1.A00
            X.58B r0 = (X.AnonymousClass58B) r0
            X.4wE r2 = r0.A06
        L_0x01e2:
            java.lang.Object r1 = r2.getValue()
            r7 = r1
            X.5IS r7 = (X.AnonymousClass5IS) r7
            r3 = 0
            r10 = 0
            X.67r r4 = X.C970367r.None
            r9 = 119(0x77, float:1.67E-43)
            r5 = r3
            r6 = r3
            r8 = r3
            r11 = r10
            X.5IS r0 = X.AnonymousClass5IS.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x01e2
            goto L_0x000c
        L_0x01ff:
            java.lang.Object r0 = r1.A00
            X.58B r0 = (X.AnonymousClass58B) r0
            X.4wE r2 = r0.A06
        L_0x0205:
            java.lang.Object r1 = r2.getValue()
            r7 = r1
            X.5IS r7 = (X.AnonymousClass5IS) r7
            r3 = 0
            r10 = 0
            r9 = 95
            r4 = r3
            r5 = r3
            r6 = r3
            r8 = r3
            r11 = r10
            X.5IS r0 = X.AnonymousClass5IS.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x0205
            goto L_0x000c
        L_0x0221:
            java.lang.Object r4 = r1.A00
            X.3ak r4 = (X.C62793ak) r4
            X.4qz r3 = X.AnonymousClass3J5.A00(r4)
            r2 = 0
            r0 = 49
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1
            r1.<init>(r4, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            goto L_0x000c
        L_0x0237:
            java.lang.Object r1 = r1.A00
            X.8pE r1 = (X.C147368pE) r1
            r0 = 0
            goto L_0x0247
        L_0x023d:
            java.lang.Object r1 = r1.A00
            X.8pE r1 = (X.C147368pE) r1
            boolean r0 = X.C86104wH.A1X(r1)
            r0 = r0 ^ 1
        L_0x0247:
            X.C147368pE.A04(r1, r0)
            goto L_0x000c
        L_0x024c:
            java.lang.Object r4 = r1.A00
            X.6hL r4 = (X.C107806hL) r4
            X.4qz r3 = r4.A01
            r2 = 0
            r0 = 45
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1
            r1.<init>(r4, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            goto L_0x000c
        L_0x0260:
            java.lang.Object r1 = r1.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            X.68c r0 = X.C971468c.MentionedOnly
            r1.invoke(r0)
            goto L_0x000c
        L_0x026b:
            java.lang.Object r1 = r1.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            X.68c r0 = X.C971468c.AccountsYouFollow
            r1.invoke(r0)
            goto L_0x000c
        L_0x0276:
            java.lang.Object r1 = r1.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            X.68c r0 = X.C971468c.Anyone
            r1.invoke(r0)
            goto L_0x000c
        L_0x0281:
            java.lang.Object r0 = r1.A00
            X.56Z r0 = (X.AnonymousClass56Z) r0
            r0.A09()
            goto L_0x000c
        L_0x028a:
            java.lang.Object r0 = r1.A00
            X.56Z r0 = (X.AnonymousClass56Z) r0
            X.4wE r1 = r0.A0D
        L_0x0290:
            java.lang.Object r2 = r1.getValue()
            r7 = r2
            X.5IX r7 = (X.AnonymousClass5IX) r7
            java.util.List r0 = r7.A0B
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x02a1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02c3
            java.lang.Object r10 = r4.next()
            X.5J1 r10 = (X.AnonymousClass5J1) r10
            r8 = 0
            r15 = 0
            r16 = 1
            r14 = 1015(0x3f7, float:1.422E-42)
            r9 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r17 = r15
            r18 = r15
            X.5J1 r0 = X.AnonymousClass5J1.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.add(r0)
            goto L_0x02a1
        L_0x02c3:
            r4 = 0
            r14 = 0
            r13 = 1
            r12 = 1015(0x3f7, float:1.422E-42)
            X.5J1 r8 = new X.5J1
            r9 = r4
            r10 = r4
            r11 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            java.util.List r11 = X.AnonymousClass00J.A0X(r8, r3)
            r13 = 8388351(0x7ffeff, float:1.1754583E-38)
            r5 = r4
            r6 = r4
            r8 = r4
            r12 = r4
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            X.5IX r0 = X.AnonymousClass5IX.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = r1.ADi(r2, r0)
            if (r0 == 0) goto L_0x0290
            goto L_0x000c
        L_0x02f2:
            java.lang.Object r1 = r1.A00
            X.56Z r1 = (X.AnonymousClass56Z) r1
            r0 = 1
            r1.A0E(r0)
            goto L_0x000c
        L_0x02fc:
            java.lang.Object r0 = r1.A00
            X.56Z r0 = (X.AnonymousClass56Z) r0
            X.4wE r2 = r0.A0D
        L_0x0302:
            java.lang.Object r1 = r2.getValue()
            r6 = r1
            X.5IX r6 = (X.AnonymousClass5IX) r6
            r3 = 0
            r13 = 0
            r12 = 6291455(0x5fffff, float:8.816206E-39)
            r4 = r3
            r5 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            X.5IX r0 = X.AnonymousClass5IX.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x0302
            goto L_0x000c
        L_0x032b:
            java.lang.Object r0 = r1.A00
            X.774 r0 = (X.AnonymousClass774) r0
            if (r0 == 0) goto L_0x0340
            X.7JH r0 = r0.A03
            java.lang.Object r0 = X.AnonymousClass7JH.A01(r0)
            float r0 = X.C18240wQ.A00(r0)
        L_0x033b:
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            return r1
        L_0x0340:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x033b
        L_0x0343:
            java.lang.Object r8 = r1.A00
            androidx.compose.foundation.lazy.LazyListState r8 = (androidx.compose.foundation.lazy.LazyListState) r8
            java.util.List r0 = X.C147158nU.A00(r8)
            java.util.Iterator r9 = r0.iterator()
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x0365
            r7 = 0
        L_0x0356:
            X.8cc r7 = (X.AnonymousClass8cc) r7
            if (r7 == 0) goto L_0x0363
            X.7VH r7 = (X.AnonymousClass7VH) r7
            int r0 = r7.A00
        L_0x035e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            return r1
        L_0x0363:
            r0 = -1
            goto L_0x035e
        L_0x0365:
            java.lang.Object r7 = r9.next()
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0356
            r2 = r7
            X.8cc r2 = (X.AnonymousClass8cc) r2
            r6 = 1
            X.C04220Ms.A0B(r2, r6)
            X.7VH r2 = (X.AnonymousClass7VH) r2
            int r1 = r2.A01
            r5 = r1
            X.8nU r0 = r8.A02()
            int r0 = r0.BLh()
            if (r1 >= r0) goto L_0x0386
            r1 = r0
        L_0x0386:
            int r0 = r2.A02
            int r5 = r5 + r0
            X.8nU r0 = r8.A02()
            int r0 = r0.BLd()
            if (r5 <= r0) goto L_0x0394
            r5 = r0
        L_0x0394:
            int r5 = r5 - r1
        L_0x0395:
            java.lang.Object r4 = r9.next()
            r3 = r4
            X.8cc r3 = (X.AnonymousClass8cc) r3
            X.C04220Ms.A0B(r3, r6)
            X.7VH r3 = (X.AnonymousClass7VH) r3
            int r2 = r3.A01
            r1 = r2
            X.8nU r0 = r8.A02()
            int r0 = r0.BLh()
            if (r2 >= r0) goto L_0x03af
            r2 = r0
        L_0x03af:
            int r0 = r3.A02
            int r1 = r1 + r0
            X.8nU r0 = r8.A02()
            int r0 = r0.BLd()
            if (r1 <= r0) goto L_0x03bd
            r1 = r0
        L_0x03bd:
            int r1 = r1 - r2
            if (r5 >= r1) goto L_0x03c2
            r7 = r4
            r5 = r1
        L_0x03c2:
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x0395
            goto L_0x0356
        L_0x03c9:
            java.lang.Object r0 = r1.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            com.instagram.barcelona.feed.post.data.PostRepository r1 = new com.instagram.barcelona.feed.post.data.PostRepository
            r1.<init>(r0)
            return r1
        L_0x03d3:
            java.lang.Object r0 = r1.A00
            java.lang.Object r1 = X.C86104wH.A0f(r0)
            return r1
        L_0x03da:
            java.lang.Object r0 = r1.A00
            X.8cZ r0 = (X.AnonymousClass8cZ) r0
            X.7Ug r0 = (X.C122867Ug) r0
            X.8pE r0 = r0.A02
            java.lang.Object r1 = r0.getValue()
            return r1
        L_0x03e7:
            java.lang.Object r0 = r1.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7tu r1 = new X.7tu
            r1.<init>(r0)
            return r1
        L_0x03f1:
            java.lang.Object r1 = r1.A00
            X.4oM r1 = (X.C81784oM) r1
            java.lang.Object r0 = r1.getValue()
            X.5IX r0 = (X.AnonymousClass5IX) r0
            java.util.List r0 = r0.A0C
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0429
            java.lang.Object r0 = r1.getValue()
            X.5IX r0 = (X.AnonymousClass5IX) r0
            boolean r0 = r0.A0H
            if (r0 != 0) goto L_0x0429
            r2 = 0
            goto L_0x0429
        L_0x0412:
            java.lang.Object r0 = r1.A00
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            X.5IX r0 = (X.AnonymousClass5IX) r0
            boolean r0 = r0.A0G
            r2 = r0 ^ 1
            goto L_0x0429
        L_0x041f:
            java.lang.Object r0 = r1.A00
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            X.5IX r0 = (X.AnonymousClass5IX) r0
            boolean r2 = r0.A0F
        L_0x0429:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            return r1
        L_0x042e:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x0433:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x0438:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12.invoke():java.lang.Object");
    }
}
