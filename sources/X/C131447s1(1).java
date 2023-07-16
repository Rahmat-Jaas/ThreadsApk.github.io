package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7s1  reason: invalid class name and case insensitive filesystem */
public final class C131447s1 implements C82394pY {
    public final C10300i6 A00;
    public final String A01;
    public final String A02;
    public final WeakReference A03;

    public C131447s1(AnonymousClass7HV r2, C10300i6 r3, String str, String str2) {
        C04220Ms.A0B(str2, 4);
        this.A00 = r3;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = C86144wL.A0w(r2);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = C14030oh.A03(-1134397147);
        C131277rh r7 = (C131277rh) obj;
        int A002 = AnonymousClass0wJ.A00(-1615561305, r7);
        AnonymousClass7HV r3 = (AnonymousClass7HV) this.A03.get();
        if (r3 == null) {
            AnonymousClass3LY.A00(this.A00).A02(this, C131277rh.class);
        } else {
            BKU bku = r7.A00;
            if (bku.A0f.A4Y.equals(this.A01)) {
                r3.A0B(this.A02, AnonymousClass6OI.A00(bku));
            }
        }
        C14030oh.A0A(-2015625496, A002);
        C14030oh.A0A(10810100, A032);
    }
}
