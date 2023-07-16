package X;

import android.widget.CompoundButton;
import com.instagram.user.model.User;

/* renamed from: X.3uz  reason: invalid class name and case insensitive filesystem */
public final class C65693uz implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C29371xr A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ boolean A02;

    public C65693uz(C29371xr r1, User user, boolean z) {
        this.A00 = r1;
        this.A01 = user;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r4.A02 == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r5, boolean r6) {
        /*
            r4 = this;
            com.instagram.user.model.User r3 = r4.A01
            if (r6 == 0) goto L_0x0018
            X.9tz r0 = X.C169839tz.PrivacyStatusPrivate
        L_0x0006:
            r3.A20(r0)
            X.1xr r2 = r4.A00
            if (r6 == 0) goto L_0x0012
            boolean r0 = r4.A02
            r1 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            r0 = 0
            X.C29371xr.A01(r2, r3, r0, r1)
            return
        L_0x0018:
            X.9tz r0 = X.C169839tz.PrivacyStatusPublic
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65693uz.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
