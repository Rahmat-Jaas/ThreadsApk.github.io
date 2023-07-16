package com.instagram.debug.devoptions.proidentity;

import X.AnonymousClass0YM;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass3W9;
import X.AnonymousClass4u2;
import X.AnonymousClass54z;
import X.AnonymousClass671;
import X.AnonymousClass6QR;
import X.AnonymousClass74X;
import X.AnonymousClass7Ad;
import X.AnonymousClass7JS;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7Kq;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.AnonymousClass7WY;
import X.C04530Oa;
import X.C101156Qc;
import X.C101176Qe;
import X.C123327Wm;
import X.C14030oh;
import X.C146288ly;
import X.C147178nW;
import X.C147188nY;
import X.C18180wK;
import X.C34640IcN;
import X.C82034oy;
import X.C968867b;
import X.C98236Es;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.service.session.UserSession;

public final class SmbToolsFragment extends C34640IcN implements C82034oy {
    public static final int $stable = 8;
    public final C04530Oa userSession$delegate = AnonymousClass3W9.A00(this);

    public String getModuleName() {
        return "smb_tools_fragment";
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            r2.Cqb(2131825557);
            r2.CtT(C18180wK.A1X(getParentFragmentManager().A0I()));
        }
    }

    /* access modifiers changed from: private */
    public final void BuildDebugOptionList(C147188nY r25, int i) {
        C147188nY r9 = r25;
        r9.Cvd(-1950347148);
        C123327Wm r4 = Modifier.A00;
        AnonymousClass54z r3 = AnonymousClass7Kq.A02;
        Modifier A01 = AnonymousClass7Ad.A01(AnonymousClass7Ad.A00(r9), r4.Cx6(r3));
        C146288ly A05 = AnonymousClass7KV.A05(r9);
        Object A0p = C147188nY.A0p(r9);
        Object A0n = C147188nY.A0n(r9);
        Object A0m = C147188nY.A0m(r9);
        AnonymousClass0ZU r2 = AnonymousClass74X.A00;
        AnonymousClass0YM A00 = C98236Es.A00(A01);
        AnonymousClass7W3 r1 = (AnonymousClass7W3) r9;
        C147188nY.A0w(r9, r1, r2);
        AnonymousClass7W3.A0a(r9, r1, A05, A0p);
        AnonymousClass7KP.A07(r9, A0n, A0m, A00);
        r9.Cvb(2142803690);
        C101176Qe.A00(r9, (Modifier) null, (AnonymousClass671) null, AnonymousClass7JS.A01(r9, 2131825198), (String) null, (AnonymousClass0ZU) null, 0, 126, false, false);
        C147188nY r16 = r9;
        C101156Qc.A00(r16, r4.Cx6(r3), (C968867b) null, AnonymousClass7JS.A01(r9, 2131825041), new SmbToolsFragment$BuildDebugOptionList$1$1(this), 384, 24, false);
        C101156Qc.A00(r16, r4.Cx6(r3), (C968867b) null, AnonymousClass7JS.A01(r9, 2131825037), new SmbToolsFragment$BuildDebugOptionList$1$2(this), 384, 24, false);
        AnonymousClass7W3.A0f(r1);
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new SmbToolsFragment$BuildDebugOptionList$2(this, i));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-2050545124);
        ComposeView A00 = AnonymousClass6QR.A00(this, AnonymousClass7WY.A00(new SmbToolsFragment$onCreateView$1(this), -792535948));
        C14030oh.A09(-329057881, A02);
        return A00;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
