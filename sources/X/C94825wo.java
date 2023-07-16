package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: X.5wo  reason: invalid class name and case insensitive filesystem */
public final class C94825wo extends C34640IcN {
    public static final String __redex_internal_original_name = "UnlikedYourActivityUpsellsBottomSheetFragment";
    public C112766q9 A00;
    public String A01;
    public String A02;
    public HashMap A03;
    public C170759vW A04;
    public AnonymousClass79D A05;
    public String A06;
    public final C04530Oa A07 = AnonymousClass3W9.A00(this);

    public final String getModuleName() {
        return "unliked_your_activity_upsell_bottom_sheet";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A07);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        Serializable serializable;
        String str2;
        int A022 = C14030oh.A02(2130420526);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str3 = null;
        if (bundle2 != null) {
            str = bundle2.getString(C86144wL.A0n());
        } else {
            str = null;
        }
        this.A06 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        } else {
            serializable = null;
        }
        this.A04 = (C170759vW) serializable;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str2 = bundle4.getString("author_id");
        } else {
            str2 = null;
        }
        this.A01 = str2;
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str3 = bundle5.getString("author_username");
        }
        this.A02 = str3;
        this.A03 = AnonymousClass4WJ.A09(C18180wK.A0p("initial_author_filters", str3), C18180wK.A0p("entrypoint", "unliked_your_activity_cn"));
        AnonymousClass79D r4 = new AnonymousClass79D(this, AnonymousClass0wJ.A0X(this.A07));
        this.A05 = r4;
        this.A00 = new C112766q9(this.A04, r4, C972868t.UNLIKED_YOUR_ACTIVITY, this.A06);
        C14030oh.A09(-1849870516, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-630746358);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.your_activity_upsell_bottom_sheet, viewGroup, false);
        Context context = getContext();
        HashMap hashMap = this.A03;
        if (hashMap == null) {
            C04220Ms.A0E("bloksParams");
            throw null;
        }
        M4x.A04(context, new C210718u(AnonymousClass0wJ.A0U(this.A07)), C18170wI.A00(339), hashMap, 60);
        String A0k = AnonymousClass0wJ.A0k(requireContext(), 2131837535);
        String A0l = AnonymousClass0wJ.A0l(requireContext(), A0k, 2131837536);
        C04220Ms.A06(A0l);
        SpannableString spannableString = new SpannableString(A0l);
        spannableString.setSpan(new StyleSpan(1), AnonymousClass8bP.A0J(A0l, A0k, 0, false), AnonymousClass8bP.A0J(A0l, A0k, 0, false) + AnonymousClass2C6.A00(A0k), 33);
        String A0l2 = AnonymousClass0wJ.A0l(requireContext(), this.A02, 2131837537);
        C04220Ms.A06(A0l2);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0J(inflate, R.id.upsell_bottom_sheet_headline);
        C04220Ms.A0B(igdsHeadline, 0);
        igdsHeadline.A05 = true;
        igdsHeadline.setHeadline((CharSequence) A0l2);
        igdsHeadline.setBody((CharSequence) spannableString);
        igdsHeadline.A08(R.drawable.ig_illustrations_illo_like_visibility_refresh, false);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(inflate, R.id.bottom_bar);
        C102476Vi.A00(igdsBottomButtonLayout, new C110156lD(C86134wK.A0P(this, 171), C18230wP.A0a(this), 2131837539, 2131831869));
        igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
        C14030oh.A09(-496333493, A022);
        return inflate;
    }
}
