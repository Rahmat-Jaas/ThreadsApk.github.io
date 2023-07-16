package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxCBackShape840S0100000_1_I2;
import com.instagram.common.api.base.IDxACallbackShape4S1100000_1_I2;

/* renamed from: X.1x6  reason: invalid class name */
public final class AnonymousClass1x6 extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "BirthdayVisibilitySettingsFragment";
    public C58133Eb A00;
    public String A01 = AnonymousClass250.NONE.A01;
    public AnonymousClass3TR A02;
    public final C04530Oa A03 = C62373Zc.A02(this, 37);

    public final void configureActionBar(AnonymousClass4u2 r4) {
        C04220Ms.A0B(r4, 0);
        AnonymousClass4u2.A07(r4, 2131822318);
        C25764Drc A0K = C18240wQ.A0K();
        A0K.A0F = AnonymousClass0wJ.A0B(this).getString(2131835122);
        r4.A7Q(C18190wL.A0L(A0K, this, 233));
    }

    public final String getModuleName() {
        return "birthday_visibility_settings_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0B(this);
    }

    public static final void A0B(AnonymousClass1x6 r3) {
        r3.setItems(C18180wK.A0n(new C49092qp()));
        C10300i6 A0U = AnonymousClass0wJ.A0U(r3.A03);
        C04220Ms.A0B(A0U, 0);
        H1T A0P = C18180wK.A0P(A0U);
        AnonymousClass0wJ.A1J(A0P, "users/", "get_birthday_visibility_setting/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, C21341Qi.class, C58993Ja.class);
        C04220Ms.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayVisibilitySettingResponse>>");
        C63873iU.A0C(r3, A0T, 147);
    }

    public static final void A0C(AnonymousClass1x6 r3) {
        AnonymousClass3TR r2 = r3.A02;
        if (r2 != null) {
            C38040KHr.A01.CWx(new E5S(r2));
            r3.A02 = null;
        }
    }

    public static final void A0D(AnonymousClass1x6 r5, String str) {
        C10300i6 A0U = AnonymousClass0wJ.A0U(r5.A03);
        C04220Ms.A0B(str, 0);
        AnonymousClass250 r0 = (AnonymousClass250) AnonymousClass250.A03.get(str);
        if (r0 == null) {
            r0 = AnonymousClass250.NONE;
        }
        int i = r0.A00;
        Integer valueOf = Integer.valueOf(i);
        C04220Ms.A0B(A0U, 0);
        H1T A0P = C18180wK.A0P(A0U);
        C18190wL.A1P(A0P, "users/", "set_birthday_opt_in_settings/");
        A0P.A0B(C21331Qh.class, AnonymousClass3JZ.class);
        if (valueOf != null) {
            A0P.A0K("visibility_status", i);
        }
        C32165H8c A022 = A0P.A02();
        C04220Ms.A0C(A022, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayOptInSettingsUpdateResponse>>");
        A022.A00 = new IDxACallbackShape4S1100000_1_I2(str, r5, 5);
        r5.schedule(A022);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public static final void A0E(AnonymousClass1x6 r5, AnonymousClass0ZU r6) {
        Context context = r5.getContext();
        if (context != null) {
            A0C(r5);
            IDxCBackShape840S0100000_1_I2 iDxCBackShape840S0100000_1_I2 = new IDxCBackShape840S0100000_1_I2(r6, 1);
            C63733iD A022 = C63733iD.A02();
            boolean A0A = AnonymousClass0fS.A0A(context);
            int i = 2131831756;
            if (A0A) {
                i = 2131836068;
            }
            C63733iD.A08(r5, A022, i);
            A022.A01 = -1;
            A022.A0D = C18180wK.A0g(r5, 2131834950);
            A022.A0I = true;
            r5.A02 = C63733iD.A04(A022, iDxCBackShape840S0100000_1_I2, 9);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1617953945);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        C04530Oa r2 = this.A03;
        setAdapter(new C29321xl(requireContext, AnonymousClass0wJ.A0U(r2), this));
        this.A00 = new C58133Eb(this, AnonymousClass0wJ.A0X(r2));
        C14030oh.A09(-486341655, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1519436624);
        super.onDestroyView();
        A0C(this);
        C14030oh.A09(1970712618, A022);
    }
}
