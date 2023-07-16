package X;

import android.content.Context;
import com.facebook.graphql.query.JSONPersistedQueryProvider;
import java.io.IOException;
import kotlin.jvm.internal.KtLambdaShape4S1100000_I2;
import org.json.JSONException;

/* renamed from: X.70y  reason: invalid class name and case insensitive filesystem */
public final class C1184470y {
    public static final void A00(Context context, C83484rS r3, String str) {
        C04530Oa A02 = AnonymousClass0OY.A02(new KtLambdaShape4S1100000_I2(str, context, 38));
        C63233h2.A00.put(str, new C126717fi(A02));
        r3.CwT(new C25581nt(str, A02));
    }

    public static final void A01(Context context, String str) {
        try {
            C63233h2.A00.put(str, new JSONPersistedQueryProvider(context, str));
        } catch (IOException | JSONException e) {
            AnonymousClass0LU.A0L("IGPandoStaticGraphQLInitializer", "Failed to initialize Pando persisted query provider for '%s'!", e, str);
        }
    }
}
