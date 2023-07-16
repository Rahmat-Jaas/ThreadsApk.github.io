package X;

import android.app.Activity;
import java.util.Map;

/* renamed from: X.81c  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1360381c implements Runnable {
    public final /* synthetic */ C86224wh A00;
    public final /* synthetic */ Map A01;

    public /* synthetic */ C1360381c(C86224wh r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public final void run() {
        C86224wh r2 = this.A00;
        Map map = this.A01;
        Activity activity = r2.getActivity();
        if (activity != null) {
            activity.getFragmentManager().beginTransaction().remove(r2).commitAllowingStateLoss();
        }
        C144608im r0 = r2.A00;
        if (r0 != null) {
            r0.CAi(map);
        }
    }
}
