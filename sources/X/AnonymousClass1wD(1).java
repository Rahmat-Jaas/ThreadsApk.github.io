package X;

import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import java.util.ArrayList;

/* renamed from: X.1wD  reason: invalid class name */
public final class AnonymousClass1wD extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "BreakScreenBottomSheetFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r1) {
    }

    public final String getModuleName() {
        return "break_screen_menu_bottom_sheet";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final void onResume() {
        int A02 = C14030oh.A02(-1537343550);
        super.onResume();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass4MA.A02(new IDxCListenerShape202S0100000_1_I2_1(this, 366), AnonymousClass0wJ.A0B(this).getString(2131836596), A0v);
        AnonymousClass4MA.A02(new IDxCListenerShape202S0100000_1_I2_1(this, 367), AnonymousClass0wJ.A0B(this).getString(2131823054), A0v);
        setItems(A0v);
        C14030oh.A09(-127138111, A02);
    }
}
