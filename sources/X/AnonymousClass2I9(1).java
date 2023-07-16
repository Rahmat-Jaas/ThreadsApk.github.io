package X;

import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;

/* renamed from: X.2I9  reason: invalid class name */
public final class AnonymousClass2I9 {
    public static final Object A00(AnonymousClass601 r14, C63893iY r15) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r15, r14);
        Object A0B = C63893iY.A0B(r15, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.Number");
        int A04 = AnonymousClass0wJ.A04(A0B);
        int A042 = AnonymousClass0wJ.A04(C63893iY.A0C(r15, "null cannot be cast to non-null type kotlin.Number", A1Z ? 1 : 0));
        Object A09 = C63893iY.A09(r15);
        C04220Ms.A0C(A09, "null cannot be cast to non-null type kotlin.String");
        C109326jp A06 = C63893iY.A06(r15, 4);
        C25786Drz A0Q = C18180wK.A0Q(C63913ic.A05(r14), C63913ic.A0F(r14));
        C19513Axa.A00.A0P();
        IDxCListenerShape70S0200000_1_I2 iDxCListenerShape70S0200000_1_I2 = new IDxCListenerShape70S0200000_1_I2(r14, A06, 13);
        Bundle A062 = C18180wK.A06();
        A062.putBoolean("in_app_signup_flow", A1Z);
        A062.putInt("in_app_signup_stepper_index", A04);
        A062.putInt("in_app_signup_stepper_capacity", A042);
        A062.putString("in_app_signup_catalog_selection_title_text", (String) C63893iY.A0C(r15, "null cannot be cast to non-null type kotlin.String", 9));
        A062.putString("in_app_signup_bottom_button_text", (String) A09);
        A062.putString("in_app_signup_bottom_button_route", (String) C63893iY.A0C(r15, "null cannot be cast to non-null type kotlin.String", 3));
        A062.putString("waterfall_id", (String) C63893iY.A0C(r15, "null cannot be cast to non-null type kotlin.String", 5));
        C18210wN.A0x(A062, (String) C63893iY.A0C(r15, "null cannot be cast to non-null type kotlin.String", 6));
        A062.putString("presentation_style", (String) C63893iY.A0C(r15, "null cannot be cast to non-null type kotlin.String", 8));
        A062.putString("prior_module_name", (String) C63893iY.A0C(r15, "null cannot be cast to non-null type kotlin.String", 7));
        C156829Pn r0 = new C156829Pn();
        r0.A00 = iDxCListenerShape70S0200000_1_I2;
        C18180wK.A0x(A062, r0, A0Q);
        return null;
    }
}
