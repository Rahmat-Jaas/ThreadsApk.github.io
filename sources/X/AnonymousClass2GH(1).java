package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2GH  reason: invalid class name */
public final class AnonymousClass2GH {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        C22191Ts parseFromJson = C59873Mt.parseFromJson(C18180wK.A0L(C63893iY.A0D(r9, A1Z ? 1 : 0)));
        C04220Ms.A06(parseFromJson);
        Context requireContext = C63913ic.A01(r8).requireContext();
        FragmentActivity A05 = C63913ic.A05(r8);
        Fragment A01 = C63913ic.A01(r8);
        C10300i6 A0F = C63913ic.A0F(r8);
        C04220Ms.A0C(A0F, "null cannot be cast to non-null type com.instagram.service.session.LoggedOutSession");
        C36132Qd.A00(requireContext, A01, A05, C63913ic.A08(r8), parseFromJson, (C07530bf) A0F, A1Z);
        return null;
    }
}
