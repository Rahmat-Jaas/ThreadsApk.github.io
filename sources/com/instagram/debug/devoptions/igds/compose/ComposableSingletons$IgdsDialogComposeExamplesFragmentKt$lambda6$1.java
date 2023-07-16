package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YM;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass6QY;
import X.C02220Ah;
import X.C04220Ms;
import X.C147188nY;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2;
import kotlin.Unit;

/* renamed from: com.instagram.debug.devoptions.igds.compose.ComposableSingletons$IgdsDialogComposeExamplesFragmentKt$lambda-6$1  reason: invalid class name */
public final class ComposableSingletons$IgdsDialogComposeExamplesFragmentKt$lambda6$1 extends C02220Ah implements AnonymousClass0YM {
    public static final ComposableSingletons$IgdsDialogComposeExamplesFragmentKt$lambda6$1 INSTANCE = new ComposableSingletons$IgdsDialogComposeExamplesFragmentKt$lambda6$1();

    public ComposableSingletons$IgdsDialogComposeExamplesFragmentKt$lambda6$1() {
        super(3);
    }

    public final void invoke(final DialogExampleScope dialogExampleScope, C147188nY r15, int i) {
        int i2;
        C04220Ms.A0B(dialogExampleScope, 0);
        C147188nY r2 = r15;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r15, dialogExampleScope) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !r15.BCM()) {
            AnonymousClass6QY.A00(r2, new KtCSuperShape0S2210000_I2((Integer) null, "Primary action", (AnonymousClass0ZU) null, 30), (KtCSuperShape0S2210000_I2) null, (KtCSuperShape0S2210000_I2) null, "No message", (String) null, new AnonymousClass0ZU() {
                public final void invoke() {
                    DialogExampleScope.this.dismissDialogExample();
                }
            }, 3120, 244, false, false);
            return;
        }
        r15.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((DialogExampleScope) obj, (C147188nY) obj2, AnonymousClass0wJ.A04(obj3));
        return Unit.A00;
    }
}
