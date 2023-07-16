package X;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1wQ  reason: invalid class name */
public final class AnonymousClass1wQ extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "LocationPageInfoPageReportFragment";
    public C82644q2 A00;
    public List A01;
    public UserSession A02;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        r2.CtT(true);
        r2.Cqb(2131834805);
    }

    public final String getModuleName() {
        return "location_page_info_page_report_fragment";
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1138602116);
        super.onCreate(bundle);
        this.A02 = C18180wK.A0V(this.mArguments);
        boolean z = requireArguments().getBoolean("show_linked_business_report_options");
        List asList = Arrays.asList(new Pair[]{new Pair(2131834807, "INACCURATE_INFO"), new Pair(2131834813, "DISLIKE"), new Pair(2131834806, "HARASSING"), new Pair(2131834815, "SHOULD_NOT_BE_ON_IG"), new Pair(2131834814, "SCAM"), new Pair(2131834810, "IP")});
        this.A01 = asList;
        if (z) {
            ArrayList A0s = C18200wM.A0s(asList);
            this.A01 = A0s;
            C18240wQ.A1Q(A0s, new Pair[]{new Pair(2131834798, "TOO_FAR"), new Pair(2131834797, "SPAM"), new Pair(2131834799, "WRONG_CLAIM")});
        }
        ArrayList A0s2 = C18200wM.A0s(this.A01);
        this.A01 = A0s2;
        C18240wQ.A1Q(A0s2, new Pair[]{new Pair(2131834808, "PIN_INACCURATE"), new Pair(2131834809, "INAPPROPRIATE_AR"), new Pair(2131834811, "CONTENT_NOT_RELEVANT"), new Pair(2131834812, "NO_CONTENT_ALLOWED")});
        C14030oh.A09(351360826, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu r1 = new C63613hu(2131834796);
        r1.A0F = false;
        A0v.add(r1);
        for (Pair pair : this.A01) {
            AnonymousClass4MA.A03(C18200wM.A0R(pair, this, StringTreeSet.MAX_SYMBOL_COUNT), A0v, AnonymousClass0wJ.A04(pair.first));
        }
        setItems(A0v);
    }
}
