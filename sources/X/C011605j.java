package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.05j  reason: invalid class name and case insensitive filesystem */
public abstract class C011605j {
    public boolean A00 = false;
    public boolean A01 = false;
    public final ViewGroup A02;
    public final ArrayList A03 = new ArrayList();
    public final ArrayList A04 = new ArrayList();

    public final void A08() {
        C12560m7.A0E(2);
        this.A02.isAttachedToWindow();
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            A04();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C13370nZ) it.next()).A02();
            }
            Iterator it2 = new ArrayList(this.A04).iterator();
            while (it2.hasNext()) {
                C12560m7.A0E(2);
                ((C13370nZ) it2.next()).A00();
            }
            Iterator it3 = new ArrayList(arrayList).iterator();
            while (it3.hasNext()) {
                C12560m7.A0E(2);
                ((C13370nZ) it3.next()).A00();
            }
        }
    }

    public abstract void A09(List list, boolean z);

    private void A04() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            C13370nZ r2 = (C13370nZ) it.next();
            if (r2.A01 == AnonymousClass006.A01) {
                r2.A03(C011505i.A00(r2.A04.requireView().getVisibility()), AnonymousClass006.A00);
            }
        }
    }

    public static void A05(AnonymousClass05H r6, C011605j r7, Integer num, Integer num2) {
        ArrayList arrayList = r7.A03;
        synchronized (arrayList) {
            C113806sA r5 = new C113806sA();
            Fragment fragment = r6.A02;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    C13370nZ r2 = new C13370nZ(r5, r6, num, num2);
                    arrayList.add(r2);
                    C011205d r0 = new C011205d(r2, r7);
                    List list = r2.A06;
                    list.add(r0);
                    list.add(new C011305e(r2, r7));
                    break;
                }
                C13370nZ r1 = (C13370nZ) it.next();
                if (r1.A04.equals(fragment) && !r1.A02) {
                    r1.A03(num, num2);
                    break;
                }
            }
        }
    }

    public final void A06() {
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            A04();
            this.A00 = false;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C13370nZ r3 = (C13370nZ) arrayList.get(size);
                Integer A012 = C011505i.A01(r3.A04.mView);
                Integer num = r3.A00;
                Integer num2 = AnonymousClass006.A01;
                if (num == num2 && A012 != num2) {
                    this.A00 = r3.A04.isPostponed();
                    break;
                }
            }
        }
    }

    public final void A07() {
        if (this.A00) {
            return;
        }
        if (!this.A02.isAttachedToWindow()) {
            A08();
            this.A01 = false;
            return;
        }
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = this.A04;
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList2.clear();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    C13370nZ r1 = (C13370nZ) it.next();
                    C12560m7.A0E(2);
                    r1.A00();
                    if (!r1.A03) {
                        arrayList2.add(r1);
                    }
                }
                A04();
                ArrayList arrayList4 = new ArrayList(arrayList);
                arrayList.clear();
                arrayList2.addAll(arrayList4);
                C12560m7.A0E(2);
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    ((C13370nZ) it2.next()).A02();
                }
                A09(arrayList4, this.A01);
                this.A01 = false;
                C12560m7.A0E(2);
            }
        }
    }

    public C011605j(ViewGroup viewGroup) {
        this.A02 = viewGroup;
    }

    public static C011605j A03(ViewGroup viewGroup) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C011605j) {
            return (C011605j) tag;
        }
        AnonymousClass010 r1 = new AnonymousClass010(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, r1);
        return r1;
    }
}
