package X;

import android.graphics.Bitmap;

/* renamed from: X.542  reason: invalid class name */
public final class AnonymousClass542 extends C115286uo {
    public float A00;
    public int A01 = 1;
    public C104136bI A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final C146868n0 A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass542) {
                AnonymousClass542 r8 = (AnonymousClass542) obj;
                if (!(C04220Ms.A0I(this.A06, r8.A06) && this.A04 == r8.A04 && this.A05 == r8.A05 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AnonymousClass542(C146868n0 r10) {
        int i;
        int A08;
        long j = C121127Eg.A01;
        Bitmap bitmap = ((C31336Gmy) r10).A00;
        long A002 = AnonymousClass7FV.A00(bitmap.getWidth(), bitmap.getHeight());
        this.A06 = r10;
        this.A04 = j;
        this.A05 = A002;
        if (((int) (j >> 32)) < 0 || C86104wH.A08(j) < 0 || (i = (int) (A002 >> 32)) < 0 || (A08 = C86104wH.A08(A002)) < 0 || i > bitmap.getWidth() || A08 > bitmap.getHeight()) {
            throw C18190wL.A0a("Failed requirement.");
        }
        this.A03 = A002;
        this.A00 = 1.0f;
    }

    public final int hashCode() {
        return C86104wH.A06(C86104wH.A06(C18210wN.A04(this.A06), this.A04), this.A05) + this.A01;
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("BitmapPainter(image=");
        A0s.append(this.A06);
        A0s.append(", srcOffset=");
        long j = this.A04;
        A0s.append(AnonymousClass00U.A0P("(", ", ", ')', C86104wH.A07(j), C86104wH.A08(j)));
        A0s.append(", srcSize=");
        long j2 = this.A05;
        A0s.append(AnonymousClass00U.A0K(" x ", C86104wH.A07(j2), C86104wH.A08(j2)));
        A0s.append(", filterQuality=");
        if (this.A01 == 0) {
            str = "None";
        } else {
            str = "Low";
        }
        A0s.append(str);
        return C86114wI.A0q(A0s, ')');
    }
}
