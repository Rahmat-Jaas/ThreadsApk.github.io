package X;

import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.util.concurrent.Executor;

/* renamed from: X.85p  reason: invalid class name and case insensitive filesystem */
public final class C1370385p implements C04560Oe {
    public final C83304rA A00;
    public final FBPayIGGraphQLQueryExecutor A01;
    public final Executor A02;
    public final Executor A03;

    public final /* bridge */ /* synthetic */ Object get() {
        return new C104996ci(this);
    }

    public C1370385p(C83304rA r1, FBPayIGGraphQLQueryExecutor fBPayIGGraphQLQueryExecutor, Executor executor, Executor executor2) {
        this.A03 = executor;
        this.A02 = executor2;
        this.A01 = fBPayIGGraphQLQueryExecutor;
        this.A00 = r1;
    }

    public static FBPayIGGraphQLQueryExecutor A00() {
        return AnonymousClass7Kz.A0C().A00.A01;
    }
}
