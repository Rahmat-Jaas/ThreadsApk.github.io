package X;

import android.content.Context;
import android.os.StatFs;
import java.io.File;

/* renamed from: X.3Qp  reason: invalid class name and case insensitive filesystem */
public final class C60813Qp {
    public static volatile C84314sw A00 = new C685944q();

    public static final C58693Gt A00(Context context, C312824z r19, String str, float f, long j, boolean z) {
        long j2;
        C571639z r14;
        double d;
        double d2;
        Context context2 = context;
        C312824z r7 = r19;
        long j3 = j;
        AnonymousClass0wJ.A1N(context2, r7);
        File A002 = AnonymousClass2LM.A00(context2, str, z);
        if (A002 != null) {
            if (C03690Kh.A01().A08()) {
                A00.AL5();
            } else if (C03690Kh.A01().A07() && r7 == C312824z.VIDEO && A00.An1() > 0.0d) {
                j3 = (long) (((double) j3) * A00.An1());
            }
            if (A00.BRA()) {
                C556033w r13 = r7.A00;
                if (A002.exists() || A002.mkdir()) {
                    StatFs statFs = new StatFs(A002.getPath());
                    long blockSizeLong = statFs.getBlockSizeLong();
                    r14 = new C571639z(statFs.getBlockCountLong() * blockSizeLong, statFs.getAvailableBlocksLong() * blockSizeLong, AnonymousClass0hL.A03(A002));
                } else {
                    r14 = new C571639z(0, 0, 0);
                }
                long j4 = r14.A01;
                j2 = 0;
                if (j4 == 0) {
                    AnonymousClass0LU.A0B("AdaptiveCacheUtil", "directory not accessible");
                } else {
                    try {
                        j2 = (long) Math.min(r13.A00 * ((float) (r14.A00 + r14.A02)), (float) Math.min((long) (((float) j4) * f), j3));
                    } catch (IllegalArgumentException e) {
                        AnonymousClass0LU.A0E("AdaptiveCacheUtil", "directory not accessible", e);
                    }
                }
                if (A00.BRE()) {
                    if (C03690Kh.A01().A09()) {
                        d = (double) j2;
                        d2 = 0.25d;
                    } else if (C03690Kh.A01().A08()) {
                        d = (double) j2;
                        d2 = 0.5d;
                    }
                    j2 = (long) Math.min(d, ((double) j3) * d2);
                }
            } else {
                j2 = 0;
                try {
                    if (!A002.exists()) {
                        A002.mkdirs();
                    }
                    StatFs statFs2 = new StatFs(A002.getPath());
                    long blockSizeLong2 = statFs2.getBlockSizeLong();
                    long blockCountLong = statFs2.getBlockCountLong();
                    long availableBlocksLong = statFs2.getAvailableBlocksLong() * blockSizeLong2;
                    long min = Math.min((long) (((float) (blockCountLong * blockSizeLong2)) * f), j3);
                    if (min > availableBlocksLong) {
                        long A03 = AnonymousClass0hL.A03(A002);
                        if (min > A03) {
                            min = Math.min(min - A03, availableBlocksLong / ((long) 2)) + A03;
                        }
                    }
                    j2 = min;
                } catch (IllegalArgumentException unused) {
                }
            }
            return new C58693Gt(A002, j2);
        }
        throw C18250wR.A0V("No disk accessible");
    }
}
