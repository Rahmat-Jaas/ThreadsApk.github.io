package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.3Tj  reason: invalid class name and case insensitive filesystem */
public final class C61423Tj {
    public static void A00(C25786Drz drz) {
        C19554AyF ayF = C19554AyF.A01;
        AnonymousClass7Ko.A07(ayF, "Error! Trying to access ReelsPlugin without an instance!");
        drz.A03 = ayF.A00.A01();
        drz.A05();
    }

    public final Fragment A01() {
        AnonymousClass228 r3 = AnonymousClass228.ALL_SETTINGS;
        AnonymousClass1wT r2 = new AnonymousClass1wT();
        Bundle A06 = C18180wK.A06();
        A06.putSerializable("ReelSettingsFragment.ARGUMENT_REEL_SETTINGS_MODE", r3);
        r2.setArguments(A06);
        return r2;
    }
}
