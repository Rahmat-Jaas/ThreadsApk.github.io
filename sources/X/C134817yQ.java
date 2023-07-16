package X;

import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import java.util.List;

/* renamed from: X.7yQ  reason: invalid class name and case insensitive filesystem */
public final class C134817yQ implements Comparable {
    public static final C134817yQ A01;
    public static final C134817yQ A02;
    public static final C134817yQ A03;
    public static final C134817yQ A04;
    public static final C134817yQ A05;
    public static final C134817yQ A06;
    public static final C134817yQ A07;
    public static final C134817yQ A08;
    public static final C134817yQ A09;
    public static final C134817yQ A0A;
    public static final C134817yQ A0B;
    public static final C134817yQ A0C;
    public static final C134817yQ A0D;
    public static final C134817yQ A0E;
    public static final C134817yQ A0F;
    public static final C134817yQ A0G;
    public static final C134817yQ A0H;
    public static final C134817yQ A0I;
    public static final List A0J;
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134817yQ) && this.A00 == ((C134817yQ) obj).A00);
    }

    static {
        C134817yQ r1 = new C134817yQ(100);
        A0D = r1;
        C134817yQ r2 = new C134817yQ(200);
        A0E = r2;
        C134817yQ r3 = new C134817yQ(300);
        A0F = r3;
        C134817yQ r4 = new C134817yQ(400);
        A06 = r4;
        C134817yQ r5 = new C134817yQ(500);
        A07 = r5;
        C134817yQ r6 = new C134817yQ(600);
        A08 = r6;
        C134817yQ r7 = new C134817yQ(Rfc3492Idn.damp);
        A0G = r7;
        C134817yQ r8 = new C134817yQ(800);
        A0H = r8;
        C134817yQ r9 = new C134817yQ(900);
        A0I = r9;
        A0C = r1;
        A0B = r2;
        A02 = r3;
        A04 = r4;
        A03 = r5;
        A05 = r6;
        A01 = r7;
        A0A = r8;
        A09 = r9;
        A0J = C06750aI.A17(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C134817yQ r3 = (C134817yQ) obj;
        C04220Ms.A0B(r3, 0);
        return C04220Ms.A00(this.A00, r3.A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return C86134wK.A0r("FontWeight(weight=", this.A00);
    }

    public C134817yQ(int i) {
        this.A00 = i;
        if (1 > i || i >= 1001) {
            throw C18190wL.A0a(AnonymousClass00U.A0J("Font weight can be in range [1, 1000]. Current value: ", i));
        }
    }
}
