package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C34640IcN;
import X.C63813iO;
import X.C82034oy;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.service.session.UserSession;

public class IgdsInlineSearchBoxExamplesFragment extends C34640IcN implements C82034oy {
    public static final String TOAST_TEXT = "Cusom action clicked";
    public Context mContext;
    public LinearLayout mLinearLayout;
    public UserSession mUserSession;

    public String getModuleName() {
        return "igds_inline_search_examples";
    }

    private void configureSearchBox(String str, boolean z, boolean z2) {
        InlineSearchBox inlineSearchBox = new InlineSearchBox(this.mContext);
        if (z) {
            inlineSearchBox.A06(new View.OnClickListener() {
                public void onClick(View view) {
                    int A05 = C14030oh.A05(-62021514);
                    C63813iO.A0D(IgdsInlineSearchBoxExamplesFragment.this.mContext, IgdsInlineSearchBoxExamplesFragment.TOAST_TEXT, 1);
                    C14030oh.A0C(-573256543, A05);
                }
            }, R.drawable.instagram_camera_pano_outline_24, 2131822800);
            int color = this.mContext.getColor(R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_normal_text_color);
            int color2 = this.mContext.getColor(R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
            ColorFilterAlphaImageView colorFilterAlphaImageView = inlineSearchBox.A01;
            if (colorFilterAlphaImageView != null) {
                colorFilterAlphaImageView.A03(color, color2);
            }
        }
        inlineSearchBox.A03 = z2;
        this.mLinearLayout.addView(new IgdsComponentDemoRow(this.mContext, str, inlineSearchBox));
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131825243);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(2033784123);
        super.onCreate(bundle);
        this.mContext = requireContext();
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(-1719997463, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-241561503);
        View inflate = layoutInflater.inflate(R.layout.igds_showcase_scrollview, viewGroup, false);
        this.mLinearLayout = (LinearLayout) inflate.requireViewById(R.id.igds_component_examples_container);
        configureSearchBox("Default search", false, false);
        configureSearchBox("Clickable custom action", true, false);
        configureSearchBox("Hidden clear button", false, true);
        configureSearchBox("Hidden clear button, clickable custom action", true, true);
        C14030oh.A09(1131248221, A02);
        return inflate;
    }
}
