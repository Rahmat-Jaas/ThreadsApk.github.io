package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import java.util.Arrays;

/* renamed from: X.0Ek  reason: invalid class name and case insensitive filesystem */
public final class C03120Ek implements C12280ld {
    public final C12290le A00;
    public final C03130El[] A01;

    public final void BQL(File file, String str) {
        int i = 0;
        while (true) {
            C03130El[] r1 = this.A01;
            if (i < r1.length) {
                C03130El r2 = r1[i];
                String str2 = str;
                if (str.isEmpty()) {
                    str2 = String.valueOf(i);
                } else if (i != 0) {
                    str2 = AnonymousClass00U.A0R(str, "_", i);
                }
                r2.BQL(file, str2);
                i++;
            } else {
                return;
            }
        }
    }

    private C12280ld A00(int i) {
        C03130El[] r2 = this.A01;
        char c = 0;
        if (Arrays.binarySearch(this.A00.A00, (short) (i >> 16)) >= 0) {
            c = 1;
        }
        return r2[c];
    }

    public final void CbB() {
        for (C03130El CbB : this.A01) {
            CbB.CbB();
        }
    }

    public final void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
        for (int i = 0; i < this.A01.length; i++) {
        }
    }

    public C03120Ek(C12290le r1, C03130El[] r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Cb5(int i, int i2, String str, int i3) {
        A00(i).Cb5(i, i2, str, i3);
    }

    public final void Cb6(int i, int i2, String str, String str2) {
        A00(i).Cb6(i, i2, str, str2);
    }

    public final void Cb7(int i, int i2) {
        A00(i).Cb7(i, i2);
    }

    public final void Cb8(int i, int i2) {
        A00(i).Cb8(i, i2);
    }

    public final void Cb9(int i, int i2, String str) {
        A00(i).Cb9(i, i2, str);
    }

    public final void CbA(int i, int i2, boolean z) {
        A00(i).CbA(i, i2, z);
    }

    public final void CbC(int i, int i2, boolean z) {
        A00(i).CbC(i, i2, z);
    }
}
