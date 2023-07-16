package X;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.4Dz  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4Dz implements C82674q5 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Status A01;
    public final /* synthetic */ AnonymousClass3YF A02;
    public final /* synthetic */ AnonymousClass265 A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass4Dz(Activity activity, Status status, AnonymousClass3YF r3, AnonymousClass265 r4, boolean z) {
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = z;
        this.A00 = activity;
        this.A01 = status;
    }

    public final void Cek(C82664q4 r23) {
        AnonymousClass3YF r5 = this.A02;
        AnonymousClass265 r3 = this.A03;
        boolean z = this.A04;
        Activity activity = this.A00;
        Status status = this.A01;
        C82664q4 r4 = r23;
        try {
            C10300i6 r15 = r5.A03;
            C26971rZ r9 = new C26971rZ(r5.A02, r15, r4, r3, z);
            List list = r5.A04;
            synchronized (list) {
                list.add(r9);
            }
            activity.startIntentSenderForResult(status.A02.getIntentSender(), r9.A00, (Intent) null, 0, 0, 0);
            if (z) {
                C04220Ms.A0B(r15, 0);
                AnonymousClass3LL.A00(r15, "login_smartlock_save_impression", "login_smart_lock", "smartlock", (String) null, (String) null, (HashMap) null);
            }
        } catch (IntentSender.SendIntentException unused) {
            if (!z) {
                C10300i6 r52 = r5.A03;
                String str = r3.A01;
                C04220Ms.A0B(r52, 0);
                C63523hf.A05(r52, str, "save", "cannot_show_dialog");
                activity.runOnUiThread(new AnonymousClass4SO(activity, r4, Boolean.FALSE));
            }
        }
    }
}
