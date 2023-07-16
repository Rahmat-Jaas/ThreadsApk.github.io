package X;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.google.android.gms.auth.api.credentials.Credential;
import java.util.HashMap;

/* renamed from: X.4Dt  reason: invalid class name and case insensitive filesystem */
public final class C70294Dt implements C84484tD {
    public final /* synthetic */ AnonymousClass3LL A00;
    public final /* synthetic */ AnonymousClass601 A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ C07530bf A03;

    public C70294Dt(AnonymousClass3LL r1, AnonymousClass601 r2, C109326jp r3, C07530bf r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    private final void A00(AnonymousClass356 r7, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        C62663aU r5 = new C62663aU(this.A03);
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        A002.A02("success", 0);
        A002.A02(str, 1);
        Uri uri = null;
        AnonymousClass355 r4 = r7.A00;
        if (r4 != null) {
            str2 = r4.A00.A01;
        } else {
            str2 = null;
        }
        A002.A02(str2, 2);
        if (r4 == null || (str5 = r4.A00.A03) == null) {
            str3 = null;
        } else {
            str3 = r5.A02(str5);
        }
        A002.A02(str3, 3);
        if (r4 != null) {
            str4 = r4.A00.A01;
        } else {
            str4 = null;
        }
        A002.A02(str4, 4);
        if (r4 != null) {
            uri = r4.A00.A00;
        }
        C61043Rr.A00(this.A01, C63893iY.A05(A002, uri, 5), this.A02);
    }

    private final void A01(String str, String str2) {
        if (!C04220Ms.A0I(str2, "dialog_dismissed") && !C04220Ms.A0I(str2, "no_account_selected")) {
            String str3 = str;
            if (str != null) {
                AnonymousClass3LL.A00(this.A03, "login_smartlock_fetch_failed", "login_smart_lock", "smartlock", (String) null, str3, (HashMap) null);
            }
        }
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        if (str2 == null) {
            str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
        }
        A002.A02(str2, 0);
        A002.A02((Object) null, 1);
        A002.A02((Object) null, 2);
        A002.A02((Object) null, 3);
        A002.A02((Object) null, 4);
        C61043Rr.A00(this.A01, C63893iY.A05(A002, (Object) null, 5), this.A02);
    }

    public final void BNQ(Fragment fragment, C21800C0z c0z, AnonymousClass356 r5, C07530bf r6, AnonymousClass265 r7) {
        AnonymousClass355 r0;
        if (!(r5 == null || (r0 = r5.A00) == null)) {
            Credential credential = r0.A00;
            if (!(credential.A01 == null || credential.A03 == null)) {
                A00(r5, "multiple");
                return;
            }
        }
        A01((String) null, (String) null);
    }

    public final void BNd(Fragment fragment, C21800C0z c0z, AnonymousClass356 r5, C07530bf r6, AnonymousClass265 r7) {
        AnonymousClass355 r0;
        if (!(r5 == null || (r0 = r5.A00) == null)) {
            Credential credential = r0.A00;
            if (!(credential.A01 == null || credential.A03 == null)) {
                A00(r5, "single");
                return;
            }
        }
        A01((String) null, (String) null);
    }

    public final void BNe(String str) {
        A01(str, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE);
    }

    public final void Bgj() {
        A01("dialog_dismissed", (String) null);
    }

    public final void Bhv() {
        A01("no_account_selected", (String) null);
    }
}
