package X;

import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;

/* renamed from: X.3Tp  reason: invalid class name and case insensitive filesystem */
public final class C61483Tp {
    public static final C61483Tp A00 = new C61483Tp();

    public final Object A00(AnonymousClass601 r12, C63893iY r13) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r13, r12);
        C109326jp A06 = C63893iY.A06(r13, 0);
        Fragment A01 = C63913ic.A01(r12);
        C07530bf r8 = (C07530bf) C63913ic.A0F(r12);
        AnonymousClass3LL r4 = new AnonymousClass3LL();
        if (C63173fJ.A05(AnonymousClass0TJ.A05, 18303900780073296L)) {
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A02(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, 0);
            A002.A02((Object) null, A1Z ? 1 : 0);
            A002.A02((Object) null, 2);
            A002.A02((Object) null, 3);
            A002.A02((Object) null, 4);
            C63893iY.A0F(r12, A002, A06, (Object) null, 5);
        } else if (r8 != null) {
            C62783aj instance = C62783aj.getInstance();
            if (instance != null) {
                ((SmartLockPluginImpl) instance).A00 = A1Z;
            }
            AnonymousClass265 r9 = AnonymousClass265.A0z;
            C70294Dt r7 = new C70294Dt(r4, r12, A06, r8);
            H8a instanceAsync = C62783aj.getInstanceAsync();
            instanceAsync.A00 = new AnonymousClass1lS(A01, r7, r8, r9, A1Z);
            C31155GhB.A03(instanceAsync);
            return null;
        }
        return null;
    }
}
