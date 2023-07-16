package androidx.fragment.app;

import X.AnonymousClass00U;
import X.AnonymousClass060;
import X.AnonymousClass061;
import X.AnonymousClass06E;
import X.AnonymousClass095;
import X.AnonymousClass0RN;
import X.C010404u;
import X.C04600Oi;
import X.C05150Rm;
import X.C12560m7;
import X.C14030oh;
import X.C14340pE;
import X.C18209Abd;
import X.C41666MXm;
import X.C41667MXn;
import X.F6X;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.facebook.redex.IDxConsumerShape516S0100000_I2;
import com.facebook.redex.IDxSProviderShape514S0100000_I2;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity extends ComponentActivity implements C41666MXm, C41667MXn {
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final C14340pE mFragmentLifecycleRegistry = new C14340pE(this);
    public final C010404u mFragments = new C010404u(new C05150Rm(this));
    public boolean mResumed;
    public boolean mStopped = true;

    public void onAttachFragment(Fragment fragment) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        IntentSender intentSender2 = intentSender;
        int i5 = i;
        Intent intent2 = intent;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        Bundle bundle2 = bundle;
        if (i5 == -1) {
            startIntentSenderForResult(intentSender2, -1, intent2, i6, i7, i8, bundle2);
        } else {
            fragment.startIntentSenderForResult(intentSender2, i5, intent2, i6, i7, i8, bundle2);
        }
    }

    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public static boolean markState(C12560m7 r4, AnonymousClass061 r5) {
        boolean z = false;
        for (Fragment fragment : r4.A0T.A04()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), r5);
                }
                AnonymousClass0RN r0 = fragment.mViewLifecycleOwner;
                if (r0 != null) {
                    r0.A00();
                    if (r0.A00.A00.A00(AnonymousClass061.STARTED)) {
                        fragment.mViewLifecycleOwner.A00.A0A(r5);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.A00.A00(AnonymousClass061.STARTED)) {
                    fragment.mLifecycleRegistry.A0A(r5);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.A00.A03.A0R.onCreateView(view, str, context, attributeSet);
    }

    public C12560m7 getSupportFragmentManager() {
        return this.mFragments.A00.A03;
    }

    /* renamed from: lambda$init$1$androidx-fragment-app-FragmentActivity  reason: not valid java name */
    public /* synthetic */ void m4lambda$init$1$androidxfragmentappFragmentActivity(Configuration configuration) {
        this.mFragments.A00.A03.A0c();
    }

    /* renamed from: lambda$init$2$androidx-fragment-app-FragmentActivity  reason: not valid java name */
    public /* synthetic */ void m5lambda$init$2$androidxfragmentappFragmentActivity(Intent intent) {
        this.mFragments.A00.A03.A0c();
    }

    /* renamed from: lambda$init$3$androidx-fragment-app-FragmentActivity  reason: not valid java name */
    public /* synthetic */ void m6lambda$init$3$androidxfragmentappFragmentActivity(Context context) {
        C04600Oi r1 = this.mFragments.A00;
        r1.A03.A0q((Fragment) null, r1, r1);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(this.mFragments.A00.A03, AnonymousClass061.CREATED));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.A00.A03.A0c();
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.A00.A03.A0c();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.A09(AnonymousClass060.ON_RESUME);
        this.mFragments.A00.A03.A0Y();
    }

    public void onStateNotSaved() {
        this.mFragments.A00.A03.A0c();
    }

    public FragmentActivity(int i) {
        super(i);
        init();
    }

    private void init() {
        getSavedStateRegistry().A03(new IDxSProviderShape514S0100000_I2(this, 1), LIFECYCLE_TAG);
        addOnConfigurationChangedListener(new IDxConsumerShape516S0100000_I2(this, 1));
        addOnNewIntentListener(new IDxConsumerShape516S0100000_I2(this, 0));
        addOnContextAvailableListener(new AnonymousClass095(this));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!androidx.core.app.ComponentActivity.shouldSkipDump(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String A0L = AnonymousClass00U.A0L(str, "  ");
            printWriter.print(A0L);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                AnonymousClass06E.A00(this).A06(A0L, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.A00.A03.A13(str, fileDescriptor, printWriter, strArr);
        }
    }

    public AnonymousClass06E getSupportLoaderManager() {
        return AnonymousClass06E.A00(this);
    }

    /* renamed from: lambda$init$0$androidx-fragment-app-FragmentActivity  reason: not valid java name */
    public /* synthetic */ Bundle m3lambda$init$0$androidxfragmentappFragmentActivity() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.A09(AnonymousClass060.ON_STOP);
        return new Bundle();
    }

    public void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(-1607969077);
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.A09(AnonymousClass060.ON_CREATE);
        this.mFragments.A00.A03.A0W();
        C14030oh.A07(-31364971, A00);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    public void onDestroy() {
        int A00 = C14030oh.A00(-657998352);
        super.onDestroy();
        this.mFragments.A00.A03.A0X();
        this.mFragmentLifecycleRegistry.A09(AnonymousClass060.ON_DESTROY);
        C14030oh.A07(878966625, A00);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.A00.A03.A19(menuItem);
        }
        return false;
    }

    public void onPause() {
        int A00 = C14030oh.A00(1017292864);
        super.onPause();
        this.mResumed = false;
        C12560m7.A09(this.mFragments.A00.A03, 5);
        this.mFragmentLifecycleRegistry.A09(AnonymousClass060.ON_PAUSE);
        C14030oh.A07(1576098307, A00);
    }

    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    public void onResume() {
        int A00 = C14030oh.A00(561736250);
        this.mFragments.A00.A03.A0c();
        super.onResume();
        this.mResumed = true;
        this.mFragments.A00.A03.A14(true);
        C14030oh.A07(-1018825767, A00);
    }

    public void onStart() {
        int A00 = C14030oh.A00(1455024966);
        this.mFragments.A00.A03.A0c();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.A00.A03.A0V();
        }
        this.mFragments.A00.A03.A14(true);
        this.mFragmentLifecycleRegistry.A09(AnonymousClass060.ON_START);
        this.mFragments.A00.A03.A0Z();
        C14030oh.A07(-2036869785, A00);
    }

    public void onStop() {
        int A00 = C14030oh.A00(1355157239);
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.A00.A03.A0a();
        this.mFragmentLifecycleRegistry.A09(AnonymousClass060.ON_STOP);
        C14030oh.A07(853652186, A00);
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    public void setEnterSharedElementCallback(C18209Abd abd) {
        F6X.A02(this, abd);
    }

    public void setExitSharedElementCallback(C18209Abd abd) {
        F6X.A03(this, abd);
    }

    public FragmentActivity() {
        init();
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }
}
