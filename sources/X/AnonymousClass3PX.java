package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.3PX  reason: invalid class name */
public final class AnonymousClass3PX {
    public static final int A00(AnonymousClass5z1 r2) {
        Object obj = r2.A00;
        if (obj instanceof AnonymousClass1j8) {
            return -1;
        }
        if (obj instanceof AnonymousClass1j9) {
            C04220Ms.A0C(obj, "null cannot be cast to non-null type com.instagram.common.api.coroutine.HttpErrorOrException.HttpError<Error of com.instagram.util.lifecycle.HttpErrorUtilKt.statusCodeOrNegative1>");
            C146578mT r1 = ((AnonymousClass1j9) obj).A00;
            if (r1 instanceof C85814vo) {
                return r1.getStatusCode();
            }
            return -1;
        }
        throw AnonymousClass4VZ.A00();
    }

    public static final String A01(Context context, AnonymousClass5z1 r3, UserSession userSession) {
        StringBuilder A0r;
        Object obj = r3.A00;
        if (obj instanceof AnonymousClass1j8) {
            A0r = C18200wM.A0r();
            C18210wN.A0u(context, A0r, 2131831763);
            if (C19573AyZ.A03(userSession)) {
                A0r.append(10);
                C04220Ms.A0C(obj, "null cannot be cast to non-null type com.instagram.common.api.coroutine.HttpErrorOrException.Exception<Error of com.instagram.util.lifecycle.HttpErrorUtilKt.buildErrorMessage$lambda$0>");
                A0r.append(((AnonymousClass1j8) obj).A00);
            }
        } else if (obj instanceof AnonymousClass1j9) {
            A0r = C18200wM.A0r();
            C18210wN.A0u(context, A0r, 2131836071);
            C04220Ms.A0C(obj, "null cannot be cast to non-null type com.instagram.common.api.coroutine.HttpErrorOrException.HttpError<Error of com.instagram.util.lifecycle.HttpErrorUtilKt.buildErrorMessage$lambda$1>");
            C146578mT r2 = ((AnonymousClass1j9) obj).A00;
            if (C19573AyZ.A03(userSession)) {
                A0r.append(AnonymousClass00U.A0J(" ", r2.getStatusCode()));
                if (r2 instanceof C85814vo) {
                    A0r.append(AnonymousClass00U.A0B(((C85814vo) r2).getErrorMessage(), ' '));
                }
            }
        } else {
            throw AnonymousClass4VZ.A00();
        }
        return C18190wL.A0n(A0r);
    }
}
