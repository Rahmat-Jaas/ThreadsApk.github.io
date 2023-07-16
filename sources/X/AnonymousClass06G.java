package X;

import com.facebook.redex.IDxFactoryShape147S0000000_I2;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.06G  reason: invalid class name */
public final class AnonymousClass06G extends C62793ak {
    public static final C147138nS A02 = new IDxFactoryShape147S0000000_I2(1);
    public C002100y A00 = new C002100y();
    public boolean A01 = false;

    public final void A02() {
        this.A01 = false;
    }

    public final void A04() {
        this.A01 = true;
    }

    public static AnonymousClass06G A00(AnonymousClass06B r2) {
        return (AnonymousClass06G) new AnonymousClass7IU(A02, r2).A01(AnonymousClass06G.class);
    }

    public final C14980qV A01(int i) {
        return (C14980qV) this.A00.A04(i);
    }

    public final void A03() {
        C002100y r3 = this.A00;
        int A012 = r3.A01();
        for (int i = 0; i < A012; i++) {
            ((C14980qV) r3.A05(i)).A0L();
        }
    }

    public final void A05(int i) {
        this.A00.A06(i);
    }

    public final void A06(C14980qV r2, int i) {
        this.A00.A07(i, r2);
    }

    public final void A07(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C002100y r4 = this.A00;
        if (r4.A01() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String A0L = AnonymousClass00U.A0L(str, "    ");
            for (int i = 0; i < r4.A01(); i++) {
                C14980qV r1 = (C14980qV) r4.A05(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r4.A02(i));
                printWriter.print(": ");
                printWriter.println(r1.toString());
                r1.A0M(A0L, fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void onCleared() {
        C002100y r5 = this.A00;
        int A012 = r5.A01();
        for (int i = 0; i < A012; i++) {
            ((C14980qV) r5.A05(i)).A0K(true);
        }
        int i2 = r5.A00;
        Object[] objArr = r5.A03;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        r5.A00 = 0;
        r5.A01 = false;
    }

    public final boolean A08() {
        return this.A01;
    }
}
