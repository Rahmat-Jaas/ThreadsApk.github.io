package X;

import android.os.Parcelable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3400000_I2;
import java.util.List;

/* renamed from: X.627  reason: invalid class name */
public final class AnonymousClass627 extends E96 {
    public Parcelable A00;
    public List A01;
    public boolean A02;
    public boolean A03;

    public final void A00(boolean z) {
        KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I2;
        KtCSuperShape0S3400000_I2 ktCSuperShape0S3400000_I2 = this.A01;
        C113066qf r2 = new C113066qf(ktCSuperShape0S3400000_I2);
        KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I22 = (KtCSuperShape0S0110000_I2) ktCSuperShape0S3400000_I2.A02;
        if (ktCSuperShape0S0110000_I22 != null) {
            ktCSuperShape0S0110000_I2 = C36302Qu.A00(ktCSuperShape0S0110000_I22, (List) ktCSuperShape0S0110000_I22.A00, z);
        } else {
            ktCSuperShape0S0110000_I2 = null;
        }
        r2.A00 = ktCSuperShape0S0110000_I2;
        this.A01 = r2.A00();
        this.A03 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r0 = (java.util.List) r1.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass627(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3400000_I2 r3, X.C26469EGu r4) {
        /*
            r2 = this;
            r2.<init>(r3, r4)
            java.lang.Object r1 = r3.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r1
            if (r1 == 0) goto L_0x001a
            boolean r0 = r1.A01
        L_0x000b:
            r2.A03 = r0
            if (r1 == 0) goto L_0x0015
            java.lang.Object r0 = r1.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0017
        L_0x0015:
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x0017:
            r2.A01 = r0
            return
        L_0x001a:
            r0 = 0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass627.<init>(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3400000_I2, X.EGu):void");
    }
}
