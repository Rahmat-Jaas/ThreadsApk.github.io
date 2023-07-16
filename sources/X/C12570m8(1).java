package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.0m8  reason: invalid class name and case insensitive filesystem */
public abstract class C12570m8 extends AnonymousClass07E {
    public Fragment A00 = null;
    public AnonymousClass05O A01 = null;
    public boolean A02;
    public final int A03;
    public final C12560m7 A04;

    public abstract Fragment A00(int i);

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        AnonymousClass05O r0 = this.A01;
        if (r0 == null) {
            r0 = new AnonymousClass01J(this.A04);
            this.A01 = r0;
        }
        r0.A02(fragment);
        if (fragment.equals(this.A00)) {
            this.A00 = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void finishUpdate(ViewGroup viewGroup) {
        AnonymousClass05O r2 = this.A01;
        if (r2 != null) {
            if (!this.A02) {
                try {
                    this.A02 = true;
                    r2.A09();
                    this.A02 = false;
                } catch (Throwable th) {
                    this.A02 = false;
                    throw th;
                }
            }
            this.A01 = null;
        }
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.A01 == null) {
            this.A01 = new AnonymousClass01J(this.A04);
        }
        long j = (long) i;
        int id = viewGroup.getId();
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(id);
        sb.append(":");
        sb.append(j);
        Fragment A0O = this.A04.A0O(sb.toString());
        if (A0O != null) {
            this.A01.A0I(new AnonymousClass05N(A0O, 7));
        } else {
            A0O = A00(i);
            AnonymousClass05O r5 = this.A01;
            int id2 = viewGroup.getId();
            int id3 = viewGroup.getId();
            StringBuilder sb2 = new StringBuilder("android:switcher:");
            sb2.append(id3);
            sb2.append(":");
            sb2.append(j);
            r5.A0F(A0O, sb2.toString(), id2);
        }
        if (A0O != this.A00) {
            A0O.setMenuVisibility(false);
            if (this.A03 == 1) {
                this.A01.A06(A0O, AnonymousClass061.STARTED);
            } else {
                A0O.setUserVisibleHint(false);
                return A0O;
            }
        }
        return A0O;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).mView == view) {
            return true;
        }
        return false;
    }

    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.A00;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.A03 == 1) {
                    AnonymousClass05O r2 = this.A01;
                    if (r2 == null) {
                        r2 = new AnonymousClass01J(this.A04);
                        this.A01 = r2;
                    }
                    r2.A06(this.A00, AnonymousClass061.STARTED);
                } else {
                    this.A00.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.A03 == 1) {
                AnonymousClass05O r1 = this.A01;
                if (r1 == null) {
                    r1 = new AnonymousClass01J(this.A04);
                    this.A01 = r1;
                }
                r1.A06(fragment, AnonymousClass061.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.A00 = fragment;
        }
    }

    public C12570m8(C12560m7 r2, int i) {
        this.A04 = r2;
        this.A03 = i;
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
