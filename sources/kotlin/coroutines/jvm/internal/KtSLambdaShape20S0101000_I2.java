package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.C146958n9;
import X.C39142Kno;
import X.CKD;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0011000_I2;
import java.util.ArrayList;
import kotlin.Unit;

public class KtSLambdaShape20S0101000_I2 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape20S0101000_I2(Object obj, C146958n9 r3, int i) {
        super(3, r3);
        this.A02 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape20S0101000_I2(r0, r6);
        r2.A01 = r4;
        r2.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        return r2.invokeSuspend(kotlin.Unit.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape20S0101000_I2(r1, r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x0024;
                case 2: goto L_0x001c;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r1 = X.AnonymousClass0wJ.A04(r5)
            X.8n9 r6 = (X.C146958n9) r6
            r0 = 3
        L_0x000c:
            kotlin.coroutines.jvm.internal.KtSLambdaShape20S0101000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape20S0101000_I2
            r2.<init>(r0, r6)
            r2.A01 = r4
            r2.A00 = r1
        L_0x0015:
            kotlin.Unit r0 = kotlin.Unit.A00
            java.lang.Object r0 = r2.invokeSuspend(r0)
            return r0
        L_0x001c:
            int r1 = X.AnonymousClass0wJ.A04(r5)
            X.8n9 r6 = (X.C146958n9) r6
            r0 = 2
            goto L_0x000c
        L_0x0024:
            X.8n9 r6 = (X.C146958n9) r6
            java.lang.Object r1 = r3.A01
            r0 = 1
            goto L_0x002e
        L_0x002a:
            X.8n9 r6 = (X.C146958n9) r6
            r1 = 0
            r0 = 0
        L_0x002e:
            kotlin.coroutines.jvm.internal.KtSLambdaShape20S0101000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape20S0101000_I2
            r2.<init>(r1, r6, r0)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape20S0101000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A02) {
            case 0:
                int i = this.A00;
                if (!(i == 0 || i == 1)) {
                    throw AnonymousClass0wJ.A0a();
                }
            case 1:
                int i2 = this.A00;
                if (!(i2 == 0 || i2 == 1)) {
                    throw AnonymousClass0wJ.A0a();
                }
            case 2:
                AnonymousClass0OU.A00(obj);
                int i3 = this.A00;
                ArrayList A0v = AnonymousClass0wJ.A0v();
                for (Object next : (Iterable) this.A01) {
                    long j = ((CKD) next).A01;
                    if (0 <= j && j <= ((long) i3)) {
                        A0v.add(next);
                    }
                }
                return A0v;
            default:
                AnonymousClass0OU.A00(obj);
                Object obj2 = this.A01;
                int i4 = this.A00;
                boolean z = true;
                if (obj2 == null) {
                    z = false;
                    i4 = 0;
                }
                return new KtCSuperShape0S0011000_I2(i4, z, 4);
        }
        AnonymousClass0OU.A00(obj);
        return Unit.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape20S0101000_I2(int i, C146958n9 r3) {
        super(3, r3);
        this.A02 = i;
    }
}
