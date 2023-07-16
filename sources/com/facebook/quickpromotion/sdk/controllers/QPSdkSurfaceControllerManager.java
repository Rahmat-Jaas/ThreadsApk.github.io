package com.facebook.quickpromotion.sdk.controllers;

import X.AnonymousClass3RE;
import X.AnonymousClass4Y6;
import X.AnonymousClass4a7;
import X.AnonymousClass7Ja;
import X.C04220Ms;
import X.C1366783w;
import X.C146958n9;
import X.C25237DiI;
import X.C25295DjG;
import X.C27219EgD;
import X.C27952Ew2;
import X.C57663Bz;
import X.C83224qz;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2;

public final class QPSdkSurfaceControllerManager {
    public final ImmutableMap A00;

    public QPSdkSurfaceControllerManager(C57663Bz r11, ImmutableSet immutableSet, AnonymousClass3RE r13, String str) {
        AnonymousClass4a7 r8 = AnonymousClass4a7.A00;
        AnonymousClass4Y6 r9 = AnonymousClass4Y6.A00;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        C1366783w it = immutableSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C04220Ms.A04(str2);
            builder.put(str2, new QPSdkOnDemandSurfaceController(r11, r13, str, str2, r8, r9));
        }
        ImmutableMap build = builder.build();
        C04220Ms.A06(build);
        this.A00 = build;
    }

    public final void A00() {
        C1366783w it = ((ImmutableCollection) this.A00.values()).iterator();
        while (it.hasNext()) {
            QPSdkOnDemandSurfaceController qPSdkOnDemandSurfaceController = (QPSdkOnDemandSurfaceController) it.next();
            C04220Ms.A04(qPSdkOnDemandSurfaceController);
            C27219EgD egD = C25295DjG.A00;
            synchronized (qPSdkOnDemandSurfaceController) {
                qPSdkOnDemandSurfaceController.A02.clear();
                C83224qz A03 = AnonymousClass7Ja.A03(egD);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape14S0201000_I2((Object) A03, (Object) qPSdkOnDemandSurfaceController, (C146958n9) null, 49), A03, 3);
            }
        }
    }
}
