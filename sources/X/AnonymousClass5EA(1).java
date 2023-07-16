package X;

import android.os.Process;
import android.os.SystemClock;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import java.io.File;

/* renamed from: X.5EA  reason: invalid class name */
public final class AnonymousClass5EA extends AnonymousClass7DF {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public final long[] A06 = new long[3];
    public final String A07;

    public static boolean A00(AnonymousClass5EA r6, long[] jArr) {
        try {
            String A012 = AnonymousClass7DF.A01(C86144wL.A0Z(r6.A07));
            if (A012 == null) {
                return false;
            }
            String[] split = A012.split("\\s+");
            jArr[0] = Long.parseLong(split[0]);
            jArr[1] = Long.parseLong(split[1]);
            jArr[2] = Long.parseLong(split[2]);
            return true;
        } catch (Throwable unused) {
            r6.A05 = false;
            return false;
        }
    }

    public final String A01() {
        if (!this.A05) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long[] jArr = this.A06;
        if (!A00(this, jArr)) {
            return null;
        }
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = j - this.A01;
        long j5 = j2 - this.A02;
        long j6 = j3 - this.A00;
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(j4);
        A0r.append(BasicHeaderValueParser.ELEM_DELIMITER);
        A0r.append(j5);
        A0r.append(BasicHeaderValueParser.ELEM_DELIMITER);
        A0r.append(j6);
        A0r.append(BasicHeaderValueParser.ELEM_DELIMITER);
        return C86154wM.A0n(A0r, uptimeMillis - this.A03);
    }

    public final void A02() {
        if (this.A05) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long[] jArr = this.A06;
            if (A00(this, jArr)) {
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                if (this.A04) {
                    this.A01 = j;
                    this.A02 = j2;
                    this.A00 = j3;
                } else {
                    this.A03 = uptimeMillis;
                    this.A01 = j;
                    this.A02 = j2;
                    this.A00 = j3;
                }
                this.A04 = false;
            }
        }
    }

    public AnonymousClass5EA(int i) {
        boolean z = true;
        this.A04 = true;
        String A0Z = AnonymousClass00U.A0Z("/proc/", "/task/", "/schedstat", Process.myPid(), i);
        this.A07 = A0Z;
        File A0Z2 = C86144wL.A0Z(A0Z);
        this.A05 = (!A0Z2.exists() || !A0Z2.canRead()) ? false : z;
    }

    public AnonymousClass5EA() {
        boolean z = true;
        this.A04 = true;
        String A0S = AnonymousClass00U.A0S("/proc/", "/schedstat", Process.myPid());
        this.A07 = A0S;
        File A0Z = C86144wL.A0Z(A0S);
        this.A05 = (!A0Z.exists() || !A0Z.canRead()) ? false : z;
    }
}
