package X;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.ComposeView;
import java.lang.ref.WeakReference;

/* renamed from: X.50n  reason: invalid class name and case insensitive filesystem */
public abstract class C871950n extends ViewGroup {
    public C115506vH A00;
    public WeakReference A01;
    public IBinder A02;
    public C146068la A03;
    public AnonymousClass0ZU A04 = AnonymousClass7YZ.A00.BQf(this);
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public void A04(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public void A06(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public abstract boolean getShouldCreateCompositionOnAttachedToWindow();

    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setViewCompositionStrategy(C146888n2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass0ZU r0 = this.A04;
        if (r0 != null) {
            r0.invoke();
        }
        this.A04 = r2.BQf(this);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    private final void A00() {
        if (!this.A05) {
            throw C86134wK.A0s(AnonymousClass00U.A0V("Cannot add views to ", C18210wN.A0e(this), "; only Compose content is supported"));
        }
    }

    private final void A01(C115506vH r3) {
        if ((!(r3 instanceof Recomposer) || ((AnonymousClass68B) ((Recomposer) r3).A0H.getValue()).compareTo(AnonymousClass68B.ShuttingDown) > 0) && r3 != null) {
            this.A01 = C86144wL.A0w(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        r0 = r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r0 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        r10 = (X.C115506vH) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r10 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r0 = r10 instanceof androidx.compose.runtime.Recomposer;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r0 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        r0 = ((X.AnonymousClass68B) ((androidx.compose.runtime.Recomposer) r10).A0H.getValue()).compareTo(X.AnonymousClass68B.A06);
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r0 <= 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r13.isAttachedToWindow() == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r8 = r13;
        r0 = r13.getParent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        if ((r0 instanceof android.view.View) == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        r3 = (android.view.View) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (r3.getId() == 16908290) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        r0 = r3.getParent();
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        r10 = X.C1188172j.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        if (r10 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        r3 = X.AnonymousClass869.A00;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        if (r3.AOA(X.C148798sC.A00) == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (r3.AOA(X.C148808sD.A00) != null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r0 = (X.C27952Ew2) X.AnonymousClass8bZ.A0B.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r5 = r0.CWl(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b4, code lost:
        r0 = (X.C148808sD) r5.AOA(X.C148808sD.A00);
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        if (r0 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bf, code lost:
        r9 = new androidx.compose.runtime.PausableMonotonicFrameClock(r0);
        r0 = r9.A00;
        r1 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ca, code lost:
        r0 = (X.C27952Ew2) X.AnonymousClass8bZ.A0A.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d2, code lost:
        if (r0 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d4, code lost:
        r0 = X.C18180wK.A0a("no AndroidUiDispatcher for this thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r0.A02 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00df, code lost:
        r11 = X.C86144wL.A17();
        r1 = (X.C148818sE) r5.AOA(X.C148818sE.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00eb, code lost:
        if (r1 != null) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ed, code lost:
        r1 = new X.C123347Wo();
        r11.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f4, code lost:
        if (r9 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f6, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fa, code lost:
        if ((r10 instanceof androidx.compose.runtime.Recomposer) == false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fc, code lost:
        r10 = (androidx.compose.runtime.Recomposer) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ff, code lost:
        r0 = r5.CWl(r3).CWl(r1);
        r10 = new androidx.compose.runtime.Recomposer(r0);
        r12 = X.AnonymousClass7Ja.A03(r0);
        r0 = X.C116066wM.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0116, code lost:
        if (r0 == null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0118, code lost:
        r1 = r0.getLifecycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011c, code lost:
        if (r1 == null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011e, code lost:
        r8.addOnAttachStateChangeListener(new com.facebook.redex.IDxCListenerShape201S0200000_2_I2(1, r8, r10));
        r1.A07(new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2(r8, r9, r10, r11, r12));
        r8.setTag(com.instagram.barcelona.R.id.androidx_compose_ui_view_composition_context, r10);
        r7 = X.C73874Uq.A00;
        r3 = r8.getHandler();
        X.C04220Ms.A06(r3);
        r8.addOnAttachStateChangeListener(new com.facebook.redex.IDxCListenerShape465S0100000_2_I2(X.C25237DiI.A00((java.lang.Integer) null, new X.C141458be(r3, "windowRecomposer cleanup", false).A01, new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2((java.lang.Object) r10, (java.lang.Object) r8, (X.C146958n9) null, 27), r7, 2), 2));
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0163, code lost:
        r0 = X.C18180wK.A0a(X.AnonymousClass0wJ.A0t("ViewTreeLifecycleOwner not found from ", r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016e, code lost:
        r0 = X.C18180wK.A0a("root viewTreeParentCompositionContext is not a Recomposer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0175, code lost:
        r1 = X.C18190wL.A0s("Cannot locate windowRecomposer; View ");
        r1.append(r13);
        r0 = X.C18180wK.A0a(X.C18180wK.A0i(" is not attached to a window", r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C871950n r13) {
        /*
            X.8la r0 = r13.A03
            if (r0 != 0) goto L_0x018f
            r2 = 0
            r4 = 1
            r13.A05 = r4     // Catch:{ all -> 0x0189 }
            X.6vH r10 = r13.A00     // Catch:{ all -> 0x0189 }
            if (r10 != 0) goto L_0x004b
            X.6vH r10 = X.C1188172j.A00(r13)     // Catch:{ all -> 0x0189 }
            if (r10 != 0) goto L_0x015b
            android.view.ViewParent r1 = r13.getParent()     // Catch:{ all -> 0x0189 }
        L_0x0016:
            boolean r0 = r1 instanceof android.view.View     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0028
            r0 = r1
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0189 }
            X.6vH r10 = X.C1188172j.A00(r0)     // Catch:{ all -> 0x0189 }
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ all -> 0x0189 }
            if (r10 != 0) goto L_0x015b
            goto L_0x0016
        L_0x0028:
            java.lang.ref.WeakReference r0 = r13.A01     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0064
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x0189 }
            X.6vH r10 = (X.C115506vH) r10     // Catch:{ all -> 0x0189 }
            if (r10 == 0) goto L_0x0064
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x004b
            r0 = r10
            androidx.compose.runtime.Recomposer r0 = (androidx.compose.runtime.Recomposer) r0     // Catch:{ all -> 0x0189 }
            X.4wE r0 = r0.A0H     // Catch:{ all -> 0x0189 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0189 }
            X.68B r1 = (X.AnonymousClass68B) r1     // Catch:{ all -> 0x0189 }
            X.68B r0 = X.AnonymousClass68B.ShuttingDown     // Catch:{ all -> 0x0189 }
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x0189 }
            if (r0 <= 0) goto L_0x0064
        L_0x004b:
            r0 = 21
            kotlin.jvm.internal.KtLambdaShape167S0100000_I2 r3 = X.C86164wN.A0u(r13, r0)     // Catch:{ all -> 0x0189 }
            r1 = -656146368(0xffffffffd8e40040, float:-2.0055178E15)
            r0 = 2
            X.C04220Ms.A0B(r3, r0)     // Catch:{ all -> 0x0189 }
            X.7WY r0 = X.AnonymousClass7WY.A01(r3, r1, r4)     // Catch:{ all -> 0x0189 }
            X.8la r0 = X.C1188272k.A00(r10, r13, r0)     // Catch:{ all -> 0x0189 }
            r13.A03 = r0     // Catch:{ all -> 0x0189 }
            goto L_0x018d
        L_0x0064:
            boolean r0 = r13.isAttachedToWindow()     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0175
            r8 = r13
            android.view.ViewParent r0 = r13.getParent()     // Catch:{ all -> 0x0189 }
        L_0x006f:
            boolean r1 = r0 instanceof android.view.View     // Catch:{ all -> 0x0189 }
            if (r1 == 0) goto L_0x0085
            r3 = r0
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x0189 }
            int r1 = r3.getId()     // Catch:{ all -> 0x0189 }
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 == r0) goto L_0x0085
            android.view.ViewParent r0 = r3.getParent()     // Catch:{ all -> 0x0189 }
            r8 = r3
            goto L_0x006f
        L_0x0085:
            X.6vH r10 = X.C1188172j.A00(r8)     // Catch:{ all -> 0x0189 }
            if (r10 != 0) goto L_0x00f8
            X.869 r3 = X.AnonymousClass869.A00     // Catch:{ all -> 0x0189 }
            r5 = r3
            X.866 r0 = X.C148798sC.A00     // Catch:{ all -> 0x0189 }
            X.8sH r0 = r3.AOA(r0)     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x009e
            X.863 r0 = X.C148808sD.A00     // Catch:{ all -> 0x0189 }
            X.8sH r0 = r3.AOA(r0)     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x00b4
        L_0x009e:
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0189 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0189 }
            if (r1 != r0) goto L_0x00ca
            X.0Oa r0 = X.AnonymousClass8bZ.A0B     // Catch:{ all -> 0x0189 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0189 }
            X.Ew2 r0 = (X.C27952Ew2) r0     // Catch:{ all -> 0x0189 }
        L_0x00b0:
            X.Ew2 r5 = r0.CWl(r3)     // Catch:{ all -> 0x0189 }
        L_0x00b4:
            X.863 r0 = X.C148808sD.A00     // Catch:{ all -> 0x0189 }
            X.8sH r0 = r5.AOA(r0)     // Catch:{ all -> 0x0189 }
            X.8sD r0 = (X.C148808sD) r0     // Catch:{ all -> 0x0189 }
            r9 = 0
            if (r0 == 0) goto L_0x00df
            androidx.compose.runtime.PausableMonotonicFrameClock r9 = new androidx.compose.runtime.PausableMonotonicFrameClock     // Catch:{ all -> 0x0189 }
            r9.<init>(r0)     // Catch:{ all -> 0x0189 }
            X.6kK r0 = r9.A00     // Catch:{ all -> 0x0189 }
            java.lang.Object r1 = r0.A03     // Catch:{ all -> 0x0189 }
            monitor-enter(r1)     // Catch:{ all -> 0x0189 }
            goto L_0x00dc
        L_0x00ca:
            java.lang.ThreadLocal r0 = X.AnonymousClass8bZ.A0A     // Catch:{ all -> 0x0189 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0189 }
            X.Ew2 r0 = (X.C27952Ew2) r0     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x00b0
            java.lang.String r0 = "no AndroidUiDispatcher for this thread"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x0189 }
            goto L_0x0188
        L_0x00dc:
            r0.A02 = r2     // Catch:{ all -> 0x0160 }
            monitor-exit(r1)     // Catch:{ all -> 0x0189 }
        L_0x00df:
            X.0MJ r11 = X.C86144wL.A17()     // Catch:{ all -> 0x0189 }
            X.864 r0 = X.C148818sE.A00     // Catch:{ all -> 0x0189 }
            X.8sH r1 = r5.AOA(r0)     // Catch:{ all -> 0x0189 }
            X.8sE r1 = (X.C148818sE) r1     // Catch:{ all -> 0x0189 }
            if (r1 != 0) goto L_0x00f4
            X.7Wo r1 = new X.7Wo     // Catch:{ all -> 0x0189 }
            r1.<init>()     // Catch:{ all -> 0x0189 }
            r11.A00 = r1     // Catch:{ all -> 0x0189 }
        L_0x00f4:
            if (r9 == 0) goto L_0x00ff
            r3 = r9
            goto L_0x00ff
        L_0x00f8:
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x016e
            androidx.compose.runtime.Recomposer r10 = (androidx.compose.runtime.Recomposer) r10     // Catch:{ all -> 0x0189 }
            goto L_0x015b
        L_0x00ff:
            X.Ew2 r3 = (X.C27952Ew2) r3     // Catch:{ all -> 0x0189 }
            X.Ew2 r0 = r5.CWl(r3)     // Catch:{ all -> 0x0189 }
            X.Ew2 r0 = r0.CWl(r1)     // Catch:{ all -> 0x0189 }
            androidx.compose.runtime.Recomposer r10 = new androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x0189 }
            r10.<init>(r0)     // Catch:{ all -> 0x0189 }
            X.4qz r12 = X.AnonymousClass7Ja.A03(r0)     // Catch:{ all -> 0x0189 }
            X.066 r0 = X.C116066wM.A00(r8)     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0163
            X.062 r1 = r0.getLifecycle()     // Catch:{ all -> 0x0189 }
            if (r1 == 0) goto L_0x0163
            com.facebook.redex.IDxCListenerShape201S0200000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape201S0200000_2_I2     // Catch:{ all -> 0x0189 }
            r0.<init>(r4, r8, r10)     // Catch:{ all -> 0x0189 }
            r8.addOnAttachStateChangeListener(r0)     // Catch:{ all -> 0x0189 }
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2     // Catch:{ all -> 0x0189 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0189 }
            r1.A07(r7)     // Catch:{ all -> 0x0189 }
            r0 = 2131296831(0x7f09023f, float:1.821159E38)
            r8.setTag(r0, r10)     // Catch:{ all -> 0x0189 }
            X.4Uq r7 = X.C73874Uq.A00     // Catch:{ all -> 0x0189 }
            android.os.Handler r3 = r8.getHandler()     // Catch:{ all -> 0x0189 }
            X.C04220Ms.A06(r3)     // Catch:{ all -> 0x0189 }
            java.lang.String r1 = "windowRecomposer cleanup"
            X.8be r0 = new X.8be     // Catch:{ all -> 0x0189 }
            r0.<init>(r3, r1, r2)     // Catch:{ all -> 0x0189 }
            X.8be r6 = r0.A01     // Catch:{ all -> 0x0189 }
            r5 = 0
            r1 = 27
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2     // Catch:{ all -> 0x0189 }
            r0.<init>((java.lang.Object) r10, (java.lang.Object) r8, (X.C146958n9) r5, (int) r1)     // Catch:{ all -> 0x0189 }
            r3 = 2
            X.8sG r1 = X.C25237DiI.A00(r5, r6, r0, r7, r3)     // Catch:{ all -> 0x0189 }
            com.facebook.redex.IDxCListenerShape465S0100000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape465S0100000_2_I2     // Catch:{ all -> 0x0189 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0189 }
            r8.addOnAttachStateChangeListener(r0)     // Catch:{ all -> 0x0189 }
        L_0x015b:
            r13.A01(r10)     // Catch:{ all -> 0x0189 }
            goto L_0x004b
        L_0x0160:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0189 }
            goto L_0x0188
        L_0x0163:
            java.lang.String r0 = "ViewTreeLifecycleOwner not found from "
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r8)     // Catch:{ all -> 0x0189 }
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x0189 }
            goto L_0x0188
        L_0x016e:
            java.lang.String r0 = "root viewTreeParentCompositionContext is not a Recomposer"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x0189 }
            goto L_0x0188
        L_0x0175:
            java.lang.String r0 = "Cannot locate windowRecomposer; View "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)     // Catch:{ all -> 0x0189 }
            r1.append(r13)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = " is not attached to a window"
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)     // Catch:{ all -> 0x0189 }
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x0189 }
        L_0x0188:
            throw r0     // Catch:{ all -> 0x0189 }
        L_0x0189:
            r0 = move-exception
            r13.A05 = r2
            throw r0
        L_0x018d:
            r13.A05 = r2
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C871950n.A02(X.50n):void");
    }

    private final void setParentContext(C115506vH r3) {
        if (this.A00 != r3) {
            this.A00 = r3;
            if (r3 != null) {
                this.A01 = null;
            }
            C146068la r0 = this.A03;
            if (r0 != null) {
                r0.dispose();
                this.A03 = null;
                if (isAttachedToWindow()) {
                    A02(this);
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.A02 != iBinder) {
            this.A02 = iBinder;
            this.A01 = null;
        }
    }

    public final void A03() {
        C146068la r0 = this.A03;
        if (r0 != null) {
            r0.dispose();
        }
        this.A03 = null;
        requestLayout();
    }

    public void A05(C147188nY r4, int i) {
        if (this instanceof C877954o) {
            C877954o r2 = (C877954o) this;
            r4.Cvd(1735448596);
            ((AnonymousClass0YP) r2.A03.getValue()).invoke(r4, C18220wO.A0d());
            C147178nW AKE = r4.AKE();
            if (AKE != null) {
                C147178nW.A02(AKE, r2, i, 13);
                return;
            }
            return;
        }
        ComposeView composeView = (ComposeView) this;
        r4.Cvd(420213850);
        AnonymousClass0YP r1 = (AnonymousClass0YP) composeView.A01.getValue();
        if (r1 != null) {
            r1.invoke(r4, C18220wO.A0d());
        }
        C147178nW AKE2 = r4.AKE();
        if (AKE2 != null) {
            C147178nW.A02(AKE2, composeView, i, 12);
        }
    }

    public final boolean getHasComposition() {
        return AnonymousClass0wJ.A1W(this.A03);
    }

    public final boolean getShowLayoutBounds() {
        return this.A07;
    }

    public final boolean isTransitionGroup() {
        if (!this.A06 || super.isTransitionGroup()) {
            return true;
        }
        return false;
    }

    public final void setShowLayoutBounds(boolean z) {
        this.A07 = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((AndroidComposeView) ((C147098nO) childAt)).A0A = z;
        }
    }

    public C871950n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void addView(View view, int i, int i2) {
        A00();
        super.addView(view, i, i2);
    }

    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A00();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void onAttachedToWindow() {
        int A062 = C14030oh.A06(1154412312);
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            A02(this);
        }
        C14030oh.A0D(-2031975127, A062);
    }

    public final void onMeasure(int i, int i2) {
        A02(this);
        A04(i, i2);
    }

    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.A06 = true;
    }

    public final void setParentCompositionContext(C115506vH r1) {
        setParentContext(r1);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        A06(z, i, i2, i3, i4);
    }

    public final void addView(View view) {
        A00();
        super.addView(view);
    }

    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        A00();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public final void addView(View view, int i) {
        A00();
        super.addView(view, i);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        A00();
        super.addView(view, layoutParams);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A00();
        super.addView(view, i, layoutParams);
    }
}
