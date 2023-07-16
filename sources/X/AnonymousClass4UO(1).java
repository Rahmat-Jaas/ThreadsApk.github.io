package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.4UO  reason: invalid class name */
public final class AnonymousClass4UO implements C04530Oa {
    public C10300i6 A00;
    public final Fragment A01;
    public final AnonymousClass0YY A02;

    public final boolean BV5() {
        return AnonymousClass0wJ.A1W(this.A00);
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        C10300i6 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        Bundle requireArguments = this.A01.requireArguments();
        if (requireArguments.getString("IgSessionManager.SESSION_TOKEN_KEY") != null) {
            C10300i6 r02 = (C10300i6) this.A02.invoke(requireArguments);
            this.A00 = r02;
            return r02;
        }
        throw C18180wK.A0a("Session token not in fragment arguments.");
    }

    public AnonymousClass4UO(Fragment fragment, AnonymousClass0YY r2) {
        this.A01 = fragment;
        this.A02 = r2;
    }
}
