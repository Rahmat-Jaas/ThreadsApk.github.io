package X;

import androidx.compose.foundation.lazy.layout.DefaultLazyKey;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape5S0102000_I2;

/* renamed from: X.7Vb  reason: invalid class name and case insensitive filesystem */
public final class C123037Vb implements C147308p8 {
    public final C142768fY A00;
    public final Map A01;
    public final AnonymousClass0YC A02;

    public final Object AZd(int i) {
        C108506iT ANr = this.A00.ANr(i);
        return C86154wM.A0f(((C145098jp) ANr.A02).BIv(), i - ANr.A01);
    }

    public final Object Aql(int i) {
        Object A0f;
        C108506iT ANr = this.A00.ANr(i);
        int i2 = i - ANr.A01;
        AnonymousClass0YY Aqr = ((C145098jp) ANr.A02).Aqr();
        if (Aqr == null || (A0f = C86154wM.A0f(Aqr, i2)) == null) {
            return new DefaultLazyKey(i);
        }
        return A0f;
    }

    public final Map Aqt() {
        return this.A01;
    }

    public final int getItemCount() {
        return ((AnonymousClass7VV) this.A00).A00;
    }

    public C123037Vb(C142768fY r9, AnonymousClass0YC r10, AnonymousClass8bH r11) {
        Map A0y;
        this.A02 = r10;
        this.A00 = r9;
        int i = r11.A00;
        if (i >= 0) {
            AnonymousClass7VV r92 = (AnonymousClass7VV) r9;
            int min = Math.min(r11.A01, r92.A00 - 1);
            if (min < i) {
                A0y = AnonymousClass4WJ.A0A();
            } else {
                A0y = AnonymousClass0wJ.A0y();
                KtLambdaShape5S0102000_I2 ktLambdaShape5S0102000_I2 = new KtLambdaShape5S0102000_I2(A0y, min, i, 1);
                AnonymousClass7VV.A00(r92, i);
                AnonymousClass7VV.A00(r92, min);
                if (min >= i) {
                    AnonymousClass84X r3 = r92.A02;
                    int A002 = C97976Dr.A00(r3, i);
                    int i2 = ((C108506iT) r3.A01[A002]).A01;
                    while (i2 <= min) {
                        C108506iT r0 = (C108506iT) r3.A01[A002];
                        ktLambdaShape5S0102000_I2.invoke(r0);
                        i2 += r0.A00;
                        A002++;
                    }
                } else {
                    throw C18190wL.A0a(C86134wK.A0l(min, i, "toIndex (", ") should be not smaller than fromIndex ("));
                }
            }
            this.A01 = A0y;
            return;
        }
        throw C18180wK.A0a("Check failed.");
    }

    public final void A4r(C147188nY r6, int i, int i2) {
        int i3;
        r6.Cvd(-1877726744);
        if ((i2 & 14) == 0) {
            i3 = C147188nY.A03(r6, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= C147188nY.A0G(r6, this);
        }
        if ((i3 & 91) != 18 || !r6.BCM()) {
            this.A02.invoke(this.A00.ANr(i), Integer.valueOf(i), r6, Integer.valueOf((i3 << 3) & 112));
        } else {
            r6.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            C147178nW.A03(AKE, this, i, i2, 3);
        }
    }
}
