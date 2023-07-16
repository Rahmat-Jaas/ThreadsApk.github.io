package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.1YO  reason: invalid class name */
public final class AnonymousClass1YO extends C34640IcN {
    public static final String __redex_internal_original_name = "UnfollowChainingBottomSheetFragment";
    public C57173Aa A00;
    public String A01 = "";
    public final C04530Oa A02 = C80644m9.A00(this);

    public final String getModuleName() {
        return "unfollow_chaining_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(1322041663);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString(AnonymousClass3QF.A00(34, 8, 105))) == null) {
            str = "";
        }
        this.A01 = str;
        C14030oh.A09(-1720742949, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-145746771);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.unfollow_chaining_bottom_sheet, viewGroup, false);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0I(inflate, R.id.unfollow_chaining_headline);
        igdsHeadline.A08(R.drawable.ig_illustrations_qp_confirm, false);
        String A0o = AnonymousClass0wJ.A0o(this, this.A01, 2131837236);
        C04220Ms.A06(A0o);
        String str = this.A01;
        SpannableStringBuilder A0E = C18200wM.A0E(A0o);
        AnonymousClass3Zw.A00(A0E, new C18640xY(), str);
        igdsHeadline.setHeadline((CharSequence) A0E);
        igdsHeadline.setHeadlineStyle(R.style.igds_headline_2);
        igdsHeadline.A09(C18210wN.A0H(this, 56), 2131837235);
        C14030oh.A09(322018022, A022);
        return inflate;
    }
}
