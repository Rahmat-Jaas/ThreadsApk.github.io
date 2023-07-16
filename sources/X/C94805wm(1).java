package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.io.Serializable;

/* renamed from: X.5wm  reason: invalid class name and case insensitive filesystem */
public final class C94805wm extends C34640IcN {
    public static final String __redex_internal_original_name = "ContactPointUpdateUpsellsBottomSheetFragment";
    public C112766q9 A00;
    public AnonymousClass694 A01;
    public C170759vW A02;
    public AnonymousClass79D A03;
    public String A04;
    public final C04530Oa A05 = AnonymousClass3W9.A00(this);

    public final String getModuleName() {
        return "contact_point_update_upsell_bottom_sheet";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        Serializable serializable;
        int A022 = C14030oh.A02(392452175);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable2 = null;
        if (bundle2 != null) {
            str = bundle2.getString(C86144wL.A0n());
        } else {
            str = null;
        }
        this.A04 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        } else {
            serializable = null;
        }
        this.A02 = (C170759vW) serializable;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            serializable2 = bundle4.getSerializable("copy_version");
        }
        C04220Ms.A0C(serializable2, "null cannot be cast to non-null type com.instagram.wellbeing.upsells.analytics.ContactPointUpdateUpsellVersion");
        this.A01 = (AnonymousClass694) serializable2;
        AnonymousClass79D r4 = new AnonymousClass79D(this, AnonymousClass0wJ.A0X(this.A05));
        this.A03 = r4;
        this.A00 = new C112766q9(this.A02, r4, C972868t.CONTACT_POINT_UPDATE, this.A04);
        C14030oh.A09(-761118687, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1567723028);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.contact_point_upsell_bottom_sheet, viewGroup, false);
        Context requireContext = requireContext();
        AnonymousClass694 r0 = this.A01;
        if (r0 != null) {
            String A0k = AnonymousClass0wJ.A0k(requireContext, r0.A02);
            Context requireContext2 = requireContext();
            AnonymousClass694 r02 = this.A01;
            if (r02 != null) {
                String string = requireContext2.getString(r02.A00);
                IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0J(inflate, R.id.upsell_bottom_sheet_headline);
                C04220Ms.A0B(igdsHeadline, 0);
                igdsHeadline.A05 = true;
                igdsHeadline.setHeadline((CharSequence) A0k);
                if (string != null) {
                    igdsHeadline.setBody((CharSequence) string);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(inflate, R.id.bottom_bar);
                IDxCListenerShape203S0100000_2_I2 A0P = C86134wK.A0P(this, 169);
                C25745DrH A0a = C18230wP.A0a(this);
                AnonymousClass694 r03 = this.A01;
                if (r03 != null) {
                    C102476Vi.A00(igdsBottomButtonLayout, new C110156lD(A0P, A0a, r03.A01, 2131837518));
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
                    C14030oh.A09(2025294122, A022);
                    return inflate;
                }
            }
        }
        C04220Ms.A0E("copyVersion");
        throw null;
    }
}
