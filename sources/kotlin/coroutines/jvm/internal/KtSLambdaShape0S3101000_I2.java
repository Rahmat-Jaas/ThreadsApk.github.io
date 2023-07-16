package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape0S3101000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S3101000_I2(Object obj, String str, String str2, String str3, C146958n9 r6, int i) {
        super(2, r6);
        this.A05 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        String str;
        Object obj2;
        String str2;
        String str3;
        int i;
        C146958n9 r5 = r9;
        if (this.A05 != 0) {
            obj2 = this.A01;
            str = this.A02;
            str3 = this.A03;
            str2 = this.A04;
            i = 1;
        } else {
            str = this.A02;
            obj2 = this.A01;
            str2 = this.A04;
            str3 = this.A03;
            i = 0;
        }
        return new KtSLambdaShape0S3101000_I2(obj2, str, str3, str2, r5, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A05
            if (r0 == 0) goto L_0x0012
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r13.A00
            r5 = 1
            if (r1 == 0) goto L_0x00b9
            if (r1 == r5) goto L_0x00d6
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0012:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r13.A00
            java.lang.String r4 = "approve"
            r1 = 4
            r5 = 3
            r8 = 2
            r12 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r12) goto L_0x007a
            if (r2 == r8) goto L_0x007a
            if (r2 != r5) goto L_0x00d6
            X.AnonymousClass0OU.A00(r14)
        L_0x0027:
            X.1jA r14 = X.C62903b6.A03()
        L_0x002b:
            java.lang.Object r3 = r13.A01
            X.10Q r3 = (X.AnonymousClass10Q) r3
            java.lang.String r6 = r13.A03
            java.lang.String r7 = r13.A04
            java.lang.String r8 = r13.A02
            boolean r2 = r14 instanceof X.AnonymousClass1jA
            if (r2 != 0) goto L_0x00d9
            boolean r2 = r14 instanceof X.AnonymousClass1jB
            if (r2 == 0) goto L_0x00d1
            com.instagram.service.session.UserSession r5 = r3.A04
            X.0kW r4 = r3.A03
            r10 = 0
            java.lang.String r9 = r3.A00
            X.AnonymousClass3WB.A01(r4, r5, r6, r7, r8, r9, r10)
            X.4wD r3 = r3.A05
            X.1eW r2 = new X.1eW
            r2.<init>()
            r13.A00 = r1
            java.lang.Object r1 = r3.Cgt(r2, r13)
            goto L_0x00ce
        L_0x0055:
            X.AnonymousClass0OU.A00(r14)
            java.lang.String r2 = r13.A02
            boolean r7 = X.C04220Ms.A0I(r2, r4)
            java.lang.Object r2 = r13.A01
            X.10Q r2 = (X.AnonymousClass10Q) r2
            com.instagram.brandedcontent.ads.repository.BCAApprovePostsForPromotionRepository r6 = r2.A02
            java.lang.String r3 = r13.A04
            java.lang.String r2 = r13.A03
            if (r7 == 0) goto L_0x0073
            r13.A00 = r12
            java.lang.Object r14 = r6.A01(r3, r2, r13)
        L_0x0070:
            if (r14 != r0) goto L_0x007d
            return r0
        L_0x0073:
            r13.A00 = r8
            java.lang.Object r14 = r6.A02(r3, r2, r13)
            goto L_0x0070
        L_0x007a:
            X.AnonymousClass0OU.A00(r14)
        L_0x007d:
            java.lang.Object r3 = r13.A01
            X.10Q r3 = (X.AnonymousClass10Q) r3
            java.lang.String r8 = r13.A03
            java.lang.String r9 = r13.A04
            java.lang.String r10 = r13.A02
            boolean r2 = r14 instanceof X.AnonymousClass1jA
            if (r2 == 0) goto L_0x00b0
            com.instagram.service.session.UserSession r7 = r3.A04
            X.0kW r6 = r3.A03
            java.lang.String r11 = r3.A00
            X.AnonymousClass3WB.A01(r6, r7, r8, r9, r10, r11, r12)
            boolean r2 = X.C04220Ms.A0I(r10, r4)
            r4 = 2131822552(0x7f1107d8, float:1.9277879E38)
            if (r2 == 0) goto L_0x00a0
            r4 = 2131822551(0x7f1107d7, float:1.9277877E38)
        L_0x00a0:
            X.4wD r3 = r3.A05
            X.1eX r2 = new X.1eX
            r2.<init>(r4)
            r13.A00 = r5
            java.lang.Object r2 = r3.Cgt(r2, r13)
            if (r2 != r0) goto L_0x0027
            return r0
        L_0x00b0:
            boolean r2 = r14 instanceof X.AnonymousClass1jB
            if (r2 != 0) goto L_0x002b
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00b9:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r1 = r13.A01
            X.10H r1 = (X.AnonymousClass10H) r1
            com.instagram.events.data.EventsRepository r4 = r1.A00
            java.lang.String r3 = r13.A02
            java.lang.String r2 = r13.A03
            java.lang.String r1 = r13.A04
            r13.A00 = r5
            java.lang.Object r1 = r4.A05(r3, r2, r1, r13)
        L_0x00ce:
            if (r1 != r0) goto L_0x00d9
            return r0
        L_0x00d1:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00d6:
            X.AnonymousClass0OU.A00(r14)
        L_0x00d9:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S3101000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S3101000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
