package X;

import java.util.List;
import kotlin.Unit;

/* renamed from: X.548  reason: invalid class name */
public final class AnonymousClass548 extends AnonymousClass798 {
    public float A00;
    public float A01;
    public float A02;
    public float A03 = 1.0f;
    public float A04 = 1.0f;
    public float A05;
    public float A06;
    public C147018nF A07;
    public M2h A08;
    public String A09 = "";
    public List A0A = C102766Wl.A00;
    public AnonymousClass0ZU A0B;
    public boolean A0C = true;
    public boolean A0D = true;
    public float[] A0E;
    public final List A0F = AnonymousClass0wJ.A0v();

    public static Unit A00(AnonymousClass548 r1) {
        r1.A0D = true;
        r1.A02();
        return Unit.A00;
    }

    public final void A05(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            List list = this.A0F;
            if (i < list.size()) {
                ((AnonymousClass798) list.get(i)).A04((AnonymousClass0ZU) null);
                list.remove(i);
            }
        }
        A02();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("VGroup: ");
        A0s.append(this.A09);
        List list = this.A0F;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            A0s.append("\t");
            A0s.append(obj.toString());
            A0s.append("\n");
        }
        return C18190wL.A0n(A0s);
    }
}
