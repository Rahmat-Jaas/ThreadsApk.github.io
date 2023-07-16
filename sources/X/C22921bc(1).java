package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.api.schemas.XFBFXIGPCEntryPoint;
import com.instagram.barcelona.R;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1bc  reason: invalid class name and case insensitive filesystem */
public final class C22921bc extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "AccountLinkingIGPCToACUpsellFragment";
    public C62813an A00;
    public AnonymousClass3Fo A01;
    public UserSession A02;
    public boolean A03;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.CtO(true);
        r3.CtT(true);
        r3.setTitle(requireActivity().getString(2131820851));
    }

    public final String getModuleName() {
        return "account_linking_igpc_to_ac_upsell";
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        UserSession userSession = this.A02;
        String obj = AnonymousClass2A2.A03.toString();
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, obj);
        C63003bJ.A00(AnonymousClass2AF.A0k, userSession, obj, (String) null);
        C18190wL.A19(this);
        return A1Z;
    }

    public final void afterOnResume() {
        C12560m7 parentFragmentManager;
        String str;
        super.afterOnResume();
        AnonymousClass3Fo r1 = this.A01;
        if (r1.A01) {
            parentFragmentManager = getParentFragmentManager();
            str = "UserOptionsFragment.USER_OPTIONS_FRAGMENT_BACKSTATE_NAME";
        } else if (r1.A00) {
            boolean z = this.A03;
            parentFragmentManager = getParentFragmentManager();
            if (z) {
                str = "AccountLinkingMainGroupManagementFragment.BACK_STACK_STATE_NAME";
            } else {
                str = "AccountLinkingChildGroupManagementFragment.BACK_STACK_STATE_NAME";
            }
        } else {
            return;
        }
        parentFragmentManager.A11(str, 0);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-138460773);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0V = C18180wK.A0V(requireArguments);
        this.A02 = A0V;
        this.A00 = C62813an.A01(A0V);
        this.A03 = requireArguments.getBoolean("is_parent_account");
        this.A01 = new AnonymousClass3Fo(this.A02);
        C14030oh.A09(-2121905841, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String A022;
        String BK7;
        List list;
        int A023 = C14030oh.A02(-785406218);
        View inflate = layoutInflater.inflate(R.layout.account_linking_setup_igpc_to_ac_upsell_fragment, viewGroup, false);
        IgdsHeadline A0S = C18240wQ.A0S(inflate, R.id.igpc_to_ac_upsell_title_textview);
        A0S.A05 = true;
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.continue_linking_button);
        User A0Y = AnonymousClass0wJ.A0Y(this.A02);
        C72144Mm r0 = null;
        AccountFamily A024 = C62813an.A02(C62813an.A01(this.A02), this.A02);
        if (A024 != null) {
            if (this.A00.A08(A0Y.getId())) {
                list = A024.A03;
            } else {
                list = A024.A04;
            }
            List A002 = C50492t5.A00(list);
            if (!A002.isEmpty()) {
                r0 = (C72144Mm) A002.get(0);
            }
        }
        r0.getClass();
        if (this.A00.A08(A0Y.getId())) {
            A022 = A0Y.BK7();
            BK7 = r0.A02();
        } else {
            A022 = r0.A02();
            BK7 = A0Y.BK7();
        }
        A0S.setBody(C16370sw.A01(AnonymousClass0wJ.A0B(this), new String[]{A022, BK7}, 2131820859), (View.OnClickListener) null);
        progressButton.setText((CharSequence) AnonymousClass0wJ.A0B(this).getString(2131820863));
        A0S.setHeadline((CharSequence) AnonymousClass0wJ.A0B(this).getString(2131820862));
        this.A00.A04(this.A02);
        AnonymousClass0wJ.A18(progressButton, 2, r0, this);
        AnonymousClass0wJ.A16(inflate.requireViewById(R.id.not_now_button), 25, this);
        UserSession userSession = this.A02;
        String obj = AnonymousClass2A2.A03.toString();
        C04220Ms.A0B(userSession, 0);
        C04220Ms.A0B(obj, 1);
        C63003bJ.A00(AnonymousClass2AF.A0i, userSession, obj, (String) null);
        UserSession userSession2 = this.A02;
        C04220Ms.A0B(userSession2, 1);
        XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint = XFBFXIGPCEntryPoint.LOGIN_INFO;
        try {
            C04220Ms.A0B(xFBFXIGPCEntryPoint, 1);
            H1T A0P = C18180wK.A0P(userSession2);
            C18190wL.A1P(A0P, "fxcal/", "igpc_update_upsell_timestamp/");
            A0P.A0B(AnonymousClass1Qo.class, C59133Jq.class);
            C32165H8c A0T = C18200wM.A0T(A0P, "upsell_entrypoint", xFBFXIGPCEntryPoint.A00);
            C04220Ms.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FXCALIGPCUpsellResponse>>");
            C31155GhB.A03(A0T);
        } catch (Exception e) {
            String obj2 = xFBFXIGPCEntryPoint.toString();
            String format = String.format("Failed to update IGPC Upsell timestamp! \n%s", Arrays.copyOf(new Object[]{e.getMessage()}, 1));
            C04220Ms.A06(format);
            C63003bJ.A02(userSession2, obj2, format);
        }
        C14030oh.A09(-58505277, A023);
        return inflate;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1960784976);
        super.onResume();
        C14030oh.A09(-1805290785, A022);
    }
}
