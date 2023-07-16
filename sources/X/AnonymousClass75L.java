package X;

import com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl;
import com.instagram.fbpay.w3c.ipc.IsReadyToPayServiceImpl;
import com.instagram.fbpay.w3c.views.PaymentActivity;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.75L  reason: invalid class name */
public final class AnonymousClass75L {
    public static final AnonymousClass6S5 A01 = new AnonymousClass6S5();
    public static final List A02 = C06750aI.A17(IsReadyToPayServiceImpl.class, FBPaymentServiceImpl.class, PaymentActivity.class);
    public static final AtomicInteger A03 = new AtomicInteger(-1);
    public final UserSession A00;

    public AnonymousClass75L(UserSession userSession) {
        this.A00 = userSession;
    }
}
