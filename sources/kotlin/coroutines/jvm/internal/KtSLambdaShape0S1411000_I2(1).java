package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape0S1411000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public boolean A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S1411000_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, C146958n9 r7, int i, boolean z) {
        super(2, r7);
        this.A07 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A05 = str;
        this.A06 = z;
    }

    public final C146958n9 create(Object obj, C146958n9 r11) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        boolean z;
        int i;
        C146958n9 r6 = r11;
        if (this.A07 != 0) {
            obj3 = this.A04;
            str = this.A05;
            z = this.A06;
            obj2 = this.A01;
            obj4 = this.A03;
            obj5 = this.A02;
            i = 1;
        } else {
            obj2 = this.A01;
            obj3 = this.A04;
            obj4 = this.A03;
            obj5 = this.A02;
            str = this.A05;
            z = this.A06;
            i = 0;
        }
        return new KtSLambdaShape0S1411000_I2(obj2, obj3, obj4, obj5, str, r6, i, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r9 = r16
            r6 = r17
            int r0 = r9.A07
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            if (r0 == 0) goto L_0x00b0
            int r2 = r9.A00
            r4 = 4
            r5 = 3
            r3 = 2
            r0 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r0) goto L_0x00eb
            if (r2 == r3) goto L_0x0084
            if (r2 != r5) goto L_0x00eb
            X.AnonymousClass0OU.A00(r6)
        L_0x001b:
            X.1jA r6 = X.C62903b6.A03()
        L_0x001f:
            java.lang.Object r2 = r9.A04
            X.64k r2 = (X.C963464k) r2
            boolean r0 = r6 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x00ee
            boolean r0 = r6 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00e1
            X.1jB r6 = (X.AnonymousClass1jB) r6
            java.lang.Object r3 = r6.A00
            X.2L8 r3 = (X.AnonymousClass2L8) r3
            X.4wF r2 = r2.A01
            X.64r r0 = new X.64r
            r0.<init>(r3)
            r9.A00 = r4
            java.lang.Object r0 = r2.emit(r0, r9)
        L_0x003e:
            if (r0 != r1) goto L_0x00ee
            return r1
        L_0x0041:
            X.AnonymousClass0OU.A00(r6)
            java.lang.Object r10 = r9.A01
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r11 = r9.A03
            com.instagram.service.session.UserSession r11 = (com.instagram.service.session.UserSession) r11
            java.lang.String r14 = r9.A05
            boolean r15 = r9.A06
            java.lang.Object r2 = r9.A02
            r9.A00 = r3
            X.64v r0 = X.C964364v.A00
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x006e
            java.lang.Integer r12 = X.AnonymousClass006.A00
        L_0x005e:
            r13 = 0
            X.H8c r3 = X.C63663i4.A00(r10, r11, r12, r13, r14, r15)
            r2 = 921724331(0x36f065ab, float:7.164393E-6)
            r0 = 0
            java.lang.Object r6 = X.C63623hv.A00(r3, r9, r2, r0)
            if (r6 != r1) goto L_0x0087
            return r1
        L_0x006e:
            X.64t r0 = X.C964164t.A00
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x0079
            java.lang.Integer r12 = X.AnonymousClass006.A0Y
            goto L_0x005e
        L_0x0079:
            X.64u r0 = X.C964264u.A00
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x00e6
            java.lang.Integer r12 = X.AnonymousClass006.A0C
            goto L_0x005e
        L_0x0084:
            X.AnonymousClass0OU.A00(r6)
        L_0x0087:
            X.3b6 r6 = (X.C62903b6) r6
            java.lang.Object r2 = r9.A04
            X.64k r2 = (X.C963464k) r2
            boolean r0 = r6 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00a7
            X.1jA r6 = (X.AnonymousClass1jA) r6
            java.lang.Object r3 = r6.A00
            X.IZD r3 = (X.IZD) r3
            X.4wF r2 = r2.A01
            X.64s r0 = new X.64s
            r0.<init>(r3)
            r9.A00 = r5
            java.lang.Object r0 = r2.emit(r0, r9)
            if (r0 != r1) goto L_0x001b
            return r1
        L_0x00a7:
            boolean r0 = r6 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x001f
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00b0:
            int r0 = r9.A00
            r2 = 1
            if (r0 == 0) goto L_0x00bc
            if (r0 == r2) goto L_0x00eb
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00bc:
            X.AnonymousClass0OU.A00(r6)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r3 = X.AnonymousClass7JJ.A02()
            java.lang.Object r5 = r9.A01
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r5 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r5
            java.lang.Object r0 = r9.A04
            X.6mc r0 = (X.C110996mc) r0
            com.facebookpay.expresscheckout.handler.ECPHandler r4 = r0.A00
            java.lang.Object r6 = r9.A03
            com.facebookpay.expresscheckout.models.TransactionInfo r6 = (com.facebookpay.expresscheckout.models.TransactionInfo) r6
            java.lang.Object r8 = r9.A02
            java.util.List r8 = (java.util.List) r8
            java.lang.String r7 = r9.A05
            boolean r10 = r9.A06
            r9.A00 = r2
            java.lang.Object r0 = r3.A06(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x003e
        L_0x00e1:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00e6:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00eb:
            X.AnonymousClass0OU.A00(r6)
        L_0x00ee:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S1411000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S1411000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
