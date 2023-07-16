package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.react.views.maps.IgStaticMapViewManager;
import com.instagram.service.session.UserSession;

/* renamed from: X.1dD  reason: invalid class name */
public final class AnonymousClass1dD extends C34640IcN implements C39882L5e, C84244sn {
    public static final String __redex_internal_original_name = "LoginActivityMapBottomSheetFragment";
    public M5O A00;
    public UserSession A01;
    public AnonymousClass3DN A02;

    public final int AU4(Context context) {
        return 0;
    }

    public final int AZN() {
        return -2;
    }

    public final View BFj() {
        return null;
    }

    public final int BHT() {
        return 0;
    }

    public final float BQB() {
        return 0.8f;
    }

    public final boolean BRv() {
        return false;
    }

    public final float BfH() {
        return 1.0f;
    }

    public final void Bm3(AnonymousClass3DN r1) {
    }

    public final void Bra(AnonymousClass3DN r1) {
    }

    public final void Btw(AnonymousClass3DN r1) {
    }

    public final void C47() {
    }

    public final void C49(int i) {
    }

    public final boolean Cs4() {
        return true;
    }

    public final String getModuleName() {
        return "loginactivity";
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final /* synthetic */ boolean A8B() {
        return false;
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final /* synthetic */ float BgR() {
        return BQB();
    }

    public final void afterOnResume() {
        super.afterOnResume();
        AnonymousClass7JU.A00(this.A00.itemView.findViewById(R.id.title_message));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-55449004);
        super.onCreate(bundle);
        this.A01 = AnonymousClass0wJ.A0W(this);
        Bundle requireArguments = requireArguments();
        AnonymousClass3DN r4 = new AnonymousClass3DN();
        r4.A06 = requireArguments.getString("id");
        r4.A00 = requireArguments.getFloat(IgStaticMapViewManager.LATITUDE_KEY);
        r4.A01 = requireArguments.getFloat(IgStaticMapViewManager.LONGITUDE_KEY);
        r4.A04 = requireArguments.getLong("timestamp");
        r4.A03 = requireArguments.getLong("status_update_timestamp");
        r4.A05 = requireArguments.getString("device");
        r4.A07 = requireArguments.getString("location");
        r4.A09 = requireArguments.getBoolean("is_confirmed");
        r4.A02 = requireArguments.getInt("position");
        r4.A0A = requireArguments.getBoolean("is_current");
        r4.A0B = requireArguments.getBoolean("is_suspicious_login");
        r4.A08 = requireArguments.getString(C61973Wo.A01(9, 8, 111));
        this.A02 = r4;
        C14030oh.A09(263414155, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(488145231);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.login_activity_map_bottom_sheet);
        C202013n r2 = new C202013n(LayoutInflater.from(requireContext()).inflate(R.layout.login_activity_map_item, (ViewGroup) A0H, true));
        this.A00 = r2;
        C54412zP.A00(requireContext(), this.A02, this, r2, true);
        C14030oh.A09(1650883144, A022);
        return A0H;
    }
}
