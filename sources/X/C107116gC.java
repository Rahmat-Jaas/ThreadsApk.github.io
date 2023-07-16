package X;

import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.6gC  reason: invalid class name and case insensitive filesystem */
public final class C107116gC {
    public final C40921Lrg A00;
    public final Locale A01;

    public C107116gC(String str, ByteBuffer byteBuffer) {
        String str2;
        this.A00 = new C40921Lrg(str, byteBuffer);
        String[] split = str.split("_");
        String str3 = split[0];
        if (split.length > 1) {
            str2 = split[1];
        } else {
            str2 = "";
        }
        this.A01 = new Locale(str3, str2);
    }
}
