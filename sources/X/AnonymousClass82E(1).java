package X;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: X.82E  reason: invalid class name */
public final class AnonymousClass82E implements Runnable {
    public final /* synthetic */ C114926u8 A00;
    public final /* synthetic */ IF5 A01;
    public final /* synthetic */ String A02;

    public AnonymousClass82E(C114926u8 r1, IF5 if5, String str) {
        this.A00 = r1;
        this.A01 = if5;
        this.A02 = str;
    }

    public final void run() {
        C114926u8 r3 = this.A00;
        IF5 if5 = this.A01;
        String str = this.A02;
        Charset charset = StandardCharsets.UTF_8;
        C04220Ms.A08(charset);
        byte[] bytes = str.getBytes(charset);
        C04220Ms.A06(bytes);
        String encodeToString = Base64.encodeToString(bytes, 2);
        C04220Ms.A06(encodeToString);
        r3.A01(if5, encodeToString);
    }
}
