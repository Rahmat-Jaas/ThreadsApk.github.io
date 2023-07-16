package X;

import android.content.Context;
import com.instagram.pendingmedia.model.UserStoryTarget;

/* renamed from: X.7xC  reason: invalid class name and case insensitive filesystem */
public final class C134187xC implements C83794s0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C28493FOg A01;
    public final /* synthetic */ C22169CKd A02;
    public final /* synthetic */ UserStoryTarget A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public final void Bye(boolean z) {
    }

    public C134187xC(Context context, C28493FOg fOg, C22169CKd cKd, UserStoryTarget userStoryTarget, String str, String str2, boolean z) {
        this.A01 = fOg;
        this.A00 = context;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = z;
        this.A02 = cKd;
        this.A03 = userStoryTarget;
    }

    public final void CMm(boolean z) {
        C28493FOg fOg = this.A01;
        C67233zC r1 = fOg.A03;
        if (r1 == null) {
            C04220Ms.A0E("shareToFBController");
            throw null;
        }
        r1.A05(AnonymousClass006.A00, z);
        C28493FOg.A02(this.A00, fOg, this.A02, this.A03, this.A05, this.A04, this.A06);
    }
}
