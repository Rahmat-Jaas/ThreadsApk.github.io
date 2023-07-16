package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.1Qb  reason: invalid class name and case insensitive filesystem */
public final class C21271Qb extends AnonymousClass1cf implements C82804qI {
    public static final String __redex_internal_original_name = "PasswordTooEasyFragment";
    public RegFlowExtras A00;
    public C07530bf A01;
    public final Handler A02 = C18250wR.A08();

    public final void Csx(String str, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C36482Rm.A00(activity, this.A02, this, this, this.A00, this.A00, this.A01, AnonymousClass2AT.A0A.A00, str, str2, (String) null);
        }
    }

    public final String getModuleName() {
        return "password_too_easy";
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1001895725);
        super.onCreate(bundle);
        this.A01 = C18210wN.A0N(this);
        this.A00 = C18210wN.A0M(this);
        C14030oh.A09(1580057452, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass3YT.A00.A01(this.A01, this.A00.A01(), AnonymousClass2AT.A0A.A00.A01);
    }
}
