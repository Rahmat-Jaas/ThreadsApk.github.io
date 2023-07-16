package X;

import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import com.instagram.barcelona.R;
import com.instagram.common.notifications.push.intf.PushChannelType;
import java.io.IOException;

/* renamed from: X.619  reason: invalid class name */
public final class AnonymousClass619 extends AnonymousClass0gG {
    public final /* synthetic */ C131697sd A00;
    public final /* synthetic */ C106326er A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass619(C131697sd r4, C106326er r5) {
        super(54, 3, true, true);
        this.A00 = r4;
        this.A01 = r5;
    }

    public final void run() {
        boolean z;
        C131697sd r5 = this.A00;
        try {
            String A05 = ((FirebaseInstanceId) r5.A01.get()).A05((String) r5.A02.get(), "FCM");
            if (A05 != null) {
                z = true;
                AnonymousClass0wJ.A12(r5.A00.getSharedPreferences("com.google.firebase.fcm", 0).edit().putString("fcm_registration", A05), "last_registration_time_ms", System.currentTimeMillis());
                AnonymousClass76G r1 = r5.A03;
                HGC A002 = C29620FrP.A00();
                Context context = r1.A01;
                PushChannelType pushChannelType = PushChannelType.FCM;
                A002.A0A(context, pushChannelType, A05, 0, pushChannelType.equals(C1190873l.A00().B59()));
                HGC hgc = r1.A00;
                if (hgc != null) {
                    hgc.A08(context, pushChannelType, 0);
                }
                AnonymousClass7ED r12 = (AnonymousClass7ED) r1.A02.get();
                if (r12 != null) {
                    r12.A02(R.id.fcm_refresh_push_token_job_service_id);
                }
            } else {
                z = false;
                AnonymousClass76G r13 = r5.A03;
                IllegalStateException A0a = C18180wK.A0a("Unknown error occurred");
                HGC hgc2 = r13.A00;
                if (hgc2 != null) {
                    hgc2.A09(r13.A01, PushChannelType.FCM, A0a.getMessage(), 0);
                }
            }
        } catch (IOException e) {
            C10450iM.A06("FCMRegistrar_getToken", "Failed to get token", e);
            AnonymousClass0LU.A0G("FCMRegistrar", "Failed to get token", e);
            AnonymousClass76G r0 = r5.A03;
            HGC hgc3 = r0.A00;
            if (hgc3 != null) {
                hgc3.A09(r0.A01, PushChannelType.FCM, e.getMessage(), 0);
            }
            z = false;
        }
        C106326er r02 = this.A01;
        if (r02 != null) {
            r02.A00.C3z(!z);
        }
    }
}
