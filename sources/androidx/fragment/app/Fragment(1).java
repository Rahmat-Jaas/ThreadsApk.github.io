package androidx.fragment.app;

import X.AnonymousClass00M;
import X.AnonymousClass00N;
import X.AnonymousClass00O;
import X.AnonymousClass00R;
import X.AnonymousClass00U;
import X.AnonymousClass00X;
import X.AnonymousClass01L;
import X.AnonymousClass039;
import X.AnonymousClass04g;
import X.AnonymousClass04m;
import X.AnonymousClass05C;
import X.AnonymousClass05f;
import X.AnonymousClass060;
import X.AnonymousClass061;
import X.AnonymousClass062;
import X.AnonymousClass066;
import X.AnonymousClass06B;
import X.AnonymousClass06C;
import X.AnonymousClass06E;
import X.AnonymousClass070;
import X.AnonymousClass072;
import X.AnonymousClass0R0;
import X.AnonymousClass0R5;
import X.AnonymousClass0RM;
import X.AnonymousClass0RN;
import X.AnonymousClass0RX;
import X.C006202t;
import X.C009404e;
import X.C009504f;
import X.C009604h;
import X.C009704i;
import X.C009804j;
import X.C010004l;
import X.C010204r;
import X.C010504v;
import X.C011605j;
import X.C011705l;
import X.C012005o;
import X.C012305s;
import X.C012405t;
import X.C012605w;
import X.C04220Ms;
import X.C04600Oi;
import X.C05090Qu;
import X.C05100Qv;
import X.C116066wM;
import X.C12560m7;
import X.C14030oh;
import X.C14260p5;
import X.C142618fJ;
import X.C14340pE;
import X.C147138nS;
import X.C15750rp;
import X.C18209Abd;
import X.C880856r;
import X.M5J;
import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import com.facebook.redex.IDxObjectShape112S0000000_I2;
import com.instagram.barcelona.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Fragment implements AnonymousClass066, AnonymousClass06C, C012605w, C15750rp, ComponentCallbacks, View.OnCreateContextMenuListener, AnonymousClass00N {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public C009804j mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    public boolean mCalled;
    public C12560m7 mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public C147138nS mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public C12560m7 mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public C04600Oi mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C14340pE mLifecycleRegistry;
    public AnonymousClass061 mMaxState;
    public boolean mMenuVisible;
    public final AtomicInteger mNextLocalRequestCode;
    public final ArrayList mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public Handler mPostponedHandler;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public final AnonymousClass04m mSavedStateAttachListener;
    public AnonymousClass072 mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public AnonymousClass0RN mViewLifecycleOwner;
    public C880856r mViewLifecycleOwnerLiveData;
    public String mWho;

    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new IDxObjectShape112S0000000_I2(1);
        public final Bundle A00;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.A00);
        }

        public SavedState(Bundle bundle) {
            this.A00 = bundle;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.A00 = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    private AnonymousClass00O prepareCallInternal(AnonymousClass00X r7, C142618fJ r8, AnonymousClass00M r9) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new AnonymousClass05f(r9, r7, r8, this, atomicReference));
            return new AnonymousClass01L(r7, this, atomicReference);
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        throw new IllegalStateException(sb.toString());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C12560m7.A0E(2);
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onDestroyOptionsMenu() {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        if (this.mHost != null) {
            this.mCalled = false;
            this.mCalled = true;
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            C12560m7 r1 = this.mChildFragmentManager;
            if (!r1.A0F) {
                r1.A0X();
                this.mChildFragmentManager = new AnonymousClass0RX();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDetach()");
        throw new C011705l(sb.toString());
    }

    public void startActivity(Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2 = intent;
        if (this.mHost != null) {
            C12560m7.A0E(2);
            C12560m7 parentFragmentManager = getParentFragmentManager();
            IntentSender intentSender2 = intentSender;
            int i5 = i2;
            int i6 = i3;
            Bundle bundle2 = bundle;
            if (parentFragmentManager.A04 != null) {
                if (bundle != null) {
                    if (intent == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    C12560m7.A0E(2);
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
                }
                C04220Ms.A0B(intentSender, 1);
                IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intent2, intentSender, i5, i6);
                parentFragmentManager.A0C.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
                C12560m7.A0E(2);
                parentFragmentManager.A04.A01(intentSenderRequest);
                return;
            }
            C04600Oi r0 = parentFragmentManager.A09;
            if (i == -1) {
                r0.A00.startIntentSenderForResult(intentSender2, -1, intent2, i5, i6, i4, bundle2);
                return;
            }
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    private C009804j ensureAnimationInfo() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 != null) {
            return r0;
        }
        C009804j r02 = new C009804j();
        this.mAnimationInfo = r02;
        return r02;
    }

    private int getMinimumMaxLifecycleState() {
        Fragment fragment;
        AnonymousClass061 r1 = this.mMaxState;
        if (r1 == AnonymousClass061.INITIALIZED || (fragment = this.mParentFragment) == null) {
            return r1.ordinal();
        }
        return Math.min(r1.ordinal(), fragment.getMinimumMaxLifecycleState());
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            AnonymousClass0R0 r3 = new AnonymousClass0R0(this);
            C12560m7.A0E(3);
            C012305s A00 = C012405t.A00(this);
            if (A00.A01.contains(C012005o.DETECT_TARGET_FRAGMENT_USAGE) && C012405t.A03(A00, getClass(), r3.getClass())) {
                C012405t.A02(A00, r3);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        C12560m7 r1 = this.mFragmentManager;
        if (r1 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return r1.A0N(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C14340pE(this);
        this.mSavedStateRegistryController = new AnonymousClass072(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C010504v.A00(str, context.getClassLoader()).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C010004l(e, AnonymousClass00U.A0V("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"));
        } catch (IllegalAccessException e2) {
            throw new C010004l(e2, AnonymousClass00U.A0V("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"));
        } catch (NoSuchMethodException e3) {
            throw new C010004l(e3, AnonymousClass00U.A0V("Unable to instantiate fragment ", str, ": could not find Fragment constructor"));
        } catch (InvocationTargetException e4) {
            throw new C010004l(e4, AnonymousClass00U.A0V("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"));
        }
    }

    private void registerOnPreAttachListener(AnonymousClass04m r2) {
        if (this.mState >= 0) {
            r2.A00();
        } else {
            this.mOnPreAttachedListeners.add(r2);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        C009804j r1 = this.mAnimationInfo;
        if (r1 != null) {
            r1.A0F = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && this.mFragmentManager != null) {
            C011605j A03 = C011605j.A03(viewGroup);
            A03.A06();
            if (z) {
                this.mHost.A02.post(new AnonymousClass04g(this, A03));
            } else {
                A03.A07();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    public C010204r createFragmentContainer() {
        return new AnonymousClass039(this);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.A0T.A00(str);
    }

    public String generateActivityResultKey() {
        return AnonymousClass00U.A05(this.mNextLocalRequestCode.getAndIncrement(), "fragment_", this.mWho, "_rq#");
    }

    public final FragmentActivity getActivity() {
        C04600Oi r0 = this.mHost;
        if (r0 == null) {
            return null;
        }
        return (FragmentActivity) r0.A00;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null || (bool = r0.A05) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null || (bool = r0.A06) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final C12560m7 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }

    public Context getContext() {
        C04600Oi r0 = this.mHost;
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r2 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (X.C12560m7.A0E(3) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        requireContext().getApplicationContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C147138nS getDefaultViewModelProviderFactory() {
        /*
            r3 = this;
            X.0m7 r0 = r3.mFragmentManager
            if (r0 == 0) goto L_0x003d
            X.8nS r1 = r3.mDefaultFactory
            if (r1 != 0) goto L_0x0035
            r2 = 0
            android.content.Context r0 = r3.requireContext()
            android.content.Context r1 = r0.getApplicationContext()
        L_0x0011:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x001e
            boolean r0 = r1 instanceof android.app.Application
            if (r0 == 0) goto L_0x0036
            r2 = r1
            android.app.Application r2 = (android.app.Application) r2
            if (r2 != 0) goto L_0x002c
        L_0x001e:
            r0 = 3
            boolean r0 = X.C12560m7.A0E(r0)
            if (r0 == 0) goto L_0x002c
            android.content.Context r0 = r3.requireContext()
            r0.getApplicationContext()
        L_0x002c:
            android.os.Bundle r0 = r3.mArguments
            X.58d r1 = new X.58d
            r1.<init>(r2, r0, r3)
            r3.mDefaultFactory = r1
        L_0x0035:
            return r1
        L_0x0036:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x0011
        L_0x003d:
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getDefaultViewModelProviderFactory():X.8nS");
    }

    public int getEnterAnim() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return 0;
        }
        return r0.A0H;
    }

    public Object getEnterTransition() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.A07;
    }

    public C18209Abd getEnterTransitionCallback() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.A03;
    }

    public int getExitAnim() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return 0;
        }
        return r0.A0I;
    }

    public Object getExitTransition() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.A08;
    }

    public C18209Abd getExitTransitionCallback() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.A04;
    }

    public View getFocusedView() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.A02;
    }

    public final Object getHost() {
        C04600Oi r0 = this.mHost;
        if (r0 == null) {
            return null;
        }
        return r0.A03();
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        C04600Oi r0 = this.mHost;
        if (r0 != null) {
            LayoutInflater A02 = r0.A02();
            A02.setFactory2(this.mChildFragmentManager.A0R);
            return A02;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public int getNextTransition() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return 0;
        }
        return r0.A01;
    }

    public final C12560m7 getParentFragmentManager() {
        C12560m7 r0 = this.mFragmentManager;
        if (r0 != null) {
            return r0;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    public boolean getPopDirection() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return false;
        }
        return r0.A0G;
    }

    public int getPopEnterAnim() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return 0;
        }
        return r0.A0J;
    }

    public int getPopExitAnim() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return 0;
        }
        return r0.A0K;
    }

    public float getPostOnViewCreatedAlpha() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return 1.0f;
        }
        return r0.A00;
    }

    public Object getReenterTransition() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        Object obj = r0.A09;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final boolean getRetainInstance() {
        AnonymousClass0RM r3 = new AnonymousClass0RM(this);
        C12560m7.A0E(3);
        C012305s A00 = C012405t.A00(this);
        if (A00.A01.contains(C012005o.DETECT_RETAIN_INSTANCE_USAGE) && C012405t.A03(A00, getClass(), r3.getClass())) {
            C012405t.A02(A00, r3);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        Object obj = r0.A0A;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    public final AnonymousClass070 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.A01;
    }

    public Object getSharedElementEnterTransition() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.A0B;
    }

    public Object getSharedElementReturnTransition() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        Object obj = r0.A0C;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public ArrayList getSharedElementSourceNames() {
        ArrayList arrayList;
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null || (arrayList = r0.A0D) == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public ArrayList getSharedElementTargetNames() {
        ArrayList arrayList;
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null || (arrayList = r0.A0E) == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public final int getTargetRequestCode() {
        AnonymousClass0R5 r3 = new AnonymousClass0R5(this);
        C12560m7.A0E(3);
        C012305s A00 = C012405t.A00(this);
        if (A00.A01.contains(C012005o.DETECT_TARGET_FRAGMENT_USAGE) && C012405t.A03(A00, getClass(), r3.getClass())) {
            C012405t.A02(A00, r3);
        }
        return this.mTargetRequestCode;
    }

    public AnonymousClass066 getViewLifecycleOwner() {
        AnonymousClass0RN r0 = this.mViewLifecycleOwner;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public AnonymousClass06B getViewModelStore() {
        C12560m7 r2 = this.mFragmentManager;
        if (r2 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (getMinimumMaxLifecycleState() != 1) {
            return r2.A0S(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final boolean isAdded() {
        if (this.mHost == null || !this.mAdded) {
            return false;
        }
        return true;
    }

    public final boolean isHidden() {
        Fragment fragment;
        if (this.mHidden) {
            return true;
        }
        if (this.mFragmentManager == null || (fragment = this.mParentFragment) == null || !fragment.isHidden()) {
            return false;
        }
        return true;
    }

    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public final boolean isMenuVisible() {
        Fragment fragment;
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager == null || (fragment = this.mParentFragment) == null || fragment.isMenuVisible()) {
            return true;
        }
        return false;
    }

    public boolean isPostponed() {
        C009804j r0 = this.mAnimationInfo;
        if (r0 == null) {
            return false;
        }
        return r0.A0F;
    }

    public final boolean isResumed() {
        if (this.mState >= 7) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        C12560m7 r0 = this.mFragmentManager;
        if (r0 == null) {
            return false;
        }
        return r0.A15();
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.A0c();
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.A0c();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.A0V();
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new C011705l(sb.toString());
    }

    public void performAttach() {
        Iterator it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            ((AnonymousClass04m) it.next()).A00();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.A0q(this, createFragmentContainer(), this.mHost);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.A01);
        if (this.mCalled) {
            C12560m7 r2 = this.mFragmentManager;
            Iterator it2 = r2.A0Y.iterator();
            while (it2.hasNext()) {
                ((AnonymousClass05C) it2.next()).BlQ(this, r2);
            }
            this.mChildFragmentManager.A0T();
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onAttach()");
        throw new C011705l(sb.toString());
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            return this.mChildFragmentManager.A19(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.A0c();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.A07(new C14260p5() {
            public final void CMI(AnonymousClass060 r2, AnonymousClass066 r3) {
                View view;
                if (r2 == AnonymousClass060.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.mSavedStateRegistryController.A01(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.A09(AnonymousClass060.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new C011705l(sb.toString());
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
        }
        return z | this.mChildFragmentManager.A18(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.A0c();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new AnonymousClass0RN(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        AnonymousClass0RN r0 = this.mViewLifecycleOwner;
        if (onCreateView != null) {
            r0.A00();
            C116066wM.A01(this.mView, this.mViewLifecycleOwner);
            View view = this.mView;
            AnonymousClass0RN r1 = this.mViewLifecycleOwner;
            C04220Ms.A0B(view, 0);
            view.setTag(R.id.view_tree_view_model_store_owner, r1);
            View view2 = this.mView;
            AnonymousClass0RN r12 = this.mViewLifecycleOwner;
            C04220Ms.A0B(view2, 0);
            view2.setTag(R.id.view_tree_saved_state_registry_owner, r12);
            this.mViewLifecycleOwnerLiveData.A0H(this.mViewLifecycleOwner);
        } else if (r0.A00 != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.mViewLifecycleOwner = null;
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.A0X();
        this.mLifecycleRegistry.A09(AnonymousClass060.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDestroy()");
            throw new C011705l(sb.toString());
        }
    }

    public void performDestroyView() {
        C12560m7.A09(this.mChildFragmentManager, 1);
        if (this.mView != null) {
            AnonymousClass0RN r0 = this.mViewLifecycleOwner;
            r0.A00();
            if (r0.A00.A00.A00(AnonymousClass061.CREATED)) {
                AnonymousClass0RN r02 = this.mViewLifecycleOwner;
                r02.A00.A09(AnonymousClass060.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AnonymousClass06E.A00(this).A04();
            this.mPerformedCreateView = false;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new C011705l(sb.toString());
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            return this.mChildFragmentManager.A1A(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            this.mChildFragmentManager.A0j(menu);
        }
    }

    public void performPause() {
        C12560m7.A09(this.mChildFragmentManager, 5);
        if (this.mView != null) {
            AnonymousClass0RN r0 = this.mViewLifecycleOwner;
            r0.A00.A09(AnonymousClass060.ON_PAUSE);
        }
        this.mLifecycleRegistry.A09(AnonymousClass060.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onPause()");
            throw new C011705l(sb.toString());
        }
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
        }
        return z | this.mChildFragmentManager.A17(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean A1B = this.mFragmentManager.A1B(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != A1B) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(A1B);
            C12560m7 r1 = this.mChildFragmentManager;
            C12560m7.A08(r1);
            C12560m7.A07(r1.A06, r1);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.A0c();
        this.mChildFragmentManager.A14(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            C14340pE r0 = this.mLifecycleRegistry;
            AnonymousClass060 r1 = AnonymousClass060.ON_RESUME;
            r0.A09(r1);
            if (this.mView != null) {
                this.mViewLifecycleOwner.A00.A09(r1);
            }
            this.mChildFragmentManager.A0Y();
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new C011705l(sb.toString());
    }

    public void performStart() {
        this.mChildFragmentManager.A0c();
        this.mChildFragmentManager.A14(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            C14340pE r0 = this.mLifecycleRegistry;
            AnonymousClass060 r1 = AnonymousClass060.ON_START;
            r0.A09(r1);
            if (this.mView != null) {
                this.mViewLifecycleOwner.A00.A09(r1);
            }
            this.mChildFragmentManager.A0Z();
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new C011705l(sb.toString());
    }

    public void performStop() {
        this.mChildFragmentManager.A0a();
        if (this.mView != null) {
            AnonymousClass0RN r0 = this.mViewLifecycleOwner;
            r0.A00.A09(AnonymousClass060.ON_STOP);
        }
        this.mLifecycleRegistry.A09(AnonymousClass060.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStop()");
            throw new C011705l(sb.toString());
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        C12560m7.A09(this.mChildFragmentManager, 2);
    }

    public final AnonymousClass00O registerForActivityResult(AnonymousClass00X r2, AnonymousClass00R r3, AnonymousClass00M r4) {
        return prepareCallInternal(r2, new C009704i(r3, this), r4);
    }

    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            C12560m7 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.A02 != null) {
                parentFragmentManager.A0C.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
                parentFragmentManager.A02.A01(strArr);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public final Bundle requireArguments() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            return bundle;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" does not have any arguments.");
        throw new IllegalStateException(sb.toString());
    }

    public final Fragment requireParentFragment() {
        Fragment fragment = this.mParentFragment;
        if (fragment != null) {
            return fragment;
        }
        Context context = getContext();
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        if (context == null) {
            sb.append(this);
            sb.append(" is not attached to any Fragment or host");
            throw new IllegalStateException(sb.toString());
        }
        sb.append(this);
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(getContext());
        throw new IllegalStateException(sb.toString());
    }

    public final View requireView() {
        View view = this.mView;
        if (view != null) {
            return view;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.A0i(parcelable);
            this.mChildFragmentManager.A0W();
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            AnonymousClass0RN r0 = this.mViewLifecycleOwner;
            r0.A01.A01(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new C011705l(sb.toString());
        } else if (this.mView != null) {
            AnonymousClass0RN r02 = this.mViewLifecycleOwner;
            r02.A00.A09(AnonymousClass060.ON_CREATE);
        }
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            ensureAnimationInfo().A0H = i;
            ensureAnimationInfo().A0I = i2;
            ensureAnimationInfo().A0J = i3;
            ensureAnimationInfo().A0K = i4;
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.A04();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState == null || (bundle = savedState.A00) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.A04();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.A01 = i;
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().A0G = z;
        }
    }

    public void setRetainInstance(boolean z) {
        C05100Qv r3 = new C05100Qv(this);
        C12560m7.A0E(3);
        C012305s A00 = C012405t.A00(this);
        if (A00.A01.contains(C012005o.DETECT_RETAIN_INSTANCE_USAGE) && C012405t.A03(A00, getClass(), r3.getClass())) {
            C012405t.A02(A00, r3);
        }
        this.mRetainInstance = z;
        C12560m7 r0 = this.mFragmentManager;
        if (r0 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            r0.A0k(this);
        } else {
            r0.A0o(this);
        }
    }

    public void setTargetFragment(Fragment fragment, int i) {
        C12560m7 r0;
        if (fragment != null) {
            C05090Qu r3 = new C05090Qu(this, fragment, i);
            C12560m7.A0E(3);
            C012305s A00 = C012405t.A00(this);
            if (A00.A01.contains(C012005o.DETECT_TARGET_FRAGMENT_USAGE) && C012405t.A03(A00, getClass(), r3.getClass())) {
                C012405t.A02(A00, r3);
            }
        }
        C12560m7 r1 = this.mFragmentManager;
        if (fragment != null) {
            r0 = fragment.mFragmentManager;
        } else {
            r0 = null;
        }
        if (r1 == null || r0 == null || r1 == r0) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.getTargetFragment(false);
                } else {
                    StringBuilder sb = new StringBuilder("Setting ");
                    sb.append(fragment);
                    sb.append(" as the target of ");
                    sb.append(this);
                    sb.append(" would create a target cycle");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Fragment ");
        sb2.append(fragment);
        sb2.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r5 != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setUserVisibleHint(boolean r5) {
        /*
            r4 = this;
            X.0o2 r3 = new X.0o2
            r3.<init>(r4, r5)
            r0 = 3
            X.C12560m7.A0E(r0)
            X.05s r2 = X.C012405t.A00(r4)
            java.util.Set r1 = r2.A01
            X.05o r0 = X.C012005o.DETECT_SET_USER_VISIBLE_HINT
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r3.getClass()
            boolean r0 = X.C012405t.A03(r2, r1, r0)
            if (r0 == 0) goto L_0x0028
            X.C012405t.A02(r2, r3)
        L_0x0028:
            boolean r0 = r4.mUserVisibleHint
            r2 = 5
            if (r0 != 0) goto L_0x0048
            if (r5 == 0) goto L_0x0048
            int r0 = r4.mState
            if (r0 >= r2) goto L_0x0048
            X.0m7 r1 = r4.mFragmentManager
            if (r1 == 0) goto L_0x0048
            boolean r0 = r4.isAdded()
            if (r0 == 0) goto L_0x0048
            boolean r0 = r4.mIsCreated
            if (r0 == 0) goto L_0x0048
            X.05H r0 = r1.A0R(r4)
            r1.A0z(r0)
        L_0x0048:
            r4.mUserVisibleHint = r5
            int r0 = r4.mState
            if (r0 >= r2) goto L_0x0051
            r0 = 1
            if (r5 == 0) goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            r4.mDeferStart = r0
            android.os.Bundle r0 = r4.mSavedFragmentState
            if (r0 == 0) goto L_0x005e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r4.mSavedUserVisibleHint = r0
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.setUserVisibleHint(boolean):void");
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        C04600Oi r0 = this.mHost;
        if (r0 != null) {
            return r0.A06(str);
        }
        return false;
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            C12560m7 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.A03 != null) {
                parentFragmentManager.A0C.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
                if (!(intent == null || bundle == null)) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.A03.A01(intent);
                return;
            }
            C04600Oi r1 = parentFragmentManager.A09;
            if (i == -1) {
                r1.A01.startActivity(intent, bundle);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().A0F) {
            if (this.mHost == null) {
                ensureAnimationInfo().A0F = false;
            } else if (Looper.myLooper() != this.mHost.A02.getLooper()) {
                this.mHost.A02.postAtFrontOfQueue(new C009504f(this));
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        int i = this.mFragmentId;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.mTag;
        if (str != null) {
            sb.append(" tag=");
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getContext() != null) {
            AnonymousClass06E.A00(this).A06(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sb = new StringBuilder("Child ");
        sb.append(this.mChildFragmentManager);
        sb.append(":");
        printWriter.println(sb.toString());
        this.mChildFragmentManager.A13(AnonymousClass00U.A0L(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public View getAnimatingAway() {
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r1 == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (X.C12560m7.A0E(3) == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        requireContext().getApplicationContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C111686o9 getDefaultViewModelCreationExtras() {
        /*
            r3 = this;
            android.content.Context r0 = r3.requireContext()
            android.content.Context r1 = r0.getApplicationContext()
        L_0x0008:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0047
            boolean r0 = r1 instanceof android.app.Application
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x0020
        L_0x0012:
            r0 = 3
            boolean r0 = X.C12560m7.A0E(r0)
            if (r0 == 0) goto L_0x0020
            android.content.Context r0 = r3.requireContext()
            r0.getApplicationContext()
        L_0x0020:
            X.58f r2 = new X.58f
            r2.<init>()
            if (r1 == 0) goto L_0x002c
            X.8dO r0 = X.C884358b.A02
            r2.A01(r0, r1)
        L_0x002c:
            X.8dO r0 = X.AnonymousClass7GW.A01
            r2.A01(r0, r3)
            X.8dO r0 = X.AnonymousClass7GW.A02
            r2.A01(r0, r3)
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L_0x003f
            X.8dO r0 = X.AnonymousClass7GW.A00
            r2.A01(r0, r1)
        L_0x003f:
            return r2
        L_0x0040:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x0008
        L_0x0047:
            r1 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getDefaultViewModelCreationExtras():X.6o9");
    }

    public final C12560m7 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public AnonymousClass062 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public AnonymousClass06E getLoaderManager() {
        return AnonymousClass06E.A00(this);
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final String getString(int i) {
        return requireContext().getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    public final CharSequence getText(int i) {
        return requireContext().getResources().getText(i);
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public M5J getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new AnonymousClass0RX();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isVisible() {
        View view;
        if (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void onActivityCreated(Bundle bundle) {
        int A02 = C14030oh.A02(-1986149221);
        this.mCalled = true;
        C14030oh.A09(1469501862, A02);
    }

    public void onAttach(Activity activity) {
        int A02 = C14030oh.A02(894618012);
        this.mCalled = true;
        C14030oh.A09(-1276121473, A02);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(412399288);
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        C12560m7 r1 = this.mChildFragmentManager;
        if (r1.A00 < 1) {
            r1.A0W();
        }
        C14030oh.A09(1111400336, A02);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        int i;
        int A02 = C14030oh.A02(-1027310901);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            view = layoutInflater.inflate(i2, viewGroup, false);
            i = 1445078932;
        } else {
            view = null;
            i = 1196706451;
        }
        C14030oh.A09(i, A02);
        return view;
    }

    public void onDestroy() {
        int A02 = C14030oh.A02(1429640738);
        this.mCalled = true;
        C14030oh.A09(55621516, A02);
    }

    public void onDestroyView() {
        int A02 = C14030oh.A02(-961299403);
        this.mCalled = true;
        C14030oh.A09(223467279, A02);
    }

    public void onDetach() {
        int A02 = C14030oh.A02(1887423784);
        this.mCalled = true;
        C14030oh.A09(1766004772, A02);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onPause() {
        int A02 = C14030oh.A02(-741365511);
        this.mCalled = true;
        C14030oh.A09(257018534, A02);
    }

    public void onResume() {
        int A02 = C14030oh.A02(339993235);
        this.mCalled = true;
        C14030oh.A09(-70928354, A02);
    }

    public void onStart() {
        int A02 = C14030oh.A02(-179177744);
        this.mCalled = true;
        C14030oh.A09(84446793, A02);
    }

    public void onStop() {
        int A02 = C14030oh.A02(1602857852);
        this.mCalled = true;
        C14030oh.A09(1867857833, A02);
    }

    public void onViewStateRestored(Bundle bundle) {
        int A02 = C14030oh.A02(865006028);
        this.mCalled = true;
        C14030oh.A09(881477546, A02);
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        AnonymousClass072 r1 = this.mSavedStateRegistryController;
        C04220Ms.A0B(bundle, 0);
        r1.A01.A02(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.A0J());
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().A0F = true;
        Handler handler2 = this.mPostponedHandler;
        if (handler2 != null) {
            handler2.removeCallbacks(this.mPostponedDurationRunnable);
        }
        C12560m7 r0 = this.mFragmentManager;
        if (r0 != null) {
            handler = r0.A09.A02;
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler = handler;
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    public final C12560m7 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to a host.");
        throw new IllegalStateException(sb.toString());
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().A05 = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().A06 = Boolean.valueOf(z);
    }

    public void setEnterSharedElementCallback(C18209Abd abd) {
        ensureAnimationInfo().A03 = abd;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().A07 = obj;
    }

    public void setExitSharedElementCallback(C18209Abd abd) {
        ensureAnimationInfo().A04 = abd;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().A08 = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().A02 = view;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().A00 = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().A09 = obj;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().A0A = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().A0B = obj;
    }

    public void setSharedElementNames(ArrayList arrayList, ArrayList arrayList2) {
        ensureAnimationInfo();
        C009804j r0 = this.mAnimationInfo;
        r0.A0D = arrayList;
        r0.A0E = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().A0C = obj;
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public void performMultiWindowModeChanged(boolean z) {
    }

    public void performPictureInPictureModeChanged(boolean z) {
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new AnonymousClass0RX();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new C009404e(this);
        this.mMaxState = AnonymousClass061.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C880856r();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList();
        this.mSavedStateAttachListener = new C006202t(this);
        initLifecycle();
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    private void restoreViewState() {
        C12560m7.A0E(3);
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater((Bundle) null);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public final String getString(int i, Object... objArr) {
        return requireContext().getResources().getString(i, objArr);
    }

    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        C04600Oi r0 = this.mHost;
        if (r0 != null) {
            Activity activity = r0.A00;
            this.mCalled = false;
            onAttach(activity);
        }
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().A0F = true;
    }

    public final AnonymousClass00O registerForActivityResult(AnonymousClass00X r2, AnonymousClass00M r3) {
        return prepareCallInternal(r2, new C009604h(this), r3);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        C04600Oi r0 = this.mHost;
        if (r0 != null) {
            r0.A01.startActivity(intent, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }
}
