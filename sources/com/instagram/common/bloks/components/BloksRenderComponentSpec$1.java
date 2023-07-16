package com.instagram.common.bloks.components;

import X.AnonymousClass060;
import X.AnonymousClass065;
import X.AnonymousClass3HX;
import X.AnonymousClass7HV;
import X.AnonymousClass7K7;
import X.AnonymousClass7r1;
import X.C110856mO;
import X.C113856sH;
import X.C135147yx;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.pando.TreeJNI;

public class BloksRenderComponentSpec$1 implements AnonymousClass065 {
    public final /* synthetic */ AnonymousClass3HX A00;

    public BloksRenderComponentSpec$1(AnonymousClass3HX r1) {
        this.A00 = r1;
    }

    @OnLifecycleEvent(AnonymousClass060.ON_PAUSE)
    public void onActivityPause() {
        AnonymousClass7HV A01 = AnonymousClass7K7.A01(this.A00);
        if (!A01.A06) {
            for (C110856mO r3 : A01.A0F) {
                Object obj = A01.A05.get(r3.A06);
                Runnable runnable = r3.A01;
                if (runnable != null && (obj instanceof TreeJNI)) {
                    r3.A00 = (TreeJNI) obj;
                    runnable.run();
                    r3.A01 = null;
                }
            }
        }
    }

    @OnLifecycleEvent(AnonymousClass060.ON_RESUME)
    public void onActivityResume() {
        AnonymousClass7HV A01 = AnonymousClass7K7.A01(this.A00);
        if (!A01.A06) {
            for (C110856mO r6 : A01.A0F) {
                C113856sH r5 = A01.A01;
                TreeJNI treeJNI = r6.A00;
                if (treeJNI != null) {
                    C135147yx r0 = new C135147yx(r6.A05.subscribe(treeJNI, TreeJNI.class, r6.A04, AnonymousClass7r1.A01).cancelToken);
                    r6.A01 = r0;
                    r5.A01(r0);
                    r6.A00 = null;
                }
            }
        }
    }
}
