package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import com.facebook.redex.IDxCBackShape840S0100000_1_I2;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;

/* renamed from: X.1x8  reason: invalid class name */
public final class AnonymousClass1x8 extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "EmbedsOptOutFragment";
    public AnonymousClass3TR A00;
    public final C04530Oa A01 = C62373Zc.A03(new KtLambdaShape116S0100000_I2_96(this, 17));

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131826748);
    }

    public final int getBottomPadding() {
        return 0;
    }

    public final String getModuleName() {
        return "embeds_opt_out";
    }

    public final int getTopPadding() {
        return 0;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0C(this);
    }

    public static final void A0B(KtCSuperShape0S0100000_I2 ktCSuperShape0S0100000_I2, AnonymousClass1x8 r4) {
        C10300i6 A0U = AnonymousClass0wJ.A0U(r4.A01);
        AnonymousClass0wJ.A1N(A0U, ktCSuperShape0S0100000_I2);
        H1T A0P = C18180wK.A0P(A0U);
        C18190wL.A1P(A0P, "accounts/", "set_embeds_opt_out/");
        A0P.A0B(AnonymousClass1R1.class, AnonymousClass3KA.class);
        Boolean bool = (Boolean) ktCSuperShape0S0100000_I2.A00;
        if (bool != null) {
            A0P.A0R("is_embeds_disabled", bool.booleanValue());
        }
        C32165H8c A02 = A0P.A02();
        C04220Ms.A0C(A02, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetEmbedsOptOutResponse>>");
        C63873iU.A0F(A02, ktCSuperShape0S0100000_I2, r4, 40);
        r4.schedule(A02);
    }

    public static final void A0C(AnonymousClass1x8 r3) {
        r3.setItems(C18180wK.A0n(new C49132qt()));
        C10300i6 A0U = AnonymousClass0wJ.A0U(r3.A01);
        C04220Ms.A0B(A0U, 0);
        H1T A0P = C18180wK.A0P(A0U);
        AnonymousClass0wJ.A1J(A0P, "accounts/", "get_embeds_opt_out/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, AnonymousClass1R1.class, AnonymousClass3KA.class);
        C04220Ms.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetEmbedsOptOutResponse>>");
        C63873iU.A0C(r3, A0T, 160);
    }

    public static final void A0D(AnonymousClass1x8 r3) {
        AnonymousClass3TR r2 = r3.A00;
        if (r2 != null) {
            C38040KHr.A01.CWx(new E5S(r2));
            r3.A00 = null;
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public static final void A0E(AnonymousClass1x8 r4, AnonymousClass0ZU r5) {
        Context context = r4.getContext();
        if (context != null) {
            A0D(r4);
            IDxCBackShape840S0100000_1_I2 iDxCBackShape840S0100000_1_I2 = new IDxCBackShape840S0100000_1_I2(r5, 2);
            C63733iD A02 = C63733iD.A02();
            int i = 2131831756;
            if (AnonymousClass0fS.A0A(context)) {
                i = 2131836068;
            }
            C63733iD.A08(r4, A02, i);
            A02.A01 = -1;
            A02.A0D = C18180wK.A0g(r4, 2131834950);
            A02.A0I = true;
            r4.A00 = C63733iD.A04(A02, iDxCBackShape840S0100000_1_I2, 10);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(814860892);
        super.onCreate(bundle);
        setAdapter(new C29331xm(requireContext(), AnonymousClass0wJ.A0U(this.A01), this));
        C14030oh.A09(-948806427, A02);
    }

    public final void onDestroyView() {
        int A02 = C14030oh.A02(-489705729);
        super.onDestroyView();
        A0D(this);
        C14030oh.A09(182831597, A02);
    }
}
