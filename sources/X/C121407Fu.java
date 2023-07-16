package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11;
import kotlin.jvm.internal.KtLambdaShape5S0010000_I2;
import kotlin.jvm.internal.KtLambdaShape6S1100000_I2;

/* renamed from: X.7Fu  reason: invalid class name and case insensitive filesystem */
public final class C121407Fu {
    public static final List A03(AnonymousClass5HY r5, AnonymousClass0YY r6) {
        C04220Ms.A0B(r5, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2 : r5.A02) {
            Object obj = ktCSuperShape0S0200000_I2.A01;
            if (AnonymousClass0wJ.A1X(r6.invoke(obj))) {
                A0v.add(obj);
            }
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            for (Object next : (Iterable) ((KtCSuperShape0S0300000_I2) ktCSuperShape0S0200000_I2.A00).A01) {
                if (AnonymousClass0wJ.A1X(r6.invoke(next))) {
                    A0v2.add(next);
                }
            }
            A0v.addAll(A0v2);
        }
        return A0v;
    }

    public static AnonymousClass5HY A01(AnonymousClass5HY r3, String str, String str2, int i, boolean z) {
        KtLambdaShape5S0010000_I2 ktLambdaShape5S0010000_I2 = new KtLambdaShape5S0010000_I2(z, i);
        C04220Ms.A0B(str, 1);
        if (str2 != null) {
            return A02(r3, str2, new KtLambdaShape6S1100000_I2(str, ktLambdaShape5S0010000_I2, 30));
        }
        return A02(r3, str, new KtLambdaShape156S0100000_I2_11(ktLambdaShape5S0010000_I2, 5));
    }

    public static final AnonymousClass5HY A02(AnonymousClass5HY r6, String str, AnonymousClass0YY r8) {
        List<KtCSuperShape0S0200000_I2> list = r6.A02;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        for (KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2 : list) {
            A0w.add(C04220Ms.A0I(((AnonymousClass9S0) ktCSuperShape0S0200000_I2.A01).A08, str) ? r8.invoke(ktCSuperShape0S0200000_I2) : ktCSuperShape0S0200000_I2);
        }
        return new AnonymousClass5HY(r6.A00, r6.A01, A0w, r6.A03, r6.A05, r6.A04);
    }

    public static final AnonymousClass9S0 A00(AnonymousClass5HY r3, String str, String str2) {
        Object obj;
        Object obj2;
        KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I2;
        Iterable iterable;
        AnonymousClass0wJ.A1N(r3, str);
        Object obj3 = null;
        Iterator it = r3.A02.iterator();
        if (str2 != null) {
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (C04220Ms.A0I(((AnonymousClass9S0) ((KtCSuperShape0S0200000_I2) obj2).A01).A08, str2)) {
                    break;
                }
            }
            KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2 = (KtCSuperShape0S0200000_I2) obj2;
            if (ktCSuperShape0S0200000_I2 != null && (ktCSuperShape0S0300000_I2 = (KtCSuperShape0S0300000_I2) ktCSuperShape0S0200000_I2.A00) != null && (iterable = (Iterable) ktCSuperShape0S0300000_I2.A01) != null) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (C04220Ms.A0I(((AnonymousClass9S0) next).A08, str)) {
                        obj3 = next;
                        break;
                    }
                }
            } else {
                return null;
            }
        } else {
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C04220Ms.A0I(((AnonymousClass9S0) ((KtCSuperShape0S0200000_I2) obj).A01).A08, str)) {
                    break;
                }
            }
            KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I22 = (KtCSuperShape0S0200000_I2) obj;
            if (ktCSuperShape0S0200000_I22 == null) {
                return null;
            }
            obj3 = ktCSuperShape0S0200000_I22.A01;
        }
        return (AnonymousClass9S0) obj3;
    }
}
