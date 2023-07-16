package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;

/* renamed from: X.1Ya  reason: invalid class name and case insensitive filesystem */
public final class C22421Ya extends C34640IcN {
    public static final String __redex_internal_original_name = "ReelDashboardFBViewerMessageBottomsheetFragment";
    public UserSession A00;
    public String A01;
    public String A02;
    public ImageUrl A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public final String getModuleName() {
        return "reel_dashboard_fb_viewer_message_bottomsheet";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-360301624);
        super.onCreate(bundle);
        Bundle A072 = C18250wR.A07(this);
        this.A01 = C18190wL.A0j(A072, "args_media_owner_id");
        this.A02 = C18190wL.A0j(A072, "args_user_id");
        this.A07 = C18190wL.A0j(A072, "args_media_viewer_namme");
        this.A03 = (ImageUrl) C18240wQ.A0D(A072, "args_profile_pic_url");
        this.A00 = C18180wK.A0V(A072);
        this.A04 = C18190wL.A0j(A072, "args_bottomsheet_title");
        this.A05 = A072.getString("args_emoji_unicode");
        this.A06 = A072.getString("args_reply_text");
        C14030oh.A09(-90740271, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1398051942);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.reel_dashboard_message_fb_viewer_bottomsheet);
        C14030oh.A09(202948810, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        TextView A0L;
        String str;
        super.onViewCreated(view, bundle);
        AnonymousClass0wJ.A0L(view, R.id.message_fb_viewer_description).setText(AnonymousClass0wJ.A0l(requireContext(), this.A07, 2131834189));
        AnonymousClass0wJ.A0L(view, R.id.message_fb_viewer_title).setText(this.A04);
        if (this.A06 != null) {
            A0L = AnonymousClass0wJ.A0L(view, R.id.message_fb_viewer_feedback);
            str = this.A06;
        } else {
            if (this.A05 != null) {
                A0L = AnonymousClass0wJ.A0L(view, R.id.message_fb_viewer_feedback);
                str = this.A05;
            }
            AnonymousClass0wJ.A17(view.requireViewById(R.id.open_messenger_button), 69, this);
            C18250wR.A0M(view, R.id.message_fb_viewer_profile_picture).setUrl(this.A03, this);
        }
        A0L.setText(str);
        A0L.setVisibility(0);
        AnonymousClass0wJ.A17(view.requireViewById(R.id.open_messenger_button), 69, this);
        C18250wR.A0M(view, R.id.message_fb_viewer_profile_picture).setUrl(this.A03, this);
    }
}
