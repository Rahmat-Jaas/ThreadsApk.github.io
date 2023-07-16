package X;

import com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2;
import java.util.List;
import java.util.Stack;

/* renamed from: X.3HU  reason: invalid class name */
public final class AnonymousClass3HU {
    public int A00 = -1;
    public AnonymousClass3DI A01;
    public Object A02;
    public List A03;
    public final Stack A04 = new Stack();

    public final void A01(Object obj, String str, String[] strArr, int i) {
        AnonymousClass3DI r0;
        int length = strArr.length;
        boolean A1X = C18180wK.A1X(length);
        int i2 = this.A00;
        int i3 = i2 + 1;
        int i4 = i3;
        while (i4 < this.A03.size()) {
            boolean equals = ((AnonymousClass3DI) this.A03.get(i4)).A08.equals(str);
            i4++;
            if (equals) {
                int i5 = 0;
                while (i3 < this.A03.size()) {
                    AnonymousClass3DI r7 = (AnonymousClass3DI) this.A03.get(i3);
                    if (A1X && r7.A08.equals(strArr[i5])) {
                        if (i2 != -1 && !((AnonymousClass3DI) this.A03.get(i2)).A06) {
                            this.A04.push(Integer.valueOf(i2));
                        }
                        i5++;
                        A1X = C18230wP.A1W(i5, length);
                        if (i == 2) {
                            if (i2 > -1) {
                                AnonymousClass3DI r1 = (AnonymousClass3DI) this.A03.get(i2);
                                obj = r1.A03.C8i(r1, obj, 1);
                            }
                            obj = r7.A02.C8i(r7, obj, 1);
                        }
                        i2 = i3;
                    } else if (r7.A08.equals(str)) {
                        if (i == 2 && (r0 = this.A01) != null) {
                            obj = r0.A03.C8i(r7, obj, 1);
                        }
                        if (i2 != -1 && !((AnonymousClass3DI) this.A03.get(i2)).A06) {
                            this.A04.push(Integer.valueOf(i2));
                        }
                        this.A00 = i3;
                        this.A01 = r7;
                        if (i == 2) {
                            obj = r7.A02.C8i(r7, obj, 1);
                        }
                        this.A02 = obj;
                        i3 = this.A03.size();
                    }
                    i3++;
                }
                return;
            }
        }
        throw C18180wK.A0a(AnonymousClass00U.A0V("Step '", str, "' not in remaining flow steps."));
    }

    public final C50622tI A00(Object obj) {
        AnonymousClass3DI r0;
        AnonymousClass3DI r1;
        AnonymousClass3DI r4 = this.A01;
        if (r4 != null) {
            obj = r4.A03.C8i(r4, r4.A05.D7Y(r4, obj), 1);
        }
        boolean z = false;
        if (this.A00 >= this.A03.size()) {
            z = true;
        }
        AnonymousClass3DI r3 = null;
        if (!z) {
            int i = this.A00;
            while (true) {
                i++;
                if (i < this.A03.size()) {
                    r1 = (AnonymousClass3DI) this.A03.get(i);
                } else {
                    r1 = null;
                }
                if (i >= this.A03.size() || (r1 != null && r1.A01.Boc(r1, obj))) {
                    r3 = r1;
                }
            }
            r3 = r1;
        }
        int i2 = this.A00;
        if (!(i2 == -1 || (r0 = this.A01) == null || r0.A06)) {
            this.A04.push(Integer.valueOf(i2));
        }
        this.A01 = r3;
        this.A00 = this.A03.indexOf(r3);
        AnonymousClass3DI r12 = this.A01;
        if (r12 != null) {
            if (r4 != null && !r4.A06) {
                r12.A04 = r4;
            }
            this.A02 = r12.A02.C8i(r12, obj, 1);
        }
        return new IDxSAdapterShape39S0300000_1_I2(this, r4, r3, 0);
    }
}
