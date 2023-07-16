package X;

/* renamed from: X.3W0  reason: invalid class name */
public final class AnonymousClass3W0 {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public double A06;
    public int A07;
    public int A08 = 50;
    public int A09 = -1;
    public int A0A = -1;
    public int A0B;
    public int A0C = 50;
    public int A0D = -1;
    public int A0E = 50;
    public int A0F = -1;
    public int A0G = -1;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public AnonymousClass22Z A0P = AnonymousClass22Z.LOW_LATENCY;
    public AnonymousClass22Z A0Q = AnonymousClass22Z.UNDEFINED;
    public String A0R = "";
    public String A0S;
    public String A0T = "";
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;

    public static AnonymousClass22Z A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 107348:
                    if (str.equals("low")) {
                        return AnonymousClass22Z.LOW_LATENCY;
                    }
                    break;
                case 1086463900:
                    if (str.equals("regular")) {
                        return AnonymousClass22Z.REGULAR_LATENCY;
                    }
                    break;
                case 1453634625:
                    if (str.equals("ultra_low")) {
                        return AnonymousClass22Z.ULTRA_LOW_LATENCY;
                    }
                    break;
            }
        }
        return AnonymousClass22Z.UNDEFINED;
    }

    public final C72384Ny A01() {
        return new C72384Ny(this);
    }

    public final void A0L(String str) {
        this.A0P = A00(str);
    }

    public final void A0M(String str) {
        this.A0Q = A00(str);
    }

    public final void A02(double d) {
        this.A00 = d;
    }

    public final void A03(double d) {
        this.A01 = d;
    }

    public final void A04(double d) {
        this.A02 = d;
    }

    public final void A05(double d) {
        this.A03 = d;
    }

    public final void A06(double d) {
        this.A04 = d;
    }

    public final void A07(double d) {
        this.A05 = d;
    }

    public final void A08(double d) {
        this.A06 = d;
    }

    public final void A09(int i) {
        this.A07 = i;
    }

    public final void A0A(int i) {
        this.A0B = i;
    }

    public final void A0B(int i) {
        this.A0G = i;
    }

    public final void A0C(int i) {
        this.A0H = i;
    }

    public final void A0D(int i) {
        this.A0I = i;
    }

    public final void A0E(int i) {
        this.A0J = i;
    }

    public final void A0F(int i) {
        this.A0K = i;
    }

    public final void A0G(int i) {
        this.A0L = i;
    }

    public final void A0H(int i) {
        this.A0M = i;
    }

    public final void A0I(int i) {
        this.A0N = i;
    }

    public final void A0J(int i) {
        this.A0O = i;
    }

    public final void A0K(String str) {
        this.A0S = str;
    }

    public final void A0N(boolean z) {
        this.A0U = z;
    }

    public final void A0O(boolean z) {
        this.A0V = z;
    }

    public final void A0P(boolean z) {
        this.A0W = z;
    }

    public final void A0Q(boolean z) {
        this.A0X = z;
    }
}
