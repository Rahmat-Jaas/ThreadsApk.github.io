package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.hangouts.args.HangoutsDeeplinkArguments;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.4Ya  reason: invalid class name and case insensitive filesystem */
public final class C74134Ya extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ HangoutsDeeplinkArguments A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74134Ya(FragmentActivity fragmentActivity, HangoutsDeeplinkArguments hangoutsDeeplinkArguments, UserSession userSession, String str, List list, List list2) {
        super(0);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A05 = str;
        this.A04 = list;
        this.A03 = list2;
        this.A01 = hangoutsDeeplinkArguments;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A05 == null) {
            return Unit.A00;
        }
        C18250wR.A0k();
        throw null;
    }
}
