package com.instagram.urlhandlers.businesslinkmanagement;

import X.AnonymousClass006;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3HX;
import X.AnonymousClass4WJ;
import X.AnonymousClass601;
import X.C05030Qo;
import X.C10300i6;
import X.C109326jp;
import X.C127397h3;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C23411dm;
import X.C25786Drz;
import X.C37067Jjv;
import X.C63743iE;
import X.C66883yU;
import X.C81804oQ;
import android.content.Intent;
import android.os.Bundle;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenDismissCallback;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Collections;
import java.util.HashMap;
import kotlin.Pair;

public final class BusinessLinkManagementUrlHandlerActivity extends BaseFragmentActivity {
    public static final Pair A00 = C18180wK.A0p("entry_point", "deeplink_from_fb");
    public static final Pair A01 = C18180wK.A0p("link_flow_source", "instagram");

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        Bundle A0B;
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Intent intent = getIntent();
        if (intent != null && (A0B = C18210wN.A0B(intent)) != null) {
            return r1.A02(A0B);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        HashMap A08 = AnonymousClass4WJ.A08(A00, A01);
        Integer num = C66883yU.A0F;
        Integer num2 = AnonymousClass006.A00;
        C66883yU r6 = new C66883yU((C81804oQ) null, (CdsOpenScreenDismissCallback) null, (AnonymousClass3HX) null, (AnonymousClass601) null, (C127397h3) null, (C109326jp) null, AnonymousClass006.A0C, num2, num, num2, (Integer) null, (Integer) null, false, false, false);
        IgBloksScreenConfig A0N = C18190wL.A0N(getSession());
        A0N.A0P = "com.bloks.www.casd_bl.business_link_management";
        A0N.A01 = r6;
        new C63743iE(C37067Jjv.A02(A08), Collections.emptyMap(), "com.bloks.www.casd_bl.business_link_management").A0E(this, A0N);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-56009915);
        super.onCreate(bundle);
        if (AnonymousClass0wJ.A0C(this) != null) {
            C25786Drz A0Q = C18180wK.A0Q(this, C05030Qo.A02(getSession()));
            A0Q.A0C = false;
            C23411dm.A06(A0Q);
            i = -670210581;
        } else {
            finish();
            i = -1736406545;
        }
        C14030oh.A07(i, A002);
    }
}
