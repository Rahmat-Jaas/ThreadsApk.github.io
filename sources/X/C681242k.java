package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Map;

/* renamed from: X.42k  reason: invalid class name and case insensitive filesystem */
public final class C681242k implements C84144sc {
    public final /* synthetic */ AnonymousClass1cU A00;

    public final void Bys(AnonymousClass3XX r12) {
        C04220Ms.A0B(r12, 0);
        AnonymousClass1cU r1 = this.A00;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r1.A07;
        if (businessFlowAnalyticsLogger == null) {
            C18240wQ.A0p();
            throw null;
        }
        businessFlowAnalyticsLogger.BcB(new C37408JrQ("renew", r1.A0B, "quick_conversion_settings", C63483hZ.A02(r12), C63483hZ.A01(r12), (Map) null, (Map) null, (Map) null));
        AnonymousClass1cU.A01(r1);
    }

    public C681242k(AnonymousClass1cU r1) {
        this.A00 = r1;
    }

    public final void Byt() {
        String str;
        AnonymousClass1cU r2 = this.A00;
        C84654td r0 = r2.A08;
        if (r0 == null) {
            str = "controller";
        } else {
            AnonymousClass0wJ.A0R(r0).A0I = true;
            SpinnerImageView spinnerImageView = r2.A0A;
            if (spinnerImageView == null) {
                str = "loadingSpinner";
            } else {
                spinnerImageView.setVisibility(8);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void Byu(AnonymousClass3DP r15) {
        String str;
        AnonymousClass266 r1;
        AnonymousClass1cU r4 = this.A00;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r4.A07;
        if (businessFlowAnalyticsLogger == null) {
            C18240wQ.A0p();
            throw null;
        }
        String str2 = null;
        businessFlowAnalyticsLogger.BcA(new C37408JrQ("renew", r4.A0B, "quick_conversion_settings", (String) null, (String) null, (Map) null, (Map) null, C67203z9.A01(r15)));
        AnonymousClass266 r0 = null;
        if (r15 != null) {
            C84654td r12 = r4.A08;
            if (r12 != null) {
                AnonymousClass0wJ.A0R(r12).A07 = C67203z9.A00(r4.requireContext(), r15);
                C84654td r13 = r4.A08;
                if (r13 != null) {
                    AnonymousClass0wJ.A0R(r13).A0E = r15.A0C;
                }
            }
            C04220Ms.A0E("controller");
            throw null;
        }
        C10300i6 A0U = AnonymousClass0wJ.A0U(r4.A0E);
        if (r15 != null) {
            str = r15.A0C;
        } else {
            str = null;
        }
        boolean equals = "LATEST_CONVERTED_ACCOUNT".equals(str);
        if (r15 != null) {
            str2 = r15.A02;
            r1 = r15.A00;
            r0 = r15.A01;
        } else {
            r1 = null;
        }
        if (C67333zN.A07(A0U, r1, r0, str2, equals)) {
            AnonymousClass1cU.A00(r4);
        } else {
            AnonymousClass1cU.A01(r4);
        }
    }
}
