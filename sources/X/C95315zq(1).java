package X;

import java.util.Collections;

/* renamed from: X.5zq  reason: invalid class name and case insensitive filesystem */
public final class C95315zq extends C111556ns {
    public final /* synthetic */ C886459y A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;

    public C95315zq(C886459y r1, int i, int i2) {
        this.A00 = r1;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj) {
        C127397h3 r5 = (C127397h3) obj;
        int i = this.A01;
        int i2 = this.A02;
        if (i < i2) {
            while (i < i2) {
                int i3 = i + 1;
                Collections.swap(r5.A0P(), i, i3);
                i = i3;
            }
            return;
        }
        while (i > i2) {
            int i4 = i - 1;
            Collections.swap(r5.A0P(), i, i4);
            i = i4;
        }
    }
}
