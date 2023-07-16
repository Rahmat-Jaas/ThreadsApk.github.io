package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1YK  reason: invalid class name */
public final class AnonymousClass1YK extends C34640IcN {
    public static final String __redex_internal_original_name = "PromoteCreativeOptimizationBottomSheetFragment";
    public C37741K2b A00;
    public boolean A01;
    public final C04530Oa A02 = C80644m9.A00(this);

    public final String getModuleName() {
        return "promote_automatic_creative_optimization_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        TextView A0L;
        int i;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18180wK.A10(AnonymousClass0wJ.A0L(view, R.id.title), this, 2131833579);
        AnonymousClass0wJ.A0L(view, R.id.body).setGravity(8388611);
        C18190wL.A18(view, R.id.body_1, 0);
        C18190wL.A18(view, R.id.body_2, 0);
        C18190wL.A18(view, R.id.body_3, 0);
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A02);
        boolean A0E = C63803iN.A0E(C18250wR.A0D(A0U, 0), A0U, 36325377395729481L);
        TextView A0L2 = AnonymousClass0wJ.A0L(view, R.id.body);
        if (A0E) {
            C18180wK.A10(A0L2, this, 2131833578);
            C18180wK.A10(AnonymousClass0wJ.A0L(view, R.id.body_1), this, 2131833572);
            C18180wK.A10(AnonymousClass0wJ.A0L(view, R.id.body_2), this, 2131833574);
            C18180wK.A10(AnonymousClass0wJ.A0L(view, R.id.body_3), this, 2131833575);
            C18190wL.A18(view, R.id.body_4, 0);
            A0L = AnonymousClass0wJ.A0L(view, R.id.body_4);
            i = 2131833577;
        } else {
            C18180wK.A10(A0L2, this, 2131833570);
            C18180wK.A10(AnonymousClass0wJ.A0L(view, R.id.body_1), this, 2131833571);
            C18180wK.A10(AnonymousClass0wJ.A0L(view, R.id.body_2), this, 2131833573);
            A0L = AnonymousClass0wJ.A0L(view, R.id.body_3);
            i = 2131833576;
        }
        C18180wK.A10(A0L, this, i);
        C18190wL.A18(view, R.id.text_link, 0);
        C18180wK.A10(AnonymousClass0wJ.A0L(view, R.id.text_link), this, 2131833568);
        AnonymousClass0wJ.A16(view.requireViewById(R.id.text_link), 180, this);
        C37741K2b k2b = this.A00;
        if (k2b == null) {
            C04220Ms.A0E("promoteLogger");
            throw null;
        }
        k2b.A0L(C35394Iu2.A06, "automatic_creative_optimization_bottom_sheet");
        if (this.A01) {
            View A0K = AnonymousClass0wJ.A0K(view, R.id.back_button);
            A0K.setVisibility(0);
            AnonymousClass0wJ.A16(A0K, 181, this);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        int A022 = C14030oh.A02(-133802609);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("enable_back_button");
        } else {
            z = false;
        }
        this.A01 = z;
        C37741K2b A012 = C37741K2b.A01(AnonymousClass0wJ.A0X(this.A02));
        C04220Ms.A06(A012);
        this.A00 = A012;
        C14030oh.A09(-89075285, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1080462415);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_title_body_bottom_sheet_view, viewGroup, false);
        C14030oh.A09(1443337030, A022);
        return inflate;
    }
}
