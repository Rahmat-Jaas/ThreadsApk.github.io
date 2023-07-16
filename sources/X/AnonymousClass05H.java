package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentState;
import com.instagram.barcelona.R;
import java.util.ArrayList;

/* renamed from: X.05H  reason: invalid class name */
public final class AnonymousClass05H {
    public int A00 = -1;
    public boolean A01 = false;
    public final Fragment A02;
    public final C010904z A03;
    public final AnonymousClass05I A04;

    public final void A01() {
        View view;
        C12560m7.A0E(3);
        Fragment fragment = this.A02;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.A03.A05(fragment);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.A0H((Object) null);
        fragment.mInLayout = false;
    }

    public static Bundle A00(AnonymousClass05H r4) {
        Bundle bundle = new Bundle();
        Fragment fragment = r4.A02;
        fragment.performSaveInstanceState(bundle);
        r4.A03.A01(bundle, fragment);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (fragment.mView != null) {
            r4.A03();
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (fragment.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", fragment.mSavedViewRegistryState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    public final void A02() {
        Fragment fragment = this.A02;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            C12560m7.A0E(3);
            LayoutInflater onGetLayoutInflater = fragment.onGetLayoutInflater(fragment.mSavedFragmentState);
            fragment.mLayoutInflater = onGetLayoutInflater;
            fragment.performCreateView(onGetLayoutInflater, (ViewGroup) null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.A03.A00(fragment.mSavedFragmentState, fragment.mView, fragment, false);
                fragment.mState = 2;
            }
        }
    }

    public final void A03() {
        Fragment fragment = this.A02;
        if (fragment.mView != null) {
            C12560m7.A0E(2);
            SparseArray sparseArray = new SparseArray();
            fragment.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                fragment.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            fragment.mViewLifecycleOwner.A01.A01.A02(bundle);
            if (!bundle.isEmpty()) {
                fragment.mSavedViewRegistryState = bundle;
            }
        }
    }

    public final void A04() {
        View view;
        View view2;
        AnonymousClass05I r0 = this.A04;
        Fragment fragment = this.A02;
        ViewGroup viewGroup = fragment.mContainer;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = r0.A01;
            int indexOf = arrayList.indexOf(fragment);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) arrayList.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) arrayList.get(i2);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x031d, code lost:
        r4.mState = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0322, code lost:
        r4.mState = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0022, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x020f, code lost:
        r4.mState = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r14 = this;
            boolean r0 = r14.A01
            r6 = 2
            if (r0 == 0) goto L_0x0009
            X.C12560m7.A0E(r6)
            return
        L_0x0009:
            r3 = 0
            r5 = 1
            r14.A01 = r5     // Catch:{ all -> 0x0539 }
            r13 = 0
        L_0x000e:
            androidx.fragment.app.Fragment r4 = r14.A02     // Catch:{ all -> 0x0539 }
            X.0m7 r0 = r4.mFragmentManager     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x0371
            int r7 = r4.mState     // Catch:{ all -> 0x0539 }
        L_0x0016:
            int r1 = r4.mState     // Catch:{ all -> 0x0539 }
            r2 = 3
            if (r7 == r1) goto L_0x04c7
            if (r7 <= r1) goto L_0x0200
            int r0 = r1 + 1
            switch(r0) {
                case 0: goto L_0x0024;
                case 1: goto L_0x018a;
                case 2: goto L_0x0092;
                case 3: goto L_0x01a4;
                case 4: goto L_0x0163;
                case 5: goto L_0x01b5;
                case 6: goto L_0x0187;
                case 7: goto L_0x01c2;
                default: goto L_0x0022;
            }     // Catch:{ all -> 0x0539 }
        L_0x0022:
            r13 = 1
            goto L_0x000e
        L_0x0024:
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            androidx.fragment.app.Fragment r1 = r4.mTarget     // Catch:{ all -> 0x0539 }
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.String r8 = " declared target fragment "
            java.lang.String r7 = "Fragment "
            r9 = 0
            if (r1 == 0) goto L_0x0061
            X.05I r0 = r14.A04     // Catch:{ all -> 0x0539 }
            java.lang.String r1 = r1.mWho     // Catch:{ all -> 0x0539 }
            java.util.HashMap r0 = r0.A02     // Catch:{ all -> 0x0539 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0539 }
            X.05H r1 = (X.AnonymousClass05H) r1     // Catch:{ all -> 0x0539 }
            if (r1 == 0) goto L_0x0453
            androidx.fragment.app.Fragment r0 = r4.mTarget     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = r0.mWho     // Catch:{ all -> 0x0539 }
            r4.mTargetWho = r0     // Catch:{ all -> 0x0539 }
            r4.mTarget = r9     // Catch:{ all -> 0x0539 }
        L_0x0048:
            r1.A05()     // Catch:{ all -> 0x0539 }
        L_0x004b:
            X.0m7 r1 = r4.mFragmentManager     // Catch:{ all -> 0x0539 }
            X.0Oi r0 = r1.A09     // Catch:{ all -> 0x0539 }
            r4.mHost = r0     // Catch:{ all -> 0x0539 }
            androidx.fragment.app.Fragment r0 = r1.A05     // Catch:{ all -> 0x0539 }
            r4.mParentFragment = r0     // Catch:{ all -> 0x0539 }
            X.04z r0 = r14.A03     // Catch:{ all -> 0x0539 }
            r0.A07(r4)     // Catch:{ all -> 0x0539 }
            r4.performAttach()     // Catch:{ all -> 0x0539 }
            r0.A0B(r4, r3)     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x0061:
            java.lang.String r1 = r4.mTargetWho     // Catch:{ all -> 0x0539 }
            if (r1 == 0) goto L_0x004b
            X.05I r0 = r14.A04     // Catch:{ all -> 0x0539 }
            java.util.HashMap r0 = r0.A02     // Catch:{ all -> 0x0539 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0539 }
            X.05H r1 = (X.AnonymousClass05H) r1     // Catch:{ all -> 0x0539 }
            if (r1 != 0) goto L_0x0048
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0539 }
            r1.<init>()     // Catch:{ all -> 0x0539 }
            r1.append(r7)     // Catch:{ all -> 0x0539 }
            r1.append(r4)     // Catch:{ all -> 0x0539 }
            r1.append(r8)     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = r4.mTargetWho     // Catch:{ all -> 0x0539 }
            r1.append(r0)     // Catch:{ all -> 0x0539 }
            r1.append(r2)     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0539 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0539 }
            r1.<init>(r0)     // Catch:{ all -> 0x0539 }
            goto L_0x04c6
        L_0x0092:
            r14.A02()     // Catch:{ all -> 0x0539 }
            boolean r0 = r4.mFromLayout     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x0022
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            android.os.Bundle r0 = r4.mSavedFragmentState     // Catch:{ all -> 0x0539 }
            android.view.LayoutInflater r9 = r4.onGetLayoutInflater(r0)     // Catch:{ all -> 0x0539 }
            r4.mLayoutInflater = r9     // Catch:{ all -> 0x0539 }
            r8 = 0
            android.view.ViewGroup r0 = r4.mContainer     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x00ab
            r8 = r0
            goto L_0x00ef
        L_0x00ab:
            int r1 = r4.mContainerId     // Catch:{ all -> 0x0539 }
            if (r1 == 0) goto L_0x00ef
            r0 = -1
            if (r1 == r0) goto L_0x0482
            X.0m7 r0 = r4.mFragmentManager     // Catch:{ all -> 0x0539 }
            X.04r r0 = r0.A07     // Catch:{ all -> 0x0539 }
            android.view.View r8 = r0.A00(r1)     // Catch:{ all -> 0x0539 }
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ all -> 0x0539 }
            if (r8 != 0) goto L_0x00c4
            boolean r0 = r4.mRestored     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x00ef
            goto L_0x0473
        L_0x00c4:
            boolean r0 = r8 instanceof androidx.fragment.app.FragmentContainerView     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x00ef
            X.0p0 r7 = new X.0p0     // Catch:{ all -> 0x0539 }
            r7.<init>(r8, r4)     // Catch:{ all -> 0x0539 }
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            X.05s r2 = X.C012405t.A00(r4)     // Catch:{ all -> 0x0539 }
            java.util.Set r1 = r2.A01     // Catch:{ all -> 0x0539 }
            X.05o r0 = X.C012005o.DETECT_WRONG_FRAGMENT_CONTAINER     // Catch:{ all -> 0x0539 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x00ef
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0539 }
            java.lang.Class r0 = r7.getClass()     // Catch:{ all -> 0x0539 }
            boolean r0 = X.C012405t.A03(r2, r1, r0)     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x00ef
            X.C012405t.A02(r2, r7)     // Catch:{ all -> 0x0539 }
        L_0x00ef:
            r4.mContainer = r8     // Catch:{ all -> 0x0539 }
            android.os.Bundle r0 = r4.mSavedFragmentState     // Catch:{ all -> 0x0539 }
            r4.performCreateView(r9, r8, r0)     // Catch:{ all -> 0x0539 }
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x031d
            r0.setSaveFromParentEnabled(r3)     // Catch:{ all -> 0x0539 }
            android.view.View r1 = r4.mView     // Catch:{ all -> 0x0539 }
            r0 = 2131300801(0x7f0911c1, float:1.8219642E38)
            r1.setTag(r0, r4)     // Catch:{ all -> 0x0539 }
            if (r8 == 0) goto L_0x010a
            r14.A04()     // Catch:{ all -> 0x0539 }
        L_0x010a:
            boolean r0 = r4.mHidden     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0115
            android.view.View r1 = r4.mView     // Catch:{ all -> 0x0539 }
            r0 = 8
            r1.setVisibility(r0)     // Catch:{ all -> 0x0539 }
        L_0x0115:
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0539 }
            android.view.View r1 = r4.mView     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0142
            r1.requestApplyInsets()     // Catch:{ all -> 0x0539 }
        L_0x0122:
            r4.performViewCreated()     // Catch:{ all -> 0x0539 }
            X.04z r2 = r14.A03     // Catch:{ all -> 0x0539 }
            android.view.View r1 = r4.mView     // Catch:{ all -> 0x0539 }
            android.os.Bundle r0 = r4.mSavedFragmentState     // Catch:{ all -> 0x0539 }
            r2.A00(r0, r1, r4, r3)     // Catch:{ all -> 0x0539 }
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            int r1 = r0.getVisibility()     // Catch:{ all -> 0x0539 }
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            float r0 = r0.getAlpha()     // Catch:{ all -> 0x0539 }
            r4.setPostOnViewCreatedAlpha(r0)     // Catch:{ all -> 0x0539 }
            android.view.ViewGroup r0 = r4.mContainer     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x031d
            goto L_0x014b
        L_0x0142:
            com.facebook.redex.IDxCListenerShape200S0200000_I2 r0 = new com.facebook.redex.IDxCListenerShape200S0200000_I2     // Catch:{ all -> 0x0539 }
            r0.<init>(r5, r1, r14)     // Catch:{ all -> 0x0539 }
            r1.addOnAttachStateChangeListener(r0)     // Catch:{ all -> 0x0539 }
            goto L_0x0122
        L_0x014b:
            if (r1 != 0) goto L_0x031d
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            android.view.View r0 = r0.findFocus()     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x015b
            r4.setFocusedView(r0)     // Catch:{ all -> 0x0539 }
            X.C12560m7.A0E(r6)     // Catch:{ all -> 0x0539 }
        L_0x015b:
            android.view.View r1 = r4.mView     // Catch:{ all -> 0x0539 }
            r0 = 0
            r1.setAlpha(r0)     // Catch:{ all -> 0x0539 }
            goto L_0x031d
        L_0x0163:
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0184
            android.view.ViewGroup r0 = r4.mContainer     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0184
            r4.getParentFragmentManager()     // Catch:{ all -> 0x0539 }
            X.05j r2 = X.C011605j.A03(r0)     // Catch:{ all -> 0x0539 }
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            int r0 = r0.getVisibility()     // Catch:{ all -> 0x0539 }
            java.lang.Integer r1 = X.C011505i.A00(r0)     // Catch:{ all -> 0x0539 }
            X.C12560m7.A0E(r6)     // Catch:{ all -> 0x0539 }
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ all -> 0x0539 }
            X.C011605j.A05(r14, r2, r1, r0)     // Catch:{ all -> 0x0539 }
        L_0x0184:
            r0 = 4
            goto L_0x0322
        L_0x0187:
            r0 = 6
            goto L_0x0322
        L_0x018a:
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            boolean r0 = r4.mIsCreated     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x020a
            X.04z r1 = r14.A03     // Catch:{ all -> 0x0539 }
            android.os.Bundle r0 = r4.mSavedFragmentState     // Catch:{ all -> 0x0539 }
            r1.A03(r0, r4)     // Catch:{ all -> 0x0539 }
            android.os.Bundle r0 = r4.mSavedFragmentState     // Catch:{ all -> 0x0539 }
            r4.performCreate(r0)     // Catch:{ all -> 0x0539 }
            android.os.Bundle r0 = r4.mSavedFragmentState     // Catch:{ all -> 0x0539 }
            r1.A04(r0, r4, r3)     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x01a4:
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            android.os.Bundle r0 = r4.mSavedFragmentState     // Catch:{ all -> 0x0539 }
            r4.performActivityCreated(r0)     // Catch:{ all -> 0x0539 }
            X.04z r1 = r14.A03     // Catch:{ all -> 0x0539 }
            android.os.Bundle r0 = r4.mSavedFragmentState     // Catch:{ all -> 0x0539 }
            r1.A02(r0, r4)     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x01b5:
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            r4.performStart()     // Catch:{ all -> 0x0539 }
            X.04z r0 = r14.A03     // Catch:{ all -> 0x0539 }
            r0.A09(r4)     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x01c2:
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            android.view.View r2 = r4.getFocusedView()     // Catch:{ all -> 0x0539 }
            if (r2 == 0) goto L_0x01ec
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            if (r2 == r0) goto L_0x01de
            android.view.ViewParent r1 = r2.getParent()     // Catch:{ all -> 0x0539 }
        L_0x01d3:
            if (r1 == 0) goto L_0x01ec
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            if (r1 == r0) goto L_0x01de
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ all -> 0x0539 }
            goto L_0x01d3
        L_0x01de:
            r2.requestFocus()     // Catch:{ all -> 0x0539 }
            boolean r0 = X.C12560m7.A0E(r6)     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x01ec
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            r0.findFocus()     // Catch:{ all -> 0x0539 }
        L_0x01ec:
            r1 = 0
            r4.setFocusedView(r1)     // Catch:{ all -> 0x0539 }
            r4.performResume()     // Catch:{ all -> 0x0539 }
            X.04z r0 = r14.A03     // Catch:{ all -> 0x0539 }
            r0.A08(r4)     // Catch:{ all -> 0x0539 }
            r4.mSavedFragmentState = r1     // Catch:{ all -> 0x0539 }
            r4.mSavedViewState = r1     // Catch:{ all -> 0x0539 }
            r4.mSavedViewRegistryState = r1     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x0200:
            int r1 = r1 - r5
            switch(r1) {
                case -1: goto L_0x0326;
                case 0: goto L_0x0246;
                case 1: goto L_0x0206;
                case 2: goto L_0x031b;
                case 3: goto L_0x0213;
                case 4: goto L_0x0357;
                case 5: goto L_0x0321;
                case 6: goto L_0x0364;
                default: goto L_0x0204;
            }     // Catch:{ all -> 0x0539 }
        L_0x0204:
            goto L_0x0022
        L_0x0206:
            r14.A01()     // Catch:{ all -> 0x0539 }
            goto L_0x020f
        L_0x020a:
            android.os.Bundle r0 = r4.mSavedFragmentState     // Catch:{ all -> 0x0539 }
            r4.restoreChildFragmentState(r0)     // Catch:{ all -> 0x0539 }
        L_0x020f:
            r4.mState = r5     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x0213:
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            boolean r0 = r4.mBeingSaved     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x023a
            r14.A06()     // Catch:{ all -> 0x0539 }
        L_0x021d:
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0236
            android.view.ViewGroup r0 = r4.mContainer     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0236
            r4.getParentFragmentManager()     // Catch:{ all -> 0x0539 }
            X.05j r7 = X.C011605j.A03(r0)     // Catch:{ all -> 0x0539 }
            X.C12560m7.A0E(r6)     // Catch:{ all -> 0x0539 }
            java.lang.Integer r1 = X.AnonymousClass006.A00     // Catch:{ all -> 0x0539 }
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x0539 }
            X.C011605j.A05(r14, r7, r1, r0)     // Catch:{ all -> 0x0539 }
        L_0x0236:
            r4.mState = r2     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x023a:
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x021d
            android.util.SparseArray r0 = r4.mSavedViewState     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x021d
            r14.A03()     // Catch:{ all -> 0x0539 }
            goto L_0x021d
        L_0x0246:
            boolean r0 = r4.mBeingSaved     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x025b
            X.05I r0 = r14.A04     // Catch:{ all -> 0x0539 }
            java.lang.String r1 = r4.mWho     // Catch:{ all -> 0x0539 }
            java.util.HashMap r0 = r0.A03     // Catch:{ all -> 0x0539 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0539 }
            androidx.fragment.app.FragmentState r0 = (androidx.fragment.app.FragmentState) r0     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x025b
            r14.A06()     // Catch:{ all -> 0x0539 }
        L_0x025b:
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            boolean r0 = r4.mRemoving     // Catch:{ all -> 0x0539 }
            r8 = 1
            if (r0 == 0) goto L_0x0269
            int r0 = r4.mBackStackNesting     // Catch:{ all -> 0x0539 }
            if (r0 > 0) goto L_0x0269
            r7 = 1
            goto L_0x026a
        L_0x0269:
            r7 = 0
        L_0x026a:
            r9 = 0
            if (r7 == 0) goto L_0x026e
            goto L_0x0294
        L_0x026e:
            X.05I r2 = r14.A04     // Catch:{ all -> 0x0539 }
            X.05B r0 = r2.A01()     // Catch:{ all -> 0x0539 }
            boolean r0 = r0.A0C(r4)     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x02a1
            java.lang.String r1 = r4.mTargetWho     // Catch:{ all -> 0x0539 }
            if (r1 == 0) goto L_0x0290
            java.util.HashMap r0 = r2.A02     // Catch:{ all -> 0x0539 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0539 }
            X.05H r0 = (X.AnonymousClass05H) r0     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0290
            androidx.fragment.app.Fragment r1 = r0.A02     // Catch:{ all -> 0x0539 }
            boolean r0 = r1.mRetainInstance     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0290
            r4.mTarget = r1     // Catch:{ all -> 0x0539 }
        L_0x0290:
            r4.mState = r3     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x0294:
            boolean r0 = r4.mBeingSaved     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x02a1
            X.05I r0 = r14.A04     // Catch:{ all -> 0x0539 }
            java.lang.String r1 = r4.mWho     // Catch:{ all -> 0x0539 }
            java.util.HashMap r0 = r0.A03     // Catch:{ all -> 0x0539 }
            r0.remove(r1)     // Catch:{ all -> 0x0539 }
        L_0x02a1:
            X.0Oi r1 = r4.mHost     // Catch:{ all -> 0x0539 }
            boolean r0 = r1 instanceof X.AnonymousClass06C     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x02b2
            X.05I r0 = r14.A04     // Catch:{ all -> 0x0539 }
            X.05B r0 = r0.A01()     // Catch:{ all -> 0x0539 }
            boolean r8 = r0.A0B()     // Catch:{ all -> 0x0539 }
            goto L_0x02c0
        L_0x02b2:
            android.content.Context r1 = r1.A01     // Catch:{ all -> 0x0539 }
            boolean r0 = r1 instanceof android.app.Activity     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x02c0
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ all -> 0x0539 }
            boolean r0 = r1.isChangingConfigurations()     // Catch:{ all -> 0x0539 }
            r8 = r0 ^ 1
        L_0x02c0:
            if (r7 == 0) goto L_0x02c6
            boolean r0 = r4.mBeingSaved     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x02c8
        L_0x02c6:
            if (r8 == 0) goto L_0x02d1
        L_0x02c8:
            X.05I r0 = r14.A04     // Catch:{ all -> 0x0539 }
            X.05B r0 = r0.A01()     // Catch:{ all -> 0x0539 }
            r0.A08(r4)     // Catch:{ all -> 0x0539 }
        L_0x02d1:
            r4.performDestroy()     // Catch:{ all -> 0x0539 }
            X.04z r0 = r14.A03     // Catch:{ all -> 0x0539 }
            r0.A0C(r4, r3)     // Catch:{ all -> 0x0539 }
            X.05I r7 = r14.A04     // Catch:{ all -> 0x0539 }
            java.util.List r0 = r7.A02()     // Catch:{ all -> 0x0539 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0539 }
        L_0x02e3:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0302
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0539 }
            X.05H r0 = (X.AnonymousClass05H) r0     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x02e3
            androidx.fragment.app.Fragment r2 = r0.A02     // Catch:{ all -> 0x0539 }
            java.lang.String r1 = r4.mWho     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = r2.mTargetWho     // Catch:{ all -> 0x0539 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x02e3
            r2.mTarget = r4     // Catch:{ all -> 0x0539 }
            r2.mTargetWho = r9     // Catch:{ all -> 0x0539 }
            goto L_0x02e3
        L_0x0302:
            java.lang.String r1 = r4.mTargetWho     // Catch:{ all -> 0x0539 }
            if (r1 == 0) goto L_0x0314
            java.util.HashMap r0 = r7.A02     // Catch:{ all -> 0x0539 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0539 }
            X.05H r0 = (X.AnonymousClass05H) r0     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0319
            androidx.fragment.app.Fragment r0 = r0.A02     // Catch:{ all -> 0x0539 }
        L_0x0312:
            r4.mTarget = r0     // Catch:{ all -> 0x0539 }
        L_0x0314:
            r7.A08(r14)     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x0319:
            r0 = 0
            goto L_0x0312
        L_0x031b:
            r4.mInLayout = r3     // Catch:{ all -> 0x0539 }
        L_0x031d:
            r4.mState = r6     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x0321:
            r0 = 5
        L_0x0322:
            r4.mState = r0     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x0326:
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            r4.performDetach()     // Catch:{ all -> 0x0539 }
            X.04z r0 = r14.A03     // Catch:{ all -> 0x0539 }
            r0.A0D(r4, r3)     // Catch:{ all -> 0x0539 }
            r0 = -1
            r4.mState = r0     // Catch:{ all -> 0x0539 }
            r0 = 0
            r4.mHost = r0     // Catch:{ all -> 0x0539 }
            r4.mParentFragment = r0     // Catch:{ all -> 0x0539 }
            r4.mFragmentManager = r0     // Catch:{ all -> 0x0539 }
            boolean r0 = r4.mRemoving     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0343
            int r0 = r4.mBackStackNesting     // Catch:{ all -> 0x0539 }
            if (r0 <= 0) goto L_0x034f
        L_0x0343:
            X.05I r0 = r14.A04     // Catch:{ all -> 0x0539 }
            X.05B r0 = r0.A01()     // Catch:{ all -> 0x0539 }
            boolean r0 = r0.A0C(r4)     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0022
        L_0x034f:
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            r4.initState()     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x0357:
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            r4.performStop()     // Catch:{ all -> 0x0539 }
            X.04z r0 = r14.A03     // Catch:{ all -> 0x0539 }
            r0.A0A(r4)     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x0364:
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            r4.performPause()     // Catch:{ all -> 0x0539 }
            X.04z r0 = r14.A03     // Catch:{ all -> 0x0539 }
            r0.A06(r4)     // Catch:{ all -> 0x0539 }
            goto L_0x0022
        L_0x0371:
            int r7 = r14.A00     // Catch:{ all -> 0x0539 }
            r10 = r7
            X.061 r0 = r4.mMaxState     // Catch:{ all -> 0x0539 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0539 }
            r8 = -1
            r2 = 5
            r9 = 3
            r1 = 4
            if (r0 == r1) goto L_0x0399
            if (r0 == r9) goto L_0x0390
            if (r0 == r6) goto L_0x038b
            if (r0 == r5) goto L_0x0395
            int r7 = java.lang.Math.min(r7, r8)     // Catch:{ all -> 0x0539 }
            goto L_0x0399
        L_0x038b:
            int r7 = java.lang.Math.min(r7, r5)     // Catch:{ all -> 0x0539 }
            goto L_0x0399
        L_0x0390:
            int r7 = java.lang.Math.min(r7, r2)     // Catch:{ all -> 0x0539 }
            goto L_0x0399
        L_0x0395:
            int r7 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x0539 }
        L_0x0399:
            boolean r0 = r4.mFromLayout     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x03b3
            boolean r0 = r4.mInLayout     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0408
            int r7 = java.lang.Math.max(r10, r6)     // Catch:{ all -> 0x0539 }
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x03b3
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x03b3
            int r7 = java.lang.Math.min(r7, r6)     // Catch:{ all -> 0x0539 }
        L_0x03b3:
            boolean r0 = r4.mAdded     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x03bb
            int r7 = java.lang.Math.min(r7, r5)     // Catch:{ all -> 0x0539 }
        L_0x03bb:
            r10 = 0
            android.view.ViewGroup r0 = r4.mContainer     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x041e
            r4.getParentFragmentManager()     // Catch:{ all -> 0x0539 }
            X.05j r11 = X.C011605j.A03(r0)     // Catch:{ all -> 0x0539 }
            java.util.ArrayList r0 = r11.A03     // Catch:{ all -> 0x0539 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0539 }
        L_0x03cd:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0406
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x0539 }
            X.0nZ r10 = (X.C13370nZ) r10     // Catch:{ all -> 0x0539 }
            androidx.fragment.app.Fragment r0 = r10.A04     // Catch:{ all -> 0x0539 }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x03cd
            boolean r0 = r10.A02     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x03cd
            java.lang.Integer r10 = r10.A01     // Catch:{ all -> 0x0539 }
        L_0x03e7:
            java.util.ArrayList r0 = r11.A04     // Catch:{ all -> 0x0539 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0539 }
        L_0x03ed:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x041e
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x0539 }
            X.0nZ r11 = (X.C13370nZ) r11     // Catch:{ all -> 0x0539 }
            androidx.fragment.app.Fragment r0 = r11.A04     // Catch:{ all -> 0x0539 }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x03ed
            boolean r0 = r11.A02     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x03ed
            goto L_0x0416
        L_0x0406:
            r10 = 0
            goto L_0x03e7
        L_0x0408:
            if (r10 >= r1) goto L_0x0411
            int r0 = r4.mState     // Catch:{ all -> 0x0539 }
            int r7 = java.lang.Math.min(r7, r0)     // Catch:{ all -> 0x0539 }
            goto L_0x03b3
        L_0x0411:
            int r7 = java.lang.Math.min(r7, r5)     // Catch:{ all -> 0x0539 }
            goto L_0x03b3
        L_0x0416:
            if (r10 == 0) goto L_0x041c
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x0539 }
            if (r10 != r0) goto L_0x041e
        L_0x041c:
            java.lang.Integer r10 = r11.A01     // Catch:{ all -> 0x0539 }
        L_0x041e:
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ all -> 0x0539 }
            if (r10 != r0) goto L_0x0438
            r0 = 6
            int r7 = java.lang.Math.min(r7, r0)     // Catch:{ all -> 0x0539 }
        L_0x0427:
            boolean r0 = r4.mDeferStart     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0433
            int r0 = r4.mState     // Catch:{ all -> 0x0539 }
            if (r0 >= r2) goto L_0x0433
            int r7 = java.lang.Math.min(r7, r1)     // Catch:{ all -> 0x0539 }
        L_0x0433:
            X.C12560m7.A0E(r6)     // Catch:{ all -> 0x0539 }
            goto L_0x0016
        L_0x0438:
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x0539 }
            if (r10 != r0) goto L_0x0441
            int r7 = java.lang.Math.max(r7, r9)     // Catch:{ all -> 0x0539 }
            goto L_0x0427
        L_0x0441:
            boolean r0 = r4.mRemoving     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0427
            int r0 = r4.mBackStackNesting     // Catch:{ all -> 0x0539 }
            if (r0 <= 0) goto L_0x044e
            int r7 = java.lang.Math.min(r7, r5)     // Catch:{ all -> 0x0539 }
            goto L_0x0427
        L_0x044e:
            int r7 = java.lang.Math.min(r7, r8)     // Catch:{ all -> 0x0539 }
            goto L_0x0427
        L_0x0453:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0539 }
            r1.<init>()     // Catch:{ all -> 0x0539 }
            r1.append(r7)     // Catch:{ all -> 0x0539 }
            r1.append(r4)     // Catch:{ all -> 0x0539 }
            r1.append(r8)     // Catch:{ all -> 0x0539 }
            androidx.fragment.app.Fragment r0 = r4.mTarget     // Catch:{ all -> 0x0539 }
            r1.append(r0)     // Catch:{ all -> 0x0539 }
            r1.append(r2)     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0539 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0539 }
            r1.<init>(r0)     // Catch:{ all -> 0x0539 }
            goto L_0x04c6
        L_0x0473:
            android.content.Context r0 = r4.requireContext()     // Catch:{ NotFoundException -> 0x049b }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ NotFoundException -> 0x049b }
            int r0 = r4.mContainerId     // Catch:{ NotFoundException -> 0x049b }
            java.lang.String r2 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x049b }
            goto L_0x049d
        L_0x0482:
            java.lang.String r0 = "Cannot create fragment "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0539 }
            r1.<init>(r0)     // Catch:{ all -> 0x0539 }
            r1.append(r4)     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = " for a container view with no id"
            r1.append(r0)     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0539 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0539 }
            r1.<init>(r0)     // Catch:{ all -> 0x0539 }
            goto L_0x04c6
        L_0x049b:
            java.lang.String r2 = "unknown"
        L_0x049d:
            java.lang.String r0 = "No view found for id 0x"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0539 }
            r1.<init>(r0)     // Catch:{ all -> 0x0539 }
            int r0 = r4.mContainerId     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ all -> 0x0539 }
            r1.append(r0)     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ all -> 0x0539 }
            r1.append(r2)     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = ") for fragment "
            r1.append(r0)     // Catch:{ all -> 0x0539 }
            r1.append(r4)     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0539 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0539 }
            r1.<init>(r0)     // Catch:{ all -> 0x0539 }
        L_0x04c6:
            throw r1     // Catch:{ all -> 0x0539 }
        L_0x04c7:
            if (r13 != 0) goto L_0x04ed
            r0 = -1
            if (r1 != r0) goto L_0x04ed
            boolean r0 = r4.mRemoving     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x04ed
            int r0 = r4.mBackStackNesting     // Catch:{ all -> 0x0539 }
            if (r0 > 0) goto L_0x04ed
            boolean r0 = r4.mBeingSaved     // Catch:{ all -> 0x0539 }
            if (r0 != 0) goto L_0x04ed
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            X.05I r1 = r14.A04     // Catch:{ all -> 0x0539 }
            X.05B r0 = r1.A01()     // Catch:{ all -> 0x0539 }
            r0.A08(r4)     // Catch:{ all -> 0x0539 }
            r1.A08(r14)     // Catch:{ all -> 0x0539 }
            X.C12560m7.A0E(r2)     // Catch:{ all -> 0x0539 }
            r4.initState()     // Catch:{ all -> 0x0539 }
        L_0x04ed:
            boolean r0 = r4.mHiddenChanged     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x0536
            android.view.View r0 = r4.mView     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x050e
            android.view.ViewGroup r0 = r4.mContainer     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x050e
            r4.getParentFragmentManager()     // Catch:{ all -> 0x0539 }
            X.05j r2 = X.C011605j.A03(r0)     // Catch:{ all -> 0x0539 }
            boolean r0 = r4.mHidden     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x052b
            X.C12560m7.A0E(r6)     // Catch:{ all -> 0x0539 }
            java.lang.Integer r1 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x0539 }
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x0539 }
            X.C011605j.A05(r14, r2, r1, r0)     // Catch:{ all -> 0x0539 }
        L_0x050e:
            X.0m7 r1 = r4.mFragmentManager     // Catch:{ all -> 0x0539 }
            if (r1 == 0) goto L_0x051e
            boolean r0 = r4.mAdded     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x051e
            boolean r0 = X.C12560m7.A0F(r4)     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x051e
            r1.A0G = r5     // Catch:{ all -> 0x0539 }
        L_0x051e:
            r4.mHiddenChanged = r3     // Catch:{ all -> 0x0539 }
            boolean r0 = r4.mHidden     // Catch:{ all -> 0x0539 }
            r4.onHiddenChanged(r0)     // Catch:{ all -> 0x0539 }
            X.0m7 r0 = r4.mChildFragmentManager     // Catch:{ all -> 0x0539 }
            r0.A0U()     // Catch:{ all -> 0x0539 }
            goto L_0x0536
        L_0x052b:
            X.C12560m7.A0E(r6)     // Catch:{ all -> 0x0539 }
            java.lang.Integer r1 = X.AnonymousClass006.A01     // Catch:{ all -> 0x0539 }
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x0539 }
            X.C011605j.A05(r14, r2, r1, r0)     // Catch:{ all -> 0x0539 }
            goto L_0x050e
        L_0x0536:
            r14.A01 = r3
            return
        L_0x0539:
            r0 = move-exception
            r14.A01 = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05H.A05():void");
    }

    public final void A06() {
        Fragment fragment = this.A02;
        FragmentState fragmentState = new FragmentState(fragment);
        if (fragment.mState <= -1 || fragmentState.A00 != null) {
            fragmentState.A00 = fragment.mSavedFragmentState;
        } else {
            Bundle A002 = A00(this);
            fragmentState.A00 = A002;
            if (fragment.mTargetWho != null) {
                if (A002 == null) {
                    A002 = new Bundle();
                    fragmentState.A00 = A002;
                }
                A002.putString("android:target_state", fragment.mTargetWho);
                int i = fragment.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.A00.putInt("android:target_req_state", i);
                }
            }
        }
        AnonymousClass05I r0 = this.A04;
        r0.A03.put(fragment.mWho, fragmentState);
    }

    public final void A07(ClassLoader classLoader) {
        boolean z;
        Fragment fragment = this.A02;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("android:view_registry_state");
            String string = fragment.mSavedFragmentState.getString("android:target_state");
            fragment.mTargetWho = string;
            if (string != null) {
                fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Boolean bool = fragment.mSavedUserVisibleHint;
            if (bool != null) {
                z = bool.booleanValue();
                fragment.mUserVisibleHint = z;
                fragment.mSavedUserVisibleHint = null;
            } else {
                z = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
                fragment.mUserVisibleHint = z;
            }
            if (!z) {
                fragment.mDeferStart = true;
            }
        }
    }

    public AnonymousClass05H(Fragment fragment, C010904z r5, FragmentState fragmentState, AnonymousClass05I r7) {
        String str;
        this.A03 = r5;
        this.A04 = r7;
        this.A02 = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        if (fragment2 != null) {
            str = fragment2.mWho;
        } else {
            str = null;
        }
        fragment.mTargetWho = str;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.A00;
        fragment.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    public AnonymousClass05H(Fragment fragment, C010904z r3, AnonymousClass05I r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = fragment;
    }

    public AnonymousClass05H(C010504v r4, C010904z r5, FragmentState fragmentState, AnonymousClass05I r7, ClassLoader classLoader) {
        this.A03 = r5;
        this.A04 = r7;
        Fragment A012 = r4.A01(classLoader, fragmentState.A05);
        Bundle bundle = fragmentState.A04;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        A012.setArguments(bundle);
        A012.mWho = fragmentState.A07;
        A012.mFromLayout = fragmentState.A09;
        A012.mRestored = true;
        A012.mFragmentId = fragmentState.A02;
        A012.mContainerId = fragmentState.A01;
        A012.mTag = fragmentState.A06;
        A012.mRetainInstance = fragmentState.A0C;
        A012.mRemoving = fragmentState.A0B;
        A012.mDetached = fragmentState.A08;
        A012.mHidden = fragmentState.A0A;
        A012.mMaxState = AnonymousClass061.values()[fragmentState.A03];
        Bundle bundle2 = fragmentState.A00;
        A012.mSavedFragmentState = bundle2 == null ? new Bundle() : bundle2;
        this.A02 = A012;
        C12560m7.A0E(2);
    }
}
