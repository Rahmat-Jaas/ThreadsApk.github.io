package X;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.KtLambdaShape4S0210000_I2;

/* renamed from: X.7F7  reason: invalid class name */
public final class AnonymousClass7F7 {
    public boolean A00;
    public final ReentrantLock A01;
    public final C86074wE A02;
    public final C86074wE A03;
    public final C86094wG A04;
    public final C86094wG A05;
    public final C114586tX A06;
    public final /* synthetic */ AnonymousClass7KG A07;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass7F7(AnonymousClass7KG r2, C114586tX r3) {
        this();
        C04220Ms.A0B(r3, 2);
        this.A07 = r2;
        this.A06 = r3;
    }

    public final void A02(C123917Zx r7) {
        C04220Ms.A0B(r7, 0);
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            C86074wE r4 = this.A02;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (Object next : (Iterable) r4.getValue()) {
                if (!C86144wL.A1X((C123917Zx) next, r7)) {
                    break;
                }
                A0v.add(next);
            }
            r4.CrC(A0v);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void A04(C123917Zx r7) {
        AnonymousClass58Q r0;
        C04220Ms.A0B(r7, 0);
        AnonymousClass7KG r3 = this.A07;
        Map map = r3.A0J;
        boolean A1Z = C18190wL.A1Z(map.get(r7), true);
        C86074wE r1 = this.A03;
        r1.CrC(AnonymousClass4WL.A02(r7, (Set) r1.getValue()));
        map.remove(r7);
        AnonymousClass8AL r2 = r3.A0M;
        if (!r2.contains(r7)) {
            r3.A0E(r7);
            if (r7.A02.A00.A00(AnonymousClass061.CREATED)) {
                r7.A02(AnonymousClass061.DESTROYED);
            }
            if (!(r2 instanceof Collection) || !r2.isEmpty()) {
                Iterator it = r2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C04220Ms.A0I(C86154wM.A0J(it).A0A, r7.A0A)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!A1Z && (r0 = r3.A05) != null) {
                String str = r7.A0A;
                C04220Ms.A0B(str, 0);
                AnonymousClass06B r02 = (AnonymousClass06B) r0.A00.remove(str);
                if (r02 != null) {
                    r02.A00();
                }
            }
        } else if (this.A00) {
            return;
        }
        r3.A0D();
        r3.A0O.D7t(r3.A0C());
    }

    public final void A05(C123917Zx r4) {
        C04220Ms.A0B(r4, 0);
        AnonymousClass7KG r2 = this.A07;
        C114586tX A002 = r2.A07.A00(r4.A03.A05);
        if (C04220Ms.A0I(A002, this.A06)) {
            AnonymousClass0YY r0 = r2.A08;
            if (r0 != null) {
                r0.invoke(r4);
                A03(r4);
                return;
            }
            return;
        }
        Object obj = r2.A0K.get(A002);
        if (obj != null) {
            ((AnonymousClass7F7) obj).A05(r4);
            return;
        }
        throw C18180wK.A0a(AnonymousClass00U.A0V("NavigatorBackStack for ", r4.A03.A05, " should already be created"));
    }

    public final void A06(C123917Zx r3) {
        C04220Ms.A0B(r3, 0);
        Object A0F = AnonymousClass00J.A0F((List) this.A04.getValue());
        if (A0F != null) {
            A00(A0F, this.A03);
        }
        A00(r3, this.A03);
        A05(r3);
    }

    public final void A07(C123917Zx r8, boolean z) {
        AnonymousClass7KG r5 = this.A07;
        C114586tX A002 = r5.A07.A00(r8.A03.A05);
        if (C04220Ms.A0I(A002, this.A06)) {
            AnonymousClass0YY r0 = r5.A09;
            if (r0 != null) {
                r0.invoke(r8);
                A02(r8);
                return;
            }
            KtLambdaShape4S0210000_I2 ktLambdaShape4S0210000_I2 = new KtLambdaShape4S0210000_I2(2, r8, this, z);
            AnonymousClass8AL r2 = r5.A0M;
            int indexOf = r2.indexOf(r8);
            if (indexOf >= 0) {
                int i = indexOf + 1;
                if (i != r2.size()) {
                    AnonymousClass7KG.A07(r5, ((C123917Zx) r2.get(i)).A03.A00, true, false);
                }
                AnonymousClass7KG.A03(r8, r5, new AnonymousClass8AL(), false);
                ktLambdaShape4S0210000_I2.invoke();
                AnonymousClass7KG.A04(r5);
                AnonymousClass7KG.A06(r5);
                return;
            }
            return;
        }
        Object obj = r5.A0K.get(A002);
        C04220Ms.A0A(obj);
        ((AnonymousClass7F7) obj).A07(r8, z);
    }

    public final C123917Zx A01(Bundle bundle, AnonymousClass7AO r11) {
        AnonymousClass061 r5;
        AnonymousClass7KG r1 = this.A07;
        Context context = r1.A0E;
        if (r1.A04 == null) {
            r5 = AnonymousClass061.CREATED;
        } else {
            r5 = r1.A03;
        }
        AnonymousClass58Q r7 = r1.A05;
        String A0n = C18190wL.A0n(UUID.randomUUID());
        C04220Ms.A0B(r5, 3);
        return new C123917Zx(context, bundle, (Bundle) null, r5, r11, r7, A0n);
    }

    public final void A03(C123917Zx r4) {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            C86074wE r1 = this.A02;
            r1.CrC(AnonymousClass00J.A0X(r4, (Collection) r1.getValue()));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void A08(C123917Zx r7, boolean z) {
        C86074wE r5 = this.A03;
        A00(r7, r5);
        C86094wG r4 = this.A04;
        ListIterator A10 = C86144wL.A10((List) r4.getValue());
        while (true) {
            if (!A10.hasPrevious()) {
                break;
            }
            Object previous = A10.previous();
            if (!C04220Ms.A0I(previous, r7) && ((List) r4.getValue()).lastIndexOf(previous) < ((List) r4.getValue()).lastIndexOf(r7)) {
                if (previous != null) {
                    A00(previous, r5);
                }
            }
        }
        A07(r7, z);
        this.A07.A0J.put(r7, Boolean.valueOf(z));
    }

    public static void A00(Object obj, C86074wE r2) {
        r2.CrC(AnonymousClass4WL.A03(obj, (Set) r2.getValue()));
    }

    public AnonymousClass7F7() {
        this.A01 = new ReentrantLock(true);
        C27457Enn A0z = C18190wL.A0z(AnonymousClass0ZV.A00);
        this.A02 = A0z;
        C27457Enn A0z2 = C18190wL.A0z(AnonymousClass84Y.A00);
        this.A03 = A0z2;
        this.A04 = C18230wP.A0x((C148838sG) null, A0z);
        this.A05 = C18230wP.A0x((C148838sG) null, A0z2);
    }
}
