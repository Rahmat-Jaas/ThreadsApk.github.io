package X;

import android.view.View;
import com.facebook.forker.Process;
import kotlin.UInt;

/* renamed from: X.6tw  reason: invalid class name and case insensitive filesystem */
public final class C114816tw {
    public final int A00;
    public final UInt A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r5.compareTo(r3) < 0) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(int r7) {
        /*
            r6 = this;
            kotlin.UInt r5 = new kotlin.UInt
            r5.<init>(r7)
            int r4 = r6.A00
            kotlin.UInt r3 = new kotlin.UInt
            r3.<init>(r4)
            kotlin.UInt r0 = r6.A01
            if (r0 != 0) goto L_0x001a
            int r0 = r5.compareTo(r3)
            if (r0 >= 0) goto L_0x0017
        L_0x0016:
            r5 = r3
        L_0x0017:
            int r0 = r5.A00
            return r0
        L_0x001a:
            int r2 = r0.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 ^ r0
            r0 = r0 ^ r2
            if (r1 == r0) goto L_0x0026
            if (r1 >= r0) goto L_0x0026
            r4 = r2
        L_0x0026:
            kotlin.UInt r2 = new kotlin.UInt
            r2.<init>(r4)
            int r0 = r3.compareTo(r2)
            if (r0 > 0) goto L_0x003f
            int r0 = r5.compareTo(r3)
            if (r0 < 0) goto L_0x0016
            int r0 = r5.compareTo(r2)
            if (r0 <= 0) goto L_0x0017
            r5 = r2
            goto L_0x0017
        L_0x003f:
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            r1.append(r2)
            java.lang.String r0 = " is less than minimum "
            r1.append(r0)
            r1.append(r3)
            r0 = 46
            java.lang.String r0 = X.C86114wI.A0q(r1, r0)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114816tw.A01(int):int");
    }

    public final boolean A02() {
        UInt uInt = this.A01;
        if (uInt == null || this.A00 != uInt.A00) {
            return false;
        }
        return true;
    }

    public C114816tw(UInt uInt, int i) {
        this.A00 = i;
        this.A01 = uInt;
    }

    public final int A00() {
        int i;
        int i2;
        if (A02()) {
            i = this.A00;
            i2 = 1073741824;
        } else {
            UInt uInt = this.A01;
            if (uInt == null) {
                return AnonymousClass7I7.A00;
            }
            i = uInt.A00;
            i2 = Process.WAIT_RESULT_TIMEOUT;
        }
        return View.MeasureSpec.makeMeasureSpec(i, i2);
    }
}
