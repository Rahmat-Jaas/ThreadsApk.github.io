package X;

import com.instagram.common.api.base.IDxACallbackShape2S1200000_1_I2;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Yc  reason: invalid class name and case insensitive filesystem */
public final class C62283Yc {
    public static final long A05 = (((long) 6) * TimeUnit.DAYS.toMillis(7));
    public BKU A00;
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public final UserSession A04;

    public final synchronized void A01(boolean z) {
        AnonymousClass0wJ.A13(C28161tl.A03(this.A04), "server_eligibility_of_dialog_after_sharing_story", z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (A05 >= (r6 - r4)) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (X.AnonymousClass266.A04 == X.AnonymousClass0wJ.A0Y(r8).A0g()) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A02() {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            com.instagram.service.session.UserSession r8 = r10.A04     // Catch:{ all -> 0x0049 }
            r2 = 0
            X.C04220Ms.A0B(r8, r2)     // Catch:{ all -> 0x0049 }
            android.content.SharedPreferences r1 = X.C28161tl.A04(r8)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "dialog_after_sharing_story_show_times"
            int r3 = r1.getInt(r0, r2)     // Catch:{ all -> 0x0049 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0049 }
            android.content.SharedPreferences r1 = X.C28161tl.A04(r8)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "dialog_after_sharing_story_time_stamp"
            long r4 = X.C18180wK.A05(r1, r0)     // Catch:{ all -> 0x0049 }
            android.content.SharedPreferences r1 = X.C28161tl.A04(r8)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "server_eligibility_of_dialog_after_sharing_story"
            boolean r0 = r1.getBoolean(r0, r2)     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0039
            X.266 r2 = X.AnonymousClass266.A04     // Catch:{ all -> 0x0049 }
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r8)     // Catch:{ all -> 0x0049 }
            X.266 r1 = r0.A0g()     // Catch:{ all -> 0x0049 }
            r0 = 1
            if (r2 != r1) goto L_0x003a
        L_0x0039:
            r0 = 2
        L_0x003a:
            if (r3 >= r0) goto L_0x0044
            long r2 = A05     // Catch:{ all -> 0x0049 }
            long r6 = r6 - r4
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            monitor-exit(r9)
            return r0
        L_0x0047:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62283Yc.A02():boolean");
    }

    public static final void A00(C62283Yc r5, BKU bku) {
        bku.A3g(AnonymousClass24M.SHARING);
        UserSession userSession = r5.A04;
        AnonymousClass2SK.A00(userSession, "request", "upsell", r5.A02, "");
        C32165H8c A002 = C60313On.A00(new ShareLaterMedia(bku), userSession, AnonymousClass006.A01, "", "upsell");
        A002.A00 = new IDxACallbackShape2S1200000_1_I2(r5, bku, "", 1);
        C31155GhB.A03(A002);
    }

    public C62283Yc(UserSession userSession) {
        this.A04 = userSession;
    }
}
