package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JA  reason: invalid class name */
public final class AnonymousClass4JA implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final Handler A02 = AnonymousClass0wJ.A0F();

    public final void BN1(Uri uri, Bundle bundle) {
        if (bundle != null) {
            Object obj = bundle.get("target_user_ids");
            if (obj != null) {
                String str = (String) obj;
                if (bundle.get("target_thread_id") != null) {
                    Object obj2 = bundle.get("target_group_name");
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
                    C04220Ms.A0B(C81074n3.A06(str), 3);
                    C63803iN.A0E(AnonymousClass0TJ.A05, this.A01, 36318230572634405L);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C60113Ns.A01(this.A00, this.A01);
        throw null;
    }

    public AnonymousClass4JA(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
