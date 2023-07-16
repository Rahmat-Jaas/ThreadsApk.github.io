package X;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: X.4aC  reason: invalid class name and case insensitive filesystem */
public final class C74294aC extends C02220Ah implements AnonymousClass0ZU {
    public static final C74294aC A00 = new C74294aC();

    public C74294aC() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        DisplayMetrics displayMetrics;
        Resources system = Resources.getSystem();
        if (system == null || (displayMetrics = system.getDisplayMetrics()) == null) {
            i = 0;
        } else {
            i = displayMetrics.densityDpi;
        }
        return Integer.valueOf(i);
    }
}
