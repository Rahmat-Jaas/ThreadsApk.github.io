package X;

import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.4Ci  reason: invalid class name */
public final class AnonymousClass4Ci implements C83594rf {
    public final /* synthetic */ IgdsBanner A00;
    public final /* synthetic */ C23941gd A01;

    public final /* synthetic */ void onActionClicked() {
    }

    public AnonymousClass4Ci(IgdsBanner igdsBanner, C23941gd r2) {
        this.A01 = r2;
        this.A00 = igdsBanner;
    }

    public final void onBannerDismissed() {
        this.A01.A01 = true;
        this.A00.setVisibility(8);
    }
}
