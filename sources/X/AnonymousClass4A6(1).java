package X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.4A6  reason: invalid class name */
public final class AnonymousClass4A6 implements C33841Hva {
    public final C84574tR A00;
    public final C57213Ae A01;
    public final List A02;

    public AnonymousClass4A6(C84574tR r2, C57213Ae r3, List list) {
        C04220Ms.A0B(r3, 2);
        this.A02 = list;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final String getName() {
        return "QP SDK Choose Promotions Callback";
    }

    public final int getRunnableId() {
        return 958178636;
    }

    public final void onCancel() {
    }

    public final void onStart() {
    }

    public final void run() {
    }

    public final void onFinish() {
        Object obj;
        try {
            this.A00.ANG("fetch_callback_invoked");
            C57213Ae r4 = this.A01;
            List list = this.A02;
            C70894Gs r2 = r4.A02;
            C84574tR r5 = r2.A09;
            r5.ANG("process_promotion");
            C57483Bf r0 = r4.A00;
            List list2 = r0.A00;
            list2.addAll(list);
            r2.A00 = r0;
            Map map = r0.A02;
            if (map.isEmpty()) {
                r5.ANG("all_triggers_sdk");
                if (list2.isEmpty()) {
                    r2.C9I();
                } else {
                    r2.CDd(new AnonymousClass3VC(false), map);
                }
            } else {
                r5.ANG("fetch_remaining_triggers");
                r5.ANG("fetch_from_legacy");
                C84384t3 r3 = r2.A08;
                QuickPromotionSlot quickPromotionSlot = r2.A0A;
                EnumSet BF6 = r2.A0B.BF6();
                r3.B4r(new C567738m(r2.A04, r2.A0E), r5, quickPromotionSlot, r4.A01, map, BF6);
            }
            obj = Unit.A00;
        } catch (Throwable th) {
            obj = new AnonymousClass0OW(th);
        }
        Throwable A002 = AnonymousClass0OV.A00(obj);
        if (A002 != null) {
            C10450iM.A00().CuY("ChooseBestPromotionCallbackTask", "Error in SDK choose promotions callback processing", A002);
            this.A00.ANE("fetch_callback_error");
        }
    }
}
