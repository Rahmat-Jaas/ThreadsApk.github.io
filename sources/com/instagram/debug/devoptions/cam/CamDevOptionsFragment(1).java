package com.instagram.debug.devoptions.cam;

import X.AnonymousClass006;
import X.AnonymousClass0OY;
import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass3J3;
import X.AnonymousClass3W9;
import X.AnonymousClass4u2;
import X.AnonymousClass534;
import X.AnonymousClass6QR;
import X.AnonymousClass74X;
import X.AnonymousClass7Ak;
import X.AnonymousClass7DE;
import X.AnonymousClass7GN;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.AnonymousClass7WY;
import X.C04220Ms;
import X.C04530Oa;
import X.C120767Cj;
import X.C123327Wm;
import X.C14030oh;
import X.C146288ly;
import X.C146958n9;
import X.C147178nW;
import X.C147188nY;
import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import X.C25237DiI;
import X.C25786Drz;
import X.C27952Ew2;
import X.C312524w;
import X.C34640IcN;
import X.C63813iO;
import X.C82034oy;
import X.C82424pb;
import X.C98236Es;
import X.E2V;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.cam.CamDevOptionsViewModel;
import com.instagram.service.session.UserSession;

public final class CamDevOptionsFragment extends C34640IcN implements C82424pb, C82034oy {
    public static final int $stable = 8;
    public final C04530Oa actionBarService$delegate = AnonymousClass0OY.A02(new CamDevOptionsFragment$actionBarService$2(this));
    public final C04530Oa camDevOptionsViewModel$delegate;
    public final C04530Oa userSession$delegate = AnonymousClass3W9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825099);
    }

    public String getModuleName() {
        return "cam_dev_options";
    }

    /* access modifiers changed from: private */
    public final E2V getActionBarService() {
        return (E2V) this.actionBarService$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final CamDevOptionsViewModel getCamDevOptionsViewModel() {
        return (CamDevOptionsViewModel) this.camDevOptionsViewModel$delegate.getValue();
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    /* access modifiers changed from: private */
    public final void handle(CamDevOptionsViewModel.UIEvent uIEvent) {
        if (uIEvent instanceof CamDevOptionsViewModel.UIEvent.LaunchMediaKitSettings) {
            C25786Drz A0Q = C18180wK.A0Q(requireActivity(), AnonymousClass0wJ.A0X(this.userSession$delegate));
            A0Q.A03 = new MediaKitDevOptionFragment();
            A0Q.A05();
        } else if (uIEvent instanceof CamDevOptionsViewModel.UIEvent.ShowToast) {
            C63813iO.A0B(getContext(), getString(((CamDevOptionsViewModel.UIEvent.ShowToast) uIEvent).stringResId));
        }
    }

    public CamDevOptionsFragment() {
        CamDevOptionsFragment$camDevOptionsViewModel$2 camDevOptionsFragment$camDevOptionsViewModel$2 = new CamDevOptionsFragment$camDevOptionsViewModel$2(this);
        C04530Oa A01 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new CamDevOptionsFragment$special$$inlined$viewModels$default$2(new CamDevOptionsFragment$special$$inlined$viewModels$default$1(this)));
        this.camDevOptionsViewModel$delegate = C18220wO.A0M(new CamDevOptionsFragment$special$$inlined$viewModels$default$3(A01), camDevOptionsFragment$camDevOptionsViewModel$2, new CamDevOptionsFragment$special$$inlined$viewModels$default$4((AnonymousClass0ZU) null, A01), C18210wN.A0l(CamDevOptionsViewModel.class));
    }

    /* access modifiers changed from: private */
    public final void CamSettingsHome(C147188nY r8, int i) {
        r8.Cvd(318174755);
        C123327Wm A01 = Modifier.A01(r8);
        C146288ly A00 = C120767Cj.A00(r8, AnonymousClass7KV.A0E, false);
        Object A0p = C147188nY.A0p(r8);
        Object A0n = C147188nY.A0n(r8);
        Object A0m = C147188nY.A0m(r8);
        AnonymousClass0ZU r1 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A01);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r8;
        C147188nY.A0w(r8, r2, r1);
        AnonymousClass7W3.A0a(r8, r2, A00, A0p);
        AnonymousClass7KP.A07(r8, A0n, A0m, A002);
        r8.Cvb(1977266653);
        LayoutKt.MenuSection(getCamDevOptionsViewModel(), r8, 8);
        AnonymousClass7W3.A0f(r2);
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new CamDevOptionsFragment$CamSettingsHome$2(this, i));
        }
    }

    /* access modifiers changed from: private */
    public final void ResetMediaKitNuxSurface(C147188nY r19, int i) {
        C147188nY r6 = r19;
        r6.Cvd(1762137655);
        C123327Wm A01 = Modifier.A01(r6);
        C146288ly A00 = C120767Cj.A00(r6, AnonymousClass7KV.A0E, false);
        AnonymousClass534 A0b = C147188nY.A0b(r6, -1323940314);
        Object AEA = r6.AEA(A0b);
        AnonymousClass534 r1 = AnonymousClass7DE.A07;
        Object AEA2 = r6.AEA(r1);
        AnonymousClass534 r0 = AnonymousClass7DE.A0B;
        Object AEA3 = r6.AEA(r0);
        AnonymousClass0ZU r15 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A01);
        AnonymousClass7W3 r5 = (AnonymousClass7W3) r6;
        C147188nY.A0w(r6, r5, r15);
        r5.A0T = false;
        AnonymousClass0YP r14 = AnonymousClass74X.A03;
        AnonymousClass0YP A003 = AnonymousClass7Ak.A00(r6, A00, AEA, r14);
        AnonymousClass0YP r12 = AnonymousClass74X.A02;
        AnonymousClass0YP A012 = AnonymousClass7Ak.A01(r6, AEA2, r12);
        Integer A05 = AnonymousClass7KP.A05(r6, AEA3, A012, A002);
        r6.Cvb(2058660585);
        r6.Cvb(-273057807);
        Object A0r = C147188nY.A0r(r6, r5, -492369756);
        if (A0r == AnonymousClass7GN.A00) {
            A0r = getCamDevOptionsViewModel().getAllMediaKitNux();
            r5.A14(A0r);
        }
        AnonymousClass7W3.A0w(r5, false);
        C146288ly A052 = AnonymousClass7KV.A05(r6);
        Object A0t = C147188nY.A0t(r6, A0b, -1323940314);
        Object AEA4 = r6.AEA(r1);
        Object AEA5 = r6.AEA(r0);
        AnonymousClass0YM A004 = C98236Es.A00(A01);
        C147188nY.A0w(r6, r5, r15);
        r5.A0T = false;
        AnonymousClass7Ak.A02(r6, A052, r14);
        AnonymousClass7Ak.A02(r6, A0t, A003);
        A004.invoke(AnonymousClass7KP.A03(r6, AEA4, AEA5, r12, A012), r6, A05);
        r6.Cvb(2058660585);
        r6.Cvb(728127931);
        for (C312524w r3 : (Iterable) A0r) {
            LayoutKt.CamDevOptionsMenuItem(getCamDevOptionsViewModel(), false, r3.A01, new CamDevOptionsFragment$ResetMediaKitNuxSurface$1$1$1$1(this, r3), r6, 56, 0);
        }
        AnonymousClass7W3.A0v(r5, AnonymousClass7W3.A11(r5));
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new CamDevOptionsFragment$ResetMediaKitNuxSurface$2(this, i));
        }
    }

    public boolean onBackPressed() {
        return getCamDevOptionsViewModel().onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1498214439);
        super.onCreate(bundle);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new CamDevOptionsFragment$onCreate$1(this, (C146958n9) null), AnonymousClass3J3.A00(getLifecycle()), 3);
        C14030oh.A09(-650347958, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(412809995);
        ComposeView A00 = AnonymousClass6QR.A00(this, AnonymousClass7WY.A00(new CamDevOptionsFragment$onCreateView$1(this), 218612896));
        C14030oh.A09(-843738417, A02);
        return A00;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
