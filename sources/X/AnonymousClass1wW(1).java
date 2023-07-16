package X;

import java.util.ArrayList;

/* renamed from: X.1wW  reason: invalid class name */
public final class AnonymousClass1wW extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "TwoFacTextMessageControlsFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131837158);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public static final void A0B(AnonymousClass1wW r9) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        boolean z = r9.requireArguments().getBoolean("is_two_factor_enabled");
        AnonymousClass4MC A03 = AnonymousClass4MC.A03(new C65683uy(r9, z, r9.requireArguments().getBoolean("is_totp_two_factor_enabled")), 2131837124, z);
        int A032 = C18220wO.A03(AnonymousClass0wJ.A0B(r9));
        A03.A05 = A032;
        A03.A00 = A032;
        if (z) {
            String A0L = AnonymousClass00U.A0L("****", C62923b9.A00(C63833iQ.A08(r9.requireArguments())));
            C04220Ms.A06(A0L);
            A03.A0A = AnonymousClass0wJ.A0o(r9, A0L, 2131837123);
        } else {
            A03.A02 = 2131837125;
        }
        A0v.add(A03);
        A0v.add(new C62593aM(C18190wL.A0H(r9, 550), (String) null, 2131837159, 2131837157, false));
        r9.setItems(A0v);
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final void onResume() {
        int A02 = C14030oh.A02(1335991584);
        super.onResume();
        A0B(this);
        C14030oh.A09(970230223, A02);
    }
}
