package X;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.03M  reason: invalid class name */
public final class AnonymousClass03M extends WindowInsetsAnimation.Callback {
    public ArrayList A00;
    public List A01;
    public final HashMap A02 = new HashMap();
    public final AnonymousClass03I A03;

    public AnonymousClass03M(AnonymousClass03I r2) {
        super(r2.A01);
        this.A03 = r2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        AnonymousClass03I r2 = this.A03;
        HashMap hashMap = this.A02;
        AnonymousClass03O r0 = (AnonymousClass03O) hashMap.get(windowInsetsAnimation);
        if (r0 == null) {
            r0 = AnonymousClass03O.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, r0);
        }
        r2.A03(r0);
        hashMap.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        AnonymousClass03I r2 = this.A03;
        HashMap hashMap = this.A02;
        AnonymousClass03O r0 = (AnonymousClass03O) hashMap.get(windowInsetsAnimation);
        if (r0 == null) {
            r0 = AnonymousClass03O.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, r0);
        }
        r2.A04(r0);
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.A00;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.A00 = arrayList2;
            this.A01 = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
                HashMap hashMap = this.A02;
                AnonymousClass03O r2 = (AnonymousClass03O) hashMap.get(windowInsetsAnimation);
                if (r2 == null) {
                    r2 = AnonymousClass03O.A00(windowInsetsAnimation);
                    hashMap.put(windowInsetsAnimation, r2);
                }
                r2.A00.A08(windowInsetsAnimation.getFraction());
                this.A00.add(r2);
            } else {
                AnonymousClass03I r22 = this.A03;
                windowInsets.getClass();
                return r22.A02(new AnonymousClass03Y(windowInsets), this.A01).A04();
            }
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        AnonymousClass03I r2 = this.A03;
        HashMap hashMap = this.A02;
        AnonymousClass03O r1 = (AnonymousClass03O) hashMap.get(windowInsetsAnimation);
        if (r1 == null) {
            r1 = AnonymousClass03O.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, r1);
        }
        AnonymousClass03H A002 = AnonymousClass03H.A00(bounds);
        r2.A01(A002, r1);
        return A002.A01();
    }
}
