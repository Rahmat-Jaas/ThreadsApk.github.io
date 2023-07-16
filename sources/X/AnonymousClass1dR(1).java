package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape11S1100000_1_I2;

/* renamed from: X.1dR  reason: invalid class name */
public final class AnonymousClass1dR extends C34640IcN implements C21735BzM, C81414nk {
    public static final String __redex_internal_original_name = "RemixForFeedPostsBottomSheetNux";
    public UserSession A00;
    public Integer A01;

    public final String getModuleName() {
        return "metadata_followers_share_video_remixable";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        SharedPreferences.Editor A03;
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String A0k = AnonymousClass0wJ.A0k(requireContext(), 2131834589);
        Context requireContext = requireContext();
        Integer num = this.A01;
        String str2 = "nuxMode";
        if (num != null) {
            Integer num2 = AnonymousClass006.A00;
            int i = 2131834592;
            if (num == num2) {
                i = 2131834599;
            }
            String A0k2 = AnonymousClass0wJ.A0k(requireContext, i);
            Context requireContext2 = requireContext();
            Integer num3 = this.A01;
            if (num3 != null) {
                int i2 = 2131834591;
                if (num3 == num2) {
                    i2 = 2131834598;
                }
                String A0l = AnonymousClass0wJ.A0l(requireContext2, A0k, i2);
                C04220Ms.A06(A0l);
                IDxCSpanShape11S1100000_1_I2 iDxCSpanShape11S1100000_1_I2 = new IDxCSpanShape11S1100000_1_I2(this, A0k, C18180wK.A00(this), 1);
                View requireViewById = view.requireViewById(R.id.title);
                C04220Ms.A0C(requireViewById, I17.A00(0));
                ((TextView) requireViewById).setText(A0k2);
                TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.message);
                C18180wK.A0z(textView);
                SpannableStringBuilder A0E = C18200wM.A0E(A0l);
                AnonymousClass3Zw.A00(A0E, iDxCSpanShape11S1100000_1_I2, A0k);
                textView.setText(A0E);
                Integer num4 = this.A01;
                if (num4 != null) {
                    str2 = "userSession";
                    if (num4 == AnonymousClass006.A01) {
                        UserSession userSession = this.A00;
                        if (userSession != null) {
                            A03 = C28161tl.A03(userSession);
                            str = "clips_remix_feed_video_nux_viewed";
                        }
                    } else if (num4 == num2) {
                        UserSession userSession2 = this.A00;
                        if (userSession2 != null) {
                            A03 = C28161tl.A03(userSession2);
                            str = "clips_remix_photos_nux_viewed";
                        }
                    } else {
                        return;
                    }
                    AnonymousClass0wJ.A13(A03, str, true);
                    return;
                }
            }
        }
        C04220Ms.A0E(str2);
        throw null;
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        Integer num;
        int A02 = C14030oh.A02(-1422474447);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0W(this, AnonymousClass0RA.A0C);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString("args_remix_nux_mode")) == null) {
            str = "VIDEO";
        }
        if (str.equals("PHOTO")) {
            num = AnonymousClass006.A00;
        } else if (str.equals("VIDEO")) {
            num = AnonymousClass006.A01;
        } else if (str.equals("OTHER")) {
            num = AnonymousClass006.A0C;
        } else {
            throw C18190wL.A0a(str);
        }
        this.A01 = num;
        C14030oh.A09(86165584, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1507640485);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.remix_for_feed_posts_bottom_sheet_nux, false);
        C14030oh.A09(380940578, A02);
        return A0D;
    }
}
