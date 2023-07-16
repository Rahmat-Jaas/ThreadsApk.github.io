package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1ct  reason: invalid class name and case insensitive filesystem */
public final class C23281ct extends C34640IcN implements C81414nk {
    public static final String __redex_internal_original_name = "EmptyReportBottomSheetFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "empty_report_bottom_sheet_fragment";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-83957582);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(-74167630, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1818876928);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.frx_report_empty_fragment);
        C14030oh.A09(-430267834, A02);
        return A0H;
    }
}
