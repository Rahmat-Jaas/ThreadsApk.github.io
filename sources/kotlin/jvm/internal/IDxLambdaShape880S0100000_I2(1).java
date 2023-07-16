package kotlin.jvm.internal;

import X.AnonymousClass00F;
import X.AnonymousClass0ZU;
import X.AnonymousClass0gG;
import X.AnonymousClass6VR;
import X.C02220Ah;
import X.C05070Qs;
import X.C05760Vw;
import X.C06810aP;
import X.C08080ch;
import X.C08100ck;
import X.C09690fw;
import X.C10300i6;
import X.C10450iM;
import X.C12050lE;
import X.C12080lH;
import X.C12090lI;
import X.L6I;
import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.Unit;

public class IDxLambdaShape880S0100000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLambdaShape880S0100000_I2(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    public final C12050lE A00() {
        C12050lE r2 = new C12050lE();
        L6I l6i = (L6I) this.A00;
        r2.attachInfo(l6i.getContext(), l6i.A04());
        return r2;
    }

    public final C06810aP A01() {
        UserSession userSession = (UserSession) this.A00;
        User A03 = AnonymousClass6VR.A00(userSession).A03(userSession.getUserId());
        if (A03 == null) {
            C10450iM.A03("UserProvider", "current user null");
            A03 = userSession.getUserDeprecatedDontUse();
        }
        return new C06810aP(A03);
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A01) {
            case 0:
                ((AnonymousClass00F) this.A00).A03();
                return Unit.A00;
            case 1:
                ((AnonymousClass00F) this.A00).A02();
                return Unit.A00;
            case 2:
                C12080lH r1 = new C12080lH((C10300i6) this.A00);
                C12090lI.A02.add(r1);
                return r1;
            case 3:
                return A00();
            case 4:
                int runnableId = ((AnonymousClass0gG) this.A00).getRunnableId();
                try {
                    if (Thread.interrupted()) {
                        C10450iM.A00().CuW("IgExecutor-Leaked-Interrupted-State-POST-Execution", String.valueOf(runnableId));
                    }
                    C09690fw.A00.set(Integer.valueOf(runnableId));
                    return Unit.A00;
                } catch (Throwable th) {
                    C09690fw.A00.set(Integer.valueOf(runnableId));
                    throw th;
                }
            case 5:
                if (C05760Vw.A00((Context) this.A00).equalsIgnoreCase("ru")) {
                    return C08100ck.A00();
                }
                return C08080ch.A00();
            case 6:
                return new C05070Qs((UserSession) this.A00);
            case 7:
                return A01();
            default:
                return ((Iterable) this.A00).iterator();
        }
    }
}
