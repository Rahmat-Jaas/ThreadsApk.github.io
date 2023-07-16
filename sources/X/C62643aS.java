package X;

import com.facebook.redex.IDxDestinationShape710S0100000_1_I2;
import com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0100000_I2_4;

/* renamed from: X.3aS  reason: invalid class name and case insensitive filesystem */
public final class C62643aS {
    public final /* synthetic */ HandlerExecutorAndBuilder A00;

    public static AnonymousClass3DH A00(IDxDestinationShape710S0100000_1_I2 iDxDestinationShape710S0100000_1_I2, Object obj) {
        C04220Ms.A0B(obj, 0);
        Object obj2 = ((C62643aS) iDxDestinationShape710S0100000_1_I2.A00).A00.A06.get(new C02230Ai(AnonymousClass3DH.class));
        C04220Ms.A0C(obj2, "null cannot be cast to non-null type T of com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder.InnerHandlerContext.get");
        return (AnonymousClass3DH) obj2;
    }

    public C62643aS(HandlerExecutorAndBuilder handlerExecutorAndBuilder) {
        this.A00 = handlerExecutorAndBuilder;
    }

    public static Object A02(C62643aS r2, Class cls) {
        Object obj = r2.A00.A06.get(new C02230Ai(cls));
        C04220Ms.A0C(obj, "null cannot be cast to non-null type T of com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder.InnerHandlerContext.get");
        return obj;
    }

    public final Object A03() {
        AnonymousClass3I7 r1 = this.A00.A00;
        if (r1 != null) {
            if (r1.A01) {
                Object obj = r1.A00;
                if (obj != null) {
                    return obj;
                }
            } else {
                throw C18180wK.A0a("DeferredActionValue not resolved. Have you called it outside of an action execution block?");
            }
        }
        throw C18180wK.A0a("No action results have been labeled as return type. Have you used construct HandlerConfig.returns{ ... }");
    }

    public static AnonymousClass3DH A01(Object obj, KtSLambdaShape15S0100000_I2_4 ktSLambdaShape15S0100000_I2_4) {
        AnonymousClass0OU.A00(obj);
        Object obj2 = ((C62643aS) ktSLambdaShape15S0100000_I2_4.A00).A00.A06.get(new C02230Ai(AnonymousClass3DH.class));
        C04220Ms.A0C(obj2, "null cannot be cast to non-null type T of com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder.InnerHandlerContext.get");
        return (AnonymousClass3DH) obj2;
    }
}
