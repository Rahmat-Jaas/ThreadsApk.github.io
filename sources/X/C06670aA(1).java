package X;

import java.io.File;

/* renamed from: X.0aA  reason: invalid class name and case insensitive filesystem */
public final class C06670aA implements AnonymousClass0OB {
    public static final C06670aA A00 = new C06670aA();

    public final /* bridge */ /* synthetic */ Object AFC(AnonymousClass0OK r4) {
        File file = r4.A03().A04;
        C002801h.A02(file, "Did you call SessionManager.init()?");
        return new C05980Xe(new File(file, "logcat.txt"));
    }
}
