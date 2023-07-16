package X;

import android.content.Context;
import com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager;
import com.facebook.avatar.autogen.flow.AESelfieCaptureConfig;

/* renamed from: X.7dQ  reason: invalid class name and case insensitive filesystem */
public final class C125527dQ implements C33777HuK {
    public C28969FfA A00;
    public boolean A01;
    public final AEFaceTrackerManager A02;
    public final AESelfieCaptureConfig A03;
    public final C30797GVp A04;
    public final C27219EgD A05;
    public final C86074wE A06 = C18190wL.A0z(DIV.A01);

    public final void Bne(Exception exc) {
    }

    public final void Bnh() {
    }

    public final void Bni(String str, String str2) {
    }

    public final void Bnl() {
    }

    public /* synthetic */ C125527dQ(Context context, AESelfieCaptureConfig aESelfieCaptureConfig, C30797GVp gVp) {
        C27219EgD egD = C25295DjG.A00;
        this.A03 = aESelfieCaptureConfig;
        this.A04 = gVp;
        this.A05 = egD;
        this.A02 = new AEFaceTrackerManager(context, aESelfieCaptureConfig, this);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0o(this, (C146958n9) null, 27), AnonymousClass7Ja.A03(egD), 3);
    }
}
