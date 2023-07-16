package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;
import java.util.List;

/* renamed from: X.1Zh  reason: invalid class name and case insensitive filesystem */
public final class C22741Zh extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "OnDeviceNudityDetectionInboxNux";
    public Drawable A00;
    public AnonymousClass3A7 A01;
    public IgdsBottomButtonLayout A02;
    public IgdsHeadline A03;
    public UserSession A04;

    public final String getModuleName() {
        return "on_device_nudity_detection_inbox_nux";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UserSession userSession = this.A04;
        if (userSession == null) {
            C18210wN.A0m();
            throw null;
        }
        this.A01 = new AnonymousClass3A7(userSession);
        this.A03 = (IgdsHeadline) AnonymousClass0wJ.A0J(view, R.id.on_device_nudity_nux_headline);
        this.A02 = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(view, R.id.on_device_nudity_nux_bottom_ctas);
        IgdsHeadline igdsHeadline = this.A03;
        if (igdsHeadline == null) {
            C04220Ms.A0E("headline");
            throw null;
        }
        igdsHeadline.setImageDrawable(this.A00);
        C62263Ya A002 = C62263Ya.A00(requireContext());
        String string = requireContext().getString(2131824946);
        Context requireContext = requireContext();
        String A0k = AnonymousClass0wJ.A0k(requireContext, 2131829574);
        String A0N = AnonymousClass00U.A0N(requireContext.getString(2131824945), A0k, ' ');
        IDxCSpanShape187S0100000_1_I2 A003 = C18730xl.A00(this, C18210wN.A01(requireContext), 20);
        SpannableStringBuilder A0E = C18200wM.A0E(A0N);
        AnonymousClass3Zw.A00(A0E, A003, A0k);
        A002.A03(string, A0E, R.drawable.instagram_shield_pano_outline_24);
        A002.A03(requireContext().getString(2131837934), requireContext().getString(2131837933), R.drawable.instagram_photo_pano_outline_24);
        A002.A03(requireContext().getString(2131835118), requireContext().getString(2131835117), R.drawable.instagram_lock_pano_outline_24);
        List A012 = C62263Ya.A01(A002, requireContext().getString(2131836987), requireContext().getString(2131836986), R.drawable.instagram_settings_pano_outline_24);
        ((IgdsBulletCell) A012.get(0)).setMovementMethod((MovementMethod) null, LinkMovementMethod.getInstance());
        IgdsHeadline igdsHeadline2 = this.A03;
        if (igdsHeadline2 == null) {
            C04220Ms.A0E("headline");
            throw null;
        }
        igdsHeadline2.setBulletList(A012);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setDividerVisible(true);
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A02;
            if (igdsBottomButtonLayout2 != null) {
                igdsBottomButtonLayout2.setPrimaryActionOnClickListener(C18190wL.A0H(this, 387));
                IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A02;
                if (igdsBottomButtonLayout3 != null) {
                    igdsBottomButtonLayout3.setSecondaryActionOnClickListener(C18190wL.A0H(this, 388));
                    return;
                }
            }
        }
        C04220Ms.A0E("bottomButton");
        throw null;
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A04;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A05(r2);
        r2.setTitle("");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1686797759);
        super.onCreate(bundle);
        this.A04 = C18180wK.A0W(this, AnonymousClass0RA.A0C);
        this.A00 = requireContext().getDrawable(R.drawable.ig_illustrations_illo_nudity_detection_refresh);
        C14030oh.A09(1803897160, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-720902762);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.on_device_nudity_inbox_qp_cta_nux, false);
        C14030oh.A09(729000964, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(1497412646);
        super.onDestroy();
        AnonymousClass3A7 r0 = this.A01;
        if (r0 == null) {
            C04220Ms.A0E("manager");
            throw null;
        }
        r0.A00.A01();
        C14030oh.A09(-1778244796, A022);
    }
}
