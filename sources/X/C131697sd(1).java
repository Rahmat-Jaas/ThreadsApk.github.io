package X;

import android.content.Context;
import com.instagram.barcelona.R;
import com.instagram.common.notifications.push.intf.PushChannelType;

/* renamed from: X.7sd  reason: invalid class name and case insensitive filesystem */
public final class C131697sd implements C146338m4 {
    public final Context A00;
    public final C86014w8 A01;
    public final C86014w8 A02;
    public final AnonymousClass76G A03;

    public final void C5S() {
    }

    public final PushChannelType B59() {
        return PushChannelType.FCM;
    }

    public final void BPv(HGC hgc, String str, boolean z) {
        this.A03.A00 = hgc;
    }

    public final void BiW(C106326er r5) {
        AnonymousClass76G r0 = this.A03;
        HGC hgc = r0.A00;
        if (hgc != null) {
            hgc.A07(r0.A01, PushChannelType.FCM, 0);
        }
        AnonymousClass0gN.A00().AKp(new AnonymousClass619(this, r5));
    }

    public final void CZk() {
        if (AnonymousClass0fS.A09(this.A00)) {
            BiW((C106326er) null);
        }
        AnonymousClass7ED r6 = (AnonymousClass7ED) this.A03.A02.get();
        if (r6 != null) {
            long j = AnonymousClass76G.A03;
            long j2 = j + (j / ((long) 2));
            C89425Ew r7 = new C89425Ew();
            r7.A00.putInt("__VERSION_CODE", AnonymousClass0FX.A01());
            if (j >= 0) {
                if (j2 < 0) {
                    throw C18190wL.A0a("You must call setSoftMaximumLatencyMs(long) or setHardMaximumLatencyMs(long)");
                } else if (j2 >= 0 && j2 <= j) {
                    throw C18190wL.A0a("setSoftMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
                }
            }
            if (j2 < 0 || j >= 0) {
                try {
                    AnonymousClass7ED.A01(r6, r7, R.id.fcm_refresh_push_token_job_service_id, 1, j, -1);
                } catch (IllegalArgumentException e) {
                    C10450iM.A03("FCMTokenJobService", AnonymousClass0wJ.A0t("Service not found exception: ", e));
                }
            } else {
                throw C18190wL.A0a("setSoftMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
            }
        }
    }

    public C131697sd(Context context, C86014w8 r2, C86014w8 r3, AnonymousClass76G r4) {
        this.A00 = context;
        this.A03 = r4;
        this.A02 = r2;
        this.A01 = r3;
    }
}
