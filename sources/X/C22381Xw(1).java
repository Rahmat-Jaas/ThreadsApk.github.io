package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.1Xw  reason: invalid class name and case insensitive filesystem */
public final class C22381Xw extends C34640IcN {
    public static final String __redex_internal_original_name = "NewRemixIntroductionNuxBottomSheetFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final String getModuleName() {
        return "SEPARATE_SEQUENCE_INTRODUCTION_NUX_BOTTOM_SHEET_FRAGMENT";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        int i;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("KEY_IS_NEW_REMIX_VERSION", false);
        }
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0I(view, R.id.new_remix_introduction_headline);
        Context A0A = C18190wL.A0A(igdsHeadline);
        Resources resources = A0A.getResources();
        C62263Ya A002 = C62263Ya.A00(A0A);
        igdsHeadline.A08(R.drawable.ig_illustrations_illo_remix_refresh, false);
        igdsHeadline.setHeadline(2131831696);
        if (z) {
            C04220Ms.A06(resources);
            A002.A03(resources.getString(2131831695), resources.getString(2131831694), R.drawable.instagram_collage_pano_outline_24);
            string = resources.getString(2131831687);
            string2 = resources.getString(2131831686);
            i = R.drawable.instagram_camera_pano_outline_24;
        } else {
            C04220Ms.A06(resources);
            igdsHeadline.setBody(2131831691);
            string = resources.getString(2131831689);
            string2 = resources.getString(2131831688);
            i = R.drawable.instagram_remix_pano_outline_24;
        }
        A002.A03(string, string2, i);
        igdsHeadline.setBulletList(C62263Ya.A01(A002, resources.getString(2131831693), resources.getString(2131831692), R.drawable.instagram_remix_sequential_pano_outline_24));
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0I(view, R.id.new_remix_introduction_bottom_buttons);
        igdsBottomButtonLayout.setDividerVisible(true);
        igdsBottomButtonLayout.setPrimaryActionText(requireContext().getString(2131831690));
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(C18190wL.A0H(this, 242));
        igdsBottomButtonLayout.setSecondaryButtonEnabled(false);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-201669100);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_new_remix_introduction_bottomsheet, viewGroup, false);
        C14030oh.A09(-768090713, A02);
        return inflate;
    }
}
