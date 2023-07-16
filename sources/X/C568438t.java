package X;

import android.util.SparseArray;
import com.instagram.service.session.UserSession;

/* renamed from: X.38t  reason: invalid class name and case insensitive filesystem */
public final class C568438t {
    public final SparseArray A00;
    public final C83734rt A01;

    public C568438t(C11630kW r5, UserSession userSession) {
        SparseArray sparseArray = new SparseArray();
        this.A00 = sparseArray;
        AnonymousClass4JX r2 = new AnonymousClass4JX(r5, userSession);
        sparseArray.append(0, r2);
        sparseArray.append(1, new AnonymousClass4JW(r5));
        sparseArray.append(2, new AnonymousClass4JZ(userSession));
        sparseArray.append(3, new AnonymousClass4JY());
        this.A01 = r2;
    }
}
