package X;

import com.facebook.redex.IDxFCollectorShape60S0300000_2_I2;
import com.instagram.compose.core.SwipeableState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* renamed from: X.874  reason: invalid class name */
public final class AnonymousClass874 implements C83234r0 {
    public final /* synthetic */ float A00;
    public final /* synthetic */ SwipeableState A01;

    public AnonymousClass874(SwipeableState swipeableState, float f) {
        this.A01 = swipeableState;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, C146958n9 r23) {
        List A0n;
        Object A002;
        Map map = (Map) obj;
        SwipeableState swipeableState = this.A01;
        float A02 = C86164wN.A02(C120527Bg.A02(swipeableState.A07.getValue(), map));
        float A003 = C18240wQ.A00(swipeableState.A09.getValue());
        Set keySet = map.keySet();
        AnonymousClass0YP r6 = (AnonymousClass0YP) swipeableState.A0C.getValue();
        float f = this.A00;
        float A004 = C18240wQ.A00(swipeableState.A0D.getValue());
        float f2 = A02;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : keySet) {
            if (((double) C18240wQ.A00(next)) <= ((double) A003) + 0.001d) {
                A0v.add(next);
            }
        }
        Float A04 = AnonymousClass00J.A04(A0v);
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        for (Object next2 : keySet) {
            if (((double) C18240wQ.A00(next2)) >= ((double) A003) - 0.001d) {
                A0v2.add(next2);
            }
        }
        Float A05 = AnonymousClass00J.A05(A0v2);
        if (A04 == null) {
            A0n = C06750aI.A15(A05);
        } else if (A05 == null || C04220Ms.A0H(A04, A05)) {
            A0n = C18180wK.A0n(A04);
        } else {
            A0n = C06750aI.A17(A04, A05);
        }
        int size = A0n.size();
        if (size != 0) {
            Object obj2 = A0n.get(0);
            if (size != 1) {
                float A005 = C18240wQ.A00(obj2);
                f2 = C18240wQ.A00(A0n.get(1));
                if (A02 > A003 ? f <= (-A004) || A003 <= C18240wQ.A00(C86154wM.A0g(r6, f2, A005)) : f < A004 && A003 < C18240wQ.A00(C86154wM.A0g(r6, A005, f2))) {
                    f2 = A005;
                }
            } else {
                f2 = C18240wQ.A00(obj2);
            }
        }
        Object obj3 = map.get(C86154wM.A0W(f2));
        C146958n9 r5 = r23;
        if (obj3 != null) {
            A002 = C84714tk.A00(r5, swipeableState.A0F, new IDxFCollectorShape60S0300000_2_I2(11, obj3, swipeableState, swipeableState.A02));
        } else {
            A002 = SwipeableState.A00(swipeableState.A02, swipeableState, r5, A02);
        }
        if (A002 != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return A002;
    }
}
