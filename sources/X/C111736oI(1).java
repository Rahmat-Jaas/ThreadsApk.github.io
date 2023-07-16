package X;

import com.facebook.dcp.model.Example;
import com.facebook.dcp.model.FeatureData;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6oI  reason: invalid class name and case insensitive filesystem */
public final class C111736oI {
    public final C83304rA A00;

    public C111736oI(C83304rA r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final ListenableFuture A00(AnonymousClass68S r16, String str, String str2, List list, long j) {
        String str3 = str;
        String str4 = str2;
        boolean A1Z = AnonymousClass0wJ.A1Z(str3, str4);
        C04220Ms.A0B(r16, 2);
        SettableFuture settableFuture = new SettableFuture();
        int i = (int) (j / 1000);
        try {
            C126707fg r5 = (C126707fg) C86104wH.A0p("create", C116276wi.class);
            C67463zb r4 = r5.A00;
            r4.A05("use_case", str3);
            r5.A04 = A1Z;
            r4.A05("use_case_version", str4);
            r5.A05 = A1Z;
            r4.A05("flow", "PREDICT");
            r5.A03 = A1Z;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Example example = (Example) it.next();
                GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
                A002.A0F(example.A00.A01, "context");
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                Iterator A0u = C18190wL.A0u(example.A02);
                while (A0u.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0u);
                    GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
                    A003.A0F(C18200wM.A0p(A0o), "id");
                    A003.A0F(((FeatureData) A0o.getValue()).A00(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    A0v2.add(A003);
                }
                A002.A0A("features", C18220wO.A0S(A0v2));
                A002.A0F(example.A01, "id");
                A002.A0C(Integer.valueOf(i), "timestamp");
                A0v.add(A002);
            }
            r4.A06("examples", C18220wO.A0S(A0v));
            r5.A02 = A1Z;
            this.A00.AMA(r5.AB4(), new C129967nl(settableFuture));
            return settableFuture;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }
}
