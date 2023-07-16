package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass006;
import X.AnonymousClass0YM;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass6QY;
import X.C02220Ah;
import X.C04220Ms;
import X.C147188nY;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2;
import kotlin.Unit;

/* renamed from: com.instagram.debug.devoptions.igds.compose.ComposableSingletons$IgdsDialogComposeExamplesFragmentKt$lambda-4$1  reason: invalid class name */
public final class ComposableSingletons$IgdsDialogComposeExamplesFragmentKt$lambda4$1 extends C02220Ah implements AnonymousClass0YM {
    public static final ComposableSingletons$IgdsDialogComposeExamplesFragmentKt$lambda4$1 INSTANCE = new ComposableSingletons$IgdsDialogComposeExamplesFragmentKt$lambda4$1();

    public ComposableSingletons$IgdsDialogComposeExamplesFragmentKt$lambda4$1() {
        super(3);
    }

    public final void invoke(DialogExampleScope dialogExampleScope, C147188nY r17, int i) {
        int i2;
        final DialogExampleScope dialogExampleScope2 = dialogExampleScope;
        C04220Ms.A0B(dialogExampleScope2, 0);
        C147188nY r4 = r17;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r4, dialogExampleScope2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !r4.BCM()) {
            AnonymousClass6QY.A00(r4, new KtCSuperShape0S2210000_I2(AnonymousClass006.A01, "Primary action", (AnonymousClass0ZU) null, 28), new KtCSuperShape0S2210000_I2(AnonymousClass006.A00, "Secondary action", (AnonymousClass0ZU) null, 28), (KtCSuperShape0S2210000_I2) null, "Two actions", "This dialog has two actions.", new AnonymousClass0ZU() {
                public final void invoke() {
                    DialogExampleScope.this.dismissDialogExample();
                }
            }, 28080, 224, false, false);
            return;
        }
        r4.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((DialogExampleScope) obj, (C147188nY) obj2, AnonymousClass0wJ.A04(obj3));
        return Unit.A00;
    }
}
