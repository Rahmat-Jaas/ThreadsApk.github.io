package X;

import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import java.util.ConcurrentModificationException;
import kotlin.Unit;

/* renamed from: X.4l7  reason: invalid class name and case insensitive filesystem */
public final class C80074l7 extends C02220Ah implements AnonymousClass0YY {
    public static final C80074l7 A00 = new C80074l7();

    public C80074l7() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C560435o r11 = (C560435o) obj;
        C04220Ms.A0B(r11, 0);
        try {
            for (C133877wc r8 : InstagramQpSdkModule.A05) {
                if (r11 instanceof C28331u5) {
                    Trigger trigger = r11.A00;
                    String str = ((C28331u5) r11).A00;
                    C04220Ms.A0B(trigger, 0);
                    if (C133877wc.A00(r8, trigger) != 0) {
                        r8.A01.flowEndFail(C133877wc.A00(r8, trigger), str, "");
                    }
                } else if (r11 instanceof C28341u6) {
                    Trigger trigger2 = r11.A00;
                    String str2 = ((C28341u6) r11).A00;
                    C04220Ms.A0B(trigger2, 0);
                    if (C133877wc.A00(r8, trigger2) != 0) {
                        r8.A01.flowMarkPoint(C133877wc.A00(r8, trigger2), str2);
                    }
                }
            }
        } catch (ConcurrentModificationException e) {
            AnonymousClass0LU.A0E("IGqpSDKLogProducer", "Concurrent Exception", e);
        }
        return Unit.A00;
    }
}
