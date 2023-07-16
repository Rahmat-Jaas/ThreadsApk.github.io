package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl;
import com.facebook.graphql.impls.FBPayAuthenticationFlowImpl;
import com.facebook.graphql.impls.FBPayLinkableTextImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxObjectShape101S0300000_2_I2;
import com.fbpay.logging.FBPayLoggerData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.7IP  reason: invalid class name */
public final class AnonymousClass7IP {
    public final C143688h9 A00;
    public final C106076eS A01;
    public final C107096g8 A02;

    public static FBPayAuthenticationFlowImpl.Steps A00(FBPayAuthFlowsContentQueryFragmentImpl.FbpayAuthenticationInformationQuery.AuthenticationInformation authenticationInformation, FBPayAuthenticationFlowImpl.Steps steps, String str, String str2) {
        if (steps == null) {
            return null;
        }
        C1366783w A0G = C18250wR.A0G(steps, FBPayAuthenticationFlowImpl.Steps.SubActions.class, "sub_actions");
        while (A0G.hasNext()) {
            TreeJNI A0G2 = C18210wN.A0G(A0G);
            AnonymousClass66V r2 = AnonymousClass66V.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            if (C86104wH.A0a(A0G2, r2, "sub_action_type") != null && ((AnonymousClass66V) C86104wH.A0a(A0G2, r2, "sub_action_type")).name().equals(str)) {
                C1366783w A0G3 = C18250wR.A0G(authenticationInformation, FBPayAuthFlowsContentQueryFragmentImpl.FbpayAuthenticationInformationQuery.AuthenticationInformation.Actions.class, "actions");
                while (A0G3.hasNext()) {
                    FBPayAuthenticationFlowImpl fBPayAuthenticationFlowImpl = (FBPayAuthenticationFlowImpl) C18210wN.A0G(A0G3).reinterpret(FBPayAuthenticationFlowImpl.class);
                    AnonymousClass69H r3 = AnonymousClass69H.A01;
                    if (C86104wH.A0a(fBPayAuthenticationFlowImpl, r3, "action_type") != null && C86104wH.A0a(A0G2, r3, "action_type") != null && ((AnonymousClass69H) C86104wH.A0a(fBPayAuthenticationFlowImpl, r3, "action_type")).name().equals(((AnonymousClass69H) C86104wH.A0a(A0G2, r3, "action_type")).name())) {
                        return A01(fBPayAuthenticationFlowImpl, str2);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static FBPayAuthenticationFlowImpl.Steps A01(FBPayAuthenticationFlowImpl fBPayAuthenticationFlowImpl, String str) {
        C1366783w A0G = C18250wR.A0G(fBPayAuthenticationFlowImpl, FBPayAuthenticationFlowImpl.Steps.class, "steps");
        while (A0G.hasNext()) {
            FBPayAuthenticationFlowImpl.Steps steps = (FBPayAuthenticationFlowImpl.Steps) A0G.next();
            AnonymousClass66U r2 = AnonymousClass66U.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            if (C86104wH.A0a(steps, r2, "step_type") != null && ((AnonymousClass66U) C86104wH.A0a(steps, r2, "step_type")).name().equals(str)) {
                return steps;
            }
        }
        return null;
    }

    public static String A03(FBPayAuthenticationFlowImpl.Steps steps) {
        C1366783w A0G = C18250wR.A0G(steps, FBPayAuthenticationFlowImpl.Steps.SubActions.class, "sub_actions");
        while (A0G.hasNext()) {
            TreeJNI A0G2 = C18210wN.A0G(A0G);
            Class<FBPayAuthenticationFlowImpl.Steps.SubActions.Text> cls = FBPayAuthenticationFlowImpl.Steps.SubActions.Text.class;
            if (A0G2.getTreeValue("text", cls) != null && !TextUtils.isEmpty(A0G2.getTreeValue("text", cls).getStringValue("text"))) {
                return A0G2.getTreeValue("text", cls).getStringValue("text");
            }
        }
        return null;
    }

    public final M5J A04(C104616c4 r7, FBPayLoggerData fBPayLoggerData) {
        C107096g8 r4 = this.A02;
        Bundle bundle = r7.A00;
        String string = bundle.getString("BUNDLE_KEY_PRIMARY_FLOW_TYPE");
        String string2 = bundle.getString("BUNDLE_KEY_PAYMENT_TYPE");
        C113556rc r1 = new C113556rc(string, string2);
        Map map = r4.A01;
        AnonymousClass56n r5 = (AnonymousClass56n) map.get(r1);
        if (r5 == null) {
            r5 = new AnonymousClass56n(r4, string, string2);
            map.put(r1, r5);
        }
        C109396jw r0 = r5.A03.A00;
        String str = r5.A02;
        AnonymousClass0wJ.A1N(str, fBPayLoggerData);
        Map map2 = r0.A02;
        C04220Ms.A05(map2);
        Object obj = map2.get(str);
        if (obj == null) {
            obj = new AnonymousClass786(r0.A00, r0.A01);
            map2.put(str, obj);
        }
        ((AnonymousClass786) obj).A00(fBPayLoggerData, AnonymousClass006.A0C, str).A6o(r5.A00);
        return C30821GXg.A01(r5, new IDxObjectShape101S0300000_2_I2(0, this, r7, fBPayLoggerData));
    }

    public AnonymousClass7IP(C107096g8 r1, C143688h9 r2, C106076eS r3) {
        this.A02 = r1;
        this.A01 = r3;
        this.A00 = r2;
    }

    public static C112166p6 A02(FBPayLinkableTextImpl fBPayLinkableTextImpl) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C1366783w A0G = C18250wR.A0G(fBPayLinkableTextImpl, FBPayLinkableTextImpl.Ranges.class, "ranges");
        while (A0G.hasNext()) {
            TreeJNI A0G2 = C18210wN.A0G(A0G);
            A0v.add(new C108886j7(A0G2.getIntValue("length"), A0G2.getIntValue("offset"), A0G2.getStringValue(C18170wI.A00(1276))));
        }
        String A0q = C86144wL.A0q(fBPayLinkableTextImpl);
        A0q.getClass();
        return new C112166p6(A0q, Collections.unmodifiableList(A0v));
    }
}
