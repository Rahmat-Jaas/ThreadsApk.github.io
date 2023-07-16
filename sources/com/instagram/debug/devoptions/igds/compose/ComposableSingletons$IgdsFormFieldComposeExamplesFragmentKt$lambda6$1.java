package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.AnonymousClass7GN;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C04220Ms;
import X.C121737Hu;
import X.C132757uS;
import X.C147188nY;
import X.C147258p3;
import X.C86164wN;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: com.instagram.debug.devoptions.igds.compose.ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt$lambda-6$1  reason: invalid class name */
public final class ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt$lambda6$1 extends C02220Ah implements AnonymousClass0YM {
    public static final ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt$lambda6$1 INSTANCE = new ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt$lambda6$1();

    public ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt$lambda6$1() {
        super(3);
    }

    public final void invoke(FormFieldExampleScope formFieldExampleScope, C147188nY r16, int i) {
        C04220Ms.A0B(formFieldExampleScope, 0);
        C147188nY r3 = r16;
        if ((i & 14) == 0) {
            i |= C147188nY.A0F(r3, formFieldExampleScope);
        }
        if ((i & 91) != 18 || !r3.BCM()) {
            String A0e = C86164wN.A0e(formFieldExampleScope.value$delegate);
            boolean A0y = C147188nY.A0y(r3, formFieldExampleScope);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r3;
            Object A13 = r2.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = new ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt$lambda6$1$1$1(formFieldExampleScope);
                r2.A14(A13);
            }
            C121737Hu.A00((C147258p3) null, r3, Modifier.A04(Modifier.A00), new C132757uS("This field always has an error."), A0e, "Form field (error)", AnonymousClass7W3.A0A(r2, A13, false), 0, 0, 3456, 480, false);
            return;
        }
        r3.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((FormFieldExampleScope) obj, (C147188nY) obj2, AnonymousClass0wJ.A04(obj3));
        return Unit.A00;
    }
}
