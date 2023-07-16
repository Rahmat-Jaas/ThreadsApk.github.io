package X;

import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.common.ui.bottomsheet.AnchoredDraggableKt$animateTo$2;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2;

/* renamed from: X.6z3  reason: invalid class name and case insensitive filesystem */
public final class C117666z3 {
    public static final Object A00(AnonymousClass7A5 r6, Object obj, C146958n9 r8, float f) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(r6, obj, (C146958n9) null, f);
        Object A01 = AnonymousClass7Ja.A01(r8, new KtSLambdaShape4S0401000_I2(obj, C967166k.Default, r6, anchoredDraggableKt$animateTo$2, (C146958n9) null, 22));
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (A01 != d0e) {
            A01 = Unit.A00;
        }
        if (A01 != d0e) {
            A01 = Unit.A00;
        }
        if (A01 != d0e) {
            return Unit.A00;
        }
        return A01;
    }

    public static final Object A01(Map map, float f, boolean z) {
        float f2;
        float f3;
        if (C86164wN.A1R(map)) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    float A00 = C18240wQ.A00(((Map.Entry) next).getValue());
                    if (z) {
                        f2 = A00 - f;
                    } else {
                        f2 = f - A00;
                    }
                    if (f2 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        f2 = Float.POSITIVE_INFINITY;
                    }
                    do {
                        Object next2 = it.next();
                        float A002 = C18240wQ.A00(((Map.Entry) next2).getValue());
                        if (z) {
                            f3 = A002 - f;
                        } else {
                            f3 = f - A002;
                        }
                        if (f3 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                            f3 = Float.POSITIVE_INFINITY;
                        }
                        if (Float.compare(f2, f3) > 0) {
                            next = next2;
                            f2 = f3;
                        }
                    } while (it.hasNext());
                }
                return ((Map.Entry) next).getKey();
            }
            throw C86154wM.A0u();
        }
        throw C18190wL.A0a(C18170wI.A00(751));
    }
}
