package X;

import android.animation.Animator;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.redex.IDxExecutorShape577S0100000_2_I2;
import com.instagram.barcelona.R;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7Ez  reason: invalid class name and case insensitive filesystem */
public final class C121247Ez {
    public LLF A00;
    public Map A01;
    public final Executor A02;
    public final List A03;
    public final AtomicBoolean A04 = C18230wP.A0w();
    public final AtomicReference A05;
    public final C127887hs A06;
    public final AnonymousClass3HX A07;
    public final C108046hj A08;
    public final AnonymousClass7HV A09;

    public static C58513Fy A00(Context context, C121997Jj r2, C83454rP r3) {
        return new C58513Fy(context, r2, r3);
    }

    public static void A01(C121247Ez r4, C113616ro r5) {
        C110936mW r1;
        if (r4.A04.get()) {
            return;
        }
        if (r5 != null) {
            AnonymousClass3HX r3 = r4.A07;
            Map map = r4.A01;
            C108056hk r0 = r4.A08.A00;
            if (r0 != null) {
                r1 = r0.A00;
            } else {
                r1 = null;
            }
            C127887hs.A00(new C127407h4(new C109236jg(r3, r5, r1, map)), r4.A06, r4.A02);
            return;
        }
        throw C18180wK.A0a("TreeState was null but it should have been initialised by the constructor");
    }

    public final AnonymousClass3HX A02() {
        if (this.A04.get()) {
            C30967GcS.A02("BloksHostingComponent", "Trying to access a BloksContext form a destroyed BloksHostingComponent");
        }
        return this.A07;
    }

    public final void A03() {
        AtomicBoolean atomicBoolean = this.A04;
        if (atomicBoolean.get()) {
            C30967GcS.A02("BloksHostingComponent", "Trying to detach a view from a destroyed BloksHostingComponent");
        } else {
            LLF llf = this.A00;
            if (llf != null) {
                llf.setRenderState((C127887hs) null);
                this.A00 = null;
            }
        }
        AnonymousClass3HX A022 = A02();
        HashMap hashMap = (HashMap) A022.A00(R.id.bk_context_key_animations);
        for (Animator cancel : ((AbstractMap) hashMap.clone()).values()) {
            cancel.cancel();
        }
        if (!hashMap.isEmpty()) {
            hashMap.clear();
        }
        HashMap hashMap2 = (HashMap) A022.A00(R.id.bk_context_key_timers);
        for (C113026qa A002 : ((AbstractMap) hashMap2.clone()).values()) {
            A002.A00();
        }
        if (!hashMap2.isEmpty()) {
            C30967GcS.A02("BloksTimer", "Timer map is non-empty after cleanup!");
            hashMap2.clear();
        }
        AnonymousClass7HV A012 = AnonymousClass7K7.A01(A022);
        A012.A06 = true;
        A012.A01.A00();
        atomicBoolean.set(true);
        AnonymousClass326.A02.incrementAndGet();
    }

    public final void A04() {
        if (this.A04.get()) {
            C30967GcS.A02("BloksHostingComponent", "Trying to detach a view from a destroyed BloksHostingComponent");
            return;
        }
        LLF llf = this.A00;
        if (llf != null) {
            llf.setRenderState((C127887hs) null);
            this.A00 = null;
        }
    }

    public final void A05() {
        if (this.A04.get()) {
            C30967GcS.A02("BloksHostingComponent", "Notifying bounds on a destroyed BloksHostingComponent");
            return;
        }
        LLF llf = this.A00;
        if (llf != null) {
            llf.BiO();
        }
    }

    public final void A06(LLF llf) {
        if (this.A04.get()) {
            C30967GcS.A02("BloksHostingComponent", "Trying to attach a view to a destroyed BloksHostingComponent");
            return;
        }
        LLF llf2 = this.A00;
        if (!(llf2 == null || llf2 == llf)) {
            A04();
        }
        this.A00 = llf;
        llf.setRenderState(this.A06);
        this.A00.requestLayout();
    }

    public C121247Ez(Context context, SparseArray sparseArray, C121997Jj r9, C83454rP r10, Map map, Map map2) {
        AtomicReference atomicReference = new AtomicReference();
        this.A05 = atomicReference;
        this.A02 = new IDxExecutorShape577S0100000_2_I2(this, 4);
        List list = r9.A01.A02;
        this.A03 = list;
        AnonymousClass326.A01.incrementAndGet();
        AnonymousClass3HX A002 = AnonymousClass7K7.A00(context, sparseArray, new AnonymousClass7HV(r9, r10.ATb().A05, AnonymousClass7r6.A00), r10, r9.A03);
        this.A07 = A002;
        AnonymousClass7HV A012 = AnonymousClass7K7.A01(A002);
        this.A09 = A012;
        this.A01 = C121997Jj.A04(list, map);
        C108046hj r1 = new C108046hj(A012);
        this.A08 = r1;
        AnonymousClass2LE.A00(A002);
        this.A06 = new C127887hs(context, r1, A002);
        C113616ro A022 = A012.A02(A002, new AnonymousClass7qR(this), map2);
        atomicReference.compareAndSet((Object) null, A022);
        A01(this, A022);
    }
}
