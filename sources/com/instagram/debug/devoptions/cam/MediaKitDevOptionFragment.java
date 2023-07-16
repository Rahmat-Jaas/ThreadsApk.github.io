package com.instagram.debug.devoptions.cam;

import X.AnonymousClass006;
import X.AnonymousClass03G;
import X.AnonymousClass0OY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass3W9;
import X.AnonymousClass4u2;
import X.AnonymousClass6QR;
import X.AnonymousClass7WR;
import X.AnonymousClass7WY;
import X.C04530Oa;
import X.C14030oh;
import X.C147368pE;
import X.C18210wN;
import X.C18220wO;
import X.C28101EyY;
import X.C34640IcN;
import X.C82034oy;
import X.C82424pb;
import X.C86104wH;
import X.DC1;
import X.E2V;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;
import com.instagram.service.session.UserSession;

public final class MediaKitDevOptionFragment extends C34640IcN implements C82424pb, C82034oy {
    public static final int $stable = 8;
    public final C04530Oa actionBarService$delegate;
    public final MediaKitDevOptionFragment$delegate$1 delegate;
    public final C04530Oa loggable$delegate;
    public final C04530Oa mediaKitDevOptionViewModel$delegate;
    public C147368pE mediaKitJsonValue;
    public final C04530Oa userSession$delegate = AnonymousClass3W9.A00(this);

    public String getModuleName() {
        return "MediaKitInternalSettings";
    }

    private final E2V getActionBarService() {
        return (E2V) this.actionBarService$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final C28101EyY getLoggable() {
        return (C28101EyY) this.loggable$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final MediaKitDevOptionViewModel getMediaKitDevOptionViewModel() {
        return (MediaKitDevOptionViewModel) this.mediaKitDevOptionViewModel$delegate.getValue();
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public static /* synthetic */ void updateActionBar$default(MediaKitDevOptionFragment mediaKitDevOptionFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        mediaKitDevOptionFragment.updateActionBar(z);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A07(r2, 2131825320);
        }
        updateActionBar(true);
    }

    public MediaKitDevOptionFragment() {
        MediaKitDevOptionFragment$mediaKitDevOptionViewModel$2 mediaKitDevOptionFragment$mediaKitDevOptionViewModel$2 = new MediaKitDevOptionFragment$mediaKitDevOptionViewModel$2(this);
        C04530Oa A01 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new MediaKitDevOptionFragment$special$$inlined$viewModels$default$2(new MediaKitDevOptionFragment$special$$inlined$viewModels$default$1(this)));
        this.mediaKitDevOptionViewModel$delegate = C18220wO.A0M(new MediaKitDevOptionFragment$special$$inlined$viewModels$default$3(A01), mediaKitDevOptionFragment$mediaKitDevOptionViewModel$2, new MediaKitDevOptionFragment$special$$inlined$viewModels$default$4((AnonymousClass0ZU) null, A01), C18210wN.A0l(MediaKitDevOptionViewModel.class));
        this.loggable$delegate = AnonymousClass0OY.A02(new MediaKitDevOptionFragment$loggable$2(this));
        this.actionBarService$delegate = AnonymousClass0OY.A02(new MediaKitDevOptionFragment$actionBarService$2(this));
        this.mediaKitJsonValue = C86104wH.A0I(AnonymousClass7WR.A00, "", "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.delegate = new MediaKitDevOptionFragment$delegate$1(this);
    }

    /* access modifiers changed from: private */
    public final void updateActionBar(boolean z) {
        String str;
        E2V actionBarService = getActionBarService();
        if (z) {
            str = "New";
        } else {
            str = "Save";
        }
        actionBarService.CpF(str, new MediaKitDevOptionFragment$updateActionBar$1(z, this));
    }

    public boolean onBackPressed() {
        if (getMediaKitDevOptionViewModel().mediaKitJsonFlow.getValue() == null) {
            return false;
        }
        getMediaKitDevOptionViewModel().closeMediaKitInfo();
        return true;
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-34786489);
        super.onCreate(bundle);
        requireActivity().getWindow().setSoftInputMode(32);
        AnonymousClass03G.A00(requireActivity().getWindow(), false);
        DC1.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A00(MediaKitEntryPoint.DEV_OPTIONS);
        C14030oh.A09(-1071569671, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1044807489);
        ComposeView A00 = AnonymousClass6QR.A00(this, AnonymousClass7WY.A00(new MediaKitDevOptionFragment$onCreateView$1(this), 22327840));
        C14030oh.A09(-1130994536, A02);
        return A00;
    }

    public void onResume() {
        int A02 = C14030oh.A02(862658320);
        super.onResume();
        updateActionBar(true);
        C14030oh.A09(643220686, A02);
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
