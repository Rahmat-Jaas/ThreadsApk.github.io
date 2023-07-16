package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.6ol  reason: invalid class name and case insensitive filesystem */
public final class C111976ol {
    public final C10300i6 A00;

    public C111976ol(C10300i6 r1) {
        this.A00 = r1;
    }

    public final void A00(String str, String str2, Throwable th) {
        C14100oo ABJ = C10770iu.A00().ABJ(str, 817900293);
        ABJ.A8U(DialogModule.KEY_MESSAGE, str2);
        ABJ.Ciu(th);
        ABJ.report();
    }
}
