package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.73F  reason: invalid class name */
public final class AnonymousClass73F {
    public static final AtomicLong A00 = new AtomicLong(System.currentTimeMillis());

    public static void A00(GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000) {
        gQLCallInputCInputShape1S0000000.A0D(String.valueOf(A00.getAndIncrement()), "client_mutation_id");
    }
}
