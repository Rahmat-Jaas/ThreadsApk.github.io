package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.privacy.zone.upf.nocton.AndroidPurposePolicyFlowsToEvaluator;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* renamed from: X.7ge  reason: invalid class name and case insensitive filesystem */
public final class C127157ge implements C146158lk {
    public final C145848lD A00;

    public final void A00(ZonePolicy zonePolicy, ZonePolicy zonePolicy2, String str) {
        String A0i;
        Integer num;
        String str2;
        String str3;
        ZonePolicy zonePolicy3 = zonePolicy;
        ZonePolicy zonePolicy4 = zonePolicy2;
        boolean A1Z = AnonymousClass0wJ.A1Z(zonePolicy3, zonePolicy4);
        int flowsTo = AndroidPurposePolicyFlowsToEvaluator.flowsTo(zonePolicy3.A00(), zonePolicy4.A00(), AnonymousClass4WJ.A0A());
        String str4 = str;
        if (flowsTo == 0) {
            A0i = AnonymousClass00U.A0i("FlowsTo fail: ", zonePolicy3.A00(), " !--> ", zonePolicy4.A00(), " for ", str4);
            AnonymousClass0LU.A0C("ZoneImpl", A0i);
            num = AnonymousClass006.A00;
        } else if (flowsTo != A1Z) {
            A0i = AnonymousClass00U.A0i("FlowsTo evaluator error: ", zonePolicy3.A00(), " !--> ", zonePolicy4.A00(), " for ", str4);
            AnonymousClass0LU.A0C("ZoneImpl", A0i);
            num = AnonymousClass006.A0Y;
        } else {
            zonePolicy3.A00();
            zonePolicy4.A00();
            return;
        }
        RuntimeException r7 = new AnonymousClass88G(A0i);
        Integer num2 = zonePolicy3.A00;
        Integer num3 = zonePolicy4.A00;
        C04220Ms.A0B(num2, 0);
        C04220Ms.A0B(num3, A1Z ? 1 : 0);
        Integer[] A002 = AnonymousClass006.A00(2);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r7 = new NoSuchElementException(C28174Ezk.A00(6));
                break;
            }
            Integer num4 = A002[i];
            if (C98876Hg.A00(num4) == Math.min(C98876Hg.A00(num2), C98876Hg.A00(num3))) {
                C145848lD r6 = this.A00;
                Pair A0p = C18180wK.A0p("from", zonePolicy3.A00());
                Pair A0p2 = C18180wK.A0p("to", zonePolicy4.A00());
                int intValue = num4.intValue();
                switch (intValue) {
                    case 1:
                        str2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                        break;
                    default:
                        str2 = "FULL_THROW";
                        break;
                }
                Pair A0p3 = C18180wK.A0p("enforcementMode", str2);
                Pair A0p4 = C18180wK.A0p("fromPolicyVersion", zonePolicy3.A01());
                Pair A0p5 = C18180wK.A0p("toPolicyVersion", zonePolicy4.A01());
                if (flowsTo == 0) {
                    str3 = "False";
                } else if (flowsTo != A1Z) {
                    switch (flowsTo) {
                        case -100:
                            str3 = "UnknownPolicy";
                            break;
                        case -99:
                            str3 = "EvaluatorError";
                            break;
                        case -98:
                            str3 = "MissingConsent";
                            break;
                        default:
                            throw C18190wL.A0a(AnonymousClass00U.A0J("Invalid value: ", flowsTo));
                    }
                } else {
                    str3 = "True";
                }
                r6.Cdc(r7, num, AnonymousClass4WJ.A0H(A0p, A0p2, A0p3, A0p4, A0p5, C18180wK.A0p("flowsToResult", str3)));
                if (intValue != 0) {
                    return;
                }
            } else {
                i++;
            }
        }
        throw r7;
    }

    public final boolean isEnabled() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        X.C102596Vu.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.privacy.zone.api.ZonedValue CfS(X.C143448gk r6, com.facebook.privacy.zone.policy.ZonePolicy r7) {
        /*
            r5 = this;
            X.GVY r4 = X.GVY.A02
            java.lang.Object r1 = r4.A01()
            com.facebook.privacy.zone.policy.ZonePolicy r1 = (com.facebook.privacy.zone.policy.ZonePolicy) r1
            java.lang.String r0 = "Run"
            r5.A00(r1, r7, r0)
            r0 = 44
            kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1 r3 = X.C86164wN.A11(r7, r6, r0)
            java.lang.ThreadLocal r2 = r4.A00
            java.lang.Object r1 = r2.get()
            X.EUq r1 = (X.C26743EUq) r1
            X.5rY r0 = new X.5rY
            r0.<init>(r7)
            r2.set(r0)
            X.C04220Ms.A04(r1)
            X.7y3 r2 = new X.7y3
            r2.<init>(r4, r1)
            java.lang.Object r0 = r3.invoke(r7)     // Catch:{ all -> 0x0035 }
            r2.close()
            com.facebook.privacy.zone.api.ZonedValue r0 = (com.facebook.privacy.zone.api.ZonedValue) r0
            return r0
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.C102596Vu.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127157ge.CfS(X.8gk, com.facebook.privacy.zone.policy.ZonePolicy):com.facebook.privacy.zone.api.ZonedValue");
    }

    public final Object D8X(ZonedValue zonedValue) {
        ZonePolicy zonePolicy = zonedValue.A00;
        ZonePolicy zonePolicy2 = (ZonePolicy) GVY.A02.A01();
        A00(zonePolicy, zonePolicy2, "Unwrap");
        this.A00.Cd9(AnonymousClass006.A0N, AnonymousClass00U.A0L("Unwrap ", "ZonedValue"), AnonymousClass4WJ.A0G(C18180wK.A0p("from", zonePolicy.A00()), C18180wK.A0p("to", zonePolicy2.A00())));
        return zonedValue.A01;
    }

    public C127157ge(C145848lD r1) {
        this.A00 = r1;
    }

    public final Object CfT(C143448gk r9, ZonePolicy zonePolicy, Integer num) {
        boolean A1V = C18210wN.A1V(num);
        ZonedValue CfS = CfS(r9, zonePolicy);
        C04220Ms.A0B(CfS, A1V ? 1 : 0);
        C146298m0 AgA = this.A00.AgA(AnonymousClass006.A01);
        ZonePolicy zonePolicy2 = CfS.A00;
        zonePolicy2.A00();
        if (AgA.isSampled()) {
            ZonePolicy zonePolicy3 = (ZonePolicy) GVY.A02.A01();
            AgA.A64(new C97476Bm(AnonymousClass00U.A0V("ZonedValue", " is unzoned for ", "IGD_OBC_LOGGING_OUT_OF_REFACTOR_SCOPE")));
            AgA.A8X("reason", "IGD_OBC_LOGGING_OUT_OF_REFACTOR_SCOPE");
            AgA.A8X("from", zonePolicy2.A00());
            AgA.A8X("to", zonePolicy3.A00());
            AgA.A8X("fromPolicyVersion", zonePolicy2.A01());
            AgA.A8X("toPolicyVersion", zonePolicy3.A01());
            AgA.report();
        }
        return CfS.A01;
    }
}
