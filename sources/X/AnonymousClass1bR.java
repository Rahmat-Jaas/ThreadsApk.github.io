package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1bR  reason: invalid class name */
public final class AnonymousClass1bR extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "UnderAgeFragment";
    public UserSession A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public final String getModuleName() {
        return "under_age_challenge";
    }

    public final boolean onBackPressed() {
        return true;
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A02(this, r2, 2131837215);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(288114806);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C18180wK.A0V(requireArguments);
        this.A04 = C18190wL.A0j(requireArguments, "headline");
        this.A03 = C18190wL.A0j(requireArguments, "content");
        this.A02 = AnonymousClass00U.A0L("https://i.instagram.com", requireArguments.getString("download_data_link"));
        this.A01 = C18190wL.A0j(requireArguments, "appeal_link");
        C14030oh.A09(-1352444677, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(139295354);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.challenge_under_age_layout);
        AnonymousClass0wJ.A0L(A0H, R.id.content_title).setText(this.A04);
        TextView A0L = AnonymousClass0wJ.A0L(A0H, R.id.content_body);
        String str = this.A03;
        IDxCSpanShape187S0100000_1_I2 A002 = C18730xl.A00(this, requireContext().getColor(R.color.blue_5), 10);
        SpannableStringBuilder A0E = C18200wM.A0E(str);
        Matcher matcher = Pattern.compile("\\^\\*.*\\^\\*").matcher(A0E.toString());
        if (matcher.find()) {
            A0E.setSpan(A002, matcher.start(), matcher.end(), 33);
            A0E.replace(matcher.end() - 2, matcher.end(), "");
            A0E.replace(matcher.start(), matcher.start() + 2, "");
        }
        A0L.setText(A0E);
        C18180wK.A0z(A0L);
        AnonymousClass0wJ.A16(A0H.requireViewById(R.id.appeal_button), 224, this);
        AnonymousClass0wJ.A16(A0H.requireViewById(R.id.logout_button), 225, this);
        C63093bU.A00().A05("unknown", AnonymousClass006.A01);
        C63093bU.A03(this, this.A00, C63093bU.A00(), AnonymousClass006.A06, (Integer) null);
        C14030oh.A09(1737213427, A022);
        return A0H;
    }
}
