package androidx.compose.ui.platform;

import X.AnonymousClass00J;
import X.AnonymousClass0YM;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass50w;
import X.AnonymousClass54T;
import X.AnonymousClass69J;
import X.AnonymousClass6ET;
import X.AnonymousClass77Z;
import X.AnonymousClass79M;
import X.AnonymousClass7AW;
import X.AnonymousClass7Ap;
import X.AnonymousClass7F6;
import X.AnonymousClass7HT;
import X.AnonymousClass7KC;
import X.AnonymousClass7Rx;
import X.AnonymousClass7Y3;
import X.C001000m;
import X.C002100y;
import X.C003201n;
import X.C008703u;
import X.C04220Ms;
import X.C103976b2;
import X.C103986b3;
import X.C106846fi;
import X.C108576ia;
import X.C110546lr;
import X.C111666o7;
import X.C112326pO;
import X.C115946wA;
import X.C122417Ry;
import X.C134747yH;
import X.C134887yX;
import X.C135077yq;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18240wQ;
import X.C27443EnZ;
import X.C28174Ezk;
import X.C86064wD;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import X.C86154wM;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.common.dextricks.Constants;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxCListenerShape465S0100000_2_I2;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

public final class AndroidComposeViewAccessibilityDelegateCompat extends C003201n {
    public static final int[] A0R;
    public int A00;
    public int A01;
    public int A02 = Process.WAIT_RESULT_TIMEOUT;
    public C001000m A03;
    public C002100y A04;
    public C002100y A05;
    public C110546lr A06;
    public C108576ia A07;
    public Integer A08;
    public HashMap A09;
    public HashMap A0A;
    public List A0B;
    public Map A0C;
    public boolean A0D;
    public boolean A0E;
    public C008703u A0F;
    public Map A0G;
    public final Handler A0H;
    public final AccessibilityManager.AccessibilityStateChangeListener A0I;
    public final AccessibilityManager.TouchExplorationStateChangeListener A0J;
    public final AccessibilityManager A0K;
    public final C001000m A0L;
    public final AndroidComposeView A0M;
    public final Runnable A0N;
    public final List A0O;
    public final AnonymousClass0YY A0P;
    public final C86064wD A0Q;

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.A0M = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        C04220Ms.A0C(systemService, C28174Ezk.A00(37));
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.A0K = accessibilityManager;
        this.A0I = new AnonymousClass7Rx(this);
        this.A0J = new C122417Ry(this);
        this.A0B = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.A0H = AnonymousClass0wJ.A0F();
        this.A0F = new C008703u(new AnonymousClass50w(this));
        this.A01 = Process.WAIT_RESULT_TIMEOUT;
        this.A04 = new C002100y();
        this.A05 = new C002100y();
        this.A00 = -1;
        this.A0L = new C001000m(0);
        this.A0Q = new C27443EnZ();
        this.A0E = true;
        this.A0G = AnonymousClass4WJ.A0A();
        this.A03 = new C001000m(0);
        this.A0A = AnonymousClass0wJ.A0y();
        this.A09 = AnonymousClass0wJ.A0y();
        this.A0C = C18220wO.A0y();
        this.A07 = new C108576ia(androidComposeView.A0i.A00(), AnonymousClass4WJ.A0A());
        androidComposeView.addOnAttachStateChangeListener(new IDxCListenerShape465S0100000_2_I2(this, 0));
        this.A0N = new C135077yq(this);
        this.A0O = AnonymousClass0wJ.A0v();
        this.A0P = C86154wM.A10(this, 42);
    }

    public static final String A04(AnonymousClass7HT r3) {
        Object A0D2;
        C134887yX r32 = r3.A05;
        AnonymousClass77Z r2 = C103986b3.A02;
        if (r32.A01(r2)) {
            return AnonymousClass6ET.A00((List) r32.A00(r2));
        }
        if (r32.A01(C103976b2.A0J)) {
            A0D2 = C115946wA.A01(r32, C103986b3.A04);
        } else {
            List list = (List) C115946wA.A01(r32, C103986b3.A0O);
            if (list == null) {
                return null;
            }
            A0D2 = AnonymousClass00J.A0D(list);
        }
        C134747yH r0 = (C134747yH) A0D2;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public static final boolean A0G(C112326pO r2, float f) {
        if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && C18240wQ.A00(r2.A01.invoke()) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return true;
        }
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || C18240wQ.A00(r2.A01.invoke()) >= C18240wQ.A00(r2.A00.invoke())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065 A[Catch:{ all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070 A[Catch:{ all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0R(X.C146958n9 r14) {
        /*
            r13 = this;
            r3 = 5
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r14)
            if (r0 == 0) goto L_0x0030
            r7 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0030
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r7.A04
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r7.A00
            r6 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r5) goto L_0x003b
            if (r1 != r6) goto L_0x0036
            java.lang.Object r4 = r7.A03
            X.Dce r4 = (X.C24944Dce) r4
            java.lang.Object r3 = r7.A02
            X.00m r3 = (X.C001000m) r3
            java.lang.Object r2 = r7.A01
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r2
            goto L_0x0059
        L_0x0030:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r7.<init>(r13, r14, r3)
            goto L_0x0015
        L_0x0036:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0a()
            throw r1
        L_0x003b:
            java.lang.Object r4 = r7.A03
            X.Dce r4 = (X.C24944Dce) r4
            java.lang.Object r3 = r7.A02
            X.00m r3 = (X.C001000m) r3
            java.lang.Object r2 = r7.A01
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r2
            goto L_0x0067
        L_0x0048:
            X.AnonymousClass0OU.A00(r0)
            r0 = 0
            X.00m r3 = new X.00m     // Catch:{ all -> 0x0123 }
            r3.<init>(r0)     // Catch:{ all -> 0x0123 }
            X.4wD r0 = r13.A0Q     // Catch:{ all -> 0x0123 }
            X.Dce r4 = r0.Ba7()     // Catch:{ all -> 0x0123 }
            r2 = r13
            goto L_0x005c
        L_0x0059:
            X.AnonymousClass0OU.A00(r0)     // Catch:{ all -> 0x0121 }
        L_0x005c:
            X.C86114wI.A1J(r2, r3, r4, r7, r5)     // Catch:{ all -> 0x0121 }
            java.lang.Object r0 = r4.A01(r7)     // Catch:{ all -> 0x0121 }
            if (r0 != r8) goto L_0x006a
            goto L_0x0117
        L_0x0067:
            X.AnonymousClass0OU.A00(r0)     // Catch:{ all -> 0x0121 }
        L_0x006a:
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0119
            r4.A00()     // Catch:{ all -> 0x0121 }
            boolean r0 = r2.A0S()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0106
            r12 = 0
            X.00m r11 = r2.A0L     // Catch:{ all -> 0x0121 }
            int r10 = r11.size()     // Catch:{ all -> 0x0121 }
        L_0x0080:
            if (r12 >= r10) goto L_0x00f6
            java.lang.Object[] r0 = r11.A02     // Catch:{ all -> 0x0121 }
            r1 = r0[r12]     // Catch:{ all -> 0x0121 }
            X.C04220Ms.A0A(r1)     // Catch:{ all -> 0x0121 }
            X.7Y3 r1 = (X.AnonymousClass7Y3) r1     // Catch:{ all -> 0x0121 }
            X.8nO r0 = r1.A0A     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00f3
            androidx.compose.ui.platform.AndroidComposeView r0 = r2.A0M     // Catch:{ all -> 0x0121 }
            X.50l r0 = r0.getAndroidViewsHandler$ui_release()     // Catch:{ all -> 0x0121 }
            java.util.HashMap r0 = r0.A01     // Catch:{ all -> 0x0121 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x00f3
            X.8pp r9 = X.AnonymousClass7FT.A01(r1)     // Catch:{ all -> 0x0121 }
            if (r9 != 0) goto L_0x00b2
            X.8Ly r0 = X.C138918Ly.A00     // Catch:{ all -> 0x0121 }
            X.7Y3 r0 = X.AnonymousClass7Ap.A00(r1, r0)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00f3
            X.8pp r9 = X.AnonymousClass7FT.A01(r0)     // Catch:{ all -> 0x0121 }
            if (r9 != 0) goto L_0x00b2
            goto L_0x00f3
        L_0x00b2:
            X.7yX r0 = X.AnonymousClass6F3.A00(r9)     // Catch:{ all -> 0x0121 }
            boolean r0 = r0.A01     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x00c9
            X.8Lx r0 = X.C138908Lx.A00     // Catch:{ all -> 0x0121 }
            X.7Y3 r0 = X.AnonymousClass7Ap.A00(r1, r0)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00c9
            X.8pp r0 = X.AnonymousClass7FT.A01(r0)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00c9
            r9 = r0
        L_0x00c9:
            X.7Y3 r0 = X.C121847Ik.A01(r9)     // Catch:{ all -> 0x0121 }
            int r1 = r0.A0W     // Catch:{ all -> 0x0121 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0121 }
            boolean r0 = r3.add(r0)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00f3
            int r9 = A00(r2, r1)     // Catch:{ all -> 0x0121 }
            r1 = 2048(0x800, float:2.87E-42)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r0) goto L_0x00f3
            boolean r0 = r2.A0S()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00f3
            android.view.accessibility.AccessibilityEvent r0 = r2.A0Q(r9, r1)     // Catch:{ all -> 0x0121 }
            r0.setContentChangeTypes(r5)     // Catch:{ all -> 0x0121 }
            A08(r0, r2)     // Catch:{ all -> 0x0121 }
        L_0x00f3:
            int r12 = r12 + 1
            goto L_0x0080
        L_0x00f6:
            r3.clear()     // Catch:{ all -> 0x0121 }
            boolean r0 = r2.A0D     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x0106
            r2.A0D = r5     // Catch:{ all -> 0x0121 }
            android.os.Handler r1 = r2.A0H     // Catch:{ all -> 0x0121 }
            java.lang.Runnable r0 = r2.A0N     // Catch:{ all -> 0x0121 }
            r1.post(r0)     // Catch:{ all -> 0x0121 }
        L_0x0106:
            X.00m r0 = r2.A0L     // Catch:{ all -> 0x0121 }
            r0.clear()     // Catch:{ all -> 0x0121 }
            r0 = 100
            X.C86114wI.A1J(r2, r3, r4, r7, r6)     // Catch:{ all -> 0x0121 }
            java.lang.Object r0 = X.AnonymousClass729.A01(r7, r0)     // Catch:{ all -> 0x0121 }
            if (r0 != r8) goto L_0x005c
            goto L_0x0118
        L_0x0117:
            return r8
        L_0x0118:
            return r8
        L_0x0119:
            X.00m r0 = r2.A0L
            r0.clear()
            kotlin.Unit r8 = kotlin.Unit.A00
            return r8
        L_0x0121:
            r1 = move-exception
            goto L_0x0125
        L_0x0123:
            r1 = move-exception
            r2 = r13
        L_0x0125:
            X.00m r0 = r2.A0L
            r0.clear()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0R(X.8n9):java.lang.Object");
    }

    public final boolean A0S() {
        if (!this.A0K.isEnabled()) {
            return false;
        }
        List list = this.A0B;
        C04220Ms.A05(list);
        return C18190wL.A1a(list);
    }

    static {
        int[] iArr = new int[32];
        System.arraycopy(new int[]{R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31}, C18200wM.A1a(new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26}, iArr) ? 1 : 0, iArr, 27, 5);
        A0R = iArr;
    }

    public static final int A00(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
        if (i == androidComposeViewAccessibilityDelegateCompat.A0M.A0i.A00().A02) {
            return -1;
        }
        return i;
    }

    public static final AccessibilityEvent A01(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, CharSequence charSequence, Integer num, Integer num2, Integer num3, int i) {
        AccessibilityEvent A0Q2 = androidComposeViewAccessibilityDelegateCompat.A0Q(i, 8192);
        if (num != null) {
            A0Q2.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            A0Q2.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            A0Q2.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            A0Q2.getText().add(charSequence);
        }
        return A0Q2;
    }

    /* JADX WARNING: type inference failed for: r1v57, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x030c, code lost:
        if (r10.A01(X.C103986b3.A0B) != false) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b7, code lost:
        if (X.AnonymousClass7Ap.A00(r3.A03, X.C138818Lo.A00) != null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x08b0, code lost:
        if (r2.isCheckable() == false) goto L_0x08b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018d, code lost:
        if (r10.A01 == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0198, code lost:
        if (r9 == 5) goto L_0x0189;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0611  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0625  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x06b5  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x07c0  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.accessibility.AccessibilityNodeInfo A02(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r25, int r26) {
        /*
            r7 = r25
            androidx.compose.ui.platform.AndroidComposeView r5 = r7.A0M
            X.6fh r0 = r5.getViewTreeOwners()
            r9 = 0
            if (r0 == 0) goto L_0x001c
            X.066 r0 = r0.A00
            X.062 r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x001c
            X.0pE r0 = (X.C14340pE) r0
            X.061 r1 = r0.A00
        L_0x0017:
            X.061 r0 = X.AnonymousClass061.DESTROYED
            if (r1 != r0) goto L_0x001e
            return r9
        L_0x001c:
            r1 = r9
            goto L_0x0017
        L_0x001e:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4 = X.C86144wL.A0L()
            java.util.Map r1 = A06(r7)
            r6 = r26
            java.lang.Integer r19 = java.lang.Integer.valueOf(r6)
            r0 = r19
            java.lang.Object r8 = r1.get(r0)
            X.6fi r8 = (X.C106846fi) r8
            if (r8 != 0) goto L_0x0037
            return r9
        L_0x0037:
            X.7HT r3 = r8.A01
            r2 = -1
            if (r6 != r2) goto L_0x019b
            android.view.ViewParent r1 = r5.getParentForAccessibility()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0047
            r9 = r1
            android.view.View r9 = (android.view.View) r9
        L_0x0047:
            r4.A07(r9)
        L_0x004a:
            r4.A01 = r6
            android.view.accessibility.AccessibilityNodeInfo r2 = r4.A02
            r2.setSource(r5, r6)
            android.graphics.Rect r8 = r8.A00
            int r0 = r8.left
            float r1 = (float) r0
            int r0 = r8.top
            float r0 = (float) r0
            long r0 = X.C86104wH.A0C(r1, r0)
            long r12 = r5.Bb1(r0)
            int r0 = r8.right
            float r1 = (float) r0
            int r0 = r8.bottom
            float r0 = (float) r0
            long r0 = X.C86104wH.A0C(r1, r0)
            long r10 = r5.Bb1(r0)
            float r0 = X.AnonymousClass7KC.A01(r12)
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            float r8 = (float) r0
            int r8 = (int) r8
            float r0 = X.AnonymousClass7KC.A02(r12)
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            float r9 = (float) r0
            int r9 = (int) r9
            float r0 = X.AnonymousClass7KC.A01(r10)
            int r1 = X.C86124wJ.A03(r0)
            float r0 = X.AnonymousClass7KC.A02(r10)
            int r0 = X.C86124wJ.A03(r0)
            android.graphics.Rect r0 = X.C86164wN.A0F(r8, r9, r1, r0)
            r2.setBoundsInScreen(r0)
            r12 = 1
            r11 = 0
            r1 = 2
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x00b9
            java.util.List r0 = r3.A0A()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00b9
            X.7Y3 r8 = r3.A03
            X.8Lo r0 = X.C138818Lo.A00
            X.7Y3 r0 = X.AnonymousClass7Ap.A00(r8, r0)
            r20 = 1
            if (r0 == 0) goto L_0x00bb
        L_0x00b9:
            r20 = 0
        L_0x00bb:
            java.lang.String r0 = "android.view.View"
            r4.A0A(r0)
            X.7yX r10 = r3.A05
            X.77Z r0 = X.C103986b3.A0J
            java.lang.Object r8 = X.C115946wA.A01(r10, r0)
            X.799 r8 = (X.AnonymousClass799) r8
            if (r8 == 0) goto L_0x00f1
            int r9 = r8.A00
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x00dc
            java.util.List r0 = r3.A0A()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00f1
        L_0x00dc:
            r0 = 4
            if (r9 != r0) goto L_0x0161
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r9 = r0.getResources()
            r0 = 2131836533(0x7f113e75, float:1.9306235E38)
        L_0x00ea:
            java.lang.String r0 = r9.getString(r0)
            r4.A0C(r0)
        L_0x00f1:
            X.77Z r14 = X.C103976b2.A0J
            boolean r0 = r10.A01(r14)
            if (r0 == 0) goto L_0x00fe
            java.lang.String r0 = "android.widget.EditText"
            r4.A0A(r0)
        L_0x00fe:
            X.7yX r9 = r3.A07()
            X.77Z r21 = X.C103986b3.A0O
            r0 = r21
            boolean r0 = r9.A01(r0)
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = "android.widget.TextView"
            r4.A0A(r0)
        L_0x0111:
            android.content.Context r18 = r5.getContext()
            java.lang.String r0 = r18.getPackageName()
            r2.setPackageName(r0)
            r2.setImportantForAccessibility(r12)
            java.util.List r17 = r3.A0A()
            int r16 = r17.size()
            r13 = 0
        L_0x0128:
            r0 = r16
            if (r13 >= r0) goto L_0x01be
            r0 = r17
            java.lang.Object r9 = r0.get(r13)
            X.7HT r9 = (X.AnonymousClass7HT) r9
            java.util.Map r15 = A06(r7)
            int r0 = r9.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r15.containsKey(r0)
            if (r0 == 0) goto L_0x0158
            X.50l r0 = r5.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.A01
            r15 = r0
            X.7Y3 r0 = r9.A03
            java.lang.Object r0 = r15.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x015b
            r2.addChild(r0)
        L_0x0158:
            int r13 = r13 + 1
            goto L_0x0128
        L_0x015b:
            int r0 = r9.A02
            r2.addChild(r5, r0)
            goto L_0x0158
        L_0x0161:
            if (r9 != r1) goto L_0x0170
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r9 = r0.getResources()
            r0 = 2131836501(0x7f113e55, float:1.930617E38)
            goto L_0x00ea
        L_0x0170:
            if (r9 != r11) goto L_0x0179
            java.lang.String r13 = "android.widget.Button"
        L_0x0174:
            r4.A0A(r13)
            goto L_0x00f1
        L_0x0179:
            if (r9 != r12) goto L_0x017e
            java.lang.String r13 = "android.widget.CheckBox"
            goto L_0x0174
        L_0x017e:
            r0 = 3
            if (r9 != r0) goto L_0x0184
            java.lang.String r13 = "android.widget.RadioButton"
            goto L_0x0174
        L_0x0184:
            r0 = 5
            if (r9 != r0) goto L_0x0190
            java.lang.String r13 = "android.widget.ImageView"
        L_0x0189:
            if (r20 != 0) goto L_0x0174
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x00f1
            goto L_0x0174
        L_0x0190:
            r0 = 6
            if (r9 != r0) goto L_0x0196
            java.lang.String r13 = "android.widget.Spinner"
            goto L_0x0174
        L_0x0196:
            r13 = 0
            r0 = 5
            if (r9 != r0) goto L_0x0174
            goto L_0x0189
        L_0x019b:
            X.7HT r0 = r3.A08()
            if (r0 == 0) goto L_0x0904
            X.7HT r0 = r3.A08()
            X.C04220Ms.A0A(r0)
            int r1 = r0.A02
            X.6o7 r0 = r5.A0i
            X.7HT r0 = r0.A00()
            int r0 = r0.A02
            if (r1 == r0) goto L_0x01b5
            r2 = r1
        L_0x01b5:
            r4.A00 = r2
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.A02
            r0.setParent(r5, r2)
            goto L_0x004a
        L_0x01be:
            int r0 = r7.A01
            if (r0 != r6) goto L_0x0839
            r2.setAccessibilityFocused(r12)
            X.03m r0 = X.C008103m.A05
        L_0x01c7:
            r4.A08(r0)
            X.8g4 r13 = r5.getFontFamilyResolver()
            X.77Z r0 = X.C103986b3.A04
            java.lang.Object r9 = X.C115946wA.A01(r10, r0)
            X.7yH r9 = (X.C134747yH) r9
            r16 = 0
            if (r9 == 0) goto L_0x0835
            X.8nV r0 = r5.A06
            android.text.SpannableString r0 = X.AnonymousClass6FX.A00(r9, r13, r0)
        L_0x01e0:
            java.lang.CharSequence r9 = A03(r0)
            r0 = r21
            java.lang.Object r0 = X.C115946wA.A01(r10, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x01fc
            java.lang.Object r15 = X.AnonymousClass00J.A0D(r0)
            X.7yH r15 = (X.C134747yH) r15
            if (r15 == 0) goto L_0x01fc
            X.8nV r0 = r5.A06
            android.text.SpannableString r16 = X.AnonymousClass6FX.A00(r15, r13, r0)
        L_0x01fc:
            java.lang.CharSequence r0 = A03(r16)
            if (r9 != 0) goto L_0x0203
            r9 = r0
        L_0x0203:
            r2.setText(r9)
            X.77Z r9 = X.C103986b3.A05
            boolean r0 = r10.A01(r9)
            if (r0 == 0) goto L_0x021a
            r2.setContentInvalid(r12)
            java.lang.Object r0 = X.C115946wA.A01(r10, r9)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setError(r0)
        L_0x021a:
            X.77Z r0 = X.C103986b3.A0M
            java.lang.Object r0 = X.C115946wA.A01(r10, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.A0D(r0)
            X.77Z r0 = X.C103986b3.A0Q
            java.lang.Object r0 = X.C115946wA.A01(r10, r0)
            X.20W r0 = (X.AnonymousClass20W) r0
            if (r0 == 0) goto L_0x0253
            r2.setCheckable(r12)
            int r0 = r0.ordinal()
            if (r0 == r11) goto L_0x081a
            if (r0 == r12) goto L_0x07ff
            if (r0 != r1) goto L_0x0253
            java.lang.CharSequence r0 = r4.A02()
            if (r0 != 0) goto L_0x0253
            r5.getContext()
            android.content.res.Resources r9 = r18.getResources()
            r0 = 2131829057(0x7f112141, float:1.9291072E38)
        L_0x024c:
            java.lang.String r0 = r9.getString(r0)
            r4.A0D(r0)
        L_0x0253:
            X.77Z r13 = X.C103986b3.A0L
            java.lang.Object r0 = X.C115946wA.A01(r10, r13)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x026b
            boolean r15 = r0.booleanValue()
            r9 = 4
            if (r8 == 0) goto L_0x07db
            int r0 = r8.A00
            if (r0 != r9) goto L_0x07db
            r2.setSelected(r15)
        L_0x026b:
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x0279
            java.util.List r0 = r3.A0A()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x028c
        L_0x0279:
            X.77Z r0 = X.C103986b3.A02
            java.lang.Object r0 = X.C115946wA.A01(r10, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x07d8
            java.lang.Object r0 = X.AnonymousClass00J.A0D(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0289:
            r4.A0B(r0)
        L_0x028c:
            X.77Z r17 = X.C103986b3.A0N
            r0 = r17
            java.lang.Object r15 = X.C115946wA.A01(r10, r0)
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L_0x02b0
            r9 = r3
        L_0x0299:
            X.7yX r8 = r9.A05
            X.77Z r0 = X.C102846Wt.A00
            boolean r16 = r8.A01(r0)
            if (r16 == 0) goto L_0x07d0
            java.lang.Object r0 = r8.A00(r0)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x02b0
            r2.setViewIdResourceName(r15)
        L_0x02b0:
            X.77Z r0 = X.C103986b3.A07
            java.lang.Object r0 = X.C115946wA.A01(r10, r0)
            if (r0 == 0) goto L_0x02bb
            r2.setHeading(r12)
        L_0x02bb:
            X.7yX r8 = r3.A07()
            X.77Z r0 = X.C103986b3.A0H
            boolean r0 = r8.A01(r0)
            r2.setPassword(r0)
            boolean r0 = r10.A01(r14)
            r2.setEditable(r0)
            boolean r0 = X.AnonymousClass7Ap.A02(r3)
            r2.setEnabled(r0)
            X.77Z r9 = X.C103986b3.A06
            boolean r0 = r10.A01(r9)
            r2.setFocusable(r0)
            boolean r0 = r2.isFocusable()
            if (r0 == 0) goto L_0x02f9
            java.lang.Object r0 = r10.A00(r9)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            r2.setFocused(r0)
            boolean r0 = r2.isFocused()
            if (r0 == 0) goto L_0x07cb
            r4.A06(r1)
        L_0x02f9:
            X.54T r0 = r3.A06()
            if (r0 == 0) goto L_0x0305
            boolean r0 = r0.A0X()
            if (r0 != 0) goto L_0x030e
        L_0x0305:
            X.77Z r0 = X.C103986b3.A0B
            boolean r1 = r10.A01(r0)
            r0 = 1
            if (r1 == 0) goto L_0x030f
        L_0x030e:
            r0 = 0
        L_0x030f:
            r2.setVisibleToUser(r0)
            X.77Z r0 = X.C103986b3.A0F
            java.lang.Object r0 = X.C115946wA.A01(r10, r0)
            if (r0 == 0) goto L_0x031d
            r2.setLiveRegion(r12)
        L_0x031d:
            r4.A0G(r11)
            X.77Z r0 = X.C103976b2.A07
            X.79M r8 = X.C115946wA.A00(r10, r0)
            r1 = 16
            if (r8 == 0) goto L_0x0342
            java.lang.Object r0 = X.C115946wA.A01(r10, r13)
            boolean r15 = X.C18190wL.A1Z(r0, r12)
            r0 = r15 ^ 1
            r4.A0G(r0)
            boolean r0 = X.AnonymousClass7Ap.A02(r3)
            if (r0 == 0) goto L_0x0342
            if (r15 != 0) goto L_0x0342
            X.AnonymousClass79M.A00(r8, r4, r1)
        L_0x0342:
            r2.setLongClickable(r11)
            X.77Z r0 = X.C103976b2.A08
            X.79M r1 = X.C115946wA.A00(r10, r0)
            if (r1 == 0) goto L_0x035b
            r2.setLongClickable(r12)
            boolean r0 = X.AnonymousClass7Ap.A02(r3)
            if (r0 == 0) goto L_0x035b
            r0 = 32
            X.AnonymousClass79M.A00(r1, r4, r0)
        L_0x035b:
            X.77Z r0 = X.C103976b2.A01
            X.79M r1 = X.C115946wA.A00(r10, r0)
            if (r1 == 0) goto L_0x0368
            r0 = 16384(0x4000, float:2.2959E-41)
            X.AnonymousClass79M.A00(r1, r4, r0)
        L_0x0368:
            boolean r0 = X.AnonymousClass7Ap.A02(r3)
            if (r0 == 0) goto L_0x03ac
            X.79M r1 = X.C115946wA.A00(r10, r14)
            if (r1 == 0) goto L_0x0379
            r0 = 2097152(0x200000, float:2.938736E-39)
            X.AnonymousClass79M.A00(r1, r4, r0)
        L_0x0379:
            X.77Z r0 = X.C103976b2.A03
            X.79M r1 = X.C115946wA.A00(r10, r0)
            if (r1 == 0) goto L_0x0386
            r0 = 65536(0x10000, float:9.18355E-41)
            X.AnonymousClass79M.A00(r1, r4, r0)
        L_0x0386:
            X.77Z r0 = X.C103976b2.A0D
            X.79M r8 = X.C115946wA.A00(r10, r0)
            if (r8 == 0) goto L_0x03ac
            boolean r0 = r2.isFocused()
            if (r0 == 0) goto L_0x03ac
            X.7YS r0 = r5.A0a
            android.content.ClipboardManager r0 = r0.A00
            android.content.ClipDescription r1 = r0.getPrimaryClipDescription()
            if (r1 == 0) goto L_0x03ac
            java.lang.String r0 = "text/*"
            boolean r0 = r1.hasMimeType(r0)
            if (r0 == 0) goto L_0x03ac
            r0 = 32768(0x8000, float:4.5918E-41)
            X.AnonymousClass79M.A00(r8, r4, r0)
        L_0x03ac:
            java.lang.String r0 = A04(r3)
            if (r0 == 0) goto L_0x043e
            int r0 = r0.length()
            if (r0 == 0) goto L_0x043e
            X.77Z r8 = X.C103986b3.A02
            boolean r0 = r10.A01(r8)
            if (r0 != 0) goto L_0x07c7
            X.77Z r1 = X.C103986b3.A0P
            boolean r0 = r10.A01(r1)
            if (r0 == 0) goto L_0x07c7
            java.lang.Object r0 = r10.A00(r1)
            X.7Ia r0 = (X.C121767Ia) r0
            long r0 = r0.A00
            int r15 = X.C86104wH.A07(r0)
        L_0x03d4:
            boolean r0 = r10.A01(r8)
            if (r0 != 0) goto L_0x07c3
            X.77Z r1 = X.C103986b3.A0P
            boolean r0 = r10.A01(r1)
            if (r0 == 0) goto L_0x07c3
            java.lang.Object r0 = r10.A00(r1)
            X.7Ia r0 = (X.C121767Ia) r0
            long r0 = r0.A00
            int r0 = X.C86104wH.A08(r0)
        L_0x03ee:
            r2.setTextSelection(r15, r0)
            X.77Z r0 = X.C103976b2.A0I
            X.79M r0 = X.C115946wA.A00(r10, r0)
            r15 = 131072(0x20000, float:1.83671E-40)
            if (r0 == 0) goto L_0x07c0
            java.lang.String r1 = r0.A00
        L_0x03fd:
            X.03m r0 = new X.03m
            r0.<init>((int) r15, (java.lang.CharSequence) r1)
            r4.A08(r0)
            r0 = 256(0x100, float:3.59E-43)
            r4.A06(r0)
            r0 = 512(0x200, float:7.175E-43)
            r4.A06(r0)
            r0 = 11
            r2.setMovementGranularities(r0)
            java.lang.Object r0 = X.C115946wA.A01(r10, r8)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0422
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x043e
        L_0x0422:
            X.77Z r0 = X.C103976b2.A06
            boolean r0 = r10.A01(r0)
            if (r0 == 0) goto L_0x043e
            boolean r0 = r10.A01(r14)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            if (r0 == 0) goto L_0x0791
            java.lang.Object r0 = X.C115946wA.A01(r10, r9)
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            if (r0 != 0) goto L_0x0791
        L_0x043e:
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            java.lang.CharSequence r0 = r4.A03()
            if (r0 == 0) goto L_0x045b
            int r0 = r0.length()
            if (r0 == 0) goto L_0x045b
            X.77Z r0 = X.C103976b2.A06
            boolean r0 = r10.A01(r0)
            if (r0 == 0) goto L_0x045b
            java.lang.String r0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"
            r1.add(r0)
        L_0x045b:
            r0 = r17
            boolean r0 = r10.A01(r0)
            if (r0 == 0) goto L_0x0468
            java.lang.String r0 = "androidx.compose.ui.semantics.testTag"
            r1.add(r0)
        L_0x0468:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0471
            r2.setAvailableExtraData(r1)
        L_0x0471:
            X.77Z r0 = X.C103986b3.A0I
            java.lang.Object r1 = X.C115946wA.A01(r10, r0)
            r8 = 0
            if (r1 == 0) goto L_0x04d8
            X.77Z r9 = X.C103976b2.A0H
            boolean r0 = r10.A01(r9)
            if (r0 == 0) goto L_0x078d
            java.lang.String r0 = "android.widget.SeekBar"
        L_0x0484:
            r4.A0A(r0)
            X.79G r0 = X.AnonymousClass79G.A01
            if (r1 == r0) goto L_0x0777
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r12, r8, r8, r8)
            r2.setRangeInfo(r0)
            java.lang.CharSequence r0 = r4.A02()
            if (r0 != 0) goto L_0x04cf
            float r1 = r8 - r8
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0774
            r1 = 0
        L_0x049f:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r14 = X.AnonymousClass8bI.A01(r1, r8, r0)
            int r15 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            r1 = 0
            if (r15 == 0) goto L_0x04ba
            r1 = 100
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x04ba
            float r0 = (float) r1
            int r1 = X.AnonymousClass8bA.A03(r14, r0)
            r0 = 99
            if (r1 >= r12) goto L_0x076e
            r1 = 1
        L_0x04ba:
            r5.getContext()
            android.content.res.Resources r14 = r18.getResources()
            r0 = 2131836636(0x7f113edc, float:1.9306444E38)
            java.lang.Object[] r1 = X.C18210wN.A1X(r1)
            java.lang.String r0 = r14.getString(r0, r1)
        L_0x04cc:
            r4.A0D(r0)
        L_0x04cf:
            boolean r0 = r10.A01(r9)
            if (r0 == 0) goto L_0x04d8
            X.AnonymousClass7Ap.A02(r3)
        L_0x04d8:
            boolean r0 = X.AnonymousClass7Ap.A02(r3)
            if (r0 == 0) goto L_0x04ec
            X.77Z r0 = X.C103976b2.A0H
            X.79M r1 = X.C115946wA.A00(r10, r0)
            if (r1 == 0) goto L_0x04ec
            r0 = 16908349(0x102003d, float:2.38774E-38)
            X.AnonymousClass79M.A00(r1, r4, r0)
        L_0x04ec:
            X.7yX r0 = r3.A07()
            X.77Z r1 = X.C103986b3.A00
            java.lang.Object r0 = X.C115946wA.A01(r0, r1)
            X.6fk r0 = (X.C106866fk) r0
            if (r0 == 0) goto L_0x071a
            int r9 = r0.A01
            int r0 = r0.A00
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r9 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r9, r0, r11, r11)
        L_0x0502:
            X.03o r0 = new X.03o
            r0.<init>(r9)
            r4.A0E(r0)
        L_0x050a:
            X.7yX r9 = r3.A07()
            X.77Z r0 = X.C103986b3.A01
            X.C115946wA.A01(r9, r0)
            X.7HT r14 = r3.A08()
            if (r14 == 0) goto L_0x0539
            X.7yX r9 = r14.A07()
            X.77Z r0 = X.C103986b3.A0K
            java.lang.Object r0 = X.C115946wA.A01(r9, r0)
            if (r0 == 0) goto L_0x0539
            X.7yX r0 = r14.A07()
            java.lang.Object r9 = X.C115946wA.A01(r0, r1)
            X.6fk r9 = (X.C106866fk) r9
            if (r9 == 0) goto L_0x069a
            int r0 = r9.A01
            if (r0 < 0) goto L_0x0539
            int r0 = r9.A00
            if (r0 >= 0) goto L_0x069a
        L_0x0539:
            X.77Z r0 = X.C103986b3.A08
            java.lang.Object r13 = X.C115946wA.A01(r10, r0)
            X.6pO r13 = (X.C112326pO) r13
            X.77Z r0 = X.C103976b2.A0F
            java.lang.Object r14 = X.C115946wA.A01(r10, r0)
            if (r13 == 0) goto L_0x05ad
            if (r14 == 0) goto L_0x05ad
            X.7yX r0 = r3.A07()
            java.lang.Object r0 = X.C115946wA.A01(r0, r1)
            if (r0 != 0) goto L_0x0566
            X.7yX r9 = r3.A07()
            X.77Z r0 = X.C103986b3.A0K
            java.lang.Object r0 = X.C115946wA.A01(r9, r0)
            if (r0 != 0) goto L_0x0566
            java.lang.String r0 = "android.widget.HorizontalScrollView"
            r4.A0A(r0)
        L_0x0566:
            X.0ZU r0 = r13.A00
            java.lang.Object r0 = r0.invoke()
            float r0 = X.C18240wQ.A00(r0)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0577
            r2.setScrollable(r12)
        L_0x0577:
            boolean r0 = X.AnonymousClass7Ap.A02(r3)
            if (r0 == 0) goto L_0x05ad
            boolean r0 = A0F(r13)
            if (r0 == 0) goto L_0x0595
            X.03m r0 = X.C008103m.A0Z
            r4.A08(r0)
            X.7Y3 r0 = r3.A03
            X.69J r9 = r0.A0D
            X.69J r0 = X.AnonymousClass69J.Rtl
            if (r9 != r0) goto L_0x0696
            X.03m r0 = X.C008103m.A0a
        L_0x0592:
            r4.A08(r0)
        L_0x0595:
            boolean r0 = A0E(r13)
            if (r0 == 0) goto L_0x05ad
            X.03m r0 = X.C008103m.A0X
            r4.A08(r0)
            X.7Y3 r0 = r3.A03
            X.69J r9 = r0.A0D
            X.69J r0 = X.AnonymousClass69J.Rtl
            if (r9 != r0) goto L_0x0692
            X.03m r0 = X.C008103m.A0b
        L_0x05aa:
            r4.A08(r0)
        L_0x05ad:
            X.77Z r0 = X.C103986b3.A0R
            java.lang.Object r9 = X.C115946wA.A01(r10, r0)
            X.6pO r9 = (X.C112326pO) r9
            if (r9 == 0) goto L_0x060b
            if (r14 == 0) goto L_0x060b
            X.7yX r0 = r3.A07()
            java.lang.Object r0 = X.C115946wA.A01(r0, r1)
            if (r0 != 0) goto L_0x05d4
            X.7yX r1 = r3.A07()
            X.77Z r0 = X.C103986b3.A0K
            java.lang.Object r0 = X.C115946wA.A01(r1, r0)
            if (r0 != 0) goto L_0x05d4
            java.lang.String r0 = "android.widget.ScrollView"
            r4.A0A(r0)
        L_0x05d4:
            X.0ZU r0 = r9.A00
            java.lang.Object r0 = r0.invoke()
            float r0 = X.C18240wQ.A00(r0)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x05e5
            r2.setScrollable(r12)
        L_0x05e5:
            boolean r0 = X.AnonymousClass7Ap.A02(r3)
            if (r0 == 0) goto L_0x060b
            boolean r0 = A0F(r9)
            if (r0 == 0) goto L_0x05fb
            X.03m r0 = X.C008103m.A0Z
            r4.A08(r0)
            X.03m r0 = X.C008103m.A0Y
            r4.A08(r0)
        L_0x05fb:
            boolean r0 = A0E(r9)
            if (r0 == 0) goto L_0x060b
            X.03m r0 = X.C008103m.A0X
            r4.A08(r0)
            X.03m r0 = X.C008103m.A0d
            r4.A08(r0)
        L_0x060b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0614
            X.AnonymousClass6F5.A00(r3, r4)
        L_0x0614:
            X.77Z r0 = X.C103986b3.A0G
            java.lang.Object r0 = X.C115946wA.A01(r10, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setPaneTitle(r0)
            boolean r0 = X.AnonymousClass7Ap.A02(r3)
            if (r0 == 0) goto L_0x0893
            X.77Z r0 = X.C103976b2.A05
            X.79M r1 = X.C115946wA.A00(r10, r0)
            if (r1 == 0) goto L_0x0632
            r0 = 262144(0x40000, float:3.67342E-40)
            X.AnonymousClass79M.A00(r1, r4, r0)
        L_0x0632:
            X.77Z r0 = X.C103976b2.A00
            X.79M r1 = X.C115946wA.A00(r10, r0)
            if (r1 == 0) goto L_0x063f
            r0 = 524288(0x80000, float:7.34684E-40)
            X.AnonymousClass79M.A00(r1, r4, r0)
        L_0x063f:
            X.77Z r0 = X.C103976b2.A04
            X.79M r1 = X.C115946wA.A00(r10, r0)
            if (r1 == 0) goto L_0x064c
            r0 = 1048576(0x100000, float:1.469368E-39)
            X.AnonymousClass79M.A00(r1, r4, r0)
        L_0x064c:
            X.77Z r1 = X.C103976b2.A02
            boolean r0 = r10.A01(r1)
            if (r0 == 0) goto L_0x0893
            java.lang.Object r13 = r10.A00(r1)
            java.util.List r13 = (java.util.List) r13
            int r0 = r13.size()
            int[] r15 = A0R
            int r14 = r15.length
            if (r0 >= r14) goto L_0x087e
            X.00y r9 = new X.00y
            r9.<init>()
            java.util.LinkedHashMap r8 = X.C18220wO.A0y()
            X.00y r3 = r7.A05
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0675
            X.C002100y.A00(r3)
        L_0x0675:
            int[] r1 = r3.A02
            int r0 = r3.A00
            int r0 = X.C001400q.A00(r1, r0, r6)
            if (r0 < 0) goto L_0x086e
            java.lang.Object r16 = r3.A04(r6)
            java.util.ArrayList r12 = X.C18240wQ.A0k(r14)
            r1 = 0
        L_0x0688:
            if (r1 >= r14) goto L_0x0840
            r0 = r15[r1]
            X.C18200wM.A1U(r12, r0)
            int r1 = r1 + 1
            goto L_0x0688
        L_0x0692:
            X.03m r0 = X.C008103m.A0a
            goto L_0x05aa
        L_0x0696:
            X.03m r0 = X.C008103m.A0b
            goto L_0x0592
        L_0x069a:
            X.7yX r0 = r3.A07()
            boolean r0 = r0.A01(r13)
            if (r0 == 0) goto L_0x0539
            java.util.ArrayList r18 = X.AnonymousClass0wJ.A0v()
            java.util.List r17 = r14.A0A()
            int r14 = r17.size()
            r9 = 0
            r16 = 0
        L_0x06b3:
            if (r9 >= r14) goto L_0x06db
            r0 = r17
            java.lang.Object r15 = r0.get(r9)
            X.7HT r15 = (X.AnonymousClass7HT) r15
            X.7yX r0 = r15.A07()
            boolean r0 = r0.A01(r13)
            if (r0 == 0) goto L_0x06d8
            r0 = r18
            r0.add(r15)
            X.7Y3 r0 = r15.A03
            int r15 = r0.A03
            X.7Y3 r0 = r3.A03
            int r0 = r0.A03
            if (r15 >= r0) goto L_0x06d8
            int r16 = r16 + 1
        L_0x06d8:
            int r9 = r9 + 1
            goto L_0x06b3
        L_0x06db:
            boolean r0 = X.C18250wR.A1K(r18)
            if (r0 == 0) goto L_0x0539
            boolean r0 = X.AnonymousClass6FF.A00(r18)
            r21 = r16
            r23 = 0
            if (r0 == 0) goto L_0x06ef
            r21 = 0
            r23 = r16
        L_0x06ef:
            X.7yX r0 = r3.A07()
            X.C04220Ms.A0B(r13, r11)
            java.util.Map r0 = r0.A02
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x0702
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
        L_0x0702:
            boolean r26 = X.AnonymousClass0wJ.A1X(r0)
            r22 = r12
            r24 = r12
            r25 = r11
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r9 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r21, r22, r23, r24, r25, r26)
            X.03p r0 = new X.03p
            r0.<init>(r9)
            r4.A0F(r0)
            goto L_0x0539
        L_0x071a:
            java.util.ArrayList r17 = X.AnonymousClass0wJ.A0v()
            X.7yX r9 = r3.A07()
            X.77Z r0 = X.C103986b3.A0K
            java.lang.Object r0 = X.C115946wA.A01(r9, r0)
            if (r0 == 0) goto L_0x074f
            java.util.List r16 = r3.A0A()
            int r14 = r16.size()
            r9 = 0
        L_0x0733:
            if (r9 >= r14) goto L_0x074f
            r0 = r16
            java.lang.Object r15 = r0.get(r9)
            X.7HT r15 = (X.AnonymousClass7HT) r15
            X.7yX r0 = r15.A07()
            boolean r0 = r0.A01(r13)
            if (r0 == 0) goto L_0x074c
            r0 = r17
            r0.add(r15)
        L_0x074c:
            int r9 = r9 + 1
            goto L_0x0733
        L_0x074f:
            boolean r0 = r17.isEmpty()
            r9 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x050a
            boolean r0 = X.AnonymousClass6FF.A00(r17)
            if (r0 == 0) goto L_0x0769
            r0 = 1
            int r9 = r17.size()
        L_0x0763:
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r9 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r0, r9, r11, r11)
            goto L_0x0502
        L_0x0769:
            int r0 = r17.size()
            goto L_0x0763
        L_0x076e:
            if (r1 <= r0) goto L_0x04ba
            r1 = 99
            goto L_0x04ba
        L_0x0774:
            float r1 = r1 / r1
            goto L_0x049f
        L_0x0777:
            java.lang.CharSequence r0 = r4.A02()
            if (r0 != 0) goto L_0x04cf
            r5.getContext()
            android.content.res.Resources r1 = r18.getResources()
            r0 = 2131829005(0x7f11210d, float:1.9290967E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x04cc
        L_0x078d:
            java.lang.String r0 = "android.widget.ProgressBar"
            goto L_0x0484
        L_0x0791:
            X.7Y3 r8 = r3.A03
            X.8M1 r0 = X.AnonymousClass8M1.A00
            X.7Y3 r0 = X.AnonymousClass7Ap.A00(r8, r0)
            if (r0 == 0) goto L_0x07b3
            X.8pp r0 = X.AnonymousClass7FT.A01(r0)
            if (r0 == 0) goto L_0x043e
            X.7yX r0 = X.AnonymousClass6F3.A00(r0)
            if (r0 == 0) goto L_0x043e
            java.lang.Object r0 = X.C115946wA.A01(r0, r9)
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            if (r0 != 0) goto L_0x07b3
            goto L_0x043e
        L_0x07b3:
            int r0 = r2.getMovementGranularities()
            r0 = r0 | 4
            r0 = r0 | 16
            r2.setMovementGranularities(r0)
            goto L_0x043e
        L_0x07c0:
            r1 = 0
            goto L_0x03fd
        L_0x07c3:
            int r0 = r7.A00
            goto L_0x03ee
        L_0x07c7:
            int r15 = r7.A00
            goto L_0x03d4
        L_0x07cb:
            r4.A06(r12)
            goto L_0x02f9
        L_0x07d0:
            X.7HT r9 = r9.A08()
            if (r9 == 0) goto L_0x02b0
            goto L_0x0299
        L_0x07d8:
            r0 = 0
            goto L_0x0289
        L_0x07db:
            r2.setCheckable(r12)
            r2.setChecked(r15)
            java.lang.CharSequence r0 = r4.A02()
            if (r0 != 0) goto L_0x026b
            r5.getContext()
            android.content.res.Resources r8 = r18.getResources()
            r0 = 2131831879(0x7f112c47, float:1.9296796E38)
            if (r15 == 0) goto L_0x07f6
            r0 = 2131835429(0x7f113a25, float:1.9303996E38)
        L_0x07f6:
            java.lang.String r0 = r8.getString(r0)
            r4.A0D(r0)
            goto L_0x026b
        L_0x07ff:
            r2.setChecked(r11)
            if (r8 == 0) goto L_0x0253
            int r0 = r8.A00
            if (r0 != r1) goto L_0x0253
            java.lang.CharSequence r0 = r4.A02()
            if (r0 != 0) goto L_0x0253
            r5.getContext()
            android.content.res.Resources r9 = r18.getResources()
            r0 = 2131831950(0x7f112c8e, float:1.929694E38)
            goto L_0x024c
        L_0x081a:
            r2.setChecked(r12)
            if (r8 == 0) goto L_0x0253
            int r0 = r8.A00
            if (r0 != r1) goto L_0x0253
            java.lang.CharSequence r0 = r4.A02()
            if (r0 != 0) goto L_0x0253
            r5.getContext()
            android.content.res.Resources r9 = r18.getResources()
            r0 = 2131831986(0x7f112cb2, float:1.9297013E38)
            goto L_0x024c
        L_0x0835:
            r0 = r16
            goto L_0x01e0
        L_0x0839:
            r2.setAccessibilityFocused(r11)
            X.03m r0 = X.C008103m.A04
            goto L_0x01c7
        L_0x0840:
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            int r0 = r13.size()
            if (r11 >= r0) goto L_0x0857
            r13.get(r11)
            X.C04220Ms.A0A(r16)
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0857:
            int r0 = r1.size()
            if (r11 >= r0) goto L_0x088b
            r1.get(r11)
            java.lang.Object r0 = r12.get(r11)
            X.C86144wL.A1M(r0)
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x086e:
            int r0 = r13.size()
            if (r11 >= r0) goto L_0x088b
            r13.get(r11)
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x087e:
            java.lang.String r1 = "Can't have more than "
            java.lang.String r0 = " custom actions for one widget"
            java.lang.String r0 = X.AnonymousClass00U.A0S(r1, r0, r14)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x088b:
            X.00y r0 = r7.A04
            r0.A07(r6, r9)
            r3.A07(r6, r8)
        L_0x0893:
            java.lang.CharSequence r0 = r2.getContentDescription()
            if (r0 != 0) goto L_0x08b2
            java.lang.CharSequence r0 = r4.A03()
            if (r0 != 0) goto L_0x08b2
            java.lang.CharSequence r0 = r2.getHintText()
            if (r0 != 0) goto L_0x08b2
            java.lang.CharSequence r0 = r4.A02()
            if (r0 != 0) goto L_0x08b2
            boolean r0 = r2.isCheckable()
            r1 = 0
            if (r0 == 0) goto L_0x08b3
        L_0x08b2:
            r1 = 1
        L_0x08b3:
            boolean r0 = r10.A01
            if (r0 != 0) goto L_0x08bb
            if (r20 == 0) goto L_0x0902
            if (r1 == 0) goto L_0x0902
        L_0x08bb:
            r0 = 1
        L_0x08bc:
            r2.setScreenReaderFocusable(r0)
            java.util.HashMap r1 = r7.A0A
            r0 = r19
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x08e0
            r0 = r19
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x08da
            int r0 = r0.intValue()
            r2.setTraversalBefore(r5, r0)
        L_0x08da:
            java.lang.String r1 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"
            r0 = 0
            A07(r0, r2, r7, r1, r6)
        L_0x08e0:
            java.util.HashMap r1 = r7.A09
            r0 = r19
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0901
            r0 = r19
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x08fb
            int r0 = r0.intValue()
            r2.setTraversalAfter(r5, r0)
        L_0x08fb:
            java.lang.String r1 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"
            r0 = 0
            A07(r0, r2, r7, r1, r6)
        L_0x0901:
            return r2
        L_0x0902:
            r0 = 0
            goto L_0x08bc
        L_0x0904:
            java.lang.String r1 = "semanticsNode "
            java.lang.String r0 = " has null parent"
            java.lang.String r0 = X.AnonymousClass00U.A0S(r1, r0, r6)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, int):android.view.accessibility.AccessibilityNodeInfo");
    }

    public static final Map A06(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        AnonymousClass7HT r2;
        if (androidComposeViewAccessibilityDelegateCompat.A0E) {
            androidComposeViewAccessibilityDelegateCompat.A0E = false;
            C111666o7 r0 = androidComposeViewAccessibilityDelegateCompat.A0M.A0i;
            C04220Ms.A0B(r0, 0);
            AnonymousClass7HT A002 = r0.A00();
            LinkedHashMap A0y = C18220wO.A0y();
            AnonymousClass7Y3 r1 = A002.A03;
            if (r1.A0N && r1.A0A != null) {
                Region region = new Region();
                region.set(AnonymousClass7F6.A00(A002.A03()));
                AnonymousClass7Ap.A01(region, A002, A002, A0y);
            }
            androidComposeViewAccessibilityDelegateCompat.A0G = A0y;
            HashMap hashMap = androidComposeViewAccessibilityDelegateCompat.A0A;
            hashMap.clear();
            HashMap hashMap2 = androidComposeViewAccessibilityDelegateCompat.A09;
            hashMap2.clear();
            C106846fi r02 = (C106846fi) C18200wM.A0f(A06(androidComposeViewAccessibilityDelegateCompat), -1);
            if (r02 != null) {
                r2 = r02.A01;
            } else {
                r2 = null;
            }
            C04220Ms.A0A(r2);
            List A052 = androidComposeViewAccessibilityDelegateCompat.A05(C18200wM.A0s(r2.A09()), C18180wK.A1Z(r2.A03.A0D, AnonymousClass69J.Rtl));
            int A0B2 = C86104wH.A0B(A052);
            int i = 1;
            if (1 <= A0B2) {
                while (true) {
                    int i2 = ((AnonymousClass7HT) A052.get(i - 1)).A02;
                    int i3 = ((AnonymousClass7HT) A052.get(i)).A02;
                    Integer valueOf = Integer.valueOf(i2);
                    Integer valueOf2 = Integer.valueOf(i3);
                    hashMap.put(valueOf, valueOf2);
                    hashMap2.put(valueOf2, valueOf);
                    if (i == A0B2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A0G;
    }

    public static final void A07(Bundle bundle, AccessibilityNodeInfo accessibilityNodeInfo, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, String str, int i) {
        String str2;
        int i2;
        Object obj;
        long j;
        HashMap hashMap;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = androidComposeViewAccessibilityDelegateCompat;
        Map A062 = A06(androidComposeViewAccessibilityDelegateCompat2);
        Integer valueOf = Integer.valueOf(i);
        C106846fi r0 = (C106846fi) A062.get(valueOf);
        if (r0 != null) {
            AnonymousClass7HT r11 = r0.A01;
            String A042 = A04(r11);
            String str3 = str;
            if (C04220Ms.A0I(str3, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL")) {
                hashMap = androidComposeViewAccessibilityDelegateCompat2.A0A;
            } else if (C04220Ms.A0I(str3, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL")) {
                hashMap = androidComposeViewAccessibilityDelegateCompat2.A09;
            } else {
                C134887yX r3 = r11.A05;
                AnonymousClass77Z r4 = C103976b2.A06;
                Bundle bundle2 = bundle;
                if (!r3.A01(r4) || bundle == null || !C04220Ms.A0I(str3, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    AnonymousClass77Z r1 = C103986b3.A0N;
                    if (r3.A01(r1) && bundle != null && C04220Ms.A0I(str3, "androidx.compose.ui.semantics.testTag") && (str2 = (String) C115946wA.A01(r3, r1)) != null) {
                        accessibilityNodeInfo.getExtras().putCharSequence(str3, str2);
                        return;
                    }
                    return;
                }
                int i3 = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i4 = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i4 > 0 && i3 >= 0) {
                    if (A042 != null) {
                        i2 = A042.length();
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    if (i3 < i2) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        AnonymousClass0YY r02 = (AnonymousClass0YY) ((AnonymousClass79M) r3.A00(r4)).A01;
                        if (r02 != null) {
                            obj = r02.invoke(A0v);
                        } else {
                            obj = null;
                        }
                        if (C18190wL.A1Z(obj, true)) {
                            AnonymousClass7AW r42 = (AnonymousClass7AW) A0v.get(0);
                            ArrayList A0v2 = AnonymousClass0wJ.A0v();
                            int i5 = 0;
                            do {
                                int i6 = i3 + i5;
                                if (i6 >= r42.A04.A03.length()) {
                                    A0v2.add((Object) null);
                                } else {
                                    AnonymousClass7F6 A092 = r42.A09(i6);
                                    RectF rectF = null;
                                    AnonymousClass54T A063 = r11.A06();
                                    if (A063 == null || !A063.BRS()) {
                                        j = AnonymousClass7KC.A03;
                                    } else {
                                        j = A063.Bb0(AnonymousClass7KC.A03);
                                    }
                                    AnonymousClass7F6 A032 = A092.A03(j);
                                    AnonymousClass7F6 A033 = r11.A03();
                                    C04220Ms.A0B(A033, 0);
                                    if (A032.A02 > A033.A01 && A033.A02 > A032.A01 && A032.A00 > A033.A03 && A033.A00 > A032.A03) {
                                        AnonymousClass7F6 A043 = A032.A04(A033);
                                        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat2.A0M;
                                        long Bb1 = androidComposeView.Bb1(C86104wH.A0C(A043.A01, A043.A03));
                                        long Bb12 = androidComposeView.Bb1(C86104wH.A0C(A043.A02, A043.A00));
                                        rectF = new RectF(AnonymousClass7KC.A01(Bb1), AnonymousClass7KC.A02(Bb1), AnonymousClass7KC.A01(Bb12), AnonymousClass7KC.A02(Bb12));
                                    }
                                    A0v2.add(rectF);
                                }
                                i5++;
                            } while (i5 < i4);
                            accessibilityNodeInfo.getExtras().putParcelableArray(str3, (Parcelable[]) A0v2.toArray(new RectF[0]));
                            return;
                        }
                        return;
                    }
                }
                Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                return;
            }
            Number number = (Number) hashMap.get(valueOf);
            if (number != null) {
                accessibilityNodeInfo.getExtras().putInt(str3, number.intValue());
            }
        }
    }

    public static final void A0A(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
        C110546lr r3 = androidComposeViewAccessibilityDelegateCompat.A06;
        if (r3 != null) {
            int i2 = r3.A05.A02;
            if (i != i2) {
                return;
            }
            if (SystemClock.uptimeMillis() - r3.A04 <= 1000) {
                AccessibilityEvent A0Q2 = androidComposeViewAccessibilityDelegateCompat.A0Q(A00(androidComposeViewAccessibilityDelegateCompat, i2), Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
                A0Q2.setFromIndex(r3.A01);
                A0Q2.setToIndex(r3.A03);
                A0Q2.setAction(r3.A00);
                A0Q2.setMovementGranularity(r3.A02);
                A0Q2.getText().add(A04(r3.A05));
                A08(A0Q2, androidComposeViewAccessibilityDelegateCompat);
            }
        }
        androidComposeViewAccessibilityDelegateCompat.A06 = null;
    }

    public static final boolean A0D(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, AnonymousClass7HT r7, int i, int i2, boolean z) {
        String A042;
        Integer num;
        C134887yX r2 = r7.A05;
        AnonymousClass77Z r1 = C103976b2.A0I;
        boolean z2 = false;
        if (!r2.A01(r1) || !AnonymousClass7Ap.A02(r7)) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = androidComposeViewAccessibilityDelegateCompat;
            if ((i == i2 && i2 == androidComposeViewAccessibilityDelegateCompat.A00) || (A042 = A04(r7)) == null) {
                return false;
            }
            if (i < 0 || i != i2 || i2 > A042.length()) {
                i = -1;
            }
            androidComposeViewAccessibilityDelegateCompat2.A00 = i;
            int length = A042.length();
            if (length > 0) {
                z2 = true;
            }
            int i3 = r7.A02;
            int A002 = A00(androidComposeViewAccessibilityDelegateCompat2, i3);
            Integer num2 = null;
            if (z2) {
                num = Integer.valueOf(androidComposeViewAccessibilityDelegateCompat2.A00);
                num2 = Integer.valueOf(length);
            } else {
                num = null;
            }
            A08(A01(androidComposeViewAccessibilityDelegateCompat2, A042, num, num, num2, A002), androidComposeViewAccessibilityDelegateCompat2);
            A0A(androidComposeViewAccessibilityDelegateCompat2, i3);
            return true;
        }
        AnonymousClass0YM r3 = (AnonymousClass0YM) ((AnonymousClass79M) r2.A00(r1)).A01;
        if (r3 != null) {
            return AnonymousClass0wJ.A1X(r3.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z)));
        }
        return false;
    }

    public static final boolean A0E(C112326pO r3) {
        AnonymousClass0ZU r2 = r3.A01;
        if (C18240wQ.A00(r2.invoke()) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && !r3.A02) {
            return true;
        }
        if (C18240wQ.A00(r2.invoke()) >= C18240wQ.A00(r3.A00.invoke()) || !r3.A02) {
            return false;
        }
        return true;
    }

    public static final boolean A0F(C112326pO r3) {
        AnonymousClass0ZU r2 = r3.A01;
        if (C18240wQ.A00(r2.invoke()) < C18240wQ.A00(r3.A00.invoke()) && !r3.A02) {
            return true;
        }
        if (C18240wQ.A00(r2.invoke()) <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || !r3.A02) {
            return false;
        }
        return true;
    }

    public static final CharSequence A03(CharSequence charSequence) {
        int i = 100000;
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        CharSequence subSequence = charSequence.subSequence(0, i);
        C04220Ms.A0C(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return subSequence;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b1 A[LOOP:1: B:7:0x002a->B:20:0x00b1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce A[EDGE_INSN: B:38:0x00ce->B:24:0x00ce ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List A05(java.util.List r16, boolean r17) {
        /*
            r15 = this;
            java.util.LinkedHashMap r9 = X.C18220wO.A0y()
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            r3 = r16
            int r2 = r3.size()
            r1 = 0
        L_0x000f:
            r10 = r17
            if (r1 >= r2) goto L_0x001f
            java.lang.Object r0 = r3.get(r1)
            X.7HT r0 = (X.AnonymousClass7HT) r0
            A0B(r15, r0, r4, r9, r10)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x001f:
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            int r3 = X.C86104wH.A0B(r4)
            if (r3 < 0) goto L_0x00ce
            r2 = 0
        L_0x002a:
            java.lang.Object r5 = r4.get(r2)
            X.7HT r5 = (X.AnonymousClass7HT) r5
            if (r2 == 0) goto L_0x00ba
            X.7F6 r0 = r5.A04()
            float r13 = r0.A03
            X.7F6 r0 = r5.A04()
            float r12 = r0.A00
            int r1 = X.C86104wH.A0B(r8)
            if (r1 < 0) goto L_0x00ba
            r7 = 0
        L_0x0045:
            java.lang.Object r0 = r8.get(r7)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r11 = r0.A00
            X.7F6 r11 = (X.AnonymousClass7F6) r11
            float r14 = r11.A03
            float r6 = r11.A00
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b5
            int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b5
            java.lang.Float r0 = java.lang.Float.valueOf(r14)
            float r14 = r0.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r13)
            float r0 = r0.floatValue()
            float r14 = java.lang.Math.max(r14, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r6)
            float r6 = r0.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r12)
            float r0 = r0.floatValue()
            float r0 = java.lang.Math.min(r6, r0)
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b5
            r6 = 0
            r1 = 2139095040(0x7f800000, float:Infinity)
            X.7F6 r0 = new X.7F6
            r0.<init>(r6, r13, r1, r12)
            X.7F6 r1 = r11.A04(r0)
            java.lang.Object r0 = r8.get(r7)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.A01
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            r8.set(r7, r0)
            java.lang.Object r0 = r8.get(r7)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            r0.add(r5)
        L_0x00af:
            if (r2 == r3) goto L_0x00ce
            int r2 = r2 + 1
            goto L_0x002a
        L_0x00b5:
            if (r7 == r1) goto L_0x00ba
            int r7 = r7 + 1
            goto L_0x0045
        L_0x00ba:
            X.7F6 r1 = r5.A04()
            X.7HT[] r0 = new X.AnonymousClass7HT[]{r5}
            java.util.List r0 = X.C06750aI.A18(r0)
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            r8.add(r0)
            goto L_0x00af
        L_0x00ce:
            X.8Lz r1 = X.C138928Lz.A00
            X.8M0 r0 = X.AnonymousClass8M0.A00
            X.0YY[] r0 = new X.AnonymousClass0YY[]{r1, r0}
            java.util.Comparator r0 = X.AnonymousClass722.A01(r0)
            X.C001300p.A0y(r8, r0)
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            int r6 = r8.size()
            r5 = 0
        L_0x00e6:
            if (r5 >= r6) goto L_0x0148
            java.lang.Object r0 = r8.get(r5)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r4 = r0.A01
            java.util.List r4 = (java.util.List) r4
            X.8Lt r3 = X.C138868Lt.A00
            X.8Lu r2 = X.C138878Lu.A00
            X.8Lv r1 = X.C138888Lv.A00
            X.8Lw r0 = X.C138898Lw.A00
            X.0YY[] r0 = new X.AnonymousClass0YY[]{r3, r2, r1, r0}
            java.util.Comparator r2 = X.AnonymousClass722.A01(r0)
            if (r17 == 0) goto L_0x0114
            X.8Lp r3 = X.C138828Lp.A00
            X.8Lq r2 = X.C138838Lq.A00
            X.8Lr r1 = X.C138848Lr.A00
            X.8Ls r0 = X.C138858Ls.A00
            X.0YY[] r0 = new X.AnonymousClass0YY[]{r3, r2, r1, r0}
            java.util.Comparator r2 = X.AnonymousClass722.A01(r0)
        L_0x0114:
            java.util.Comparator r0 = X.AnonymousClass7Y3.A0d
            X.83h r1 = new X.83h
            r1.<init>(r2, r0)
            r0 = 9
            X.C86144wL.A1Q(r1, r4, r0)
            int r3 = r4.size()
            r2 = 0
        L_0x0125:
            if (r2 >= r3) goto L_0x0145
            java.lang.Object r1 = r4.get(r2)
            X.7HT r1 = (X.AnonymousClass7HT) r1
            int r0 = r1.A02
            java.lang.Object r0 = X.C18200wM.A0f(r9, r0)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x013f
            X.7HT[] r0 = new X.AnonymousClass7HT[]{r1}
            java.util.List r0 = X.C06750aI.A18(r0)
        L_0x013f:
            r7.addAll(r0)
            int r2 = r2 + 1
            goto L_0x0125
        L_0x0145:
            int r5 = r5 + 1
            goto L_0x00e6
        L_0x0148:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A05(java.util.List, boolean):java.util.List");
    }

    public static final void A08(AccessibilityEvent accessibilityEvent, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (androidComposeViewAccessibilityDelegateCompat.A0S()) {
            AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0M;
            androidComposeView.getParent().requestSendAccessibilityEvent(androidComposeView, accessibilityEvent);
        }
    }

    public static final void A09(C108576ia r8, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, AnonymousClass7HT r10) {
        LinkedHashSet A0u = C86134wK.A0u();
        List A0A2 = r10.A0A();
        int size = A0A2.size();
        int i = 0;
        while (true) {
            if (i < size) {
                AnonymousClass7HT r7 = (AnonymousClass7HT) A0A2.get(i);
                if (A06(androidComposeViewAccessibilityDelegateCompat).containsKey(Integer.valueOf(r7.A02))) {
                    if (!C86114wI.A1Z(r8.A02, r7.A02)) {
                        break;
                    }
                    C18200wM.A1U(A0u, r7.A02);
                }
                i++;
            } else {
                for (Object A042 : r8.A02) {
                    if (!A0u.contains(Integer.valueOf(AnonymousClass0wJ.A04(A042)))) {
                    }
                }
                List A0A3 = r10.A0A();
                int size2 = A0A3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    AnonymousClass7HT r2 = (AnonymousClass7HT) A0A3.get(i2);
                    if (A06(androidComposeViewAccessibilityDelegateCompat).containsKey(Integer.valueOf(r2.A02))) {
                        Object A0f = C18200wM.A0f(androidComposeViewAccessibilityDelegateCompat.A0C, r2.A02);
                        C04220Ms.A0A(A0f);
                        A09((C108576ia) A0f, androidComposeViewAccessibilityDelegateCompat, r2);
                    }
                }
                return;
            }
        }
        if (androidComposeViewAccessibilityDelegateCompat.A0L.add(r10.A03)) {
            androidComposeViewAccessibilityDelegateCompat.A0Q.D7w(Unit.A00);
        }
    }

    public static final void A0B(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, AnonymousClass7HT r5, List list, Map map, boolean z) {
        list.add(r5);
        C134887yX A072 = r5.A07();
        AnonymousClass77Z r2 = C103986b3.A0C;
        if (C18190wL.A1Z(C115946wA.A01(A072, r2), false) || (!C18190wL.A1Z(C115946wA.A01(r5.A07(), r2), true) && !r5.A07().A01(C103986b3.A00) && !r5.A07().A01(C103976b2.A0F))) {
            List A092 = r5.A09();
            int size = A092.size();
            for (int i = 0; i < size; i++) {
                A0B(androidComposeViewAccessibilityDelegateCompat, (AnonymousClass7HT) A092.get(i), list, map, z);
            }
            return;
        }
        map.put(Integer.valueOf(r5.A02), androidComposeViewAccessibilityDelegateCompat.A05(C18200wM.A0s(r5.A09()), z));
    }

    public static final void A0C(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, String str, int i, int i2) {
        AccessibilityEvent A0Q2 = androidComposeViewAccessibilityDelegateCompat.A0Q(A00(androidComposeViewAccessibilityDelegateCompat, i), 32);
        A0Q2.setContentChangeTypes(i2);
        if (str != null) {
            A0Q2.getText().add(str);
        }
        A08(A0Q2, androidComposeViewAccessibilityDelegateCompat);
    }

    public final AccessibilityEvent A0Q(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C04220Ms.A06(obtain);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.A0M;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i);
        C106846fi r0 = (C106846fi) C18200wM.A0f(A06(this), i);
        if (r0 != null) {
            obtain.setPassword(r0.A01.A07().A01(C103986b3.A0H));
        }
        return obtain;
    }

    public final boolean A0T(int i, long j, boolean z) {
        AnonymousClass77Z r2;
        C112326pO r3;
        Collection<C106846fi> values = A06(this).values();
        C04220Ms.A0B(values, 0);
        if (j == AnonymousClass7KC.A02) {
            return false;
        }
        if (Float.isNaN(AnonymousClass7KC.A01(j)) || Float.isNaN(AnonymousClass7KC.A02(j))) {
            throw C18180wK.A0a("Offset argument contained a NaN value.");
        }
        if (z) {
            r2 = C103986b3.A0R;
        } else {
            r2 = C103986b3.A08;
        }
        if (values.isEmpty()) {
            return false;
        }
        for (C106846fi r6 : values) {
            Rect rect = r6.A00;
            if (new AnonymousClass7F6((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom).A05(j) && (r3 = (C112326pO) C115946wA.A01(r6.A01.A07(), r2)) != null) {
                boolean z2 = r3.A02;
                int i2 = i;
                if (z2) {
                    i2 = -i;
                }
                if ((i != 0 || !z2) && i2 >= 0) {
                    if (C18240wQ.A00(r3.A01.invoke()) < C18240wQ.A00(r3.A00.invoke())) {
                    }
                } else if (C18240wQ.A00(r3.A01.invoke()) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                }
                return true;
            }
        }
        return false;
    }

    public final C008703u A0P(View view) {
        return this.A0F;
    }
}
