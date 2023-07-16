package X;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: X.5lG  reason: invalid class name and case insensitive filesystem */
public final class C93255lG extends C129167lR implements AnonymousClass8eE {
    public static final C93175l8 A00;
    public static final C99286Iv A01;
    public static final C108946jD A02;
    public static final C113826sD A03 = new C113826sD("Auth", "GoogleAuthServiceClient");

    static {
        C99286Iv r3 = new C99286Iv();
        A01 = r3;
        C93115l2 r2 = new C93115l2();
        A00 = r2;
        A02 = new C108946jD(r2, r3, "GoogleAuthService.API");
    }

    public C93255lG(Context context) {
        super((Activity) null, context, (C146788mr) null, A02, C1195075p.A02);
    }

    public static void A00(Status status, C113426rN r2, Object obj) {
        boolean A002;
        if (status.A01 <= 0) {
            A002 = r2.A01(obj);
        } else {
            A002 = r2.A00(new C32102Af(status));
        }
        if (!A002) {
            A03.A01("The task is already complete.", C86164wN.A1T());
        }
    }
}
