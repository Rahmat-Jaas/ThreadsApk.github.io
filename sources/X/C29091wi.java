package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.1wi  reason: invalid class name and case insensitive filesystem */
public final class C29091wi extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "VerifiedUserCallingAllowlistTypeSelectionFragment";
    public int A00;
    public String A01 = "call_settings";
    public final C04530Oa A02 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131822918);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0B();
        C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this, AnonymousClass0wJ.A0U(this.A02)), "call_settings_page_impression"), 121).Bb4();
    }

    public final String getModuleName() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    private final void A0B() {
        Context requireContext = requireContext();
        AnonymousClass06E A002 = AnonymousClass06E.A00(this);
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A02);
        C04220Ms.A0B(A0U, 0);
        H1T A0P = AnonymousClass0wJ.A0P(A0U);
        A0P.A0J("video_call/retrieve_user_call_settings/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, AnonymousClass1RM.class, AnonymousClass3KF.class);
        C63873iU.A0E(A0T, this, 157);
        C31155GhB.A01(requireContext, A002, A0T);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-2085719142);
        super.onCreate(bundle);
        String A0k = C18190wL.A0k(this);
        if (A0k != null) {
            this.A01 = A0k;
        }
        C14030oh.A09(-56241520, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(597955744);
        super.onResume();
        A0B();
        C14030oh.A09(-892804855, A022);
    }
}
