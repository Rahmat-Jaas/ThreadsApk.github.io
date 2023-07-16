package X;

import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* renamed from: X.60r  reason: invalid class name and case insensitive filesystem */
public final class C954260r extends C132657uI {
    public final /* synthetic */ C105506dX A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public final void C4u(VideoPreviewView videoPreviewView, int i, int i2) {
        videoPreviewView.setVisibility(0);
        videoPreviewView.A06();
        C105506dX r0 = this.A00;
        boolean z = this.A01;
        C28552FRy fRy = r0.A00;
        float f = 1.0f;
        if (z) {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        fRy.setVolume(f);
        if (!this.A02 && !fRy.A08()) {
            fRy.A04();
        }
    }

    public C954260r(C105506dX r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }
}
