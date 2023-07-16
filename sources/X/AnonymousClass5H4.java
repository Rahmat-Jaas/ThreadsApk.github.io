package X;

import android.content.Context;
import com.facebook.graphql.query.JSONPersistedQueryProvider;

/* renamed from: X.5H4  reason: invalid class name */
public final class AnonymousClass5H4 extends JSONPersistedQueryProvider {
    public static AnonymousClass5H4 A00;

    public AnonymousClass5H4(Context context) {
        super(context, "ig4a-facebook-schema");
    }

    public static C145828l9 A00() {
        if (A00 == null) {
            synchronized (AnonymousClass5H4.class) {
                if (A00 == null) {
                    A00 = new AnonymousClass5H4(C10600ic.A00);
                }
            }
        }
        return A00;
    }
}
