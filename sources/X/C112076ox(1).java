package X;

import android.content.Context;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.dcp.model.DcpContext;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.redex.IDxFCallbackShape314S0100000_2_I2;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6ox  reason: invalid class name and case insensitive filesystem */
public final class C112076ox {
    public final C83304rA A00;
    public final Context A01;

    public final C143338gY A00(Integer num, String str, String str2, String str3, String str4, List list) {
        String str5;
        ImmutableList immutableList;
        String str6 = str;
        String str7 = str2;
        boolean A1Z = AnonymousClass0wJ.A1Z(str6, str7);
        String str8 = str3;
        C04220Ms.A0B(str8, 2);
        SettableFuture settableFuture = new SettableFuture();
        try {
            C126397fB r5 = (C126397fB) C86104wH.A0p("create", C116636xI.class);
            C67463zb r4 = r5.A00;
            r4.A05("test_id", "59705010009496");
            r5.A04 = A1Z;
            r4.A05("usecase", str6);
            r5.A05 = A1Z;
            r4.A05("purpose", str8);
            r5.A03 = A1Z;
            r4.A05(ClientCookie.VERSION_ATTR, str7);
            r5.A06 = A1Z;
            if (num.intValue() != 0) {
                str5 = "INFER";
            } else {
                str5 = "TRAIN";
            }
            r4.A05("client_msg_type", str5);
            r5.A02 = A1Z;
            r4.A05("client_msg", str4);
            if (list == null || list.isEmpty()) {
                immutableList = null;
            } else {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    DcpContext dcpContext = (DcpContext) it.next();
                    GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
                    Map map = dcpContext.A03;
                    ArrayList A0k = C18240wQ.A0k(map.size());
                    Iterator A0z = AnonymousClass0wJ.A0z(map);
                    while (A0z.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0z);
                        GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
                        A003.A0C(C86124wJ.A0h(C18200wM.A0p(A0o)), "id");
                        A003.A0C(Integer.valueOf((int) C18190wL.A08(A0o.getValue())), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        A0k.add(A003);
                    }
                    A002.A0A("int_features", A0k);
                    Map map2 = dcpContext.A02;
                    ArrayList A0k2 = C18240wQ.A0k(map2.size());
                    Iterator A0z2 = AnonymousClass0wJ.A0z(map2);
                    while (A0z2.hasNext()) {
                        Map.Entry A0o2 = C18180wK.A0o(A0z2);
                        GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
                        A004.A0C(C86124wJ.A0h(C18200wM.A0p(A0o2)), "id");
                        A004.A0E(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, (Double) A0o2.getValue());
                        A0k2.add(A004);
                    }
                    A002.A0A("float_features", A0k2);
                    Map map3 = dcpContext.A04;
                    ArrayList A0k3 = C18240wQ.A0k(map3.size());
                    Iterator A0z3 = AnonymousClass0wJ.A0z(map3);
                    while (A0z3.hasNext()) {
                        Map.Entry A0o3 = C18180wK.A0o(A0z3);
                        GQLCallInputCInputShape0S0000000 A005 = GraphQlCallInput.A00();
                        A005.A0C(C86124wJ.A0h(C18200wM.A0p(A0o3)), "id");
                        A005.A0F(C18230wP.A0u(A0o3), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        A0k3.add(A005);
                    }
                    A002.A0A("string_features", A0k3);
                    A0v.add(A002);
                }
                immutableList = ImmutableList.copyOf((Collection) A0v);
            }
            r4.A06("contexts", immutableList);
            this.A00.AMA(r5.build(), new IDxFCallbackShape314S0100000_2_I2(settableFuture, A1Z ? 1 : 0));
            return (C143338gY) settableFuture.get();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }

    public C112076ox(Context context, C83304rA r2) {
        AnonymousClass0wJ.A1O(r2, context);
        this.A00 = r2;
        this.A01 = context;
    }
}
