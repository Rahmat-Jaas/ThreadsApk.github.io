package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.1d0  reason: invalid class name */
public final class AnonymousClass1d0 extends C34640IcN implements C21839C2o, C21735BzM, C83044qh {
    public static final String __redex_internal_original_name = "PoliticalAdInfoSheetFragment";
    public int A00;
    public ScrollView A01;
    public C37383Jqm A02;
    public UserSession A03;
    public SpinnerImageView A04;
    public Boolean A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public final void CVi(String str, String str2) {
        String str3 = str2;
        C04220Ms.A0B(str2, 1);
        UserSession userSession = this.A03;
        String str4 = "userSession";
        if (userSession != null) {
            String str5 = this.A06;
            if (str5 == null) {
                str4 = "adId";
            } else {
                C19606Az7.A0Q(this, userSession, str3, "webclick", str, str5, this.A08);
                FragmentActivity requireActivity = requireActivity();
                UserSession userSession2 = this.A03;
                if (userSession2 != null) {
                    C37412JrW.A06(requireActivity, userSession2, C171209wF.A1r, (Long) null, str, "political_ad_info_sheet");
                    return;
                }
            }
        }
        C04220Ms.A0E(str4);
        throw null;
    }

    public final String getModuleName() {
        return "political_ad_info_sheet";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = (SpinnerImageView) view.requireViewById(R.id.loading_spinner);
        A00(view, this);
    }

    public static final void A00(View view, AnonymousClass1d0 r4) {
        String str;
        UserSession userSession = r4.A03;
        if (userSession == null) {
            str = "userSession";
        } else {
            String str2 = r4.A06;
            if (str2 == null) {
                str = "adId";
            } else {
                H1T A0P = AnonymousClass0wJ.A0P(userSession);
                A0P.A0J("ads/political_context/");
                A0P.A0O("ad_id", str2);
                C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, C22201Tt.class, AnonymousClass3PA.class);
                C63873iU.A0F(A0T, view, r4, 48);
                r4.schedule(A0T);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A03;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final boolean isScrolledToTop() {
        ScrollView scrollView = this.A01;
        boolean z = false;
        if (scrollView != null && scrollView.canScrollVertically(-1)) {
            z = true;
        }
        return !z;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(745257459);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = C18180wK.A0V(requireArguments);
        String string = requireArguments.getString("ad_id");
        if (string != null) {
            this.A06 = string;
            String string2 = requireArguments.getString("user_id");
            if (string2 != null) {
                this.A09 = string2;
                if (requireArguments.containsKey("location_shared")) {
                    this.A05 = C18210wN.A0Q(requireArguments, "location_shared");
                }
                String string3 = requireArguments.getString("tracking_token");
                if (string3 != null) {
                    this.A08 = string3;
                    this.A00 = requireArguments.getInt("entry_point");
                    this.A07 = requireArguments.getString("state_run_media_country");
                    C14030oh.A09(932895554, A022);
                    return;
                }
                illegalStateException = C18180wK.A0a("Required value was null.");
                i = -1396986930;
            } else {
                illegalStateException = C18180wK.A0a("Required value was null.");
                i = 222599663;
            }
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 1349492920;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(454532537);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.political_ad_info_sheet_container, false);
        C14030oh.A09(-71748628, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1268842415);
        super.onDestroyView();
        this.A01 = null;
        this.A04 = null;
        C14030oh.A09(-973002114, A022);
    }
}
