package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.1Qa  reason: invalid class name and case insensitive filesystem */
public final class C21261Qa extends AnonymousClass1cf {
    public static final String __redex_internal_original_name = "CreatePasswordFragment";
    public RegFlowExtras A00;
    public C07530bf A01;

    public final String getModuleName() {
        return "sac_create_password";
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1427979047);
        super.onCreate(bundle);
        this.A01 = C18210wN.A0N(this);
        this.A00 = C18210wN.A0M(this);
        C14030oh.A09(-982883087, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass3YT.A00.A01(this.A01, C313625r.SAC, AnonymousClass2AT.A0C.A00.A01);
    }
}
