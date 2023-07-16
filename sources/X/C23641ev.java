package X;

import android.os.Bundle;

/* renamed from: X.1ev  reason: invalid class name and case insensitive filesystem */
public final class C23641ev extends AnonymousClass1wA {
    public static final String __redex_internal_original_name = "RageshakeBottomSheetSuggestUpdateFragment";

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(665948375);
        super.onCreate(bundle);
        if (C19573AyZ.A03(this.A06)) {
            C14030oh.A09(759044167, A02);
            return;
        }
        IllegalStateException A0a = C18180wK.A0a("this screen should only be visible to employees");
        C14030oh.A09(-1708710855, A02);
        throw A0a;
    }
}
