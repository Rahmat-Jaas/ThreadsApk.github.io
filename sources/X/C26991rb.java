package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.1rb  reason: invalid class name and case insensitive filesystem */
public final class C26991rb extends AnonymousClass1jJ {
    public static final String __redex_internal_original_name = "ChallengeUtil$1";
    public final /* synthetic */ UserSession A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26991rb(Context context, Fragment fragment, FragmentActivity fragmentActivity, C12560m7 r15, C11630kW r16, UserSession userSession, UserSession userSession2, Integer num, List list, boolean z) {
        super(context, fragment, fragmentActivity, r15, r16, userSession, num, list, z);
        this.A00 = userSession2;
    }

    public final void A06(Boolean bool) {
        super.A06(bool);
        C697449w A002 = AnonymousClass3GW.A00.A00(this.A00);
        if (A002 != null) {
            A002.A01();
        }
    }
}
