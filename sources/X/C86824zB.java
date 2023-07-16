package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.4zB  reason: invalid class name and case insensitive filesystem */
public final class C86824zB extends Handler {
    public final /* synthetic */ C22266CRf A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86824zB(Looper looper, C22266CRf cRf) {
        super(looper);
        this.A00 = cRf;
    }

    public final void handleMessage(Message message) {
        FragmentActivity activity;
        Handler handler;
        Runnable r0;
        int i = message.what;
        if (i == 1) {
            C22266CRf cRf = this.A00;
            if (cRf.A0k == null && (activity = cRf.getActivity()) != null) {
                cRf.A0k = AnonymousClass779.getInstance(cRf.A0H).createGooglePlayLocationSettingsController(activity, cRf.A0H, cRf.A0a, AnonymousClass000.A00(1010), "find_nearby_venues");
                if (cRf.A0k != null) {
                    handler = cRf.A0Z;
                    r0 = new C135747zz(this);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (i == 2) {
            C22266CRf cRf2 = this.A00;
            if (cRf2.A0k != null) {
                handler = cRf2.A0Z;
                r0 = new AnonymousClass800(this);
            } else {
                return;
            }
        } else {
            return;
        }
        handler.post(r0);
    }
}
