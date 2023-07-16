package X;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.4Zy  reason: invalid class name and case insensitive filesystem */
public final class C74184Zy extends C02220Ah implements AnonymousClass0ZU {
    public static final C74184Zy A00 = new C74184Zy();

    public C74184Zy() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        return MoreExecutors.listeningDecorator((ScheduledExecutorService) AnonymousClass0gE.A00().A00);
    }
}
