package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.barcelona.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.service.session.UserSession;

/* renamed from: X.1Yl  reason: invalid class name and case insensitive filesystem */
public final class C22531Yl extends C34640IcN {
    public static final String __redex_internal_original_name = "PromoteAudienceSizeEducationBottomSheetFragment";
    public SpannableStringBuilder A00;
    public IgTextView A01;
    public UserSession A02;
    public PromoteData A03;
    public String A04;

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = C18190wL.A0P(this);
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.title);
        String str2 = this.A04;
        if (str2 == null) {
            str = DialogModule.KEY_TITLE;
        } else {
            A0L.setText(str2);
            this.A01 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.body);
            A00(C18180wK.A0g(this, 2131833151), "https://www.facebook.com/business/help/283579896000936");
            A00(C18180wK.A0g(this, 2131833150), "https://business.facebook.com/business/help/metrics-labeling");
            A00(C18180wK.A0g(this, 2131833149), "https://www.facebook.com/business/help/1665333080167380?id=176276233019487");
            IgTextView igTextView = this.A01;
            str = "bodyView";
            if (igTextView != null) {
                SpannableStringBuilder spannableStringBuilder = this.A00;
                if (spannableStringBuilder == null) {
                    str = "body";
                } else {
                    igTextView.setText(spannableStringBuilder);
                    IgTextView igTextView2 = this.A01;
                    if (igTextView2 != null) {
                        C18180wK.A0z(igTextView2);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    private final void A00(String str, String str2) {
        String str3;
        SpannableStringBuilder spannableStringBuilder = this.A00;
        if (spannableStringBuilder == null) {
            str3 = "body";
        } else {
            Context requireContext = requireContext();
            UserSession userSession = this.A02;
            if (userSession == null) {
                str3 = "userSession";
            } else {
                String A012 = AnonymousClass3W8.A01(requireContext(), str2);
                C04220Ms.A06(A012);
                AnonymousClass3Zw.A00(spannableStringBuilder, new C29401xz(requireContext, userSession, (AnonymousClass36D) null, A012, C18180wK.A00(this)), str);
                this.A00 = spannableStringBuilder;
                return;
            }
        }
        C04220Ms.A0E(str3);
        throw null;
    }

    public final String getModuleName() {
        return "promote_audience_size_education_bottom_sheet_fragment";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        UserSession userSession = this.A02;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1471947060);
        super.onCreate(bundle);
        this.A02 = C18180wK.A0W(this, AnonymousClass0RA.A0C);
        this.A04 = C18180wK.A0g(this, 2131833148);
        this.A00 = C18200wM.A0E(getString(2131833147));
        C14030oh.A09(-567529860, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1760138725);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_audience_size_education_bottom_sheet_view, viewGroup, false);
        C14030oh.A09(2105866232, A022);
        return inflate;
    }
}
