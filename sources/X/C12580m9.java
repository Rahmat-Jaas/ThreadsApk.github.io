package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: X.0m9  reason: invalid class name and case insensitive filesystem */
public abstract class C12580m9 extends AnonymousClass07E {
    public Fragment A00 = null;
    public AnonymousClass05O A01 = null;
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public boolean A04;
    public final int A05;
    public final C12560m7 A06;

    public abstract Fragment A00(int i);

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ArrayList arrayList;
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.A01 == null) {
            this.A01 = new AnonymousClass01J(this.A06);
        }
        while (true) {
            arrayList = this.A03;
            if (arrayList.size() > i) {
                break;
            }
            arrayList.add((Object) null);
        }
        if (fragment.isAdded()) {
            savedState = this.A06.A0K(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.A02.set(i, (Object) null);
        this.A01.A04(fragment);
        if (fragment.equals(this.A00)) {
            this.A00 = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void finishUpdate(ViewGroup viewGroup) {
        AnonymousClass05O r2 = this.A01;
        if (r2 != null) {
            if (!this.A04) {
                try {
                    this.A04 = true;
                    r2.A09();
                    this.A04 = false;
                } catch (Throwable th) {
                    this.A04 = false;
                    throw th;
                }
            }
            this.A01 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r3 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object instantiateItem(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            java.util.ArrayList r4 = r5.A02
            int r0 = r4.size()
            if (r0 <= r7) goto L_0x000f
            java.lang.Object r3 = r4.get(r7)
            if (r3 == 0) goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            X.05O r0 = r5.A01
            if (r0 != 0) goto L_0x001c
            X.0m7 r1 = r5.A06
            X.01J r0 = new X.01J
            r0.<init>(r1)
            r5.A01 = r0
        L_0x001c:
            androidx.fragment.app.Fragment r3 = r5.A00(r7)
            java.util.ArrayList r1 = r5.A03
            int r0 = r1.size()
            if (r0 <= r7) goto L_0x0033
            java.lang.Object r0 = r1.get(r7)
            androidx.fragment.app.Fragment$SavedState r0 = (androidx.fragment.app.Fragment.SavedState) r0
            if (r0 == 0) goto L_0x0033
            r3.setInitialSavedState(r0)
        L_0x0033:
            int r0 = r4.size()
            if (r0 > r7) goto L_0x003e
            r0 = 0
            r4.add(r0)
            goto L_0x0033
        L_0x003e:
            r0 = 0
            r3.setMenuVisibility(r0)
            int r2 = r5.A05
            if (r2 != 0) goto L_0x0049
            r3.setUserVisibleHint(r0)
        L_0x0049:
            r4.set(r7, r3)
            X.05O r1 = r5.A01
            int r0 = r6.getId()
            r1.A0C(r3, r0)
            r0 = 1
            if (r2 != r0) goto L_0x000e
            X.05O r1 = r5.A01
            X.061 r0 = X.AnonymousClass061.STARTED
            r1.A06(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12580m9.instantiateItem(android.view.ViewGroup, int):java.lang.Object");
    }

    public final boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).mView == view) {
            return true;
        }
        return false;
    }

    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.A03;
            arrayList.clear();
            ArrayList arrayList2 = this.A02;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable add : parcelableArray) {
                    arrayList.add(add);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment A0M = this.A06.A0M(bundle, str);
                    if (A0M == null) {
                        Log.w("FragmentStatePagerAdapt", AnonymousClass00U.A0L("Bad fragment at key ", str));
                    } else {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add((Object) null);
                        }
                        A0M.setMenuVisibility(false);
                        arrayList2.set(parseInt, A0M);
                    }
                }
            }
        }
    }

    public final Parcelable saveState() {
        Bundle bundle;
        ArrayList arrayList = this.A03;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[arrayList.size()];
            arrayList.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.A02;
            if (i >= arrayList2.size()) {
                return bundle;
            }
            Fragment fragment = (Fragment) arrayList2.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.A06.A0h(bundle, fragment, AnonymousClass00U.A0J("f", i));
            }
            i++;
        }
    }

    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.A00;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.A05 == 1) {
                    AnonymousClass05O r2 = this.A01;
                    if (r2 == null) {
                        r2 = new AnonymousClass01J(this.A06);
                        this.A01 = r2;
                    }
                    r2.A06(this.A00, AnonymousClass061.STARTED);
                } else {
                    this.A00.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.A05 == 1) {
                AnonymousClass05O r1 = this.A01;
                if (r1 == null) {
                    r1 = new AnonymousClass01J(this.A06);
                    this.A01 = r1;
                }
                r1.A06(fragment, AnonymousClass061.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.A00 = fragment;
        }
    }

    public C12580m9(C12560m7 r3, int i) {
        this.A06 = r3;
        this.A05 = i;
    }

    public final void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }
}
