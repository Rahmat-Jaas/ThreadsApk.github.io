package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape41S0100000_I2_21;

/* renamed from: X.1Yg  reason: invalid class name and case insensitive filesystem */
public final class C22481Yg extends C34640IcN {
    public static final String __redex_internal_original_name = "PromoteDeleteDraftBottomSheetFragment";
    public View A00;
    public View A01;
    public C37741K2b A02;
    public C37352Jq1 A03;
    public PromoteData A04;
    public UserSession A05;
    public final C04530Oa A06 = AnonymousClass0OY.A02(new KtLambdaShape41S0100000_I2_21(this, 31));

    public final String getModuleName() {
        return "promote_delete_draft_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18200wM.A17(AnonymousClass0wJ.A0B(this), (TextView) AnonymousClass0wJ.A0J(view, R.id.delete_draft_bottom_sheet_title), 2131833276);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.discard_button_row);
        this.A01 = A0K;
        String str = "discardButtonRow";
        TextView textView = (TextView) AnonymousClass0wJ.A0J(A0K, R.id.promote_bottom_sheet_button_text);
        C18200wM.A17(AnonymousClass0wJ.A0B(this), textView, 2131833386);
        C18180wK.A0s(requireContext(), textView, R.color.igds_error_or_destructive);
        View view2 = this.A01;
        if (view2 != null) {
            AnonymousClass0wJ.A16(view2, 190, this);
            View view3 = this.A01;
            if (view3 != null) {
                view3.setClickable(true);
                View A0K2 = AnonymousClass0wJ.A0K(view, R.id.cancel_button_row);
                this.A00 = A0K2;
                str = "cancelButtonRow";
                C18200wM.A17(AnonymousClass0wJ.A0B(this), (TextView) AnonymousClass0wJ.A0J(A0K2, R.id.promote_bottom_sheet_button_text), 2131833385);
                View view4 = this.A00;
                if (view4 != null) {
                    AnonymousClass0wJ.A16(view4, 191, this);
                    View view5 = this.A00;
                    if (view5 != null) {
                        view5.setClickable(true);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A05;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-908623939);
        super.onCreate(bundle);
        PromoteData A0P = C18190wL.A0P(this);
        this.A04 = A0P;
        String str = "promoteData";
        UserSession userSession = A0P.A0v;
        C04220Ms.A05(userSession);
        this.A05 = userSession;
        PromoteData promoteData = this.A04;
        if (promoteData != null) {
            this.A03 = new C37352Jq1(requireActivity(), this, promoteData.A0v);
            UserSession userSession2 = this.A05;
            if (userSession2 == null) {
                str = "userSession";
            } else {
                C37741K2b A012 = C37741K2b.A01(userSession2);
                C04220Ms.A06(A012);
                this.A02 = A012;
                C14030oh.A09(-191386834, A022);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1466813216);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.promote_delete_draft_bottom_sheet_view, false);
        C14030oh.A09(-1858800277, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(945054142);
        super.onDestroyView();
        C14030oh.A09(252659642, A022);
    }
}
