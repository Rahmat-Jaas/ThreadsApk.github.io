package X;

import android.app.Activity;
import java.util.Map;

/* renamed from: X.47y  reason: invalid class name */
public final class AnonymousClass47y implements C144608im {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C69794Ai A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass47y(Activity activity, C69794Ai r2, boolean z, boolean z2) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void CAi(Map map) {
        int i;
        String A002 = AnonymousClass000.A00(49);
        Object obj = map.get(A002);
        Object obj2 = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
        C971568d r0 = C971568d.GRANTED;
        if (obj == r0 && obj2 == r0) {
            C69794Ai.A01(this.A01);
            return;
        }
        Activity activity = this.A00;
        boolean z = !AnonymousClass7K8.A03(activity, A002);
        boolean z2 = !AnonymousClass7K8.A03(activity, "android.permission.WRITE_EXTERNAL_STORAGE");
        if (z && !this.A02) {
            i = 2131822933;
        } else if (z2 && !this.A03) {
            i = 2131836144;
        } else {
            return;
        }
        C62413Zr.A01(activity, i);
    }
}
