package X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: X.3HZ  reason: invalid class name */
public final class AnonymousClass3HZ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final C311624m A04;
    public final AnonymousClass24G A05;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass3HZ)) {
            return false;
        }
        AnonymousClass3HZ r4 = (AnonymousClass3HZ) obj;
        return this.A02.equals(r4.A02) && this.A01.equals(r4.A01) && this.A00.equals(r4.A00) && this.A04.equals(r4.A04) && this.A05.equals(r4.A05) && this.A03.equals(r4.A03);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00, this.A04, this.A03});
    }

    public AnonymousClass3HZ(String str, String str2, String str3, Map map, C311624m r5, AnonymousClass24G r6) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = map;
    }
}
