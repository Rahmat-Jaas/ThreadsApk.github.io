package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.List;
import kotlin.jvm.internal.IDxLambdaShape24S0500000_2_I2;
import kotlin.jvm.internal.KtLambdaShape2S1310000_I2;

/* renamed from: X.7IZ  reason: invalid class name */
public final class AnonymousClass7IZ {
    public static ViewGroup A00;
    public static AnonymousClass770 A01;
    public static AnonymousClass7IQ A02;
    public static C121077Ea A03;
    public static List A04 = AnonymousClass0wJ.A0v();
    public static List A05 = AnonymousClass0wJ.A0v();
    public static boolean A06;
    public static final Handler A07 = AnonymousClass0wJ.A0F();
    public static final AnonymousClass7IZ A08 = new AnonymousClass7IZ();
    public static final Runnable A09 = new C134957ye();

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.Pair A03(android.view.View r11, int r12) {
        /*
            r10 = this;
            r4 = 0
            X.7Ea r0 = A02()
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x000f
            A00()
            X.AnonymousClass770.A00()
        L_0x000f:
            java.util.List r0 = A05
            java.util.Iterator r1 = r0.iterator()
        L_0x0015:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r1.next()
            X.C86134wK.A1L(r0, r11)
            goto L_0x0015
        L_0x0023:
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            boolean r0 = r11 instanceof android.view.ViewGroup
            r9 = 1
            if (r0 == 0) goto L_0x0061
            r7 = r11
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r6 = r7.getChildCount()
            r2 = 0
            r5 = 0
        L_0x0039:
            if (r2 >= r6) goto L_0x005b
            android.view.View r1 = r7.getChildAt(r2)
            X.C04220Ms.A06(r1)
            int r0 = r12 + 1
            kotlin.Pair r1 = r10.A03(r1, r0)
            java.lang.Object r0 = r1.A00
            java.util.Collection r0 = (java.util.Collection) r0
            r8.addAll(r0)
            java.lang.Object r0 = r1.A01
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0058
            r5 = 1
        L_0x0058:
            int r2 = r2 + 1
            goto L_0x0039
        L_0x005b:
            if (r5 == 0) goto L_0x0062
            r3.addAll(r8)
            goto L_0x00b0
        L_0x0061:
            r5 = 0
        L_0x0062:
            X.7IQ r2 = A01()
            int r1 = r11.getLeft()
            int r0 = r2.A01
            if (r1 >= r0) goto L_0x00b0
            int r0 = r11.getRight()
            if (r0 <= 0) goto L_0x00b0
            int r1 = r11.getTop()
            int r0 = r2.A00
            if (r1 >= r0) goto L_0x00b0
            int r0 = r11.getBottom()
            if (r0 <= 0) goto L_0x00b0
            A01()
            r0 = -345497869(0xffffffffeb681ef3, float:-2.8061694E26)
            java.lang.Object r0 = r11.getTag(r0)
            if (r0 != 0) goto L_0x00ad
            int r1 = r11.getId()
            r0 = -1
            if (r1 == r0) goto L_0x00b0
            X.7Ea r0 = r2.A0A
            java.util.Set r1 = r0.A01
            java.lang.Object r0 = r11.getTag()
            boolean r0 = X.AnonymousClass00J.A0k(r1, r0)
            if (r0 != 0) goto L_0x00b0
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00d1
        L_0x00ad:
            r3.add(r11)
        L_0x00b0:
            A01()
            r0 = -345497869(0xffffffffeb681ef3, float:-2.8061694E26)
            java.lang.Object r0 = r11.getTag(r0)
            if (r0 != 0) goto L_0x00bd
            r9 = r5
        L_0x00bd:
            if (r12 != 0) goto L_0x00ea
            X.7IQ r0 = A01()
            r0.A04(r3)
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            return r0
        L_0x00d1:
            java.util.Iterator r2 = r1.iterator()
        L_0x00d5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.String r1 = X.C18180wK.A0k(r2)
            java.lang.String r0 = X.AnonymousClass7IQ.A01(r11)
            boolean r0 = X.AnonymousClass8bP.A0j(r0, r1, r4)
            if (r0 == 0) goto L_0x00d5
            goto L_0x00b0
        L_0x00ea:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            kotlin.Pair r0 = X.C18180wK.A0p(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IZ.A03(android.view.View, int):kotlin.Pair");
    }

    public final void A04(Context context, View view, String str, String str2, AnonymousClass0ZU r16, AnonymousClass0ZU r17) {
        Object ktLambdaShape2S1310000_I2;
        Context context2;
        View view2;
        Window window;
        View decorView;
        AnonymousClass0wJ.A1Q(str, str2);
        View view3 = view;
        if (!A06) {
            Context context3 = view.getContext();
            while (true) {
                if (!(context3 instanceof ContextWrapper)) {
                    break;
                } else if (context3 instanceof Activity) {
                    Activity activity = (Activity) context3;
                    if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                        view2 = decorView.getRootView();
                    }
                } else {
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            view2 = null;
            if (view2 instanceof ViewGroup) {
                A00 = (ViewGroup) view2;
                A07.post(A09);
                A06 = true;
            }
        }
        if (A02().A09) {
            AnonymousClass770 A002 = A00();
            ViewGroup viewGroup = A00;
            if (viewGroup != null) {
                context2 = viewGroup.getContext();
            } else {
                context2 = null;
            }
            Button button = new Button(context2);
            A002.A00 = button;
            button.setText("Overlap Sequence");
            Button button2 = A002.A00;
            if (button2 != null) {
                button2.setTag("Debug_Control");
            }
            Button button3 = A002.A00;
            if (button3 != null) {
                button3.setClickable(true);
            }
            Button button4 = A002.A00;
            if (button4 != null) {
                C86104wH.A1C(button4, 1, A002);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(20, 200, 0, 0);
            ViewGroup viewGroup2 = A00;
            if (viewGroup2 != null) {
                viewGroup2.addView(A002.A00, layoutParams);
            }
            AnonymousClass770 A003 = A00();
            A003.A06.A02.A0E(C86114wI.A0Q(A003, 10));
        }
        if (A02().A03 && A02().A0A) {
            AnonymousClass770 A004 = A00();
            int argb = Color.argb(40, 50, 50, 50);
            ViewGroup viewGroup3 = A00;
            if (viewGroup3 != null) {
                Context context4 = viewGroup3.getContext();
                ScrollView scrollView = new ScrollView(context4);
                A004.A01 = scrollView;
                scrollView.setBackgroundColor(argb);
                TextView textView = new TextView(context4);
                A004.A02 = textView;
                textView.setBackgroundColor(argb);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(600, 800);
            layoutParams2.setMargins(20, 200, 0, 0);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            ScrollView scrollView2 = A004.A01;
            if (scrollView2 != null) {
                scrollView2.addView(A004.A02, layoutParams3);
            }
            ViewGroup viewGroup4 = A00;
            if (viewGroup4 != null) {
                viewGroup4.removeView(A004.A01);
            }
            ViewGroup viewGroup5 = A00;
            if (viewGroup5 != null) {
                viewGroup5.addView(A004.A01, layoutParams2);
            }
            A004.A03.post(A004.A08);
        }
        if (A02 != null && A03 != null) {
            AnonymousClass7IQ A012 = A01();
            String A0V = AnonymousClass00U.A0V(str, "///", str2);
            view.setTag(-345497869, A0V);
            AnonymousClass0ZU r9 = r16;
            AnonymousClass0ZU r10 = r17;
            if (A012.A0A.A03) {
                ktLambdaShape2S1310000_I2 = new IDxLambdaShape24S0500000_2_I2(0, context, view3, A012, r9, r10);
            } else {
                ktLambdaShape2S1310000_I2 = new KtLambdaShape2S1310000_I2(A012, A0V, r9, r10);
            }
            A012.A07.put(AnonymousClass7IQ.A02(A0V), ktLambdaShape2S1310000_I2);
        }
    }

    public static final AnonymousClass770 A00() {
        AnonymousClass770 r0 = A01;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("debugOptions");
        throw null;
    }

    public static final AnonymousClass7IQ A01() {
        AnonymousClass7IQ r0 = A02;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("viewModel");
        throw null;
    }

    public static final C121077Ea A02() {
        C121077Ea r0 = A03;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("viewSweepConfigs");
        throw null;
    }

    public final void A05(C121077Ea r3) {
        if (!A06) {
            A03 = r3;
            A02 = new AnonymousClass7IQ(A02());
            A01 = new AnonymousClass770(A02());
        }
    }
}
