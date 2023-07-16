package X;

import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.models.interfaces.IManifestLoader;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7gA  reason: invalid class name and case insensitive filesystem */
public final class C126907gA implements IManifestLoader {
    public C83304rA A00;

    private ListenableFuture A00(Long l, String str, Map map) {
        SettableFuture settableFuture = new SettableFuture();
        GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
        A002.A0F(str, FXPFAccessLibraryDebugFragment.NAME);
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > 2147483647L || longValue < -2147483648L) {
                settableFuture.setException(new ArithmeticException("Version number overflow! Valid version range is [-2147483648, 2147483647]."));
            }
            if (longValue != -1) {
                A002.A0C(Integer.valueOf(l.intValue()), ClientCookie.VERSION_ATTR);
            }
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator A0x = C18220wO.A0x(map);
        while (A0x.hasNext()) {
            A0v.add(A0x.next());
        }
        GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
        A003.A0A(C28174Ezk.A00(476), AnonymousClass0wJ.A0v());
        A003.A0A("cachedModelAssets", A0v);
        C67463zb A004 = C67463zb.A00();
        A004.A02(A002, "model_request_metadata");
        A004.A02(A003, "client_capability_metadata");
        this.A00.AMA(new C67473zc(A004, C89765Gq.class, "NativeMLModelQuery"), new MJM(this, settableFuture));
        return settableFuture;
    }

    public final ListenableFuture load(String str, long j, Map map) {
        return A00(new Long(j), str, map);
    }

    public C126907gA(C83304rA r1) {
        this.A00 = r1;
    }

    public final ListenableFuture load(String str, Map map) {
        return A00((Long) null, str, map);
    }
}
