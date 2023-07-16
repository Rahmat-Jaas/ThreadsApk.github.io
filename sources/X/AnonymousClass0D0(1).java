package X;

/* renamed from: X.0D0  reason: invalid class name */
public final class AnonymousClass0D0 {
    public static final String[] A00;

    static {
        String[] strArr = new String[15];
        A00 = strArr;
        strArr[0] = "pgpgin";
        strArr[1] = "pgpgout";
        strArr[2] = "pgmajfault";
        strArr[3] = "allocstall";
        strArr[4] = "allocstall_high";
        strArr[5] = "allocstall_dma";
        strArr[6] = "allocstall_dma32";
        strArr[7] = "allocstall_normal";
        strArr[8] = "allocstall_movable";
        strArr[9] = "pgsteal_kswapd_normal";
        strArr[10] = "pgsteal_kswapd_high";
        strArr[11] = "pgsteal_kswapd_movable";
        strArr[12] = "pgsteal_direct_normal";
        strArr[13] = "pgsteal_direct_high";
        strArr[14] = "pgsteal_direct_movable";
    }

    public static final C02810Cz A00() {
        String[] strArr = A00;
        long[] jArr = new long[strArr.length];
        C03620Ka.A02("/proc/vmstat", jArr, strArr);
        C02810Cz r11 = new C02810Cz();
        long j = jArr[0];
        r11.A02 = j;
        long j2 = jArr[1];
        r11.A04 = j2;
        long j3 = jArr[2];
        r11.A03 = j3;
        long j4 = r11.A00 + jArr[3];
        r11.A00 = j4;
        long j5 = j4 + jArr[4];
        r11.A00 = j5;
        long j6 = j5 + jArr[5];
        r11.A00 = j6;
        long j7 = j6 + jArr[6];
        r11.A00 = j7;
        long j8 = j7 + jArr[7];
        r11.A00 = j8;
        long j9 = j8 + jArr[8];
        r11.A00 = j9;
        long j10 = r11.A01 + jArr[9];
        r11.A01 = j10;
        long j11 = j10 + jArr[10];
        r11.A01 = j11;
        long j12 = j11 + jArr[11];
        r11.A01 = j12;
        long j13 = j12 + jArr[12];
        r11.A01 = j13;
        long j14 = j13 + jArr[13];
        r11.A01 = j14;
        long j15 = j14 + jArr[14];
        r11.A01 = j15;
        if (j == 0 && j2 == 0 && j3 == 0 && j9 == 0 && j15 == 0) {
            return new C02810Cz(-1);
        }
        return r11;
    }
}
