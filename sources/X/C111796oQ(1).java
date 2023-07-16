package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.6oQ  reason: invalid class name and case insensitive filesystem */
public final class C111796oQ {
    public final C04530Oa A00 = AnonymousClass0OY.A02(C138068Gb.A00);

    public final C145388kQ A00(C113806sA r8, C112146p4 r9, C121207Et r10) {
        String str;
        AnonymousClass0wJ.A1O(r10, r9);
        try {
            String str2 = null;
            C126387fA r3 = (C126387fA) C116336wo.class.getMethod("create", new Class[0]).invoke((Object) null, new Object[0]);
            ImmutableList immutableList = r10.A00;
            C67463zb r2 = r3.A00;
            r2.A06("component_types", immutableList);
            r3.A02 = true;
            String str3 = r10.A0E;
            C67463zb r4 = r3.A01;
            r4.A05(AnonymousClass7C6.A00(), str3);
            r3.A06 = true;
            r4.A05(TraceFieldType.RequestID, r10.A0D);
            r3.A05 = true;
            r2.A05("payment_product_id", r10.A0B);
            r3.A04 = true;
            r4.A05("fetch_type", r10.A08);
            r3.A03 = true;
            OtcInput otcInput = r10.A03;
            if (otcInput != null) {
                str = otcInput.A00;
            } else {
                str = null;
            }
            r2.A05("otc_session_id", str);
            if (otcInput != null) {
                str2 = otcInput.A01;
            }
            r2.A05("otc_type", str2);
            String str4 = r10.A0C;
            if (!(str4 == null || str4.length() == 0)) {
                r4.A05("receiver_id", str4);
            }
            String str5 = r10.A0A;
            if (str5.length() > 0) {
                r2.A05("payment_container_mode", str5);
            }
            ImmutableList immutableList2 = r10.A05;
            if (!immutableList2.isEmpty()) {
                r4.A06("supported_container_types", immutableList2);
            }
            ImmutableList immutableList3 = r10.A04;
            if (!immutableList3.isEmpty()) {
                r4.A06("payment_action_types", immutableList3);
            }
            String str6 = r10.A06;
            if (!(str6 == null || str6.length() == 0)) {
                r4.A05("client_receiver_id", str6);
            }
            String str7 = r10.A07;
            if (str7 != null) {
                r4.A05("experience_type", str7);
            }
            GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000 = r10.A01;
            if (gQLCallInputCInputShape0S0000000 != null) {
                r4.A02(gQLCallInputCInputShape0S0000000, "charge_amount");
            }
            String str8 = r10.A09;
            if (str8 != null && !AnonymousClass8bQ.A0n(str8)) {
                r4.A05("order_id", str8);
            }
            GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S00000002 = r10.A02;
            if (gQLCallInputCInputShape0S00000002 != null) {
                r2.A02(gQLCallInputCInputShape0S00000002, "otc_component_input");
            }
            C146418mD build = r3.build();
            C04220Ms.A06(build);
            r9.A00(build);
            return AnonymousClass6BW.A00(r8, (C83304rA) this.A00.getValue(), build, AnonymousClass7n9.A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }
}
