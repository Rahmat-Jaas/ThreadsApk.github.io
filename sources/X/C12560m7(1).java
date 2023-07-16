package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.IDxPCallbackShape32S0100000_I2;
import androidx.fragment.app.BackStackRecordState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager$6;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.redex.IDxConsumerShape516S0100000_I2;
import com.instagram.barcelona.R;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0m7  reason: invalid class name and case insensitive filesystem */
public abstract class C12560m7 implements AnonymousClass05E {
    public int A00 = -1;
    public AnonymousClass00F A01;
    public AnonymousClass00O A02;
    public AnonymousClass00O A03;
    public AnonymousClass00O A04;
    public Fragment A05;
    public Fragment A06;
    public C010204r A07;
    public C010504v A08 = null;
    public C04600Oi A09;
    public AnonymousClass05B A0A;
    public Runnable A0B = new AnonymousClass050(this);
    public ArrayDeque A0C = new ArrayDeque();
    public ArrayList A0D;
    public ArrayList A0E;
    public boolean A0F;
    public boolean A0G;
    public C010504v A0H = new AnonymousClass0gC(this);
    public AnonymousClass05k A0I = new AnonymousClass0gU(this);
    public ArrayList A0J;
    public ArrayList A0K;
    public ArrayList A0L;
    public ArrayList A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final AnonymousClass00C A0Q = new IDxPCallbackShape32S0100000_I2(this);
    public final C010704x A0R = new C010704x(this);
    public final C010904z A0S = new C010904z(this);
    public final AnonymousClass05I A0T = new AnonymousClass05I();
    public final ArrayList A0U = new ArrayList();
    public final Map A0V = Collections.synchronizedMap(new HashMap());
    public final Map A0W = Collections.synchronizedMap(new HashMap());
    public final Map A0X = Collections.synchronizedMap(new HashMap());
    public final CopyOnWriteArrayList A0Y = new CopyOnWriteArrayList();
    public final AtomicInteger A0Z = new AtomicInteger();
    public final C002301a A0a = new IDxConsumerShape516S0100000_I2(this, 2);
    public final C002301a A0b = new IDxConsumerShape516S0100000_I2(this, 3);
    public final C002301a A0c = new IDxConsumerShape516S0100000_I2(this, 4);
    public final C002301a A0d = new IDxConsumerShape516S0100000_I2(this, 5);
    public final AnonymousClass02V A0e = new AnonymousClass0g2(this);
    public boolean mExecutingActions;

    public static C12560m7 A01(View view) {
        Fragment fragment;
        View view2 = view;
        while (view2 != null) {
            Object tag = view2.getTag(R.id.fragment_container_view_tag);
            if (!(tag instanceof Fragment) || (fragment = (Fragment) tag) == null) {
                ViewParent parent = view2.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view2 = (View) parent;
            } else if (fragment.isAdded()) {
                return fragment.getChildFragmentManager();
            } else {
                StringBuilder sb = new StringBuilder("The Fragment ");
                sb.append(fragment);
                sb.append(" that owns View ");
                sb.append(view);
                sb.append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
                throw new IllegalStateException(sb.toString());
            }
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                if (fragmentActivity != null) {
                    return fragmentActivity.getSupportFragmentManager();
                }
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        StringBuilder sb2 = new StringBuilder("View ");
        sb2.append(view);
        sb2.append(" is not within a subclass of FragmentActivity.");
        throw new IllegalStateException(sb2.toString());
    }

    private void A03() {
        this.mExecutingActions = false;
        this.A0L.clear();
        this.A0M.clear();
    }

    /* JADX INFO: finally extract failed */
    public static void A09(C12560m7 r4, int i) {
        try {
            r4.mExecutingActions = true;
            for (AnonymousClass05H r0 : r4.A0T.A02.values()) {
                if (r0 != null) {
                    r0.A00 = i;
                }
            }
            r4.A0g(i, false);
            for (C011605j A082 : r4.A02()) {
                A082.A08();
            }
            r4.mExecutingActions = false;
            r4.A14(true);
        } catch (Throwable th) {
            r4.mExecutingActions = false;
            throw th;
        }
    }

    private boolean A0H(String str, int i, int i2) {
        A14(false);
        A0D(true);
        Fragment fragment = this.A06;
        String str2 = str;
        int i3 = i;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().A16()) {
            return true;
        }
        ArrayList arrayList = this.A0M;
        ArrayList arrayList2 = this.A0L;
        boolean A1D = A1D(str2, arrayList, arrayList2, i3, i2);
        if (A1D) {
            this.mExecutingActions = true;
            try {
                A0B(arrayList, arrayList2);
            } finally {
                A03();
            }
        }
        A08(this);
        A04();
        this.A0T.A02.values().removeAll(Collections.singleton((Object) null));
        return A1D;
    }

    public final void A0T() {
        this.A0O = false;
        this.A0P = false;
        this.A0A.A0A(false);
        A09(this, 0);
    }

    public final void A0V() {
        this.A0O = false;
        this.A0P = false;
        this.A0A.A0A(false);
        A09(this, 4);
    }

    public final void A0W() {
        this.A0O = false;
        this.A0P = false;
        this.A0A.A0A(false);
        A09(this, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r0 != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0X() {
        /*
            r4 = this;
            r0 = 1
            r4.A0F = r0
            r4.A14(r0)
            java.util.Set r0 = r4.A02()
            java.util.Iterator r1 = r0.iterator()
        L_0x000e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r1.next()
            X.05j r0 = (X.C011605j) r0
            r0.A08()
            goto L_0x000e
        L_0x001e:
            X.0Oi r1 = r4.A09
            boolean r0 = r1 instanceof X.AnonymousClass06C
            if (r0 == 0) goto L_0x0062
            X.05I r0 = r4.A0T
            X.05B r0 = r0.A01()
            boolean r0 = r0.A0B()
        L_0x002e:
            if (r0 == 0) goto L_0x0071
        L_0x0030:
            java.util.Map r0 = r4.A0V
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x003a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.BackStackState r0 = (androidx.fragment.app.BackStackState) r0
            java.util.List r0 = r0.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x004c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003a
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            X.05I r0 = r4.A0T
            X.05B r0 = r0.A01()
            r0.A09(r1)
            goto L_0x004c
        L_0x0062:
            android.content.Context r1 = r1.A01
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0030
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isChangingConfigurations()
            r0 = r0 ^ 1
            goto L_0x002e
        L_0x0071:
            r0 = -1
            A09(r4, r0)
            X.0Oi r1 = r4.A09
            boolean r0 = r1 instanceof X.C83274r7
            if (r0 == 0) goto L_0x0082
            X.4r7 r1 = (X.C83274r7) r1
            X.01a r0 = r4.A0d
            r1.removeOnTrimMemoryListener(r0)
        L_0x0082:
            X.0Oi r1 = r4.A09
            boolean r0 = r1 instanceof X.C83264r6
            if (r0 == 0) goto L_0x008f
            X.4r6 r1 = (X.C83264r6) r1
            X.01a r0 = r4.A0a
            r1.removeOnConfigurationChangedListener(r0)
        L_0x008f:
            X.0Oi r1 = r4.A09
            boolean r0 = r1 instanceof X.C83244r4
            if (r0 == 0) goto L_0x009c
            X.4r4 r1 = (X.C83244r4) r1
            X.01a r0 = r4.A0b
            r1.removeOnMultiWindowModeChangedListener(r0)
        L_0x009c:
            X.0Oi r1 = r4.A09
            boolean r0 = r1 instanceof X.C83254r5
            if (r0 == 0) goto L_0x00a9
            X.4r5 r1 = (X.C83254r5) r1
            X.01a r0 = r4.A0c
            r1.removeOnPictureInPictureModeChangedListener(r0)
        L_0x00a9:
            X.0Oi r1 = r4.A09
            boolean r0 = r1 instanceof X.AnonymousClass02O
            if (r0 == 0) goto L_0x00ba
            androidx.fragment.app.Fragment r0 = r4.A05
            if (r0 != 0) goto L_0x00ba
            X.02O r1 = (X.AnonymousClass02O) r1
            X.02V r0 = r4.A0e
            r1.removeMenuProvider(r0)
        L_0x00ba:
            r1 = 0
            r4.A09 = r1
            r4.A07 = r1
            r4.A05 = r1
            X.00F r0 = r4.A01
            if (r0 == 0) goto L_0x00cc
            X.00C r0 = r4.A0Q
            r0.A00()
            r4.A01 = r1
        L_0x00cc:
            X.00O r0 = r4.A03
            if (r0 == 0) goto L_0x00ef
            X.08f r0 = (X.C017308f) r0
            X.00R r1 = r0.A01
            java.lang.String r0 = r0.A02
            r1.A04(r0)
            X.00O r0 = r4.A04
            X.08f r0 = (X.C017308f) r0
            X.00R r1 = r0.A01
            java.lang.String r0 = r0.A02
            r1.A04(r0)
            X.00O r0 = r4.A02
            X.08f r0 = (X.C017308f) r0
            X.00R r1 = r0.A01
            java.lang.String r0 = r0.A02
            r1.A04(r0)
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12560m7.A0X():void");
    }

    public final void A0Y() {
        this.A0O = false;
        this.A0P = false;
        this.A0A.A0A(false);
        A09(this, 7);
    }

    public final void A0Z() {
        this.A0O = false;
        this.A0P = false;
        this.A0A.A0A(false);
        A09(this, 5);
    }

    public final void A0a() {
        this.A0P = true;
        this.A0A.A0A(true);
        A09(this, 4);
    }

    public final void A0b() {
        A14(true);
        A05();
    }

    public final void A0d() {
        A0w(new C11430kB(this, (String) null, -1, 0), false);
    }

    public final void A0e(int i) {
        if (i >= 0) {
            A0H((String) null, i, 1);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0J("Bad id: ", i));
    }

    public final void A0l(Fragment fragment) {
        A0E(2);
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.A0T.A05(fragment);
                A0E(2);
                if (A0F(fragment)) {
                    this.A0G = true;
                }
            }
        }
    }

    public final void A0m(Fragment fragment) {
        A0E(2);
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                A0E(2);
                ArrayList arrayList = this.A0T.A01;
                synchronized (arrayList) {
                    arrayList.remove(fragment);
                }
                fragment.mAdded = false;
                if (A0F(fragment)) {
                    this.A0G = true;
                }
                A06(fragment);
            }
        }
    }

    public final void A0n(Fragment fragment) {
        A0E(2);
        boolean z = false;
        if (fragment.mBackStackNesting > 0) {
            z = true;
        }
        boolean z2 = !z;
        if (!fragment.mDetached || z2) {
            ArrayList arrayList = this.A0T.A01;
            synchronized (arrayList) {
                arrayList.remove(fragment);
            }
            fragment.mAdded = false;
            if (A0F(fragment)) {
                this.A0G = true;
            }
            fragment.mRemoving = true;
            A06(fragment);
        }
    }

    public final void A11(String str, int i) {
        A0w(new C11430kB(this, str, -1, i), false);
    }

    public final boolean A16() {
        return A0H((String) null, -1, 0);
    }

    public final boolean A1B(Fragment fragment) {
        if (fragment != null) {
            C12560m7 r1 = fragment.mFragmentManager;
            if (!fragment.equals(r1.A06) || !A1B(r1.A05)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A1C(String str, int i) {
        return A0H(str, -1, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1D(java.lang.String r8, java.util.ArrayList r9, java.util.ArrayList r10, int r11, int r12) {
        /*
            r7 = this;
            r6 = 1
            r0 = r12 & 1
            r5 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r2 = 1
        L_0x0008:
            java.util.ArrayList r4 = r7.A0D
            if (r4 == 0) goto L_0x0085
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0085
            if (r8 != 0) goto L_0x003a
            if (r11 >= 0) goto L_0x003a
            if (r2 == 0) goto L_0x0033
            r3 = 0
        L_0x0019:
            java.util.ArrayList r2 = r7.A0D
            int r1 = r2.size()
            int r1 = r1 - r6
        L_0x0020:
            if (r1 < r3) goto L_0x0084
            java.lang.Object r0 = r2.remove(r1)
            r9.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r10.add(r0)
            int r1 = r1 + -1
            goto L_0x0020
        L_0x0033:
            int r0 = r4.size()
            int r3 = r0 + -1
            goto L_0x005e
        L_0x003a:
            int r3 = r4.size()
        L_0x003e:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0085
            java.lang.Object r1 = r4.get(r3)
            X.01J r1 = (X.AnonymousClass01J) r1
            if (r8 == 0) goto L_0x007d
            java.lang.String r0 = r1.A0A
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x007d
        L_0x0052:
            if (r2 != 0) goto L_0x0061
            int r0 = r4.size()
            int r0 = r0 + -1
            if (r3 == r0) goto L_0x0085
            int r3 = r3 + 1
        L_0x005e:
            if (r3 >= 0) goto L_0x0019
            return r5
        L_0x0061:
            if (r3 <= 0) goto L_0x005e
            int r2 = r3 + -1
            java.lang.Object r1 = r4.get(r2)
            X.01J r1 = (X.AnonymousClass01J) r1
            if (r8 == 0) goto L_0x0075
            java.lang.String r0 = r1.A0A
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x007b
        L_0x0075:
            if (r11 < 0) goto L_0x0019
            int r0 = r1.A01
            if (r11 != r0) goto L_0x0019
        L_0x007b:
            r3 = r2
            goto L_0x0061
        L_0x007d:
            if (r11 < 0) goto L_0x003e
            int r0 = r1.A01
            if (r11 != r0) goto L_0x003e
            goto L_0x0052
        L_0x0084:
            return r6
        L_0x0085:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12560m7.A1D(java.lang.String, java.util.ArrayList, java.util.ArrayList, int, int):boolean");
    }

    private ViewGroup A00(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.A07.A01()) {
            return null;
        }
        View A002 = this.A07.A00(fragment.mContainerId);
        if (A002 instanceof ViewGroup) {
            return (ViewGroup) A002;
        }
        return null;
    }

    private Set A02() {
        HashSet hashSet = new HashSet();
        for (AnonymousClass05H r0 : this.A0T.A02()) {
            ViewGroup viewGroup = r0.A02.mContainer;
            if (viewGroup != null) {
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (!(tag instanceof C011605j)) {
                    tag = new AnonymousClass010(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, tag);
                }
                hashSet.add(tag);
            }
        }
        return hashSet;
    }

    private void A04() {
        if (this.A0N) {
            this.A0N = false;
            for (AnonymousClass05H A0z : this.A0T.A02()) {
                A0z(A0z);
            }
        }
    }

    public static void A07(Fragment fragment, C12560m7 r2) {
        if (fragment != null && fragment.equals(r2.A0N(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r3.A0I() <= 0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (r3.A1B(r3.A05) == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r1.A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r1 = r3.A0Q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(X.C12560m7 r3) {
        /*
            java.util.ArrayList r1 = r3.A0U
            monitor-enter(r1)
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r0 != 0) goto L_0x0011
            X.00C r0 = r3.A0Q     // Catch:{ all -> 0x0028 }
            r0.A02(r2)     // Catch:{ all -> 0x0028 }
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            return
        L_0x0011:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            X.00C r1 = r3.A0Q
            int r0 = r3.A0I()
            if (r0 <= 0) goto L_0x0026
            androidx.fragment.app.Fragment r0 = r3.A05
            boolean r0 = r3.A1B(r0)
            if (r0 == 0) goto L_0x0026
        L_0x0022:
            r1.A02(r2)
            return
        L_0x0026:
            r2 = 0
            goto L_0x0022
        L_0x0028:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12560m7.A08(X.0m7):void");
    }

    private void A0D(boolean z) {
        if (this.mExecutingActions) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.A09 == null) {
            if (this.A0F) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.A09.A02.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z && A15()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.A0M == null) {
            this.A0M = new ArrayList();
            this.A0L = new ArrayList();
        }
    }

    public static boolean A0E(int i) {
        if (Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    public static boolean A0F(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        for (Fragment fragment2 : fragment.mChildFragmentManager.A0T.A03()) {
            if (fragment2 != null && A0F(fragment2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0G(C12560m7 r2) {
        Fragment fragment = r2.A05;
        if (fragment == null || (fragment.isAdded() && A0G(fragment.getParentFragmentManager()))) {
            return true;
        }
        return false;
    }

    public final int A0I() {
        ArrayList arrayList = this.A0D;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011b A[LOOP:4: B:39:0x0115->B:41:0x011b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b A[LOOP:5: B:43:0x0135->B:45:0x013b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle A0J() {
        /*
            r10 = this;
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r10.A05()
            java.util.Set r0 = r10.A02()
            java.util.Iterator r1 = r0.iterator()
        L_0x0010:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r1.next()
            X.05j r0 = (X.C011605j) r0
            r0.A08()
            goto L_0x0010
        L_0x0020:
            r1 = 1
            r10.A14(r1)
            r10.A0O = r1
            X.05B r0 = r10.A0A
            r0.A0A(r1)
            X.05I r3 = r10.A0T
            java.util.HashMap r1 = r3.A02
            int r0 = r1.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Collection r0 = r1.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x0040:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r1 = r2.next()
            X.05H r1 = (X.AnonymousClass05H) r1
            if (r1 == 0) goto L_0x0040
            androidx.fragment.app.Fragment r0 = r1.A02
            r1.A06()
            java.lang.String r0 = r0.mWho
            r8.add(r0)
            r0 = 2
            A0E(r0)
            goto L_0x0040
        L_0x005d:
            java.util.HashMap r0 = r3.A03
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            boolean r0 = r7.isEmpty()
            r9 = 2
            if (r0 == 0) goto L_0x0073
            A0E(r9)
        L_0x0072:
            return r5
        L_0x0073:
            java.util.ArrayList r2 = r3.A01
            monitor-enter(r2)
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x007e
            r6 = 0
            goto L_0x00a0
        L_0x007e:
            int r0 = r2.size()     // Catch:{ all -> 0x0155 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0155 }
            r6.<init>(r0)     // Catch:{ all -> 0x0155 }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0155 }
        L_0x008b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0155 }
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = r0.mWho     // Catch:{ all -> 0x0155 }
            r6.add(r0)     // Catch:{ all -> 0x0155 }
            A0E(r9)     // Catch:{ all -> 0x0155 }
            goto L_0x008b
        L_0x00a0:
            monitor-exit(r2)     // Catch:{ all -> 0x0155 }
            r4 = 0
            java.util.ArrayList r0 = r10.A0D
            if (r0 == 0) goto L_0x00ce
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x00ce
            androidx.fragment.app.BackStackRecordState[] r4 = new androidx.fragment.app.BackStackRecordState[r3]
            r2 = 0
        L_0x00af:
            java.util.ArrayList r0 = r10.A0D
            java.lang.Object r1 = r0.get(r2)
            X.01J r1 = (X.AnonymousClass01J) r1
            androidx.fragment.app.BackStackRecordState r0 = new androidx.fragment.app.BackStackRecordState
            r0.<init>((X.AnonymousClass01J) r1)
            r4[r2] = r0
            boolean r0 = A0E(r9)
            if (r0 == 0) goto L_0x00c9
            java.util.ArrayList r0 = r10.A0D
            r0.get(r2)
        L_0x00c9:
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x00ce
            goto L_0x00af
        L_0x00ce:
            androidx.fragment.app.FragmentManagerState r3 = new androidx.fragment.app.FragmentManagerState
            r3.<init>()
            r3.A05 = r8
            r3.A06 = r6
            r3.A07 = r4
            java.util.concurrent.atomic.AtomicInteger r0 = r10.A0Z
            int r0 = r0.get()
            r3.A00 = r0
            androidx.fragment.app.Fragment r0 = r10.A06
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = r0.mWho
            r3.A01 = r0
        L_0x00e9:
            java.util.ArrayList r1 = r3.A02
            java.util.Map r2 = r10.A0V
            java.util.Set r0 = r2.keySet()
            r1.addAll(r0)
            java.util.ArrayList r1 = r3.A03
            java.util.Collection r0 = r2.values()
            r1.addAll(r0)
            java.util.ArrayDeque r1 = r10.A0C
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r3.A04 = r0
            java.lang.String r4 = "state"
            r5.putParcelable(r4, r3)
            java.util.Map r6 = r10.A0X
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0115:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "result_"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r2)
            java.lang.Object r0 = r6.get(r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r5.putBundle(r1, r0)
            goto L_0x0115
        L_0x0131:
            java.util.Iterator r3 = r7.iterator()
        L_0x0135:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.FragmentState r0 = (androidx.fragment.app.FragmentState) r0
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r2.putParcelable(r4, r0)
            java.lang.String r1 = "fragment_"
            java.lang.String r0 = r0.A07
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            r5.putBundle(r0, r2)
            goto L_0x0135
        L_0x0155:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0155 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12560m7.A0J():android.os.Bundle");
    }

    public final Fragment.SavedState A0K(Fragment fragment) {
        Bundle A002;
        AnonymousClass05I r0 = this.A0T;
        AnonymousClass05H r3 = (AnonymousClass05H) r0.A02.get(fragment.mWho);
        if (r3 != null) {
            Fragment fragment2 = r3.A02;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState <= -1 || (A002 = AnonymousClass05H.A00(r3)) == null) {
                    return null;
                }
                return new Fragment.SavedState(A002);
            }
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(fragment);
        sb.append(" is not currently in the FragmentManager");
        A0A(new IllegalStateException(sb.toString()));
        throw null;
    }

    public final Fragment A0L(int i) {
        AnonymousClass05I r4 = this.A0T;
        ArrayList arrayList = r4.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            } else {
                for (AnonymousClass05H r0 : r4.A02.values()) {
                    if (r0 != null) {
                        Fragment fragment2 = r0.A02;
                        if (fragment2.mFragmentId == i) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final Fragment A0N(String str) {
        AnonymousClass05H r0 = (AnonymousClass05H) this.A0T.A02.get(str);
        if (r0 != null) {
            return r0.A02;
        }
        return null;
    }

    public final Fragment A0O(String str) {
        AnonymousClass05I r4 = this.A0T;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = r4.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            } else {
                for (AnonymousClass05H r0 : r4.A02.values()) {
                    if (r0 != null) {
                        Fragment fragment2 = r0.A02;
                        if (str.equals(fragment2.mTag)) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final C010504v A0P() {
        C010504v r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        Fragment fragment = this.A05;
        if (fragment != null) {
            return fragment.mFragmentManager.A0P();
        }
        return this.A0H;
    }

    public final AnonymousClass05H A0Q(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            C012405t.A01(fragment, str);
        }
        A0E(2);
        AnonymousClass05H A0R2 = A0R(fragment);
        fragment.mFragmentManager = this;
        AnonymousClass05I r1 = this.A0T;
        r1.A07(A0R2);
        if (!fragment.mDetached) {
            r1.A05(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (A0F(fragment)) {
                this.A0G = true;
            }
        }
        return A0R2;
    }

    public final AnonymousClass05H A0R(Fragment fragment) {
        AnonymousClass05I r2 = this.A0T;
        AnonymousClass05H r1 = (AnonymousClass05H) r2.A02.get(fragment.mWho);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass05H r12 = new AnonymousClass05H(fragment, this.A0S, r2);
        r12.A07(this.A09.A01.getClassLoader());
        r12.A00 = this.A00;
        return r12;
    }

    public final AnonymousClass06B A0S(Fragment fragment) {
        return this.A0A.A04(fragment);
    }

    public final void A0U() {
        for (Fragment fragment : this.A0T.A03()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.A0U();
            }
        }
    }

    public final void A0c() {
        if (this.A09 != null) {
            this.A0O = false;
            this.A0P = false;
            this.A0A.A0A(false);
            for (Fragment fragment : this.A0T.A04()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    public final void A0f(int i, int i2, boolean z) {
        if (i >= 0) {
            A0w(new C11430kB(this, (String) null, i, i2), z);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0J("Bad id: ", i));
    }

    public final void A0g(int i, boolean z) {
        C04600Oi r2;
        if (this.A09 == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.A00) {
            this.A00 = i;
            AnonymousClass05I r5 = this.A0T;
            Iterator it = r5.A01.iterator();
            while (it.hasNext()) {
                AnonymousClass05H r0 = (AnonymousClass05H) r5.A02.get(((Fragment) it.next()).mWho);
                if (r0 != null) {
                    r0.A05();
                }
            }
            for (AnonymousClass05H r3 : r5.A02.values()) {
                if (r3 != null) {
                    r3.A05();
                    Fragment fragment = r3.A02;
                    if (fragment.mRemoving && fragment.mBackStackNesting <= 0) {
                        if (fragment.mBeingSaved && !r5.A03.containsKey(fragment.mWho)) {
                            r3.A06();
                        }
                        r5.A08(r3);
                    }
                }
            }
            for (AnonymousClass05H A0z : r5.A02()) {
                A0z(A0z);
            }
            if (this.A0G && (r2 = this.A09) != null && this.A00 == 7) {
                r2.A04();
                this.A0G = false;
            }
        }
    }

    public final void A0h(Bundle bundle, Fragment fragment, String str) {
        if (fragment.mFragmentManager != this) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            A0A(new IllegalStateException(sb.toString()));
            throw null;
        }
        bundle.putString(str, fragment.mWho);
    }

    public final void A0i(Parcelable parcelable) {
        AnonymousClass05H r6;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.A09.A01.getClassLoader());
                this.A0X.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.A09.A01.getClassLoader());
                arrayList.add(bundle.getParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE));
            }
        }
        AnonymousClass05I r10 = this.A0T;
        HashMap hashMap = r10.A03;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState fragmentState = (FragmentState) it.next();
            hashMap.put(fragmentState.A07, fragmentState);
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        if (fragmentManagerState != null) {
            HashMap hashMap2 = r10.A02;
            hashMap2.clear();
            Iterator it2 = fragmentManagerState.A05.iterator();
            while (it2.hasNext()) {
                FragmentState fragmentState2 = (FragmentState) hashMap.remove(it2.next());
                if (fragmentState2 != null) {
                    Fragment A022 = this.A0A.A02(fragmentState2.A07);
                    if (A022 != null) {
                        A0E(2);
                        r6 = new AnonymousClass05H(A022, this.A0S, fragmentState2, r10);
                    } else {
                        r6 = new AnonymousClass05H(A0P(), this.A0S, fragmentState2, r10, this.A09.A01.getClassLoader());
                    }
                    r6.A02.mFragmentManager = this;
                    A0E(2);
                    r6.A07(this.A09.A01.getClassLoader());
                    r10.A07(r6);
                    r6.A00 = this.A00;
                }
            }
            for (Fragment fragment : this.A0A.A05()) {
                if (hashMap2.get(fragment.mWho) == null) {
                    A0E(2);
                    this.A0A.A07(fragment);
                    fragment.mFragmentManager = this;
                    AnonymousClass05H r1 = new AnonymousClass05H(fragment, this.A0S, r10);
                    r1.A00 = 1;
                    r1.A05();
                    fragment.mRemoving = true;
                    r1.A05();
                }
            }
            ArrayList<String> arrayList2 = fragmentManagerState.A06;
            r10.A01.clear();
            if (arrayList2 != null) {
                for (String str3 : arrayList2) {
                    AnonymousClass05H r0 = (AnonymousClass05H) hashMap2.get(str3);
                    if (r0 != null) {
                        Fragment fragment2 = r0.A02;
                        A0E(2);
                        r10.A05(fragment2);
                    } else {
                        throw new IllegalStateException(AnonymousClass00U.A0V("No instantiated fragment for (", str3, ")"));
                    }
                }
            }
            BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.A07;
            if (backStackRecordStateArr != null) {
                this.A0D = new ArrayList(backStackRecordStateArr.length);
                int i = 0;
                while (true) {
                    BackStackRecordState[] backStackRecordStateArr2 = fragmentManagerState.A07;
                    if (i >= backStackRecordStateArr2.length) {
                        break;
                    }
                    BackStackRecordState backStackRecordState = backStackRecordStateArr2[i];
                    AnonymousClass01J r3 = new AnonymousClass01J(this);
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        int[] iArr = backStackRecordState.A0D;
                        boolean z = true;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        AnonymousClass05N r102 = new AnonymousClass05N();
                        int i4 = i2 + 1;
                        r102.A00 = iArr[i2];
                        A0E(2);
                        r102.A07 = AnonymousClass061.values()[backStackRecordState.A0C[i3]];
                        r102.A06 = AnonymousClass061.values()[backStackRecordState.A0B[i3]];
                        int i5 = i4 + 1;
                        if (iArr[i4] == 0) {
                            z = false;
                        }
                        r102.A08 = z;
                        int i6 = i5 + 1;
                        int i7 = iArr[i5];
                        r102.A01 = i7;
                        int i8 = i6 + 1;
                        int i9 = iArr[i6];
                        r102.A02 = i9;
                        int i10 = i8 + 1;
                        int i11 = iArr[i8];
                        r102.A03 = i11;
                        i2 = i10 + 1;
                        int i12 = iArr[i10];
                        r102.A04 = i12;
                        r3.A03 = i7;
                        r3.A04 = i9;
                        r3.A05 = i11;
                        r3.A06 = i12;
                        r3.A0I(r102);
                        i3++;
                    }
                    r3.A07 = backStackRecordState.A03;
                    r3.A0A = backStackRecordState.A06;
                    r3.A0F = true;
                    r3.A02 = backStackRecordState.A01;
                    r3.A09 = backStackRecordState.A05;
                    r3.A01 = backStackRecordState.A00;
                    r3.A08 = backStackRecordState.A04;
                    r3.A0D = backStackRecordState.A08;
                    r3.A0E = backStackRecordState.A09;
                    r3.A0G = backStackRecordState.A0A;
                    r3.A01 = backStackRecordState.A02;
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList3 = backStackRecordState.A07;
                        if (i13 >= arrayList3.size()) {
                            break;
                        }
                        String str4 = (String) arrayList3.get(i13);
                        if (str4 != null) {
                            ((AnonymousClass05N) r3.A0C.get(i13)).A05 = A0N(str4);
                        }
                        i13++;
                    }
                    r3.A0M(1);
                    if (A0E(2)) {
                        PrintWriter printWriter = new PrintWriter(new C011105c());
                        r3.A0N(printWriter, "  ", false);
                        printWriter.close();
                    }
                    this.A0D.add(r3);
                    i++;
                }
            } else {
                this.A0D = null;
            }
            this.A0Z.set(fragmentManagerState.A00);
            String str5 = fragmentManagerState.A01;
            if (str5 != null) {
                Fragment A0N2 = A0N(str5);
                this.A06 = A0N2;
                A07(A0N2, this);
            }
            ArrayList arrayList4 = fragmentManagerState.A02;
            if (arrayList4 != null) {
                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                    this.A0V.put(arrayList4.get(i14), fragmentManagerState.A03.get(i14));
                }
            }
            this.A0C = new ArrayDeque(fragmentManagerState.A04);
        }
    }

    public final void A0j(Menu menu) {
        if (this.A00 >= 1) {
            for (Fragment fragment : this.A0T.A04()) {
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void A0k(Fragment fragment) {
        this.A0A.A06(fragment);
    }

    public final void A0o(Fragment fragment) {
        this.A0A.A07(fragment);
    }

    public final void A0p(Fragment fragment) {
        if (fragment == null || (fragment.equals(A0N(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.A06;
            this.A06 = fragment;
            A07(fragment2, this);
            A07(this.A06, this);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.092} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0q(androidx.fragment.app.Fragment r7, X.C010204r r8, X.C04600Oi r9) {
        /*
            r6 = this;
            X.0Oi r0 = r6.A09
            if (r0 != 0) goto L_0x0134
            r6.A09 = r9
            r6.A07 = r8
            r6.A05 = r7
            if (r7 == 0) goto L_0x012d
            X.0hu r1 = new X.0hu
            r1.<init>(r7, r6)
        L_0x0011:
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.A0Y
            r0.add(r1)
        L_0x0016:
            androidx.fragment.app.Fragment r0 = r6.A05
            if (r0 == 0) goto L_0x001d
            A08(r6)
        L_0x001d:
            boolean r0 = r9 instanceof X.AnonymousClass092
            if (r0 == 0) goto L_0x0032
            r2 = r9
            X.092 r2 = (X.AnonymousClass092) r2
            X.00F r1 = r2.getOnBackPressedDispatcher()
            r6.A01 = r1
            if (r7 == 0) goto L_0x002d
            r2 = r7
        L_0x002d:
            X.00C r0 = r6.A0Q
            r1.A05(r0, r2)
        L_0x0032:
            if (r7 == 0) goto L_0x0115
            X.0m7 r0 = r7.mFragmentManager
            X.05B r0 = r0.A0A
            X.05B r1 = r0.A03(r7)
        L_0x003c:
            r6.A0A = r1
            boolean r0 = r6.A15()
            r1.A0A(r0)
            X.05I r0 = r6.A0T
            r0.A06(r1)
            X.0Oi r1 = r6.A09
            boolean r0 = r1 instanceof X.C15750rp
            if (r0 == 0) goto L_0x006c
            if (r7 != 0) goto L_0x006c
            X.0rp r1 = (X.C15750rp) r1
            X.070 r2 = r1.getSavedStateRegistry()
            r0 = 2
            com.facebook.redex.IDxSProviderShape514S0100000_I2 r1 = new com.facebook.redex.IDxSProviderShape514S0100000_I2
            r1.<init>(r6, r0)
            java.lang.String r0 = "android:support:fragments"
            r2.A03(r1, r0)
            android.os.Bundle r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x006c
            r6.A0i(r0)
        L_0x006c:
            X.0Oi r1 = r6.A09
            boolean r0 = r1 instanceof X.AnonymousClass00S
            if (r0 == 0) goto L_0x00cd
            X.00S r1 = (X.AnonymousClass00S) r1
            X.00R r4 = r1.getActivityResultRegistry()
            if (r7 == 0) goto L_0x0111
            java.lang.String r1 = r7.mWho
            java.lang.String r0 = ":"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
        L_0x0082:
            java.lang.String r0 = "FragmentManager:"
            java.lang.String r5 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.String r0 = "StartActivityForResult"
            java.lang.String r3 = X.AnonymousClass00U.A0L(r5, r0)
            X.07i r2 = new X.07i
            r2.<init>()
            r1 = 1
            com.facebook.redex.IDxRCallbackShape718S0100000_I2 r0 = new com.facebook.redex.IDxRCallbackShape718S0100000_I2
            r0.<init>(r6, r1)
            X.00O r0 = r4.A02(r0, r2, r3)
            r6.A03 = r0
            java.lang.String r0 = "StartIntentSenderForResult"
            java.lang.String r3 = X.AnonymousClass00U.A0L(r5, r0)
            X.0jN r2 = new X.0jN
            r2.<init>()
            r1 = 2
            com.facebook.redex.IDxRCallbackShape718S0100000_I2 r0 = new com.facebook.redex.IDxRCallbackShape718S0100000_I2
            r0.<init>(r6, r1)
            X.00O r0 = r4.A02(r0, r2, r3)
            r6.A04 = r0
            java.lang.String r0 = "RequestPermissions"
            java.lang.String r3 = X.AnonymousClass00U.A0L(r5, r0)
            X.07k r2 = new X.07k
            r2.<init>()
            r1 = 0
            com.facebook.redex.IDxRCallbackShape718S0100000_I2 r0 = new com.facebook.redex.IDxRCallbackShape718S0100000_I2
            r0.<init>(r6, r1)
            X.00O r0 = r4.A02(r0, r2, r3)
            r6.A02 = r0
        L_0x00cd:
            X.0Oi r1 = r6.A09
            boolean r0 = r1 instanceof X.C83264r6
            if (r0 == 0) goto L_0x00da
            X.4r6 r1 = (X.C83264r6) r1
            X.01a r0 = r6.A0a
            r1.addOnConfigurationChangedListener(r0)
        L_0x00da:
            X.0Oi r1 = r6.A09
            boolean r0 = r1 instanceof X.C83274r7
            if (r0 == 0) goto L_0x00e7
            X.4r7 r1 = (X.C83274r7) r1
            X.01a r0 = r6.A0d
            r1.addOnTrimMemoryListener(r0)
        L_0x00e7:
            X.0Oi r1 = r6.A09
            boolean r0 = r1 instanceof X.C83244r4
            if (r0 == 0) goto L_0x00f4
            X.4r4 r1 = (X.C83244r4) r1
            X.01a r0 = r6.A0b
            r1.addOnMultiWindowModeChangedListener(r0)
        L_0x00f4:
            X.0Oi r1 = r6.A09
            boolean r0 = r1 instanceof X.C83254r5
            if (r0 == 0) goto L_0x0101
            X.4r5 r1 = (X.C83254r5) r1
            X.01a r0 = r6.A0c
            r1.addOnPictureInPictureModeChangedListener(r0)
        L_0x0101:
            X.0Oi r1 = r6.A09
            boolean r0 = r1 instanceof X.AnonymousClass02O
            if (r0 == 0) goto L_0x0110
            if (r7 != 0) goto L_0x0110
            X.02O r1 = (X.AnonymousClass02O) r1
            X.02V r0 = r6.A0e
            r1.addMenuProvider(r0)
        L_0x0110:
            return
        L_0x0111:
            java.lang.String r1 = ""
            goto L_0x0082
        L_0x0115:
            boolean r0 = r9 instanceof X.AnonymousClass06C
            if (r0 == 0) goto L_0x0125
            X.06C r9 = (X.AnonymousClass06C) r9
            X.06B r0 = r9.getViewModelStore()
            X.05B r1 = X.AnonymousClass05B.A00(r0)
            goto L_0x003c
        L_0x0125:
            r0 = 0
            X.05B r1 = new X.05B
            r1.<init>(r0)
            goto L_0x003c
        L_0x012d:
            boolean r0 = r9 instanceof X.AnonymousClass05C
            if (r0 == 0) goto L_0x0016
            r1 = r9
            goto L_0x0011
        L_0x0134:
            java.lang.String r1 = "Already attached"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12560m7.A0q(androidx.fragment.app.Fragment, X.04r, X.0Oi):void");
    }

    public final void A0r(Fragment fragment, AnonymousClass061 r4) {
        if (!fragment.equals(A0N(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        fragment.mMaxState = r4;
    }

    public final void A0t(AnonymousClass052 r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A0S.A00;
        synchronized (copyOnWriteArrayList) {
            int i = 0;
            int size = copyOnWriteArrayList.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (((C010804y) copyOnWriteArrayList.get(i)).A01 == r5) {
                    copyOnWriteArrayList.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    public final void A0u(AnonymousClass052 r3, boolean z) {
        this.A0S.A00.add(new C010804y(r3, z));
    }

    public final void A0v(AnonymousClass054 r2) {
        ArrayList arrayList = this.A0E;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0E = arrayList;
        }
        arrayList.add(r2);
    }

    public final void A0w(AnonymousClass055 r4, boolean z) {
        if (!z) {
            if (this.A09 == null) {
                if (this.A0F) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (A15()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        ArrayList arrayList = this.A0U;
        synchronized (arrayList) {
            if (this.A09 != null) {
                arrayList.add(r4);
                try {
                    if (arrayList.size() == 1) {
                        Handler handler = this.A09.A02;
                        Runnable runnable = this.A0B;
                        handler.removeCallbacks(runnable);
                        this.A09.A02.post(runnable);
                        A08(this);
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } else if (!z) {
                th = new IllegalStateException("Activity has been destroyed");
                throw th;
            }
        }
    }

    public final void A0x(AnonymousClass055 r3, boolean z) {
        if (!z || (this.A09 != null && !this.A0F)) {
            A0D(z);
            if (r3.ANg(this.A0M, this.A0L)) {
                this.mExecutingActions = true;
                try {
                    A0B(this.A0M, this.A0L);
                } finally {
                    A03();
                }
            }
            A08(this);
            A04();
            this.A0T.A02.values().removeAll(Collections.singleton((Object) null));
        }
    }

    public final void A0z(AnonymousClass05H r3) {
        Fragment fragment = r3.A02;
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.mExecutingActions) {
            this.A0N = true;
            return;
        }
        fragment.mDeferStart = false;
        r3.A05();
    }

    public final void A10(String str) {
        C11060jP r0 = (C11060jP) this.A0W.remove(str);
        if (r0 != null) {
            r0.A00.A08(r0.A01);
        }
        A0E(2);
    }

    public final void A12(String str, Bundle bundle) {
        C11060jP r2 = (C11060jP) this.A0W.get(str);
        if (r2 != null) {
            if (((C14340pE) r2.A00).A00.A00(AnonymousClass061.STARTED)) {
                r2.Bzx(str, bundle);
                A0E(2);
            }
        }
        this.A0X.put(str, bundle);
        A0E(2);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A13(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            r6 = this;
            java.lang.String r0 = "    "
            java.lang.String r5 = X.AnonymousClass00U.A0L(r7, r0)
            X.05I r3 = r6.A0T
            java.lang.String r2 = X.AnonymousClass00U.A0L(r7, r0)
            java.util.HashMap r1 = r3.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0044
            r9.print(r7)
            java.lang.String r0 = "Active Fragments:"
            r9.println(r0)
            java.util.Collection r0 = r1.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0024:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r1.next()
            X.05H r0 = (X.AnonymousClass05H) r0
            r9.print(r7)
            if (r0 == 0) goto L_0x003e
            androidx.fragment.app.Fragment r0 = r0.A02
            r9.println(r0)
            r0.dump(r2, r8, r9, r10)
            goto L_0x0024
        L_0x003e:
            java.lang.String r0 = "null"
            r9.println(r0)
            goto L_0x0024
        L_0x0044:
            java.util.ArrayList r4 = r3.A01
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x0075
            r9.print(r7)
            java.lang.String r0 = "Added Fragments:"
            r9.println(r0)
            r2 = 0
        L_0x0055:
            java.lang.Object r1 = r4.get(r2)
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0075
            goto L_0x0055
        L_0x0075:
            java.util.ArrayList r0 = r6.A0J
            r4 = 0
            if (r0 == 0) goto L_0x00ab
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x00ab
            r9.print(r7)
            java.lang.String r0 = "Fragments Created Menus:"
            r9.println(r0)
            r2 = 0
        L_0x0089:
            java.util.ArrayList r0 = r6.A0J
            java.lang.Object r1 = r0.get(r2)
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x00ab
            goto L_0x0089
        L_0x00ab:
            java.util.ArrayList r0 = r6.A0D
            if (r0 == 0) goto L_0x00e6
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x00e6
            r9.print(r7)
            java.lang.String r0 = "Back Stack:"
            r9.println(r0)
            r2 = 0
        L_0x00be:
            java.util.ArrayList r0 = r6.A0D
            java.lang.Object r1 = r0.get(r2)
            X.01J r1 = (X.AnonymousClass01J) r1
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            r0 = 1
            r1.A0N(r9, r5, r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x00e6
            goto L_0x00be
        L_0x00e6:
            r9.print(r7)
            java.lang.String r1 = "Back Stack Index: "
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0Z
            int r0 = r0.get()
            java.lang.String r0 = X.AnonymousClass00U.A0J(r1, r0)
            r9.println(r0)
            java.util.ArrayList r3 = r6.A0U
            monitor-enter(r3)
            int r2 = r3.size()     // Catch:{ all -> 0x0198 }
            if (r2 <= 0) goto L_0x0127
            r9.print(r7)     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = "Pending Actions:"
            r9.println(r0)     // Catch:{ all -> 0x0198 }
        L_0x0109:
            java.lang.Object r1 = r3.get(r4)     // Catch:{ all -> 0x0198 }
            X.055 r1 = (X.AnonymousClass055) r1     // Catch:{ all -> 0x0198 }
            r9.print(r7)     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = "  #"
            r9.print(r0)     // Catch:{ all -> 0x0198 }
            r9.print(r4)     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = ": "
            r9.print(r0)     // Catch:{ all -> 0x0198 }
            r9.println(r1)     // Catch:{ all -> 0x0198 }
            int r4 = r4 + 1
            if (r4 >= r2) goto L_0x0127
            goto L_0x0109
        L_0x0127:
            monitor-exit(r3)     // Catch:{ all -> 0x0198 }
            r9.print(r7)
            java.lang.String r0 = "FragmentManager misc state:"
            r9.println(r0)
            r9.print(r7)
            java.lang.String r0 = "  mHost="
            r9.print(r0)
            X.0Oi r0 = r6.A09
            r9.println(r0)
            r9.print(r7)
            java.lang.String r0 = "  mContainer="
            r9.print(r0)
            X.04r r0 = r6.A07
            r9.println(r0)
            androidx.fragment.app.Fragment r0 = r6.A05
            if (r0 == 0) goto L_0x015b
            r9.print(r7)
            java.lang.String r0 = "  mParent="
            r9.print(r0)
            androidx.fragment.app.Fragment r0 = r6.A05
            r9.println(r0)
        L_0x015b:
            r9.print(r7)
            java.lang.String r0 = "  mCurState="
            r9.print(r0)
            int r0 = r6.A00
            r9.print(r0)
            java.lang.String r0 = " mStateSaved="
            r9.print(r0)
            boolean r0 = r6.A0O
            r9.print(r0)
            java.lang.String r0 = " mStopped="
            r9.print(r0)
            boolean r0 = r6.A0P
            r9.print(r0)
            java.lang.String r0 = " mDestroyed="
            r9.print(r0)
            boolean r0 = r6.A0F
            r9.println(r0)
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x0197
            r9.print(r7)
            java.lang.String r0 = "  mNeedMenuInvalidate="
            r9.print(r0)
            boolean r0 = r6.A0G
            r9.println(r0)
        L_0x0197:
            return
        L_0x0198:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0198 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12560m7.A13(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final boolean A15() {
        if (this.A0O || this.A0P) {
            return true;
        }
        return false;
    }

    public final boolean A17(Menu menu) {
        boolean z = false;
        if (this.A00 >= 1) {
            for (Fragment fragment : this.A0T.A04()) {
                if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean A18(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.A00 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.A0T.A04()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.A0J != null) {
            while (true) {
                ArrayList arrayList2 = this.A0J;
                if (i >= arrayList2.size()) {
                    break;
                }
                Object obj = arrayList2.get(i);
                if (arrayList != null) {
                    arrayList.contains(obj);
                }
                i++;
            }
        }
        this.A0J = arrayList;
        return z;
    }

    public final boolean A19(MenuItem menuItem) {
        if (this.A00 >= 1) {
            for (Fragment fragment : this.A0T.A04()) {
                if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A1A(MenuItem menuItem) {
        if (this.A00 >= 1) {
            for (Fragment fragment : this.A0T.A04()) {
                if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.A05;
        String str = "}";
        if (obj == null && (obj = this.A09) == null) {
            str = "null";
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append(str);
        sb.append("}}");
        return sb.toString();
    }

    private void A05() {
        for (C011605j r1 : A02()) {
            if (r1.A00) {
                A0E(2);
                r1.A00 = false;
                r1.A07();
            }
        }
    }

    private void A06(Fragment fragment) {
        ViewGroup A002 = A00(fragment);
        if (A002 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            if (A002.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                A002.setTag(R.id.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) A002.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
        }
    }

    private void A0A(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C011105c());
        C04600Oi r4 = this.A09;
        if (r4 != null) {
            try {
                r4.A05("  ", (FileDescriptor) null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        } else {
            A13("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        }
    }

    private void A0B(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((AnonymousClass05O) arrayList.get(i)).A0G) {
                    if (i2 != i) {
                        A0C(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((AnonymousClass05O) arrayList.get(i2)).A0G) {
                            i2++;
                        }
                    }
                    A0C(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                A0C(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final Fragment A0M(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment A0N2 = A0N(string);
        if (A0N2 != null) {
            return A0N2;
        }
        A0A(new IllegalStateException(AnonymousClass00U.A0d("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final void A0s(Fragment fragment, boolean z) {
        ViewGroup A002 = A00(fragment);
        if (A002 != null && (A002 instanceof FragmentContainerView)) {
            ((FragmentContainerView) A002).A00 = !z;
        }
    }

    public final void A0y(AnonymousClass05D r5, AnonymousClass066 r6, String str) {
        AnonymousClass062 lifecycle = r6.getLifecycle();
        if (((C14340pE) lifecycle).A00 != AnonymousClass061.DESTROYED) {
            FragmentManager$6 fragmentManager$6 = new FragmentManager$6(this, r5, lifecycle, str);
            C11060jP r0 = (C11060jP) this.A0W.put(str, new C11060jP(r5, lifecycle, fragmentManager$6));
            if (r0 != null) {
                r0.A00.A08(r0.A01);
            }
            A0E(2);
            lifecycle.A07(fragmentManager$6);
        }
    }

    public final void A14(boolean z) {
        A0D(z);
        while (true) {
            ArrayList arrayList = this.A0M;
            ArrayList arrayList2 = this.A0L;
            ArrayList arrayList3 = this.A0U;
            synchronized (arrayList3) {
                if (arrayList3.isEmpty()) {
                    break;
                }
                try {
                    int size = arrayList3.size();
                    boolean z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= ((AnonymousClass055) arrayList3.get(i)).ANg(arrayList, arrayList2);
                    }
                    if (!z2) {
                        break;
                    }
                    this.mExecutingActions = true;
                    try {
                        A0B(this.A0M, this.A0L);
                    } finally {
                        A03();
                    }
                } finally {
                    arrayList3.clear();
                    this.A09.A02.removeCallbacks(this.A0B);
                }
            }
        }
        A08(this);
        A04();
        this.A0T.A02.values().removeAll(Collections.singleton((Object) null));
    }

    private void A0C(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        C12560m7 r0;
        C12560m7 r02;
        Fragment fragment;
        ArrayList arrayList3 = arrayList;
        int i3 = i;
        boolean z = ((AnonymousClass05O) arrayList3.get(i3)).A0G;
        ArrayList arrayList4 = this.A0K;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            this.A0K = arrayList4;
        } else {
            arrayList4.clear();
        }
        AnonymousClass05I r23 = this.A0T;
        arrayList4.addAll(r23.A04());
        Fragment fragment2 = this.A06;
        int i4 = i3;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList5 = arrayList2;
            int i5 = i2;
            if (i4 < i5) {
                AnonymousClass05O r11 = (AnonymousClass05O) arrayList3.get(i4);
                boolean booleanValue = ((Boolean) arrayList5.get(i4)).booleanValue();
                ArrayList arrayList6 = this.A0K;
                if (!booleanValue) {
                    int i6 = 0;
                    while (true) {
                        ArrayList arrayList7 = r11.A0C;
                        if (i6 < arrayList7.size()) {
                            AnonymousClass05N r13 = (AnonymousClass05N) arrayList7.get(i6);
                            int i7 = r13.A00;
                            if (i7 != 1) {
                                if (i7 == 2) {
                                    fragment = r13.A05;
                                    int i8 = fragment.mContainerId;
                                    boolean z3 = false;
                                    for (int size = arrayList6.size() - 1; size >= 0; size--) {
                                        Fragment fragment3 = (Fragment) arrayList6.get(size);
                                        if (fragment3.mContainerId == i8) {
                                            if (fragment3 == fragment) {
                                                z3 = true;
                                            } else {
                                                if (fragment3 == fragment2) {
                                                    arrayList7.add(i6, new AnonymousClass05N(fragment3, 9, true));
                                                    i6++;
                                                    fragment2 = null;
                                                }
                                                AnonymousClass05N r15 = new AnonymousClass05N(fragment3, 3, true);
                                                r15.A01 = r13.A01;
                                                r15.A03 = r13.A03;
                                                r15.A02 = r13.A02;
                                                r15.A04 = r13.A04;
                                                arrayList7.add(i6, r15);
                                                arrayList6.remove(fragment3);
                                                i6++;
                                            }
                                        }
                                    }
                                    if (z3) {
                                        arrayList7.remove(i6);
                                        i6--;
                                    } else {
                                        r13.A00 = 1;
                                        r13.A08 = true;
                                        arrayList6.add(fragment);
                                    }
                                } else if (i7 == 3 || i7 == 6) {
                                    arrayList6.remove(r13.A05);
                                    Fragment fragment4 = r13.A05;
                                    if (fragment4 == fragment2) {
                                        arrayList7.add(i6, new AnonymousClass05N(fragment4, 9));
                                        i6++;
                                        fragment2 = null;
                                    }
                                } else if (i7 != 7) {
                                    if (i7 == 8) {
                                        arrayList7.add(i6, new AnonymousClass05N(fragment2, 9, true));
                                        r13.A08 = true;
                                        i6++;
                                        fragment2 = r13.A05;
                                    }
                                }
                                i6++;
                            }
                            fragment = r13.A05;
                            arrayList6.add(fragment);
                            i6++;
                        }
                    }
                } else {
                    ArrayList arrayList8 = r11.A0C;
                    for (int size2 = arrayList8.size() - 1; size2 >= 0; size2--) {
                        AnonymousClass05N r2 = (AnonymousClass05N) arrayList8.get(size2);
                        int i9 = r2.A00;
                        if (i9 != 1) {
                            if (i9 != 3) {
                                switch (i9) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        fragment2 = null;
                                        break;
                                    case 9:
                                        fragment2 = r2.A05;
                                        break;
                                    case 10:
                                        r2.A06 = r2.A07;
                                        break;
                                }
                            }
                            arrayList6.add(r2.A05);
                        }
                        arrayList6.remove(r2.A05);
                    }
                }
                if (!z2) {
                    z2 = false;
                    if (!r11.A0F) {
                        i4++;
                    }
                }
                z2 = true;
                i4++;
            } else {
                this.A0K.clear();
                if (!z && this.A00 >= 1) {
                    for (int i10 = i3; i10 < i5; i10++) {
                        Iterator it = ((AnonymousClass05O) arrayList3.get(i10)).A0C.iterator();
                        while (it.hasNext()) {
                            Fragment fragment5 = ((AnonymousClass05N) it.next()).A05;
                            if (!(fragment5 == null || fragment5.mFragmentManager == null)) {
                                r23.A07(A0R(fragment5));
                            }
                        }
                    }
                }
                for (int i11 = i3; i11 < i5; i11++) {
                    AnonymousClass01J r8 = (AnonymousClass01J) arrayList3.get(i11);
                    if (((Boolean) arrayList5.get(i11)).booleanValue()) {
                        r8.A0M(-1);
                        ArrayList arrayList9 = r8.A0C;
                        for (int size3 = arrayList9.size() - 1; size3 >= 0; size3--) {
                            AnonymousClass05N r14 = (AnonymousClass05N) arrayList9.get(size3);
                            Fragment fragment6 = r14.A05;
                            if (fragment6 != null) {
                                fragment6.mBeingSaved = false;
                                fragment6.setPopDirection(true);
                                int i12 = r8.A07;
                                int i13 = 4100;
                                if (i12 == 4097) {
                                    i13 = ReactTextInputManager.INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
                                } else if (i12 == 8194) {
                                    i13 = 4097;
                                } else if (i12 != 8197) {
                                    if (i12 != 4099) {
                                        i13 = 8197;
                                        if (i12 != 4100) {
                                            i13 = 0;
                                        }
                                    } else {
                                        i13 = 4099;
                                    }
                                }
                                fragment6.setNextTransition(i13);
                                fragment6.setSharedElementNames(r8.A0E, r8.A0D);
                            }
                            int i14 = r14.A00;
                            switch (i14) {
                                case 1:
                                    fragment6.setAnimations(r14.A01, r14.A02, r14.A03, r14.A04);
                                    C12560m7 r03 = r8.A02;
                                    r03.A0s(fragment6, true);
                                    r03.A0n(fragment6);
                                    break;
                                case 3:
                                    fragment6.setAnimations(r14.A01, r14.A02, r14.A03, r14.A04);
                                    r8.A02.A0Q(fragment6);
                                    break;
                                case 4:
                                    fragment6.setAnimations(r14.A01, r14.A02, r14.A03, r14.A04);
                                    A0E(2);
                                    if (!fragment6.mHidden) {
                                        break;
                                    } else {
                                        fragment6.mHidden = false;
                                        fragment6.mHiddenChanged = !fragment6.mHiddenChanged;
                                        break;
                                    }
                                case 5:
                                    fragment6.setAnimations(r14.A01, r14.A02, r14.A03, r14.A04);
                                    C12560m7 r3 = r8.A02;
                                    r3.A0s(fragment6, true);
                                    A0E(2);
                                    if (fragment6.mHidden) {
                                        break;
                                    } else {
                                        fragment6.mHidden = true;
                                        fragment6.mHiddenChanged = !fragment6.mHiddenChanged;
                                        r3.A06(fragment6);
                                        break;
                                    }
                                case 6:
                                    fragment6.setAnimations(r14.A01, r14.A02, r14.A03, r14.A04);
                                    r8.A02.A0l(fragment6);
                                    break;
                                case 7:
                                    fragment6.setAnimations(r14.A01, r14.A02, r14.A03, r14.A04);
                                    C12560m7 r04 = r8.A02;
                                    r04.A0s(fragment6, true);
                                    r04.A0m(fragment6);
                                    break;
                                case 8:
                                    r02 = r8.A02;
                                    fragment6 = null;
                                    break;
                                case 9:
                                    r02 = r8.A02;
                                    break;
                                case 10:
                                    r8.A02.A0r(fragment6, r14.A07);
                                    break;
                                default:
                                    throw new IllegalArgumentException(AnonymousClass00U.A0J("Unknown cmd: ", i14));
                            }
                            r02.A0p(fragment6);
                        }
                        continue;
                    } else {
                        r8.A0M(1);
                        ArrayList arrayList10 = r8.A0C;
                        int size4 = arrayList10.size();
                        for (int i15 = 0; i15 < size4; i15++) {
                            AnonymousClass05N r05 = (AnonymousClass05N) arrayList10.get(i15);
                            Fragment fragment7 = r05.A05;
                            if (fragment7 != null) {
                                fragment7.mBeingSaved = false;
                                fragment7.setPopDirection(false);
                                fragment7.setNextTransition(r8.A07);
                                fragment7.setSharedElementNames(r8.A0D, r8.A0E);
                            }
                            int i16 = r05.A00;
                            switch (i16) {
                                case 1:
                                    fragment7.setAnimations(r05.A01, r05.A02, r05.A03, r05.A04);
                                    C12560m7 r06 = r8.A02;
                                    r06.A0s(fragment7, false);
                                    r06.A0Q(fragment7);
                                    break;
                                case 3:
                                    fragment7.setAnimations(r05.A01, r05.A02, r05.A03, r05.A04);
                                    r8.A02.A0n(fragment7);
                                    break;
                                case 4:
                                    fragment7.setAnimations(r05.A01, r05.A02, r05.A03, r05.A04);
                                    C12560m7 r32 = r8.A02;
                                    A0E(2);
                                    if (fragment7.mHidden) {
                                        break;
                                    } else {
                                        fragment7.mHidden = true;
                                        fragment7.mHiddenChanged = !fragment7.mHiddenChanged;
                                        r32.A06(fragment7);
                                        break;
                                    }
                                case 5:
                                    fragment7.setAnimations(r05.A01, r05.A02, r05.A03, r05.A04);
                                    r8.A02.A0s(fragment7, false);
                                    A0E(2);
                                    if (!fragment7.mHidden) {
                                        break;
                                    } else {
                                        fragment7.mHidden = false;
                                        fragment7.mHiddenChanged = !fragment7.mHiddenChanged;
                                        break;
                                    }
                                case 6:
                                    fragment7.setAnimations(r05.A01, r05.A02, r05.A03, r05.A04);
                                    r8.A02.A0m(fragment7);
                                    break;
                                case 7:
                                    fragment7.setAnimations(r05.A01, r05.A02, r05.A03, r05.A04);
                                    C12560m7 r07 = r8.A02;
                                    r07.A0s(fragment7, false);
                                    r07.A0l(fragment7);
                                    break;
                                case 8:
                                    r0 = r8.A02;
                                    break;
                                case 9:
                                    r0 = r8.A02;
                                    fragment7 = null;
                                    break;
                                case 10:
                                    r8.A02.A0r(fragment7, r05.A06);
                                    break;
                                default:
                                    throw new IllegalArgumentException(AnonymousClass00U.A0J("Unknown cmd: ", i16));
                            }
                            r0.A0p(fragment7);
                        }
                        continue;
                    }
                }
                boolean booleanValue2 = ((Boolean) arrayList5.get(i2 - 1)).booleanValue();
                for (int i17 = i3; i17 < i5; i17++) {
                    AnonymousClass05O r10 = (AnonymousClass05O) arrayList3.get(i17);
                    ArrayList arrayList11 = r10.A0C;
                    if (booleanValue2) {
                        for (int size5 = arrayList11.size() - 1; size5 >= 0; size5--) {
                            Fragment fragment8 = ((AnonymousClass05N) r10.A0C.get(size5)).A05;
                            if (fragment8 != null) {
                                A0R(fragment8).A05();
                            }
                        }
                    } else {
                        Iterator it2 = arrayList11.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment9 = ((AnonymousClass05N) it2.next()).A05;
                            if (fragment9 != null) {
                                A0R(fragment9).A05();
                            }
                        }
                    }
                }
                A0g(this.A00, true);
                HashSet<C011605j> hashSet = new HashSet<>();
                for (int i18 = i3; i18 < i5; i18++) {
                    Iterator it3 = ((AnonymousClass05O) arrayList3.get(i18)).A0C.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment10 = ((AnonymousClass05N) it3.next()).A05;
                        if (!(fragment10 == null || (viewGroup = fragment10.mContainer) == null)) {
                            hashSet.add(C011605j.A03(viewGroup));
                        }
                    }
                }
                for (C011605j r08 : hashSet) {
                    r08.A01 = booleanValue2;
                    r08.A06();
                    r08.A07();
                }
                while (i3 < i5) {
                    AnonymousClass01J r82 = (AnonymousClass01J) arrayList3.get(i3);
                    if (((Boolean) arrayList5.get(i3)).booleanValue() && r82.A01 >= 0) {
                        r82.A01 = -1;
                    }
                    if (r82.A0B != null) {
                        int i19 = 0;
                        while (true) {
                            ArrayList arrayList12 = r82.A0B;
                            if (i19 < arrayList12.size()) {
                                ((Runnable) arrayList12.get(i19)).run();
                                i19++;
                            } else {
                                r82.A0B = null;
                            }
                        }
                    }
                    i3++;
                }
                if (z2 && this.A0E != null) {
                    int i20 = 0;
                    while (true) {
                        ArrayList arrayList13 = this.A0E;
                        if (i20 < arrayList13.size()) {
                            ((AnonymousClass054) arrayList13.get(i20)).onBackStackChanged();
                            i20++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }
}
