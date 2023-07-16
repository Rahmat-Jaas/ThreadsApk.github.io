package X;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.0la  reason: invalid class name and case insensitive filesystem */
public final class C12250la {
    public int A00 = 0;
    public long A01 = 0;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final UUID A05;

    public C12250la(String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A05 = UUID.randomUUID();
        this.A04 = new HashMap();
    }
}
