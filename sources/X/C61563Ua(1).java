package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Ua  reason: invalid class name and case insensitive filesystem */
public final class C61563Ua {
    public static final AnonymousClass3O4 A02 = new AnonymousClass3O4();
    public static final C04530Oa A03 = AnonymousClass0OY.A01(AnonymousClass006.A00, C76524eE.A00);
    public static final C36852Sx A04 = new C36852Sx();
    public static final C36862Sy A05 = new C36862Sy();
    public static final C36872Sz A06 = new C36872Sz();
    public static final AnonymousClass2T0 A07 = new AnonymousClass2T0();
    public static final AnonymousClass2T1 A08 = new AnonymousClass2T1();
    public static final AnonymousClass2T2 A09 = new AnonymousClass2T2();
    public final AnonymousClass3YC A00;
    public final AnonymousClass0YP A01;

    public final AnonymousClass1Pw A00(Context context, AnonymousClass3UU r25, UserSession userSession, String str, Set set, long j) {
        List list;
        Set set2 = set;
        C04220Ms.A0B(set2, 0);
        Context context2 = context;
        String str2 = str;
        AnonymousClass0wJ.A1O(str2, context2);
        UserSession userSession2 = userSession;
        C04220Ms.A0B(userSession2, 3);
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass3YD r7 = (AnonymousClass3YD) this.A01.invoke(userSession2, str2);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession2, 36317161123220998L)) {
            list = C18180wK.A0n(new AnonymousClass40U(new C560835s(userSession2)));
        } else {
            list = AnonymousClass0ZV.A00;
        }
        C36622Sa.A00();
        C567638l r0 = new C567638l(context2, userSession2);
        C36862Sy r10 = A05;
        C13330nS A022 = C13330nS.A02(userSession2);
        AnonymousClass2T0 r12 = A07;
        C57493Bg r8 = new C57493Bg(context2, r7, r25, userSession2);
        C36872Sz r11 = A06;
        AnonymousClass2T1 r13 = A08;
        C36852Sx r9 = A04;
        C04220Ms.A06(C10450iM.A00());
        return new AnonymousClass1Pw(A022, r7, r8, r9, r10, r11, r12, r13, A09, str2, list, set2, currentTimeMillis, j, ((SharedPreferences) ((IGDevToolPersistentStateHandler) r0.A00.getValue()).A02.getValue()).getBoolean("/shared/qp/dev_mode", false));
    }

    public C61563Ua(AnonymousClass3YC r1, AnonymousClass0YP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
