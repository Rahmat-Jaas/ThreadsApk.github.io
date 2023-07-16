package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C147258p3;
import X.C147368pE;
import X.C18220wO;
import X.C18532Ah8;
import X.C39142Kno;
import X.C81784oM;
import X.DYZ;
import android.content.Context;
import kotlin.Unit;

public class KtSLambdaShape1S0401100_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0401100_I2(Context context, C18532Ah8 ah8, DYZ dyz, C146958n9 r5) {
        super(2, r5);
        this.A04 = ah8;
        this.A03 = dyz;
        this.A02 = context;
    }

    public final C146958n9 create(Object obj, C146958n9 r12) {
        C146958n9 r7 = r12;
        if (this.A06 != 0) {
            KtSLambdaShape1S0401100_I2 ktSLambdaShape1S0401100_I2 = new KtSLambdaShape1S0401100_I2((Context) this.A02, (C18532Ah8) this.A04, (DYZ) this.A03, r12);
            ktSLambdaShape1S0401100_I2.A05 = obj;
            return ktSLambdaShape1S0401100_I2;
        }
        long j = this.A01;
        return new KtSLambdaShape1S0401100_I2((C147258p3) this.A03, (C147368pE) this.A04, (C81784oM) this.A02, r7, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A06
            if (r0 == 0) goto L_0x005b
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r11.A00
            r9 = -1
            r7 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r7) goto L_0x0056
            long r2 = r11.A01
            X.AnonymousClass0OU.A00(r12)
        L_0x0014:
            long r2 = r2 + r9
        L_0x0015:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0071
            java.lang.Object r0 = r11.A03
            X.DYZ r0 = (X.DYZ) r0
            X.0Oa r0 = r0.A08
            java.lang.Object r8 = r0.getValue()
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.Object r6 = r11.A02
            android.content.Context r6 = (android.content.Context) r6
            r4 = 2131834987(0x7f11386b, float:1.93031E38)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r2)
            java.lang.String r0 = X.C19591Ayr.A03(r0)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r6, r0, r4)
            r8.setText(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r11.A01 = r2
            r11.A00 = r7
            java.lang.Object r0 = X.AnonymousClass729.A01(r11, r0)
            if (r0 != r5) goto L_0x0014
            return r5
        L_0x004a:
            X.AnonymousClass0OU.A00(r12)
            java.lang.Object r0 = r11.A04
            X.Ah8 r0 = (X.C18532Ah8) r0
            long r2 = r0.A00()
            goto L_0x0015
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x005b:
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r11.A00
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0074
            if (r0 == r2) goto L_0x0092
            java.lang.Object r1 = r11.A05
            X.AnonymousClass0OU.A00(r12)
        L_0x006a:
            java.lang.Object r0 = r11.A04
            X.8pE r0 = (X.C147368pE) r0
            r0.CrC(r1)
        L_0x0071:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x0074:
            X.AnonymousClass0OU.A00(r12)
            java.lang.Object r0 = r11.A02
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            java.lang.Object r0 = X.C86144wL.A0j(r0)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0095
            long r0 = X.AnonymousClass6WL.A00
            r11.A00 = r2
            java.lang.Object r0 = X.AnonymousClass729.A01(r11, r0)
            if (r0 != r5) goto L_0x0095
            return r5
        L_0x0092:
            X.AnonymousClass0OU.A00(r12)
        L_0x0095:
            long r2 = r11.A01
            X.7Uv r1 = new X.7Uv
            r1.<init>(r2)
            java.lang.Object r0 = r11.A03
            X.8p3 r0 = (X.C147258p3) r0
            r11.A05 = r1
            r11.A00 = r4
            java.lang.Object r0 = r0.AJQ(r1, r11)
            if (r0 != r5) goto L_0x006a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape1S0401100_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape1S0401100_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0401100_I2(C147258p3 r2, C147368pE r3, C81784oM r4, C146958n9 r5, long j) {
        super(2, r5);
        this.A02 = r4;
        this.A01 = j;
        this.A03 = r2;
        this.A04 = r3;
    }
}
