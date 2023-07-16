package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2IP  reason: invalid class name */
public final class AnonymousClass2IP {
    public static final Object A00(AnonymousClass601 r6, C63893iY r7) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r7, r6);
        String A0D = C63893iY.A0D(r7, 0);
        r7.A00.get(A1Z ? 1 : 0);
        FragmentActivity A05 = C63913ic.A05(r6);
        C10300i6 A0F = C63913ic.A0F(r6);
        C18200wM.A1R(A0F);
        Bundle A06 = C18180wK.A06();
        A06.putString("dictionary_manager_entrypoint", "bloks");
        A06.putString("dictionary_manager_surface_name", A0D);
        C63863iT.A0A(A05, A06, A0F, "muted_words_dictionary_manager");
        return null;
    }
}
