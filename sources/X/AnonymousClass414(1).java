package X;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;
import java.util.HashMap;

/* renamed from: X.414  reason: invalid class name */
public final /* synthetic */ class AnonymousClass414 implements C143758hG {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass3YF A01;
    public final /* synthetic */ C83634rj A02;
    public final /* synthetic */ AnonymousClass265 A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass414(Activity activity, AnonymousClass3YF r2, C83634rj r3, AnonymousClass265 r4, boolean z) {
        this.A01 = r2;
        this.A00 = activity;
        this.A03 = r4;
        this.A04 = z;
        this.A02 = r3;
    }

    public final void CH9(C82014ow r14) {
        String str;
        AnonymousClass3YF r7 = this.A01;
        Activity activity = this.A00;
        AnonymousClass265 r9 = this.A03;
        boolean z = this.A04;
        C83634rj r8 = this.A02;
        Status status = (Status) r14;
        String str2 = null;
        if (status != null) {
            int i = status.A01;
            if (i <= 0) {
                AnonymousClass0wJ.A13(C18200wM.A0C().edit(), "preference_smartlock_credential_have_been_saved", true);
                activity.runOnUiThread(new AnonymousClass4PL(r8));
                if (z) {
                    C10300i6 r0 = r7.A03;
                    C04220Ms.A0B(r0, 0);
                    AnonymousClass3LL.A00(r0, "login_smartlock_save_success", "login_smart_lock", "smartlock", (String) null, (String) null, (HashMap) null);
                } else {
                    C10300i6 r72 = r7.A03;
                    if (r9 != null) {
                        str2 = r9.A01;
                    }
                    C04220Ms.A0B(r72, 0);
                    C63523hf.A04(r72, str2, (String) null, 48, true, false);
                }
                if (C62783aj.getInstance() != null) {
                    ((SmartLockPluginImpl) C62783aj.getInstance()).A00 = true;
                }
            } else if (status.A02 != null) {
                activity.runOnUiThread(new AnonymousClass4T9(activity, status, r7, r8, r9, z));
            } else {
                if (!z) {
                    C10300i6 r02 = r7.A03;
                    if (r9 != null) {
                        str2 = r9.A01;
                    }
                    String num = Integer.toString(i);
                    C04220Ms.A0B(r02, 0);
                    C63523hf.A04(r02, str2, num, 32, false, false);
                }
                r8.BrI(false, status.A04);
            }
        } else {
            if (!z) {
                C10300i6 r1 = r7.A03;
                if (r9 == null) {
                    str = null;
                } else {
                    str = r9.A01;
                }
                C04220Ms.A0B(r1, 0);
                C63523hf.A04(r1, str, (String) null, 48, false, false);
            }
            r8.BrI(false, (String) null);
        }
    }
}
