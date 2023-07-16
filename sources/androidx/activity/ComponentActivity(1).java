package androidx.activity;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00F;
import X.AnonymousClass00H;
import X.AnonymousClass00I;
import X.AnonymousClass00K;
import X.AnonymousClass00M;
import X.AnonymousClass00N;
import X.AnonymousClass00O;
import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.AnonymousClass00U;
import X.AnonymousClass00X;
import X.AnonymousClass02O;
import X.AnonymousClass02P;
import X.AnonymousClass02Q;
import X.AnonymousClass02V;
import X.AnonymousClass060;
import X.AnonymousClass061;
import X.AnonymousClass062;
import X.AnonymousClass066;
import X.AnonymousClass06B;
import X.AnonymousClass06C;
import X.AnonymousClass070;
import X.AnonymousClass072;
import X.AnonymousClass07B;
import X.AnonymousClass07C;
import X.AnonymousClass092;
import X.AnonymousClass096;
import X.AnonymousClass098;
import X.AnonymousClass09A;
import X.AnonymousClass0g2;
import X.AnonymousClass3SD;
import X.AnonymousClass3SE;
import X.AnonymousClass7GW;
import X.C002301a;
import X.C012605w;
import X.C04220Ms;
import X.C111686o9;
import X.C116066wM;
import X.C120447Av;
import X.C14030oh;
import X.C14260p5;
import X.C14340pE;
import X.C147138nS;
import X.C15750rp;
import X.C40958Lsx;
import X.C41668MXo;
import X.C83244r4;
import X.C83254r5;
import X.C83264r6;
import X.C83274r7;
import X.C86234wi;
import X.C884358b;
import X.C884558d;
import X.C884758f;
import X.MXX;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda0;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1;
import com.facebook.redex.IDxObjectShape235S0100000_I2;
import com.facebook.redex.IDxSProviderShape514S0100000_I2;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements AnonymousClass066, AnonymousClass06C, C012605w, C15750rp, AnonymousClass092, AnonymousClass00S, C83244r4, C83254r5, C83264r6, C83274r7, AnonymousClass02O, MXX, AnonymousClass00H, AnonymousClass00N, C41668MXo {
    public static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    public final AnonymousClass00R mActivityResultRegistry;
    public int mContentLayoutId;
    public final AnonymousClass00I mContextAwareHelper;
    public C147138nS mDefaultFactory;
    public boolean mDispatchingOnMultiWindowModeChanged;
    public boolean mDispatchingOnPictureInPictureModeChanged;
    public final C40958Lsx mFullyDrawnReporter;
    public final C14340pE mLifecycleRegistry;
    public final AnonymousClass02Q mMenuHostHelper;
    public final AtomicInteger mNextLocalRequestCode;
    public final AnonymousClass00F mOnBackPressedDispatcher;
    public final CopyOnWriteArrayList mOnConfigurationChangedListeners;
    public final CopyOnWriteArrayList mOnMultiWindowModeChangedListeners;
    public final CopyOnWriteArrayList mOnNewIntentListeners;
    public final CopyOnWriteArrayList mOnPictureInPictureModeChangedListeners;
    public final CopyOnWriteArrayList mOnTrimMemoryListeners;
    public final AnonymousClass009 mReportFullyDrawnExecutor;
    public final AnonymousClass072 mSavedStateRegistryController;
    public AnonymousClass06B mViewModelStore;

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        AnonymousClass008 r0;
        AnonymousClass06B r02 = this.mViewModelStore;
        if (r02 == null && ((r0 = (AnonymousClass008) getLastNonConfigurationInstance()) == null || (r02 = r0.A00) == null)) {
            return null;
        }
        AnonymousClass008 r1 = new AnonymousClass008();
        r1.A00 = r02;
        return r1;
    }

    private AnonymousClass009 createFullyDrawnExecutor() {
        return new AnonymousClass096(this);
    }

    public void addMenuProvider(AnonymousClass02V r3) {
        AnonymousClass02Q r1 = this.mMenuHostHelper;
        r1.A02.add(r3);
        r1.A00.run();
    }

    public final void addOnConfigurationChangedListener(C002301a r2) {
        this.mOnConfigurationChangedListeners.add(r2);
    }

    public final void addOnContextAvailableListener(AnonymousClass00K r3) {
        AnonymousClass00I r1 = this.mContextAwareHelper;
        C04220Ms.A0B(r3, 0);
        Context context = r1.A01;
        if (context != null) {
            r3.Bs5(context);
        }
        r1.A00.add(r3);
    }

    public final void addOnMultiWindowModeChangedListener(C002301a r2) {
        this.mOnMultiWindowModeChangedListeners.add(r2);
    }

    public final void addOnNewIntentListener(C002301a r2) {
        this.mOnNewIntentListeners.add(r2);
    }

    public final void addOnPictureInPictureModeChangedListener(C002301a r2) {
        this.mOnPictureInPictureModeChangedListeners.add(r2);
    }

    public final void addOnTrimMemoryListener(C002301a r2) {
        this.mOnTrimMemoryListeners.add(r2);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            AnonymousClass008 r0 = (AnonymousClass008) getLastNonConfigurationInstance();
            if (r0 != null) {
                this.mViewModelStore = r0.A00;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new AnonymousClass06B();
            }
        }
    }

    public C111686o9 getDefaultViewModelCreationExtras() {
        C884758f r2 = new C884758f();
        if (getApplication() != null) {
            r2.A01(C884358b.A02, getApplication());
        }
        r2.A01(AnonymousClass7GW.A01, this);
        r2.A01(AnonymousClass7GW.A02, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            r2.A01(AnonymousClass7GW.A00, getIntent().getExtras());
        }
        return r2;
    }

    public C147138nS getDefaultViewModelProviderFactory() {
        Bundle bundle;
        C147138nS r2 = this.mDefaultFactory;
        if (r2 != null) {
            return r2;
        }
        Application application = getApplication();
        if (getIntent() != null) {
            bundle = getIntent().getExtras();
        } else {
            bundle = null;
        }
        C884558d r22 = new C884558d(application, bundle, this);
        this.mDefaultFactory = r22;
        return r22;
    }

    public final AnonymousClass070 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.A01;
    }

    /* renamed from: lambda$new$1$androidx-activity-ComponentActivity  reason: not valid java name */
    public /* synthetic */ Bundle m1lambda$new$1$androidxactivityComponentActivity() {
        Bundle bundle = new Bundle();
        AnonymousClass00R r4 = this.mActivityResultRegistry;
        Map map = r4.A03;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(r4.A00));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) r4.A02.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", r4.A01);
        return bundle;
    }

    /* renamed from: lambda$new$2$androidx-activity-ComponentActivity  reason: not valid java name */
    public /* synthetic */ void m2lambda$new$2$androidxactivityComponentActivity(Context context) {
        Bundle A00 = this.mSavedStateRegistryController.A01.A00(ACTIVITY_RESULT_TAG);
        if (A00 != null) {
            AnonymousClass00R r8 = this.mActivityResultRegistry;
            ArrayList<Integer> integerArrayList = A00.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = A00.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                r8.A00 = A00.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                r8.A01 = (Random) A00.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                Bundle bundle = r8.A02;
                bundle.putAll(A00.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    Map map = r8.A03;
                    if (map.containsKey(str)) {
                        Object remove = map.remove(str);
                        if (!bundle.containsKey(str)) {
                            r8.A05.remove(remove);
                        }
                    }
                    Integer num = integerArrayList.get(i);
                    String str2 = stringArrayList.get(i);
                    r8.A05.put(num, str2);
                    map.put(str2, num);
                }
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.A05(intent, i, i2)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.A02();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.mMenuHostHelper.A01(menu, getMenuInflater());
        return true;
    }

    public void onMultiWindowModeChanged(boolean z) {
        if (!this.mDispatchingOnMultiWindowModeChanged) {
            Iterator it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                ((C002301a) it.next()).accept(new AnonymousClass3SD(z));
            }
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        Iterator it = this.mMenuHostHelper.A02.iterator();
        while (it.hasNext()) {
            ((AnonymousClass0g2) ((AnonymousClass02V) it.next())).A00.A0j(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        if (!this.mDispatchingOnPictureInPictureModeChanged) {
            Iterator it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                ((C002301a) it.next()).accept(new AnonymousClass3SE(z));
            }
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.mMenuHostHelper.A00(menu);
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.A05(new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr), i, -1)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C14340pE r1 = this.mLifecycleRegistry;
        if (r1 != null) {
            r1.A0A(AnonymousClass061.CREATED);
        }
        super.onSaveInstanceState(bundle);
        AnonymousClass072 r12 = this.mSavedStateRegistryController;
        C04220Ms.A0B(bundle, 0);
        r12.A01.A02(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.A01;
    }

    public final AnonymousClass00O registerForActivityResult(AnonymousClass00X r3, AnonymousClass00R r4, AnonymousClass00M r5) {
        return r4.A01(r5, r3, this, AnonymousClass00U.A0J("activity_rq#", this.mNextLocalRequestCode.getAndIncrement()));
    }

    public void removeMenuProvider(AnonymousClass02V r2) {
        this.mMenuHostHelper.A02(r2);
    }

    public final void removeOnConfigurationChangedListener(C002301a r2) {
        this.mOnConfigurationChangedListeners.remove(r2);
    }

    public final void removeOnContextAvailableListener(AnonymousClass00K r3) {
        AnonymousClass00I r1 = this.mContextAwareHelper;
        C04220Ms.A0B(r3, 0);
        r1.A00.remove(r3);
    }

    public final void removeOnMultiWindowModeChangedListener(C002301a r2) {
        this.mOnMultiWindowModeChangedListeners.remove(r2);
    }

    public final void removeOnNewIntentListener(C002301a r2) {
        this.mOnNewIntentListeners.remove(r2);
    }

    public final void removeOnPictureInPictureModeChangedListener(C002301a r2) {
        this.mOnPictureInPictureModeChangedListeners.remove(r2);
    }

    public final void removeOnTrimMemoryListener(C002301a r2) {
        this.mOnTrimMemoryListeners.remove(r2);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }

    private void initViewTreeOwners() {
        C116066wM.A01(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C04220Ms.A0B(decorView, 0);
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView2 = getWindow().getDecorView();
        C04220Ms.A0B(decorView2, 0);
        decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView3 = getWindow().getDecorView();
        C04220Ms.A0B(decorView3, 0);
        decorView3.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView4 = getWindow().getDecorView();
        C04220Ms.A0B(decorView4, 0);
        decorView4.setTag(R.id.report_drawn, this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.DAW(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public final AnonymousClass00R getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public C40958Lsx getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    public Object getLastCustomNonConfigurationInstance() {
        getLastNonConfigurationInstance();
        return null;
    }

    public AnonymousClass062 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final AnonymousClass00F getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public AnonymousClass06B getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* renamed from: lambda$new$0$androidx-activity-ComponentActivity  reason: not valid java name */
    public /* synthetic */ Unit m0lambda$new$0$androidxactivityComponentActivity() {
        reportFullyDrawn();
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            ((C002301a) it.next()).accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(950917542);
        this.mSavedStateRegistryController.A01(bundle);
        AnonymousClass00I r0 = this.mContextAwareHelper;
        r0.A01 = this;
        for (AnonymousClass00K Bs5 : r0.A00) {
            Bs5.Bs5(this);
        }
        super.onCreate(bundle);
        C86234wi.A00(this);
        if (C120447Av.A01()) {
            this.mOnBackPressedDispatcher.A04(AnonymousClass007.A00(this));
        }
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
        C14030oh.A07(-1508650169, A00);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.A03(menuItem);
        }
        return false;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            ((C002301a) it.next()).accept(intent);
        }
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            ((C002301a) it.next()).accept(Integer.valueOf(i));
        }
    }

    public void reportFullyDrawn() {
        try {
            if (AnonymousClass07B.A00()) {
                AnonymousClass07C.A01("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.A00();
        } finally {
            AnonymousClass07C.A00();
        }
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.DAW(getWindow().getDecorView());
        super.setContentView(i);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void addMenuProvider(AnonymousClass02V r7, AnonymousClass066 r8, AnonymousClass061 r9) {
        AnonymousClass02Q r5 = this.mMenuHostHelper;
        AnonymousClass062 lifecycle = r8.getLifecycle();
        Map map = r5.A01;
        AnonymousClass02P r2 = (AnonymousClass02P) map.remove(r7);
        if (r2 != null) {
            r2.A01.A08(r2.A00);
            r2.A00 = null;
        }
        map.put(r7, new AnonymousClass02P(lifecycle, new MenuHostHelper$$ExternalSyntheticLambda1(r5, r7, r9)));
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                ((C002301a) it.next()).accept(new AnonymousClass3SD(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                ((C002301a) it.next()).accept(new AnonymousClass3SE(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final AnonymousClass00O registerForActivityResult(AnonymousClass00X r2, AnonymousClass00M r3) {
        return registerForActivityResult(r2, this.mActivityResultRegistry, r3);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.DAW(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new AnonymousClass00I();
        this.mMenuHostHelper = new AnonymousClass02Q(new AnonymousClass002(this));
        this.mLifecycleRegistry = new C14340pE(this);
        AnonymousClass072 r2 = new AnonymousClass072(this);
        this.mSavedStateRegistryController = r2;
        this.mOnBackPressedDispatcher = new AnonymousClass00F(new AnonymousClass003(this));
        AnonymousClass096 r4 = new AnonymousClass096(this);
        this.mReportFullyDrawnExecutor = r4;
        this.mFullyDrawnReporter = new C40958Lsx(r4, new IDxObjectShape235S0100000_I2(this, 0));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new AnonymousClass098(this);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        C14340pE r1 = this.mLifecycleRegistry;
        if (r1 != null) {
            r1.A07(new C14260p5() {
                public final void CMI(AnonymousClass060 r2, AnonymousClass066 r3) {
                    Window window;
                    View peekDecorView;
                    if (r2 == AnonymousClass060.ON_STOP && (window = ComponentActivity.this.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            });
            this.mLifecycleRegistry.A07(new C14260p5() {
                public final void CMI(AnonymousClass060 r4, AnonymousClass066 r5) {
                    if (r4 == AnonymousClass060.ON_DESTROY) {
                        ComponentActivity componentActivity = ComponentActivity.this;
                        componentActivity.mContextAwareHelper.A01 = null;
                        if (!componentActivity.isChangingConfigurations()) {
                            componentActivity.getViewModelStore().A00();
                        }
                        componentActivity.mReportFullyDrawnExecutor.A5H();
                    }
                }
            });
            this.mLifecycleRegistry.A07(new C14260p5() {
                public final void CMI(AnonymousClass060 r2, AnonymousClass066 r3) {
                    ComponentActivity componentActivity = ComponentActivity.this;
                    componentActivity.ensureViewModelStore();
                    componentActivity.getLifecycle().A08(this);
                }
            });
            r2.A00();
            AnonymousClass7GW.A02(this);
            this.mSavedStateRegistryController.A01.A03(new IDxSProviderShape514S0100000_I2(this, 0), ACTIVITY_RESULT_TAG);
            addOnContextAvailableListener(new AnonymousClass09A(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void addMenuProvider(AnonymousClass02V r7, AnonymousClass066 r8) {
        AnonymousClass02Q r5 = this.mMenuHostHelper;
        r5.A02.add(r7);
        r5.A00.run();
        AnonymousClass062 lifecycle = r8.getLifecycle();
        Map map = r5.A01;
        AnonymousClass02P r2 = (AnonymousClass02P) map.remove(r7);
        if (r2 != null) {
            r2.A01.A08(r2.A00);
            r2.A00 = null;
        }
        map.put(r7, new AnonymousClass02P(lifecycle, new MenuHostHelper$$ExternalSyntheticLambda0(r5, r7)));
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.DAW(getWindow().getDecorView());
        super.setContentView(view);
    }
}
