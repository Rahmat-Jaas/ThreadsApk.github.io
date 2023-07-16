package X;

import android.view.View;
import java.util.Arrays;

/* renamed from: X.03V  reason: invalid class name */
public class AnonymousClass03V {
    public static final AnonymousClass03Y A01 = new AnonymousClass03T().A00.A00().A00.A08().A00.A09().A00.A0A();
    public final AnonymousClass03Y A00;

    public AnonymousClass025 A07() {
        return null;
    }

    public void A0C(View view) {
    }

    public void A0D(AnonymousClass01T r1) {
    }

    public void A0E(AnonymousClass03Y r1) {
    }

    public void A0F(AnonymousClass01T[] r1) {
    }

    public boolean A0G() {
        return false;
    }

    public boolean A0H() {
        return false;
    }

    public boolean A0I(int i) {
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass03V)) {
            return false;
        }
        AnonymousClass03V r4 = (AnonymousClass03V) obj;
        return A0G() == r4.A0G() && A0H() == r4.A0H() && C002401c.A00(A04(), r4.A04()) && C002401c.A00(A03(), r4.A03()) && C002401c.A00(A07(), r4.A07());
    }

    public AnonymousClass01T A06(int i) {
        if ((i & 8) == 0) {
            return AnonymousClass01T.A04;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public AnonymousClass03V(AnonymousClass03Y r1) {
        this.A00 = r1;
    }

    public AnonymousClass01T A00() {
        return A04();
    }

    public AnonymousClass01T A01() {
        return A04();
    }

    public AnonymousClass01T A02() {
        return A04();
    }

    public AnonymousClass01T A03() {
        return AnonymousClass01T.A04;
    }

    public AnonymousClass01T A04() {
        return AnonymousClass01T.A04;
    }

    public AnonymousClass03Y A08() {
        return this.A00;
    }

    public AnonymousClass03Y A09() {
        return this.A00;
    }

    public AnonymousClass03Y A0A() {
        return this.A00;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(A0G()), Boolean.valueOf(A0H()), A04(), A03(), A07()});
    }

    public AnonymousClass01T A05(int i) {
        return AnonymousClass01T.A04;
    }

    public AnonymousClass03Y A0B(int i, int i2, int i3, int i4) {
        return A01;
    }
}
