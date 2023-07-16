package X;

import com.instagram.pendingmedia.model.PendingMedia;

/* renamed from: X.4FC  reason: invalid class name */
public final class AnonymousClass4FC implements C21425Bu8 {
    public final /* synthetic */ C19270za A00;

    public final void BzK(PendingMedia pendingMedia) {
        Integer num;
        C04220Ms.A0B(pendingMedia, 0);
        C19270za r2 = this.A00;
        C28933FeZ feZ = pendingMedia.A1N;
        C28933FeZ feZ2 = C28933FeZ.CONFIGURED;
        if (feZ == feZ2 || !pendingMedia.A13()) {
            if (pendingMedia.A1N == feZ2) {
                num = AnonymousClass006.A01;
            } else {
                num = AnonymousClass006.A0C;
            }
            C19270za.A01(r2, pendingMedia, num);
        }
    }

    public AnonymousClass4FC(C19270za r1) {
        this.A00 = r1;
    }
}
