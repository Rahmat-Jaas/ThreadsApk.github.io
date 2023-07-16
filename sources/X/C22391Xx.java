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

/* renamed from: X.1Xx  reason: invalid class name and case insensitive filesystem */
public final class C22391Xx extends C34640IcN {
    public static final String __redex_internal_original_name = "SeparateSequenceIntroductionNuxBottomSheetFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final String getModuleName() {
        return "SEPARATE_SEQUENCE_INTRODUCTION_NUX_BOTTOM_SHEET_FRAGMENT";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0I(view, R.id.new_remix_introduction_headline);
        igdsHeadline.A08(R.drawable.ig_illustrations_illo_sequence_refresh, false);
        igdsHeadline.setHeadline(2131829198);
        igdsHeadline.setBody(2131829197);
        Context A0A = C18190wL.A0A(igdsHeadline);
        Resources resources = A0A.getResources();
        C62263Ya A002 = C62263Ya.A00(A0A);
        A002.A03(resources.getString(2131829194), resources.getString(2131829193), R.drawable.instagram_remix_sequential_pano_outline_24);
        A002.A03(resources.getString(2131829192), resources.getString(2131829191), R.drawable.instagram_camera_pano_outline_24);
        igdsHeadline.setBulletList(C62263Ya.A01(A002, resources.getString(2131829196), resources.getString(2131829195), R.drawable.instagram_remix_pano_outline_24));
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0I(view, R.id.new_remix_introduction_bottom_buttons);
        igdsBottomButtonLayout.setDividerVisible(true);
        igdsBottomButtonLayout.setPrimaryActionText(requireContext().getString(2131829199));
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(C18190wL.A0H(this, 243));
        igdsBottomButtonLayout.setSecondaryButtonEnabled(false);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(871663065);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_new_remix_introduction_bottomsheet, viewGroup, false);
        C14030oh.A09(959103455, A02);
        return inflate;
    }
}
