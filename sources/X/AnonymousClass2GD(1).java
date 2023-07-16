package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.2GD  reason: invalid class name */
public final class AnonymousClass2GD {
    public static final Object A00(AnonymousClass601 r5, C63893iY r6) {
        C26641qy parseFromJson = AnonymousClass3WN.parseFromJson(C18180wK.A0L(C63893iY.A0D(r6, AnonymousClass0wJ.A1Y(r6, r5) ? 1 : 0)));
        C10300i6 A0F = C63913ic.A0F(r5);
        C04220Ms.A0C(A0F, "null cannot be cast to non-null type com.instagram.service.session.LoggedOutSession");
        Fragment A01 = C63913ic.A01(r5);
        C04220Ms.A0C(A01, "null cannot be cast to non-null type com.instagram.nux.fragment.LoginLandingFragment");
        parseFromJson.getClass();
        AnonymousClass3XX r1 = new AnonymousClass3XX((Object) parseFromJson);
        new C26731r7(r5, (C23151ca) A01, (C07530bf) A0F).onFail(r1);
        return null;
    }
}
