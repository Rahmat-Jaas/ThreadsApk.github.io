package X;

import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0O2  reason: invalid class name */
public final class AnonymousClass0O2 {
    public static Set A05;
    public static final Charset A06 = StandardCharsets.US_ASCII;
    public int A00 = 0;
    public final C06160Xx A01;
    public final Object A02 = new Object();
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();

    public static boolean A01(String str) {
        if (A05 == null) {
            A05 = new HashSet();
            for (AnonymousClass0O1 name : AnonymousClass0O1.values()) {
                A05.add(name.name());
            }
        }
        return A05.contains(str);
    }

    public AnonymousClass0O2(C06160Xx r2) {
        this.A01 = r2;
    }

    public static void A00(AnonymousClass0O1 r3, String str, MappedByteBuffer mappedByteBuffer, int i) {
        mappedByteBuffer.position(i);
        String A002 = AnonymousClass0Y5.A00(r3.A01, true);
        Charset charset = A06;
        mappedByteBuffer.put(A002.getBytes(charset));
        mappedByteBuffer.put("=".getBytes(charset));
        mappedByteBuffer.put(AnonymousClass0Y5.A00(str, false).getBytes(charset));
        mappedByteBuffer.put("\n#".getBytes(charset));
        for (int length = str.length(); length < r3.A00; length++) {
            mappedByteBuffer.put("#".getBytes(charset));
        }
        mappedByteBuffer.put("\n".getBytes(charset));
    }
}
