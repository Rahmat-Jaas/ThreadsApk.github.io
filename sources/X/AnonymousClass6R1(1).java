package X;

import java.util.Arrays;

/* renamed from: X.6R1  reason: invalid class name */
public final class AnonymousClass6R1 {
    public static final String A00(long j) {
        long abs = Math.abs(j);
        long j2 = (long) 60;
        long j3 = abs / j2;
        if ((abs ^ j2) < 0 && j3 * j2 != abs) {
            j3--;
        }
        long j4 = abs % j2;
        String format = String.format("%02d", Arrays.copyOf(C18210wN.A1X((int) (j4 + (j2 & (((j4 ^ j2) & ((-j4) | j4)) >> 63)))), 1));
        C04220Ms.A06(format);
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(j3);
        A0r.append(':');
        return C18180wK.A0i(format, A0r);
    }
}
