package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.hangouts.args.HangoutsDeeplinkArguments;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.4gj  reason: invalid class name and case insensitive filesystem */
public final class C77524gj extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ HangoutsDeeplinkArguments A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ AnonymousClass0ZU A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77524gj(Context context, Fragment fragment, FragmentActivity fragmentActivity, HangoutsDeeplinkArguments hangoutsDeeplinkArguments, UserSession userSession, String str, String str2, String str3, String str4, List list, List list2, AnonymousClass0ZU r13) {
        super(1);
        this.A04 = userSession;
        this.A02 = fragmentActivity;
        this.A01 = fragment;
        this.A00 = context;
        this.A07 = str;
        this.A06 = str2;
        this.A0A = list;
        this.A09 = list2;
        this.A08 = str3;
        this.A05 = str4;
        this.A03 = hangoutsDeeplinkArguments;
        this.A0B = r13;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C37383Jqm jqm = (C37383Jqm) obj;
        C04220Ms.A0B(jqm, 0);
        jqm.A06();
        UserSession userSession = this.A04;
        FragmentActivity fragmentActivity = this.A02;
        Fragment fragment = this.A01;
        Context context = this.A00;
        String str = this.A07;
        String str2 = this.A06;
        List list = this.A0A;
        List list2 = this.A09;
        DBI.A00(context, fragment, fragmentActivity, this.A03, userSession, str, str2, this.A08, this.A05, list, list2, this.A0B, true);
        return Unit.A00;
    }
}
