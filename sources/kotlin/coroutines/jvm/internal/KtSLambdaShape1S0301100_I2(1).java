package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C147258p3;
import X.C147368pE;
import X.C18220wO;
import X.C39142Kno;
import X.D1X;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService;
import kotlin.Unit;

public class KtSLambdaShape1S0301100_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0301100_I2(C147258p3 r2, C147368pE r3, C146958n9 r4, long j) {
        super(2, r4);
        this.A03 = r3;
        this.A01 = j;
        this.A02 = r2;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        C146958n9 r3 = r8;
        if (this.A05 != 0) {
            KtSLambdaShape1S0301100_I2 ktSLambdaShape1S0301100_I2 = new KtSLambdaShape1S0301100_I2((MiniGalleryCategoriesService) this.A04, (D1X) this.A02, r3, this.A01);
            ktSLambdaShape1S0301100_I2.A03 = obj;
            return ktSLambdaShape1S0301100_I2;
        }
        long j = this.A01;
        return new KtSLambdaShape1S0301100_I2((C147258p3) this.A02, (C147368pE) this.A03, r3, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A05
            if (r0 == 0) goto L_0x0045
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 == r5) goto L_0x0032
            X.AnonymousClass0OU.A00(r9)
        L_0x0011:
            kotlin.Unit r7 = kotlin.Unit.A00
            return r7
        L_0x0014:
            X.AnonymousClass0OU.A00(r9)
            java.lang.Object r4 = r8.A03
            X.4r0 r4 = (X.C83234r0) r4
            java.lang.Object r0 = r8.A04
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService r0 = (com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService) r0
            com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository r3 = r0.A02
            java.lang.Object r2 = r8.A02
            X.D1X r2 = (X.D1X) r2
            long r0 = r8.A01
            r8.A03 = r4
            r8.A00 = r5
            java.lang.Object r9 = r3.A00(r2, r8, r0)
            if (r9 != r7) goto L_0x0039
            return r7
        L_0x0032:
            java.lang.Object r4 = r8.A03
            X.4r0 r4 = (X.C83234r0) r4
            X.AnonymousClass0OU.A00(r9)
        L_0x0039:
            r0 = 0
            r8.A03 = r0
            r8.A00 = r6
            java.lang.Object r0 = r4.emit(r9, r8)
            if (r0 != r7) goto L_0x0011
            return r7
        L_0x0045:
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r6 = 0
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 == r4) goto L_0x0082
            java.lang.Object r2 = r8.A04
            X.AnonymousClass0OU.A00(r9)
        L_0x0055:
            java.lang.Object r0 = r8.A03
            X.8pE r0 = (X.C147368pE) r0
            r0.CrC(r2)
            goto L_0x0011
        L_0x005d:
            X.AnonymousClass0OU.A00(r9)
            java.lang.Object r3 = r8.A03
            X.8pE r3 = (X.C147368pE) r3
            java.lang.Object r2 = r3.getValue()
            X.7Uv r2 = (X.C122987Uv) r2
            if (r2 == 0) goto L_0x008c
            java.lang.Object r1 = r8.A02
            X.8p3 r1 = (X.C147258p3) r1
            X.7Uu r0 = new X.7Uu
            r0.<init>(r2)
            if (r1 == 0) goto L_0x0089
            r8.A04 = r3
            r8.A00 = r4
            java.lang.Object r0 = r1.AJQ(r0, r8)
            if (r0 != r7) goto L_0x0089
            return r7
        L_0x0082:
            java.lang.Object r3 = r8.A04
            X.8pE r3 = (X.C147368pE) r3
            X.AnonymousClass0OU.A00(r9)
        L_0x0089:
            r3.CrC(r6)
        L_0x008c:
            long r0 = r8.A01
            X.7Uv r2 = new X.7Uv
            r2.<init>(r0)
            java.lang.Object r0 = r8.A02
            X.8p3 r0 = (X.C147258p3) r0
            if (r0 == 0) goto L_0x0055
            r8.A04 = r2
            r8.A00 = r5
            java.lang.Object r0 = r0.AJQ(r2, r8)
            if (r0 != r7) goto L_0x0055
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape1S0301100_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape1S0301100_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0301100_I2(MiniGalleryCategoriesService miniGalleryCategoriesService, D1X d1x, C146958n9 r4, long j) {
        super(2, r4);
        this.A04 = miniGalleryCategoriesService;
        this.A02 = d1x;
        this.A01 = j;
    }
}
