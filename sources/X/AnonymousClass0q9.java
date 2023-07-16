package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0q9  reason: invalid class name */
public enum AnonymousClass0q9 {
    SUPERPACK_XZ("assets/lib/libs.spk.xz", ".spk.xz"),
    SUPERPACK_BR("assets/lib/libs.spk.br", ".spk.br"),
    SUPERPACK_OB("assets/lib/libs.spo", ".spo");
    
    public static Map A02;
    public final String A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        AnonymousClass0q9 r9;
        AnonymousClass0q9 r10;
        AnonymousClass0q9 r11;
        AnonymousClass0q9 r12;
        AnonymousClass0q9 r13;
        AnonymousClass0q9 r14;
        HashMap hashMap = new HashMap();
        A02 = hashMap;
        hashMap.put(".xzs", r9);
        A02.put(".zstd", r10);
        A02.put(".spk.xz", r11);
        A02.put(".spk.zst", r12);
        A02.put(".spk.br", r13);
        A02.put(".spo", r14);
    }

    /* access modifiers changed from: public */
    AnonymousClass0q9(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
