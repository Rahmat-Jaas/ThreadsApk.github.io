package androidx.navigation.compose;

import X.AnonymousClass060;
import X.AnonymousClass066;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C123917Zx;
import X.C14260p5;
import java.util.List;

public final /* synthetic */ class DialogHostKt$PopulateVisibleList$1$1$$ExternalSyntheticLambda0 implements C14260p5 {
    public final /* synthetic */ C123917Zx A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ DialogHostKt$PopulateVisibleList$1$1$$ExternalSyntheticLambda0(C123917Zx r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }

    public final void CMI(AnonymousClass060 r4, AnonymousClass066 r5) {
        List list = this.A01;
        C123917Zx r1 = this.A00;
        AnonymousClass0wJ.A1N(list, r1);
        C04220Ms.A0B(r4, 3);
        if (r4 == AnonymousClass060.ON_START && !list.contains(r1)) {
            list.add(r1);
        }
        if (r4 == AnonymousClass060.ON_STOP) {
            list.remove(r1);
        }
    }
}
