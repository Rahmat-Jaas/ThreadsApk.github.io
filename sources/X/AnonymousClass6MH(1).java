package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.InspectableValueKt;
import com.instagram.barcelona.common.ui.pulltorefresh.PullRefreshNestedScrollConnection;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0100000_I2_1;
import kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2;
import kotlin.jvm.internal.KtLambdaShape5S0110000_I2;
import kotlin.jvm.internal.KtLambdaShape5S0210000_I2;

/* renamed from: X.6MH  reason: invalid class name */
public final class AnonymousClass6MH {
    public static /* synthetic */ Modifier A00(Modifier modifier, C111216my r9) {
        AnonymousClass0YY r0;
        AnonymousClass0YY r1;
        C18210wN.A0n(1, modifier, r9);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = new KtLambdaShape5S0110000_I2(12, r9, true);
        } else {
            r0 = InspectableValueKt.A00;
        }
        C123327Wm r6 = Modifier.A00;
        IDxRImplShape189S0000000_2_I2 iDxRImplShape189S0000000_2_I2 = new IDxRImplShape189S0000000_2_I2(r9, 11);
        KtSLambdaShape12S0100000_I2_1 ktSLambdaShape12S0100000_I2_1 = new KtSLambdaShape12S0100000_I2_1(r9, (C146958n9) null, 9);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r1 = new KtLambdaShape5S0210000_I2(5, ktSLambdaShape12S0100000_I2_1, iDxRImplShape189S0000000_2_I2, true);
        } else {
            r1 = InspectableValueKt.A00;
        }
        return InspectableValueKt.A00(modifier, InspectableValueKt.A00(r6, C98186En.A00(r6, new PullRefreshNestedScrollConnection(iDxRImplShape189S0000000_2_I2, ktSLambdaShape12S0100000_I2_1), (NestedScrollDispatcher) null), r1), r0);
    }
}
