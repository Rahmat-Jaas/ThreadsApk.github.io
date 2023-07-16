package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: X.3W3  reason: invalid class name */
public final class AnonymousClass3W3 {
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0029 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x003b */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0033=Splitter:B:24:0x0033, B:30:0x003b=Splitter:B:30:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(android.content.res.AssetManager r7, java.lang.String r8) {
        /*
            r0 = 3
            java.io.InputStream r7 = r7.open(r8, r0)     // Catch:{ IOException -> 0x003c }
            if (r7 == 0) goto L_0x0048
            r6 = 0
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x002a }
            r5.<init>()     // Catch:{ IOException -> 0x002a }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r4]     // Catch:{ all -> 0x0025 }
        L_0x0011:
            r2 = 0
            int r1 = r7.read(r3, r2, r4)     // Catch:{ all -> 0x0025 }
            r0 = -1
            if (r1 == r0) goto L_0x001d
            r5.write(r3, r2, r1)     // Catch:{ all -> 0x0025 }
            goto L_0x0011
        L_0x001d:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x0025 }
            r5.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x0033
        L_0x0025:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            throw r0     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            r2 = move-exception
            java.lang.String r1 = "FileParsingUtils"
            java.lang.String r0 = "getFileContentAsByte: failed due to exception: "
            X.AnonymousClass0LU.A0I(r1, r0, r2)     // Catch:{ all -> 0x0037 }
            r0 = r6
        L_0x0033:
            r7.close()     // Catch:{ IOException -> 0x003c }
            return r0
        L_0x0037:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r8, r0}
            java.lang.String r1 = "FileParsingUtils"
            java.lang.String r0 = "getFileContentAsByteFromAssets: failed to get file %s, due to exception: "
            X.AnonymousClass0LU.A0P(r1, r0, r2)
        L_0x0048:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3W3.A01(android.content.res.AssetManager, java.lang.String):byte[]");
    }

    public static int[] A02(ReadableByteChannel readableByteChannel, int i) {
        if (i <= 0) {
            AnonymousClass0LU.A0P("FileParsingUtils", "loadParamsArrayFromChannel: received unexpected param size: %d", C18210wN.A1X(i));
            return new int[0];
        }
        int[] iArr = new int[i];
        int i2 = i << 2;
        try {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            if (readableByteChannel.read(allocateDirect) != i2) {
                AnonymousClass0LU.A0P("FileParsingUtils", "populateTranslationTableNewToNew: Failed loading params_map v4 file, didn't read expected param size: %d", C18210wN.A1X(i / 2));
            }
            allocateDirect.flip();
            allocateDirect.asIntBuffer().get(iArr);
            return iArr;
        } catch (IOException e) {
            AnonymousClass0LU.A0J("FileParsingUtils", "buildTranslationTable load into array failed", e);
            return iArr;
        }
    }

    public static C563736y A00(ReadableByteChannel readableByteChannel) {
        String str;
        C563736y r4 = new C563736y();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(2);
            if (readableByteChannel.read(allocate) == 2) {
                allocate.flip();
                CharBuffer decode = Charset.forName("US-ASCII").decode(allocate);
                if (decode == null) {
                    AnonymousClass0LU.A0D("FileParsingUtils", "getHeaderInfoFromParamsMapFile: failed to get first two byte");
                    return r4;
                }
                String obj = decode.toString();
                if (obj != null) {
                    if (obj.equals("v2")) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(128);
                        if (readableByteChannel.read(allocate2) < 0) {
                            AnonymousClass0LU.A0D("FileParsingUtils", "getHeaderInfoFromParamsMapFile: failed to get first line");
                            return r4;
                        }
                        allocate2.flip();
                        String[] split = Charset.forName("US-ASCII").decode(allocate2).toString().split("\\r?\\n");
                        if (split.length != 0) {
                            String[] split2 = split[0].split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                            int length = split2.length;
                            if (length >= 2) {
                                r4.A01 = split2[1];
                            }
                            if (length >= 3) {
                                Integer.parseInt(split2[2]);
                                return r4;
                            }
                        }
                        return r4;
                    } else if (!obj.equals("v4")) {
                        AnonymousClass0LU.A0D("FileParsingUtils", "getSchemaHashFromMclistFile: failed to get header version");
                        return r4;
                    } else {
                        ByteBuffer allocate3 = ByteBuffer.allocate(28);
                        allocate3.order(ByteOrder.LITTLE_ENDIAN);
                        if (readableByteChannel.read(allocate3) != 28) {
                            AnonymousClass0LU.A0D("FileParsingUtils", "getSchemaHashFromMclistFile: failed to get header required info");
                            return r4;
                        }
                        allocate3.flip();
                        short s = allocate3.getShort();
                        if (allocate3.getShort() != Short.MAX_VALUE) {
                            AnonymousClass0LU.A0D("FileParsingUtils", "getSchemaHashFromMclistFile: magic mismatch");
                            return r4;
                        }
                        allocate3.getShort();
                        r4.A00 = allocate3.getShort() & 65535;
                        allocate3.getShort();
                        allocate3.getShort();
                        allocate3.getShort();
                        allocate3.getShort();
                        allocate3.position(26);
                        short s2 = allocate3.getShort();
                        ByteBuffer allocate4 = ByteBuffer.allocate(s2);
                        int i = s2 + 30;
                        if (s != i) {
                            AnonymousClass0LU.A0P("FileParsingUtils", "getSchemaHashFromMclistFile: header size doesn't match, in file: %d, read: %d", C18210wN.A1Y(Integer.valueOf(s), i));
                            return r4;
                        } else if (readableByteChannel.read(allocate4) != s2) {
                            AnonymousClass0LU.A0D("FileParsingUtils", "getSchemaHashFromMclistFile: failed to read hash");
                            return r4;
                        } else {
                            allocate4.flip();
                            r4.A01 = Charset.forName("US-ASCII").decode(allocate4).toString();
                            return r4;
                        }
                    }
                }
            }
            AnonymousClass0LU.A0D("FileParsingUtils", "getHeaderInfoFromParamsMapFile: failed to get first two chars");
            return r4;
        } catch (IOException e) {
            e = e;
            str = "getHeaderInfoFromParamsMapFile: IOException";
            AnonymousClass0LU.A0J("FileParsingUtils", str, e);
            return r4;
        } catch (NumberFormatException e2) {
            e = e2;
            str = "getHeaderInfoFromParamsMapFile: NumberFormatException while getting content from v2";
            AnonymousClass0LU.A0J("FileParsingUtils", str, e);
            return r4;
        }
    }
}
