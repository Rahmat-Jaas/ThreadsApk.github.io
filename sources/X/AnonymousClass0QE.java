package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0QE  reason: invalid class name */
public final class AnonymousClass0QE {
    public static final Map A00 = new HashMap();

    public static long A00(long... jArr) {
        long j = Long.MIN_VALUE;
        for (long j2 : jArr) {
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer A02(java.io.File r7) {
        /*
            r6 = 0
            r5 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0036, IOException -> 0x0028 }
            r0.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0036, IOException -> 0x0028 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0036, IOException -> 0x0028 }
            r4.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0036, IOException -> 0x0028 }
            long r2 = r7.length()     // Catch:{ all -> 0x0023 }
            int r1 = (int) r2     // Catch:{ all -> 0x0023 }
            byte[] r0 = new byte[r1]     // Catch:{ all -> 0x0023 }
            r4.read(r0, r6, r1)     // Catch:{ all -> 0x0023 }
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ all -> 0x0023 }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x0023 }
            r5.order(r0)     // Catch:{ all -> 0x0023 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x0036, IOException -> 0x0028 }
            return r5
        L_0x0023:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r0     // Catch:{ FileNotFoundException -> 0x0036, IOException -> 0x0028 }
        L_0x0028:
            r3 = move-exception
            java.lang.String r2 = "NightwatchParser"
            java.lang.String r0 = r7.getPath()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "could not parse nightwatch log file %s"
            goto L_0x0043
        L_0x0036:
            r3 = move-exception
            java.lang.String r2 = "NightwatchParser"
            java.lang.String r0 = r7.getPath()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "nightwatch log file %s not exist"
        L_0x0043:
            X.AnonymousClass0LU.A0K(r2, r0, r3, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QE.A02(java.io.File):java.nio.ByteBuffer");
    }

    public static void A03(AnonymousClass0ON r2, String str, Map map) {
        Map map2 = A00;
        String str2 = r2.A00;
        map2.put(str2, r2);
        map.put(str2, str);
    }

    public static String A01(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        if (j == -1) {
            return "";
        }
        byte[] bArr = {-1, -1, -1, -1, -1, -1, -1, -1};
        int i = 7;
        do {
            bArr[i] = (byte) ((int) (255 & j));
            j >>= 8;
            i--;
        } while (i >= 0);
        StringBuilder sb = new StringBuilder("[");
        int i2 = 0;
        while (true) {
            sb.append(Byte.toString(bArr[i2]));
            i2++;
            if (i2 >= 8) {
                sb.append("]");
                return sb.toString();
            } else if (i2 > 0) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
        }
    }
}
