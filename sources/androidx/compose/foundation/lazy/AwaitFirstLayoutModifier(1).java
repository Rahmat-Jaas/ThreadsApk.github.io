package androidx.compose.foundation.lazy;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass6ER;
import X.AnonymousClass6ES;
import X.C146508mM;
import X.C146958n9;
import X.C147438pL;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public final class AwaitFirstLayoutModifier implements C147438pL {
    public C146958n9 A00;
    public boolean A01;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146958n9 r7) {
        /*
            r6 = this;
            r3 = 2
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r7)
            if (r0 == 0) goto L_0x004f
            r5 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004f
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r4 = r5.A03
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r1 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r1) goto L_0x0055
            java.lang.Object r2 = r5.A02
            X.8n9 r2 = (X.C146958n9) r2
            X.AnonymousClass0OU.A00(r4)
        L_0x0027:
            if (r2 == 0) goto L_0x002e
            kotlin.Unit r0 = kotlin.Unit.A00
            r2.resumeWith(r0)
        L_0x002e:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x0031:
            X.AnonymousClass0OU.A00(r4)
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x002e
            X.8n9 r2 = r6.A00
            X.C86124wJ.A1S(r6, r2, r5, r1)
            X.8n9 r1 = X.C25598DoY.A02(r5)
            X.Eei r0 = new X.Eei
            r0.<init>(r1)
            r6.A00 = r0
            java.lang.Object r0 = r0.A00()
            if (r0 != r3) goto L_0x0027
            return r3
        L_0x004f:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r5.<init>(r6, r7, r3)
            goto L_0x0015
        L_0x0055:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.AwaitFirstLayoutModifier.A00(X.8n9):java.lang.Object");
    }

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final void C0k(C146508mM r3) {
        if (!this.A01) {
            this.A01 = true;
            C146958n9 r1 = this.A00;
            if (r1 != null) {
                r1.resumeWith(Unit.A00);
            }
            this.A00 = null;
        }
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
